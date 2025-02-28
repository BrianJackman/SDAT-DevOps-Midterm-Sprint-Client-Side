package com.keyin.client;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class ClientServiceTest {

    private ClientService clientService;
    private CloseableHttpClient httpClient;
    private CloseableHttpResponse response;

    @BeforeEach
    public void setUp() {
        clientService = new ClientService();
        httpClient = mock(CloseableHttpClient.class);
        response = mock(CloseableHttpResponse.class);
    }

    @Test
    public void testGetCities() throws Exception {
        String expectedJson = "[{\"id\":1,\"name\":\"New York\"}]";
        when(httpClient.execute(any(HttpGet.class))).thenReturn(response);
        when(response.getEntity()).thenReturn(EntityUtils.toHttpEntity(expectedJson));

        String result = clientService.getCities();
        assertEquals(expectedJson, result);
    }

    @Test
    public void testGetAirports() throws Exception {
        String expectedJson = "[{\"id\":1,\"name\":\"John F. Kennedy International Airport\"}]";
        when(httpClient.execute(any(HttpGet.class))).thenReturn(response);
        when(response.getEntity()).thenReturn(EntityUtils.toHttpEntity(expectedJson));

        String result = clientService.getAirports();
        assertEquals(expectedJson, result);
    }

    @Test
    public void testGetPassengers() throws Exception {
        String expectedJson = "[{\"id\":1,\"firstName\":\"John\",\"lastName\":\"Doe\"}]";
        when(httpClient.execute(any(HttpGet.class))).thenReturn(response);
        when(response.getEntity()).thenReturn(EntityUtils.toHttpEntity(expectedJson));

        String result = clientService.getPassengers();
        assertEquals(expectedJson, result);
    }

    @Test
    public void testGetAircraft() throws Exception {
        String expectedJson = "[{\"id\":1,\"type\":\"Boeing 747\"}]";
        when(httpClient.execute(any(HttpGet.class))).thenReturn(response);
        when(response.getEntity()).thenReturn(EntityUtils.toHttpEntity(expectedJson));

        String result = clientService.getAircraft();
        assertEquals(expectedJson, result);
    }

    @Test
    public void testGetAirportsByCity() throws Exception {
        String expectedJson = "[{\"id\":1,\"name\":\"John F. Kennedy International Airport\"}]";
        when(httpClient.execute(any(HttpGet.class))).thenReturn(response);
        when(response.getEntity()).thenReturn(EntityUtils.toHttpEntity(expectedJson));

        String result = clientService.getAirportsByCity(1);
        assertEquals(expectedJson, result);
    }

    @Test
    public void testGetAircraftByPassenger() throws Exception {
        String expectedJson = "[{\"id\":1,\"type\":\"Boeing 747\"}]";
        when(httpClient.execute(any(HttpGet.class))).thenReturn(response);
        when(response.getEntity()).thenReturn(EntityUtils.toHttpEntity(expectedJson));

        String result = clientService.getAircraftByPassenger(1);
        assertEquals(expectedJson, result);
    }

    @Test
    public void testGetAirportsByAircraft() throws Exception {
        String expectedJson = "[{\"id\":1,\"name\":\"John F. Kennedy International Airport\"}]";
        when(httpClient.execute(any(HttpGet.class))).thenReturn(response);
        when(response.getEntity()).thenReturn(EntityUtils.toHttpEntity(expectedJson));

        String result = clientService.getAirportsByAircraft(1);
        assertEquals(expectedJson, result);
    }

    @Test
    public void testGetAirportsUsedByPassenger() throws Exception {
        String expectedJson = "[{\"id\":1,\"name\":\"John F. Kennedy International Airport\"}]";
        when(httpClient.execute(any(HttpGet.class))).thenReturn(response);
        when(response.getEntity()).thenReturn(EntityUtils.toHttpEntity(expectedJson));

        String result = clientService.getAirportsUsedByPassenger(1);
        assertEquals(expectedJson, result);
    }
}
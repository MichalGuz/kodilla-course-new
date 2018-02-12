package com.kodilla.testing.weather.stub;

import org.junit.Assert;

public class WeatherForecastTestSuite {

    public void testCalculateForecastWithStub(){

        // Given
        Temperatures temperatures = new TemperaturesStub() ;
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        // When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        // Then
        Assert.assertEquals(5,quantityOfSensors);
    }
}

package com.daehosting.temperatureconversions;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TemperatureConversionsTest {

    @Test
    public void getTemperatureConversionsSoap() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap();
        BigDecimal cToFRes = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));

        assertEquals("Failed", cToFRes, BigDecimal.valueOf(32));
    }

    @Test
    public void getTemperatureConversionsSoap1() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap();
        BigDecimal fToCRes = service.fahrenheitToCelsius(BigDecimal.valueOf(32.0));

        assertEquals("failed", fToCRes, BigDecimal.valueOf(0));
    }

    @Test
    public void getTemperatureConversionsSoap12() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillC = service.windChillInCelsius(BigDecimal.valueOf(30), BigDecimal.valueOf(20));

        assertEquals("failed", windChillC, BigDecimal.valueOf(23.63));
    }

    @Test
    public void getTemperatureConversionsSoap121() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillF = service.windChillInFahrenheit(BigDecimal.valueOf(30), BigDecimal.valueOf(20));

        assertEquals("failed", windChillF, BigDecimal.valueOf(-1.06599991));
    }
}
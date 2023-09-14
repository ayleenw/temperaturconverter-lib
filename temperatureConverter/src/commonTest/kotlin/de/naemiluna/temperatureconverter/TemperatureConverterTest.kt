package de.naemiluna.temperatureconverter

import kotlin.test.Test
import kotlin.test.assertEquals

class TemperatureConverterTest {

    @Test
    fun testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0.0))
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100.0))
    }

    @Test
    fun testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32.0))
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212.0))
    }
}

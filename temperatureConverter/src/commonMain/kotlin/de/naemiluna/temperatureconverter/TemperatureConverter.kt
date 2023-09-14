package de.naemiluna.temperatureconverter

object TemperatureConverter {
    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 9.0 / 5.0 + 32.0
    }

    fun fahrenheitToCelsius(fahrenheit: Double): Double {
        return (fahrenheit - 32.0) * 5.0 / 9.0
    }
}
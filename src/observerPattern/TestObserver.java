package observerPattern;

public class TestObserver {
    public static void main(String[] args) {
        System.out.println("**********************Observer Pattern Demo**********************");
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticDisplay statisticsDisplay = new StatisticDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("--------------------------------------------------------");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("--------------------------------------------------------");
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}

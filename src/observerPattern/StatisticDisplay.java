package observerPattern;

public class StatisticDisplay implements Observer, Display{
    private Subject weatherData;

    private int numberOfReadings;
    private float maxTemp;
    private float minTemp = 80.0f;
    private float tempSum;

    // Called by the Subject to register an observer
    public StatisticDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numberOfReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numberOfReadings++;

        if(temperature > maxTemp)
            maxTemp = temperature;
        if(temperature < minTemp)
            minTemp = temperature;

        display();
    }
}

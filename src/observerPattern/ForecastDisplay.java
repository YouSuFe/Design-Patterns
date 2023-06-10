package observerPattern;

public class ForecastDisplay implements Observer, Display{
    private Subject weatherData;
    private float currentPressure;
    private float lastPressure;

    // Called by the Subject to register an observer
    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // Calculate the forecast based on the current pressure and the last pressure
    @Override
    public void display() {
        System.out.println("Forecast: ");
        if(currentPressure > lastPressure)
            System.out.println("Improving weather on the way!");
        else if(currentPressure == lastPressure)
            System.out.println("More of the same");
        else if(currentPressure < lastPressure)
            System.out.println("Watch out for cooler, rainy weather");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}

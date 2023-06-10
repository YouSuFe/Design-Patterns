package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;   // List of observers
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>(); // Create an empty arraylist for observers
    }

    // Register an observer
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // Find the given observer's index and remove it
    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0)
            observers.remove(index);
    }

    // Notify all observers
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    // Set the measurements and call measurementsChanged method
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}

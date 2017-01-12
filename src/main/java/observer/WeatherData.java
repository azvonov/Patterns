package observer;

import java.util.ArrayList;

public class WeatherData implements Subject{

    private ArrayList<Observer> observers;
    private float tempreture;
    private float humidity;
    private float pressure;


    public WeatherData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {

        int i = observers.indexOf(observer);
        if(i>=0){
            observers.remove(i);
        }
    }

    public void notifyObserver() {

        for (Observer o : observers){
             o.update(tempreture,humidity,pressure);

        }
    }

    public void messurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float tempreture, float humidity, float pressure){

        this.tempreture = tempreture;
        this.humidity = humidity;
        this.pressure = pressure;
        messurementsChanged();
    }

    public String getTempreture(){

        return null;
    }

    public String getHumidity(){
        return null;
    }

    public String getPressure(){
        return null;
    }

}

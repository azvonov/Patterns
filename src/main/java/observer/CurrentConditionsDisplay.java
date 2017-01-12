package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float tempreture;
    private float humidity;
    private Subject weatheraDate;


    public CurrentConditionsDisplay(Subject weatheraDate) {
        this.weatheraDate = weatheraDate;
        weatheraDate.registerObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: " + tempreture + " degrees and " + humidity + " % humidity");
    }

    public void update(float tempreture, float humidity, float pressure) {
        this.tempreture = tempreture;
        this.humidity = humidity;
        display();
    }
}

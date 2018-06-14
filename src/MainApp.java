import processing.core.PApplet;

public class MainApp extends PApplet {

    public static void main(String[] args) {

        PApplet.main("MainApp", args);

    }

    Car myCar;

    public void settings() {
        size(200, 200);
    }

    public void setup() {
        background(255);
        myCar = new Car(this);
    }

    public void draw() {
        myCar.display();
        myCar.drive();
    }

}

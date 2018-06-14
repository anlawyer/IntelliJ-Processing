import processing.core.PApplet;

public class MainApp extends PApplet {

    public static void main(String[] args) {

        PApplet.main("MainApp", args);

    }

    Car carOne;
    Car carTwo;

    public void settings() {
        size(200, 200);
    }

    public void setup() {
//        background(255);
        carOne = new Car(this, 22, 50, 50, 1);
        carTwo = new Car(this, 222, 150, 150, 2);
    }

    public void draw() {
        background(255);
        carOne.display();
        carOne.drive();
        carTwo.display();
        carTwo.drive();
    }

}

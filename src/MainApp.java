import processing.core.PApplet;

public class MainApp extends PApplet {

    public static void main(String[] args) {

        PApplet.main("MainApp", args);

    }

    public void settings() {
        size(800, 600);
    }

    public void setup() {
        background(126);
    }

    public void draw() {
        line(mouseX, mouseY, pmouseX, pmouseY);
    }

}

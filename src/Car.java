import processing.core.PApplet;

public class Car {

    PApplet p;
    float color;
    float xpos;
    float ypos;
    float xspeed;

    public Car(PApplet p) {
        this.p = p;
        color = p.color(0);
        xpos = p.width/2;
        ypos = p.height/2;
        xspeed = 1;
    }

    void display() {
//        p.rectMode(CENTER);
        p.fill(color);
        p.rect(xpos, ypos, 20, 10);
    }

    void drive() {
        xpos = xpos + xspeed;
        if (xpos > p.width) {
            xpos = 0;
        }
    }
}

import processing.core.PApplet;

public class Car {

    PApplet p;
    float color;
    float xpos;
    float ypos;
    float xspeed;

    public Car(PApplet p, float tempColor, float tempXpos, float tempYpos, float tempXspeed) {
        this.p = p;
        color = p.color(tempColor);
        xpos = tempXpos;
        ypos = tempYpos;
        xspeed = tempXspeed;
    }

    void display() {
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

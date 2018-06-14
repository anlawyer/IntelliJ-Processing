import processing.core.PApplet;

public class Car {

    PApplet p;
    float color;
    float xpos;
    float ypos;
    float xspeed;

    public Car(PApplet p, float tempColor, float tempXpos, float tempYpos, float tempXspeed) {
        this.p = p;
        color = tempColor;
        xpos = tempXpos;
        ypos = tempYpos;
        xspeed = tempXspeed;
    }

    void display() {
        p.stroke(255);
        p.fill(color, 0, 0);
        p.rect(xpos, ypos, 20, 10);
    }

    void drive() {
        xpos = xpos + xspeed;
        ypos = ypos + xspeed;
        if ((xpos > p.width) && (ypos > p.height)){
            xpos = 0;
            ypos = 0;
        }
    }
}

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Fan {
    private int speed = 1;
    boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(this.isOn() == true){
            return "Fan is on: " + " Speed: " + this.getSpeed() + ", Color: " + this.getColor() + ", Radius: " + this.getRadius();
        }else {
            return "Fan is off: " + " Color: " + this.getColor() + ", Radius: " + this.getRadius();
        }
    }
}
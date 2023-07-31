package access.modifiers.chatgpt;

//Write a class `Circle` that represents a circle with a private data member `radius`. Provide public methods to calculate the area and circumference of the circle.

public class Circle {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return (Math.PI * this.radius * this.radius);
    }

    public double getCircumference(){
        return (2 * Math.PI * this.radius);
    }
}

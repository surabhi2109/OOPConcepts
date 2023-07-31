package access.modifiers.chatgpt;

public class CircleMain {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(3);

        System.out.println("Radius : "+c1.getRadius());
        System.out.println("Area : " + c1.getArea());
        System.out.println("Circumference : "+c1.getCircumference());
    }
}

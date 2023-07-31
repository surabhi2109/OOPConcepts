package access.modifiers.chatgpt;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(5);
        r1.setWidth(4);

        System.out.println("R1 : length - "+r1.getLength()+", width - "+r1.getWidth());
        System.out.println("R1 Area - "+r1.getArea()+", Perimeter - "+r1.getPerimieter());
        System.out.println("Is R1 a Square = "+r1.isSquare());

        Rectangle r2 = new Rectangle();
        r2.setLength(5);
        r2.setWidth(5);

        System.out.println("R2 : length - "+r2.getLength()+", width - "+r2.getWidth());
        System.out.println("R2 Area - "+r2.getArea()+", Perimeter - "+r2.getPerimieter());
        System.out.println("Is R2 a Square = "+r2.isSquare());
    }
}

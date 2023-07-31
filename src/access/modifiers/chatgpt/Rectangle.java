package access.modifiers.chatgpt;

//Create a class `Rectangle` with private data members `length` and `width`. Provide public methods to calculate the area and perimeter of the rectangle. Also, implement a method to check if the rectangle is a square (i.e., length and width are equal).

public class Rectangle {
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimieter(){
        return 2 * (this.length + this.width);
    }

    public boolean isSquare(){
        if(this.length == this.width)
            return true;
        return false;
    }
}

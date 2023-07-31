package access.modifiers.chatgpt;

public class CarMain {
    public static void main(String[] args) {
        Car c = new Car();
        c.setModel("Camry");
        c.setPrice(30000);
        c.setMake("Toyota");
        c.setYear(2020);

        System.out.println("Car : Make - "+c.getMake()+", Model - "+c.getModel()+", Price - "+c.getYear()+", Year - "+c.getYear());

        System.out.println("Depreciation Cost - "+ c.getDepreciationCost());
    }
}

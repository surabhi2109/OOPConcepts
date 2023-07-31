package access.modifiers.chatgpt;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("John Doe");
        p1.setAge(30);
        p1.setAddress("123 Main Street");

        System.out.println("Person p1 : name - " + p1.getName()+", age - "+p1.getAge()+", address - "+p1.getAddress());
    }
}

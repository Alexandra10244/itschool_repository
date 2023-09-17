package session15.homework15;

public class JsonObject {
    //Create a method that returns a JSON representation of an object.
// The method should make use of the toString method to facilitate this.
    private String name;
    private int age;

    public JsonObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person: {" +
                " name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        JsonObject person = new JsonObject("John", 34);
        System.out.println(person);
    }
}

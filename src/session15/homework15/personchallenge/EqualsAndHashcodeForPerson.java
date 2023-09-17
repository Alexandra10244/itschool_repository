package session15.homework15.personchallenge;

public class EqualsAndHashcodeForPerson {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Ana");
        person1.setAge(25);

        Person person2 = new Person();
        person2.setName("Ana");
        person2.setAge(25);

        System.out.println("person1 equals to person2: " + person1.equals(person2));
        System.out.println("Hashcode for person1: " + person1.hashCode());
        System.out.println("Hashcode for person2: " + person2.hashCode());
    }
}

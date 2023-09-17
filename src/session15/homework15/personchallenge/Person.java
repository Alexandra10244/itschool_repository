package session15.homework15.personchallenge;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void email(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return name == person.name && age == person.age;
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }
}

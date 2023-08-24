package session8.homework8;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListWithStudentsNames {
    //  Given a LinkedList storing student names, write a program that checks if a particular student name exists in the list.
    //  If it does, remove that name from the list.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> studentsList = new LinkedList<>();
        studentsList.add("Mihai");
        studentsList.add("Alin");
        studentsList.add("Alina");

        System.out.println(studentsList);
        System.out.println("Enter a name: ");
        String inputName = scanner.nextLine();

        boolean foundName = false;
        for (String name : studentsList) {
            if (inputName.equals(name)) {
               foundName = true;
            }
        }
        if(foundName == true){
            studentsList.remove(inputName);
            System.out.println(studentsList);
        } else{
            System.out.println("Name not found.");
        }

    }
}

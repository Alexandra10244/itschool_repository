package session11.homework11.parent;

import session11.homework11.parent.FirstSubclass;
import session11.homework11.parent.SecndSubclass;

public class MainParent {
    //Create an abstract class 'Parent' with a method 'message'.
    // It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and
    // "This is second subclass" respectively.
    // Call the methods 'message' by creating an object for each subclass.

    public static void main(String[] args) {

        FirstSubclass fisrtObj = new FirstSubclass();
        SecndSubclass secondObj = new SecndSubclass();

        fisrtObj.message();
        secondObj.message();
    }
}

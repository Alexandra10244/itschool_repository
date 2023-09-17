package session15.homework15.enumchallenge;

import java.time.Duration;

public enum LightColor {

    //Create an enum called LightColor that represents the three colors of a traffic light: red, yellow, and green.
    // Each color should have a string representation and a duration (in seconds) associated with it
    // (e.g., red = "Stop", 30 seconds; yellow = "Caution", 5 seconds; green = "Go", 45 seconds).

    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);

    private final String message;
    private final int duration;

    LightColor(String message, int duration) {
        this.message = message;
        this.duration = duration;
    }

    public String getMessage() {
        return message;
    }

    public int getDuration() {
        return duration;
    }
}

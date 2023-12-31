package session7.time_tracking_system;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String NIN;

    private List<TimeLog> userTimeLogList = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setNIN(String NIN) {
        this.NIN = NIN;
    }

    public String getName() {
        return name;
    }

    public String getNIN() {
        return NIN;
    }

    public List<TimeLog> getUserTimeLogList() {
        return userTimeLogList;
    }

    public void setUserTimeLogList(List<TimeLog> userTimeLogList) {
        this.userTimeLogList = userTimeLogList;
    }

    public void addTimeLog(TimeLog timeLog) {
        userTimeLogList.add(timeLog);
    }

    public int getHoursWorked() {
        int hoursWorked = 0;
        Duration duration;
        for (TimeLog timeLog : userTimeLogList) {
            duration = Duration.between((timeLog.getCheckIn()), timeLog.getCheckOut());
            hoursWorked += duration.toHours();
        }
        return hoursWorked;
    }
}

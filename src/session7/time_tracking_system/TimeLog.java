package session7.time_tracking_system;

import java.time.LocalDateTime;
import java.util.List;

public class TimeLog {

    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private List<TimeLog> user;

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public List<TimeLog> getUser() {
        return user;
    }

    public void setUser(List<TimeLog> user) {
        this.user = user;
    }
}

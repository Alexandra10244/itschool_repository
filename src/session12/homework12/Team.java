package session12.homework12;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private Employee teamLeader;
    private List<Employee> teamMembers;

    public Team(String teamName, Employee teamLeader) {
        this.teamName = teamName;
        this.teamLeader = teamLeader;
        this.teamMembers = new ArrayList<>();
    }

    public void addMembers(Employee member) {
        teamMembers.add(member);
    }

    public void removeMember(Employee member) {
        teamMembers.remove(member);
    }

    public List<Employee> getTeamMembers() {
        return teamMembers;
    }

    public String getTeamName() {
        return teamName;
    }

    public Employee getTeamLeader() {
        return teamLeader;
    }
}

package session12.homework12;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String companyName;
    private List<Employee> employees;
    private List<Team> teams;
    private List<String> emails;

    public Company(String companyName) {
        this.companyName = companyName;
        this.employees = new ArrayList<>();
        this.teams = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public List<String> getEmails() {
        return emails;
    }

    public boolean addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
            return true;
        }
        return false;
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public boolean addTeam(Team team) {
        if (!teams.contains(team)) {
            teams.add(team);
            return true;
        }
        return false;
    }

    public void removeTeam(Team team) {
        teams.remove(team);
    }


}

package session12.homework12;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {

    public static void main(String[] args) {

        Company company = new Company("Continental");

        ConstructionApp app = new ConstructionApp();

        Employee manager = new Employee("Alin", "manager", "alin26@gmail.com");
        Employee engineer1 = new Employee("Andrei", "engineer", "andrei44@gmail.com");
        Employee engineer2 = new Employee("Ana", "engineer", "ana89@gmail.com");

        company.addEmployee(manager);
        company.addEmployee(engineer1);
        company.addEmployee(engineer2);

        Team team = new Team("Team 1", manager);
        team.addMembers(engineer1);
        team.addMembers(engineer2);
        company.addTeam(team);

        System.out.println("Company: " + company.getCompanyName());

        System.out.println("Company employees: ");
        for (Employee employee : company.getEmployees()) {
            System.out.println(employee.getName() + " " + employee.getRole());
        }

        System.out.println("Team: " + team.getTeamName());
        System.out.println("Team leader: " + team.getTeamLeader().getName());

        app.sendAnnouncement("You have an announcement.");
        app.receivedAnnouncement("You have an announcement.");
    }
}

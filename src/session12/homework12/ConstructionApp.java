package session12.homework12;

public class ConstructionApp implements Admin, User {
    private Company company;

    public ConstructionApp(Company company) {
        this.company = company;
    }

    public ConstructionApp() {
        super();
    }

    @Override
    public void makeChanges() {

    }

    @Override
    public void sendAnnouncement(String announcement) {

    }

    @Override
    public void progressMade() {

    }

    @Override
    public void interactWithData() {

    }

    @Override
    public void receivedAnnouncement(String announcement) {

    }
}

package overridingandsuper;

public class EventRegistration {

    private String name;
    private String nameOfTheEvent;
    private double registrationFees;

    public EventRegistration(String name, String nameOfTheEvent) {
        this.name = name;
        this.nameOfTheEvent = nameOfTheEvent;
    }

    void registerEvent(){
        if(nameOfTheEvent == "ShakeALeg"){
            registrationFees = 100;
        } else if (nameOfTheEvent == "SingAndWin") {
            registrationFees = 150;
        } else if (nameOfTheEvent == "Actathon") {
            registrationFees = 70;
        } else if (nameOfTheEvent == "PlayAway") {
            registrationFees = 130;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfTheEvent() {
        return nameOfTheEvent;
    }

    public void setNameOfTheEvent(String nameOfTheEvent) {
        this.nameOfTheEvent = nameOfTheEvent;
    }

    public double getRegistrationFees() {
        return registrationFees;
    }

    public void setRegistrationFees(double registrationFees) {
        this.registrationFees = registrationFees;
    }
}

package overridingandsuper;

public class TeamEventRegistration extends EventRegistration {
    private int noOfParticipants;
    private int teamNo;

    public TeamEventRegistration(String name, String nameOfTheEvent, int noOfParticipants, int teamNo) {
        super(name, nameOfTheEvent);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
    }

    void registerEvent() {
        if (getNameOfTheEvent() == "ShakeALeg") {
            setRegistrationFees(noOfParticipants * 50);
        } else if (getNameOfTheEvent() == "SingAndWin") {
            setRegistrationFees(noOfParticipants * 60);
        } else if (getNameOfTheEvent() == "PlayAway") {
            setRegistrationFees(noOfParticipants * 100);
        } else if (getNameOfTheEvent() == "Actathon") {
            setRegistrationFees(noOfParticipants * 80);
        }

        System.out.println("Thank you " + getName() + " for your participation. " + "Your registration fee is " + getRegistrationFees()
                + " Your participant No: "   + getTeamNo());

    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }
}

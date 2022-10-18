package overridingandsuper;

public class SingleEventParticipation extends EventRegistration {
    private int participationId;

    SingleEventParticipation(String name, String nameOfEvent, int participationId){
        super(name,nameOfEvent);
        this.participationId = participationId;
    }

    void registerEvent(){
        if(getNameOfTheEvent() == "ShakeALeg"){
            setRegistrationFees(100);
        } else if (getNameOfTheEvent() == "SingAndWin") {
            setRegistrationFees(150);
        } else if (getNameOfTheEvent() == "PlayAway") {
            setRegistrationFees(130);
        }

        System.out.println("Thank you " + getName() + " for your participation. " + "Your registration fee is " + getRegistrationFees()
             + " Your participant No: "   + getParticipationId());
    }

    public int getParticipationId() {
        return participationId;
    }

    public void setParticipationId(int participationId) {
        this.participationId = participationId;
    }
}

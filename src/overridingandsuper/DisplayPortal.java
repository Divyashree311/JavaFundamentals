package overridingandsuper;

public class DisplayPortal {
    public static void main(String[] args) {
        EventRegistration eventRegistration = new SingleEventParticipation("Jenny","SingAndWin",1);
        eventRegistration.registerEvent();

        EventRegistration eventRegistration1 = new TeamEventRegistration("Aura","ShakeALeg",5,1);
        eventRegistration1.registerEvent();

        EventRegistration eventRegistration2 = new SingleEventParticipation("Hudson","PlayAway",2);
        eventRegistration2.registerEvent();
    }
}

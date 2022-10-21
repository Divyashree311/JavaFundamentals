package abstractexample;

public class Execution {
    public static void main(String[] args) {
        Branches branches = new KarnatakaBranch();
        branches.openAccount(1500,"pan","aadhar");
    }
}

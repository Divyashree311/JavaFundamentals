package polymorphyism.overloading;

/*
Internet user registration class, Customer and Phone number is mandatory.
User should provide Passport if not provide:
License number and pan OR
Voter id and license OR
Pan and Voter id

Create constructor for above conditions.
 */
public class RegistrationConstructorOverLoading {

    private String customerName;
    private String panCard;
    private int voterId;
    private String passportNo;
    private int licensedNo;
    private long[] telephoneNo;

    public RegistrationConstructorOverLoading(String customerName, String passportNo, long[] telephoneNo) {
        this.customerName = customerName;
        this.passportNo = passportNo;
        this.telephoneNo = telephoneNo;

        System.out.println("congrats " + getCustomerName() + "!" + "You have successfully registered for our services with the following details \n" +
                "Passport number " + getPassportNo() + "\nPhone numbers " );
        for(long telePhone: telephoneNo ){
            System.out.println(telePhone);
        }
    }

    public RegistrationConstructorOverLoading(String customerName, int licensedNo, String panCard, long[] telephoneNo) {
        this.customerName = customerName;
        this.panCard = panCard;
        this.licensedNo = licensedNo;
        this.telephoneNo = telephoneNo;


        System.out.println("congrats " + getCustomerName() + "!" + "You have successfully registered for our services with the following details \n" +
                "Pan number " + getPanCard() + "\nVoter id " + getVoterId() + "\nPhone numbers: " );
        for(long telePhone: telephoneNo ){
            System.out.println(telePhone);
        }
    }

    public RegistrationConstructorOverLoading(String customerName, int voterId, int licensedNo, long[] telephoneNo) {
        this.customerName = customerName;
        this.voterId = voterId;
        this.licensedNo = licensedNo;
        this.telephoneNo = telephoneNo;
        System.out.println("congrats " + getCustomerName() + "!" + "You have successfully registered for our services with the following details \n" +
                "Voter id " + getVoterId() + "\nLicense No " + getLicensedNo() + " \nPhone numbers: " );
        for(long telePhone: telephoneNo ){
            System.out.println(telePhone);
        }
    }

    public RegistrationConstructorOverLoading(String customerName, String panCard, int voterId, long[] telephoneNo) {
        this.customerName = customerName;
        this.panCard = panCard;
        this.voterId = voterId;
        this.telephoneNo = telephoneNo;
        System.out.println("congrats " + getCustomerName() + "!" + "You have successfully registered for our services with the following details \n" +
                "Voter id " + getVoterId() + "\nPan No " + getPanCard() + " \nPhone numbers: " );
        for(long telePhone: telephoneNo ){
            System.out.println(telePhone);
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPanCard() {
        return panCard;
    }

    public int getVoterId() {
        return voterId;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public int getLicensedNo() {
        return licensedNo;
    }

    public long[] getTelephoneNo() {
        return telephoneNo;
    }

    public static void main(String[] args) {
            long[] phoneNumbers = {89735299l, 9876568l};

            RegistrationConstructorOverLoading registrationConstructorOverLoading = new RegistrationConstructorOverLoading("Kevin", "MN9891N", phoneNumbers);
            System.out.println("----------------------------------");
            RegistrationConstructorOverLoading registrationConstructorOverLoading1 = new RegistrationConstructorOverLoading("Julia", 123, "P7897", phoneNumbers);
            System.out.println("----------------------------------");

            RegistrationConstructorOverLoading registrationConstructorOverLoading2 = new RegistrationConstructorOverLoading("Jammy ", 45452, 765, new long[]{87865l,9786l});
            System.out.println("----------------------------------");
            RegistrationConstructorOverLoading registrationConstructorOverLoading3 = new RegistrationConstructorOverLoading("Rose ", "4545YT2", 7659, new long[]{87865l,9786l});

    }
}

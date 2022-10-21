package abstractexample;

public abstract class Branches {

    abstract public boolean validateAddressProof(String addressProof);
    abstract public boolean validateIdentificationProof(String identProof);

    public void openAccount(int amount, String addressP, String identityP){
        if(amount >= 1000){
            if(validateAddressProof(addressP) && (validateIdentificationProof(identityP))){
                System.out.println("Account can be opened");
            }else {
                System.out.println("Account can be opened");
            }
        }
    }

}

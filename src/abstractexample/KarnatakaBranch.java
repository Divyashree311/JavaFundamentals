package abstractexample;

public class KarnatakaBranch extends  Branches{

    @Override
    public boolean validateAddressProof(String addressProof) {
        if (addressProof.equalsIgnoreCase("Aadhar")){
            return true;
        }
        return false;
    }

    @Override
    public boolean validateIdentificationProof(String identProof) {
        if(identProof.equalsIgnoreCase("PAN")){
            return true;
        }
        return false;
    }
}

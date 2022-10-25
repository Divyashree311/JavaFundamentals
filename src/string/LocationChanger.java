package string;

public class LocationChanger {
    private String name;
    private String location;

    @Override
    public String toString() {
        return "LocationChanger{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    void checkCity(){
        String[] a = location.split(",");
        String city = a[1];
        switch (city){
            case "Delhi":
                System.out.println("Welcome to Mysore Delhites");
                break;
            case  "Tri":
                System.out.println("Welcome to mydc people from Trify");
                break;
            default:
                System.out.println("We don't have this address in our database");
                break;
        }
    }

    void editAddress(){
        if (location.contains("STP")){
          String editLocation =  location.replace("STP", "SEZ");
            System.out.println("Your location has been changed from STP to SEZ "+editLocation);
        }else {
            System.out.println("Your location remains same!");
        }
    }

    void welcomeEmployee(){
        String[] fName = name.split(" ");
        System.out.println("Hello " + fName[0]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void main(String[] args) {
        LocationChanger locationChanger = new LocationChanger();
        locationChanger.setName("Divya Nisarga");
        locationChanger.setLocation("BL00,Delhi,STP");
        locationChanger.welcomeEmployee();
        locationChanger.checkCity();
        locationChanger.editAddress();

        System.out.println("-------------------------------");
        LocationChanger locationChanger2 = new LocationChanger();
        locationChanger2.setName("Divya Kavya");
        locationChanger2.setLocation("BL00,Pune,SEZ");
        locationChanger2.welcomeEmployee();
        locationChanger2.checkCity();
        locationChanger2.editAddress();
    }
}

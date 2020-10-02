public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo (String theName, String theAddress, String thePhone){
        name = theName;
        address = theAddress;
        phoneNumber = thePhone;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo myBuddy = new BuddyInfo("homer",null, null);
        myBuddy.name = "Homer";
        System.out.println("Hello " + myBuddy.getName());
    }
}

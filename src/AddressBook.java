public class AddressBook {
    BuddyInfo[] list = new BuddyInfo[5];

    public void addBuddy(BuddyInfo buddy) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) list[i] = buddy;
        }
    }

    public void removeBuddy(int i){
        list[i] = null;
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}


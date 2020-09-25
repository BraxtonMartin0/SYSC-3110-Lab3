public class AddressBook {
    BuddyInfo[] list = new BuddyInfo[5];

    public void addBuddy(BuddyInfo buddy) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) list[i] = buddy;
        }
    }

    public void removeBuddy(BuddyInfo buddy){
        for (int i = 0; i < list.length; i++) {
            if (list[i] == buddy) list[i] = null;
        }
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("tom", "Carleton", "613");
        AddressBook addressbook = new AddressBook();
        addressbook.addBuddy(buddy);
        addressbook.removeBuddy(buddy);
    }
}


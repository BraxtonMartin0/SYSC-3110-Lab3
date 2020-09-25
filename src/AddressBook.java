import java.util.*;
public class AddressBook {
    ArrayList<BuddyInfo> list;

    public void addBuddy(BuddyInfo buddy) {
        list.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        list.remove(buddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("tom", "Carleton", "613");
        AddressBook addressbook = new AddressBook();
        addressbook.addBuddy(buddy);
        addressbook.removeBuddy(buddy);
    }
}


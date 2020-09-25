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
      System.out.println("Address Book");
    }
}


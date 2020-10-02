import java.util.*;
public class AddressBook {
    ArrayList<BuddyInfo> myBuddies;

    public AddressBook(){
        myBuddies = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo aBuddy) {
        if(aBuddy!= null) myBuddies.add(aBuddy);
    }

    public BuddyInfo removeBuddy(int index){
        if(index>=0 && index < myBuddies.size()){
            return myBuddies.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressbook = new AddressBook();
        addressbook.addBuddy(buddy);
        addressbook.removeBuddy(0);
    }
}


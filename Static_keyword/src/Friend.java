public class Friend {
    String name;
    static int noOfFriends;
    Friend(String name){
        this.name = name;
        noOfFriends++;
    }
    static void displayFriends(){
        System.out.println("You have " + noOfFriends + " friends");
    }
}

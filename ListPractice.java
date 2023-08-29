import java.util.ArrayList;
public class ListPractice {
    public static void main(String[] args) {
        System.out.println("\nArray List Practice\n");

        ArrayList<String> myFriendsList = new ArrayList<>();
        // Add five friends to the list
        myFriendsList.add("John");
        myFriendsList.add("Chris");
        myFriendsList.add("Eric");
        myFriendsList.add("Luke");
        myFriendsList.add("Mitch");

        System.out.println("\n My fifth friend is " + myFriendsList.get(4));

        System.out.println("\n the size of (number of elements) " + myFriendsList.size());

        // Set change the data in an element
        myFriendsList.set(0, "Alex");
        System.out.println("\n my first friend is now (me lol)........... " + myFriendsList.get(0));

        // Remove Element 3
        myFriendsList.remove(2);

        // Output the list without for loop
        System.out.println(myFriendsList);

        int myFriendNumber = 1;

        // Output the list with a for loop
        for (String s: myFriendsList) {
            System.out.println(" friend " + myFriendNumber + " is " + s);
            myFriendNumber++;
        }

        // Add list elements with a for loop
        for (int i = 0; i < 10; i++);
        {
            // Use .add()
            myFriendsList.add(index: i+4, element: "new friend");
            System.out.println(" New friend added to list");
        }

        // Write a for/each loop to output the list




    }
}
//    create objects of type FCITfriends
//    the Linked-List class
//    Each student will have a reference to their list of Friends
//    point to a linked-list object (an object of type FCITfriends)
/*This is the Linked-List class.
• All nodes of this class are of type FCITfriend*/
import java.util.LinkedList;
//ID : 1946122
//Name: تسون تينج فلان تشان
//Section: XXA CPCS-204

public class FCITfriends {

    public static void main(String[] args) {

        // Creating object of the class linked list
        LinkedList<String> FCITfriends
                = new LinkedList<String>();

        // Adding elements to the linked list
        FCITfriends.add("friend A");
        FCITfriends.add("friend B");
        FCITfriends.addLast("friend C");
        FCITfriends.addFirst("friend D");
        FCITfriends.add(2, "friend E");

        System.out.println(FCITfriends);

        FCITfriends.remove("friend B");
        FCITfriends.remove(3);
        FCITfriends.removeFirst();
        FCITfriends.removeLast();

        System.out.println(FCITfriends);

    }

    public static int[] shift(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        newArr[0] = arr[arr.length - 1];
        return newArr;
    }

}
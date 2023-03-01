import java.util.ArrayList;
import java.util.Collection;

public class MyCollection {
    public static void main(String[] args) {
        Collection<String> myCollection = new ArrayList<String>();

        // Adding elements to the collection
        myCollection.add("apple");
        myCollection.add("banana");
        myCollection.add("orange");

        // Printing the collection
        System.out.println("Collection: " + myCollection);

        // Checking if the collection contains an element
        boolean containsApple = myCollection.contains("apple");
        System.out.println("Contains 'apple': " + containsApple);

        // Removing an element from the collection
        myCollection.remove("banana");

        // Printing the collection again
        System.out.println("Collection after removing 'banana': " + myCollection);

        // Clearing the collection
        myCollection.clear();

        // Printing the empty collection
        System.out.println("Empty collection: " + myCollection);
    }
}
/*In Java, the Collection interface is the root interface of the collection framework and provides
the basic functionality for storing and manipulating a group of objects.
 Here's an example of how to implement a Collection using an ArrayList:
 This code creates an ArrayList object and adds some elements to it using the add method.
  It then prints the collection using System.out.println, checks if the collection contains an element using contains,
   removes an element using remove, clears the collection using clear, and prints the empty collection.
   Since ArrayList implements the Collection interface, we can use all of the methods of the Collection interface with an ArrayList object.
 */


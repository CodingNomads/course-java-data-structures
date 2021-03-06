package com.codingnomads.list;

/**
 * implement a custom ArrayList from scratch.
 * It should be generic, and it should automatically resize itself when nearing it's upper size bounds.
 * It should also resize itself to be smaller if/when needed as well.
 * <p>
 * Part1:
 * Implement the methods:
 * 1) add( Object o): This method adds an object o to the arraylist.
 * 2) add(int index, Object o): It adds the object o to the array list at the given index.
 * 3) remove(Object o): Removes the object o from the ArrayList.
 * 4) remove(int index): Removes element from a given index.
 * 5) set(int index, Object o): Used for updating an element. It replaces the element present at the specified index with the object o.
 * 6) int indexOf(Object o): Gives the index of the object o. If the element is not found in the list then this method returns the value -1.
 * 7) Object get(int index): It returns the object of list which is present at the specified index.
 * 8) int size(): It gives the size of the ArrayList – Number of elements of the list.
 * 9) boolean contains(Object o): It checks whether the given object o is present in the array list if its there then it returns true else it returns false.
 * 10) clear(): It is used for removing all the elements of the array list in one go. The below code will remove all the elements of ArrayList whose object is obj.
 * <p>
 * Part2:
 * Make it Generic
 * <p>
 * Part3:
 * Implement the Iterator
 * https://beginnersbook.com/2014/06/java-iterator-with-examples/
 */

public class MyArrayList<E> {
}

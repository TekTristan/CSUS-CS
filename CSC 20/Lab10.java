// Your name here (NO NAME, NO CREDIT!): Tristan Dinh

package Main;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.Stack;

public class Lab10 {
  public static void main(String[] args) {
    // TEST PORTION (DO NOT MODIFY!)
    ArrayList < String > alist = new ArrayList < String > (); // Created array list
    Stack < Integer > st = new Stack < Integer > (); // Created stack
    final int n = 10;
    for (int i = 0; i < n; i++) {
      alist.add(Integer.toString(i));
      st.push(i);
    }
    // END TEST...CODE BELOW THIS LINE!
    // TODO (Remove this when you finish lab)
    
    System.out.println("ArrayList iterator Elements are:");
    Iterator < String > listIterator = alist.iterator();
    while (listIterator.hasNext()) {
      p(listIterator.next());
    }
    System.out.println();
    System.out.println("Stack values in LIFO order:");
    Iterator < Integer > stackIterator = getStackIterator(st);
    while (stackIterator.hasNext()) {
      pn(stackIterator.next());
    }
  }

  public static Iterator < Integer > getStackIterator(Stack < Integer > st) {
    // TODO: Follow specifications in hand out!
    Stack < Integer > temp1 = new Stack < > ();
    Stack < Integer > temp2 = st;
    while (!st.isEmpty()) {
      temp1.push(temp2.pop());
    }
    Iterator < Integer > it = temp1.iterator();
    return it;
    // This is just to prevent a Java error; remove when you complete this method!
  }

  /* Helper method for easy printing on same line */
  public static < E > void p(E item) {
    System.out.print(item + " ");
  }

  /* Helper method for easy printing with line return */
  public static < E > void pn(E item) {
    System.out.println(item);
  }
}
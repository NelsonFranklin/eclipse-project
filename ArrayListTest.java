package Collecxions;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
 
public class ArrayListTest {
   public static void main(String[] args) {
      List<String> lst = new ArrayList<String>();  
      lst.add("Nelson");            // add() takes Object. String upcast to Object implicitly
      lst.add("Franklin");
      lst.add("Mr.Frankz");
      System.out.println(lst);     // [alpha, beta, charlie]
 
      // Get a "iterator" instance from List to iterate thru all the elements of the List
      Iterator<String> iter = lst.iterator();
      while (iter.hasNext()) {      // any more element
         // Retrieve the next element, explicitly downcast from Object back to String
    	  String str = (String)iter.next();
         System.out.println(str);
      }
   }
}
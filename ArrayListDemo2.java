package Collecxions;
import java.util.ArrayList;
 
public class ArrayListDemo2 {
   public static void main(String[] args) {
      ArrayList<String> st = new ArrayList<String>();  
      st.add("Nelson");           
      st.add("Franklin");
      st.add("Mr.Frankz");
      System.out.println(st);     
     // Iterator iter = lst.iterator();
     for(Object obj:st){			//for object we should use only strings
      System.out.println(obj);
     } 
      }
   }

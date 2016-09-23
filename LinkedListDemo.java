package Collecxions;

import java.util.LinkedList;

class LinkedListDemo {
public static void main(String[] args)
{
	LinkedList l=new LinkedList();
						l.add("nelson");
						System.out.println(l);
											l.add(30);
											System.out.println(l);
						l.add(null);
						System.out.println(l);
											l.set(0,"software");
											System.out.println(l);
						l.add(0,"franklin");
						System.out.println(l);
											l.removeLast();
											System.out.println(l);
						l.addFirst("ccc");
						System.out.println(l);
											for(Object obj:l)
											System.out.println(obj);
}
}

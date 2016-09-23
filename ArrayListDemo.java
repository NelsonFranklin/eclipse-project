package Collecxions;
import java.util.*;
class ArrayListDemo
{
	public static void main(String[] args)
	{
ArrayList<String> I =new ArrayList<String>();
I.add("mrfrank");
I.addAll(100);
I.add("franklin");
I.add(null);	
	
	
	System.out.println(I);
	I.remove(2);
	System.out.println(I);
	I.add(2,"musike");
	I.add("nelson");
	System.out.println(I);
	I.remove(0);
	System.out.println(I);
	
	
}
}

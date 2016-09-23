package Collecxions;

import java.util.Enumeration;
import java.util.Vector;

class VectorDemo {
	public static void main() {
Vector n=new Vector();

{
	for( int i=0;i<=10;i++)
	{
		n.addElement(n);
		
	}

System.out.println(n);
Enumeration e=n.element();
while(e.hasMoreElements);
{
	Integer I=(Integer)e.nextElement();
	if(I%2==0)
System.out.println(I);
}

}

	}

}

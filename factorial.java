import java.util.*;
import javax.swing.*;
class test
{
	int no;
	String a;
	public void get()
	{
		a=JOptionPane.showInputDialog("\n Enter no for calculating factorial=");
		no=Integer.parseInt(a);
		System.out.println("\n factorial of Given no="+fact(no));
	}
	int fact(int x)
	{
		if(x>1)
		{
			return (x*fact(x-1));
		}
		return 1;
	}
}
class factorial
{
	public static void main(String[] args)
	{
		test t=new test();
		t.get();
	}
}


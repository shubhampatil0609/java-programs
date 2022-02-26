import java.util.*;
class FB
{
 	public static void main(String args[])
 	{
		int nterms, n1=0,n2=1,count=0,nth;
		System.out.println("how many terms:");
		Scanner sc=new Scanner(System.in);
		nterms=sc.nextInt();
		System.out.println("fibonacci sequence:");
		while(count<nterms)
		{
			System.out.println(n1);
			nth= n1+n2;
			n1=n2;
			n2=nth;
			count++;
		}
	}
}

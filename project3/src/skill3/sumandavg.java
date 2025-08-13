package skill3;

import java.util.*;
public class sumandavg {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
	    int[] arr=new int[n];
	    int sum=0;
	    System.out.println("Enter "+n+" elements");
	    for(int i=0;i<n;i++) {
	    	arr[i]=sc.nextInt();
	    	sum+=arr[i];
	    }
	    double avg=sum/n;
	    System.out.println("Sum is:"+sum);
	    System.out.println("Average is:"+avg);

	}

}

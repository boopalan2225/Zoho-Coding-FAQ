/*
Print second frequently occurring number in given series
Example :	Input: 1 1 2 3 1 2 4	Output: 2
*/
import java.util.*;
public class Freq {

	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
		String input = sc.nextLine();
		System.out.println(input);
		int i=0,j=0,a;
		int n[] = new int[10];
		for(i=0;i<input.length();i++) {
			if(input.charAt(i)!=' ') {
				a = Integer.parseInt(String.valueOf(input.charAt(i)));
				n[a]++;
			}
		}
		int max=0;
		for(i=0;i<10;i++) {
			if(n[i]>max) {
				max=n[i];
				j=i;
			}
		}
		max=0;
		for(i=0;i<10;i++) {
			if(n[i]>max && i!=j) {
				max=n[i];
				j=i;
			}
		}
	   	System.out.println(n[j]);
	   	sc.close();
		}
	}
}


/*
import java.util.*;
public class Freq {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	       String input = "";
	       String[] numbers = null;
    	   input = sc.nextLine();
           numbers = input.split(" ");
           int j=0;
	       int[] n = new int[numbers.length];
	       for(String i : numbers) {
	    	   n[j++]=Integer.valueOf(i);
	       }
	       int[] a = new int[10];
	       for(int i=0;i<n.length;i++) {
	    	   a[n[i]]++;
	       }
	       int max=0;
	       for(int i=0;i<10;i++) {
	    	   if(a[i]>max) {
	    		   max=a[i];
	    		   j=i;
	    	   }
	       }
	       max=0;
	       for(int i=0;i<10;i++) {
	    	   if(a[i]>max && i!=j) {
	    		   max=a[i];
	    		   j=i;
	    	   }
    	   }
	       System.out.println(a[j]);
	       
		sc.close();
	}

}
*/

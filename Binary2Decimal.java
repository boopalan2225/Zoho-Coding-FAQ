/*
Print pattern like this
Example:
Input: 1		Output: 
					0
					1
Input: 2		Output: 
					0 0
					0 1
					1 0
					1 1
Input: 3		Output:
					0 0 0
					0 0 1
					0 1 0
					0 1 1
					1 0 0
					1 0 1
					1 1 0
					1 1 1
 */
import java.util.*;
public class Binary2Decimal {
	public static void binary(int n,int digits) {
		int i=0,num=digits;
		int[] a = new int[digits]; 
		while(n!=0) {
			a[i++]=n%2;
			n/=2;
		}
		for(int j=num-1;j>=0;j--)
			System.out.print(a[j]+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m=(int)Math.pow(2,n);
		for(int i=0;i<m;i++) {
			binary(i,n);
		}
		sc.close();
	}
}

/*
import java.util.*;
public class Binary2Decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m=(int)Math.pow(2,n);
		for(int i=0;i<m;i++) {
			System.out.println(0+Integer.toBinaryString(i));
		}
		
		sc.close();
	}

}
*/


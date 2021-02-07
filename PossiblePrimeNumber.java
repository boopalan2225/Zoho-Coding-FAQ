/*
Find the largest possible prime number with given no
Input: 4691
Output: 9461
*/
import java.util.*;
public class PossiblePrimeNumber {

	public static boolean prime(int n) {
		if(n<2 || n%2==0)
			return false;
		else {
			for(int i=3;i<=Math.sqrt(n);i++) {
				if(n%i==0) 
					return false;
			}
			return true;
		}
	}
	public static int[] Int2TntArray(int n) {
		int l = String.valueOf(n).length();
		int[] a = new int[l];
		int i=0;
		while(n!=0) {
			a[i++]=n%10;
			n/=10;
		}
		return a;
	}
	public static int IntArray2Int(int[] a) {
		int n=0;
		for(int i=0;i<a.length;i++) {
			n=(n*10)+a[i];
		}
		return n;
	}
	public static int swap(int[] a,int i,int j) {
		int n=0,temp=0;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		n=IntArray2Int(a);
//		System.out.println(n);
		return n;
	}
//	public static int fact(int n) {
//		int sum=1,r;
//		while(n!=0) {
//			r=n%10;
//			sum*=r;
//			n/=10;
//		}
//		return sum;
//	}
//	static void printPermutn(String str, String ans) 
//	{ 
//		if (str.length() == 0) { 
//			return; 
//		} 
//
//		for (int i = 0; i < str.length(); i++) { 
//			char ch = str.charAt(i); 
//			String ros = str.substring(0, i) + 
//						str.substring(i + 1); 
//			printPermutn(ros, ans + ch); 
//		} 
//	} 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = Int2TntArray(n);
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i!=j) {
					int b=swap(a,i,j);
					if(prime(b)) {
						al.add(b);
					}
				}				
			}
		}
		
//		System.out.println("count: "+c);
//		for(int i : al)
//			System.out.print(i+" ");
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al.get(0)+" the largest possible prime number with given no "+n);
		sc.close();
	}

}
/*
import java.util.*;
public class PossiblePrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l=String.valueOf(n).length();
		char[] ch = String.valueOf(n).toCharArray();
		String[] str = new String[l];
		String s ="";
		for(int i=0;i<l;i++) {
			for(int j=0;j<l;j++) {
				
			}
		}
		sc.close();
	}

}
*/
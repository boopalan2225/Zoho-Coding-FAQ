/*
Print only numbers which is present in Fibonacci series (0 1 1 2 3 5 8 ……..)
Example:
Input: 2 10 4 8			Output: 2 8 
Input: 1 10 6 8 13 21	Output: 1 8 13 21
*/
import java.util.*;
import java.util.stream.*;
public class Fibonacci {
	public static int fib(int n) {
		if(n==0)
			return 0;
		else if(n==1 || n==2)
			return 1;
		else
			return fib(n-1) + fib(n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] s = str.split(" ");
		int[] n = new int[s.length];
		int j=0,max=0;
		for(String i:s) {
			n[j]=Integer.parseInt(i);
			if(n[j]>max)
			max=n[j];
			j++;
		}
		int[] f = new int[max+2];
		for(int i=0;i<=max;i++) {
			f[i]=fib(i);
		}
		for(int i=0;i<j;i++) {
			int m=n[i];
			if(IntStream.of(f).anyMatch(num -> num == m))
				System.out.print(m+" ");
		}		
		sc.close();
	}
}

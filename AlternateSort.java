/*
1) Alternate sorting: Given an array of integers, 
rearrange the array in such a way that the first
 element is first maximum and second element is first minimum.

    Eg.) Input  : {1, 2, 3, 4, 5, 6, 7}
         Output : {7, 1, 6, 2, 5, 3, 4} 
*/
import java.util.*;
public class AlternateSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] ch = s.split(", ");
		int l = ch.length;
		int[] a = new int[l];
		for(int i=0;i<l;i++) {
			a[i]=Integer.parseInt(ch[i]);
		}
		System.out.print("{"+a[l-1]);
		for(int i=0,j=l-2;i<l/2 || j>l/2;i++,j--) {
			System.out.print(", "+a[i]+", "+a[j]);
		}
		System.out.print("}");
		
		sc.close();
	}

}

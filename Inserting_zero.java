/*Insert 0 after consecutive (K times) of 1 is found.

Input:		Number of bits: 12
			Bits: 1 0 1 1 0 1 1 0 1 1 1 1
			Consecutive K: 2
Output:		1 0 1 1 0 0 1 1 0 0 1 1 0 1 1 0
 */
import java.util.*;
public class Inserting_zero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("Number of bits: ");
		int n = sc.nextInt();
//		System.out.print("Bits: ");
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			al.add(sc.nextInt());
		}
//		System.out.print("Consecutive K: ");
		int k = sc.nextInt();
		
		int f=0;
		for(int i=0;i<al.size()-(k-1);i++) {
			f=0;
			for(int j=i;j<i+k;j++) {
				if(al.get(j)==1) {
					f++;
				}
			}
			if(f==k)
				al.add(i+k,0);
		}
		for(int i=0;i<al.size();i++)
		System.out.print(al.get(i)+" ");
		sc.close();
	}
}

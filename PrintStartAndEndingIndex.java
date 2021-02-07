/* Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array
and search for substring like “too” in the two dimensional string 
both from left to right and from top to bottom.

input: WELCOMETOZOHOCORPORATION
w	e	L	C	O		(print Statement)
M	E	T	O	Z
O	H	O	C	O
R	P	O	R	A
T	I	O	N	

output:		Start index : <1,2>		End index: <3, 2>
*/
import java.util.*;
public class PrintStartAndEndingIndex {
	public static int n,len,l;
	public static String s, str;
	
	public static void coordinates(String s1){
		int i;
		for(i=0;i<l;i++) {
			if((s1.substring(i, i+len)).equals(s)) {
				break;
			}
		}
		System.out.println("Start index : <"+(i%n)+", "+(i/n)+">");
		System.out.println("End index: <"+(((i+len)-1)%n)+", "+((i+len)-1)/n+">");
	}
	
	public static boolean T2B(char ch[][]) {
		int k=0;
		String s1="";
		len=s.length();
		for(int i=0;i<n && k!=l;i++) {
			for(int j=0;j<n && k!=l;j++) {
				s1+=ch[j][i];
			}
		} 	
		if(s1.contains(s)) {
			coordinates(s1);	
			return true;
		}
		else
			return false;
	}
	
	public static boolean L2R(char ch[][]) {
		
		String s1=str;
		if(s1.contains(s)) {
			coordinates(s1);	
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		s = sc.nextLine();
		l = str.length();
		n = (int)Math.sqrt(str.length())+1;
		char[][] ch = new char[n][n];
		int k=0;
		for(int i=0;i<n && k!=l;i++) {
			for(int j=0;j<n && k!=l;j++) {
				ch[i][j]=str.charAt(k++);
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
		boolean r1 = T2B(ch);
		boolean r2 = L2R(ch);
		
		if(r1 == r2 && r1==false)
			System.out.println(s+" NOT FOUND");
		
		sc.close();
	}
}
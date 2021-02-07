/* Given a string of odd length convert it into cross character or cross string 
   (i.e Diagonal from left-right and from right-left)
   Example: 
   	Input: LOVE2CODE
    Output: 
      	L                 E
           O            D  
             V       O     
               E   C 
                 2 
               E   C
             V       O
           O            D  
         L                E
     Input: CROSS
     Output: 
      C       S
     	R   S
   	  	  O
     	R   S
      C       S
         
 */
import java.util.*;
public class Cross {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		int l=s.length();
		for(int i=0;i<l;i++) {
			for(int j=0;j<l;j++) {
				if(i==j || i+j==(l-1))
					System.out.print(ch[j]+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
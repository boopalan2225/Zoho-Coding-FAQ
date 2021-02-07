/*
3) Form a number system with only 3 and 4. Find the nth number 
of the number system.
Eg.) The numbers are: 
3, 4, 33, 34, 43, 44, 333, 334, 343, 344,
433, 434, 443, 444, 3333, 3334, 3343, 3344, 3433, 3434,
 3443, 3444 ….
*/
public class NthNumberUsing3and4 {
    static void find(int n) 
    {  
        String[] arr = new String[n+1]; 
        arr[0] = "";  
        int size = 1, m = 1; 
        while (size <= n) 
        { 
            for (int i=0; i<m && (size+i)<=n; i++) 
                arr[size + i] = "3" + arr[size - m + i]; 
            for (int i=0; i<m && (size + m + i)<=n; i++) 
                arr[size + m + i] = "4" + arr[size - m + i]; 
            m = m << 1; 
            size = size + m; 
        } 
        System.out.println(arr[n]); 
    } 
    public static void main (String[] args)  
    { 
        for (int i=0; i<16; i++) 
            find(i); 
    } 
}

//import java.util.*;
//	static StringBuffer sb = new StringBuffer();
//	static String str="";
//	static int a=3,b=4; 
//	static void bin(Integer n)
//	{
//		if (n > 1)
//			bin(n >> 1);
//		else
//			System.out.print(0);
//		if((n&1)==0)
//			System.out.print(a);
//		else if((n&1)==1)
//			System.out.print(b);
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int x=8;
//		for(int i=0;i<=x;i++) {
//			System.out.print(i+" -> ");
//			bin(i);
//			System.out.println();
//		}
//		
//		sc.close();
//	}
//
//}

/*
n=5 (3,4)
0 -> 3
1 -> 4

0 0 -> 3 3
0 1 -> 3 4
1 0 -> 4 3
1 1 -> 4 4

0 0 0 -> 3 3 3
0 0 1 -> 3 3 4
0 1 0 -> 3 4 3
0 1 1 -> 3 4 4
1 0 0 -> 4 3 3
1 0 1 -> 4 3 4
1 1 0 -> 4 4 3
1 1 1 -> 4 4 4

0 0 0 0 -> 3 3 3 3
0 0 0 1 -> 3 3 3 4
0 0 1 0 -> 3 3 4 3
0 0 1 1 -> 3 3 4 4
0 1 0 0 -> 3 4 3 3
0 1 0 1 -> 3 4 3 4
0 1 1 0 -> 3 4 4 3
0 1 1 1 -> 3 4 4 4
1 0 0 0 -> 4 3 3 3
1 0 0 1 -> 4 3 3 4
1 0 1 0 -> 4 3 4 3
1 0 1 1 -> 4 3 4 4
1 1 0 0 -> 4 4 3 3
1 1 0 1 -> 4 4 3 4
1 1 1 0 -> 4 4 4 3
1 1 1 1 -> 4 4 4 4
 
0 0 0 0 0 -> 3 3 3
0 0 0 0 1 -> 3 3 4
0 0 0 1 0 -> 3 4 3
0 0 
0 1 1 -> 3 4 4
0 0 1 0 0 -> 
0 0 1 0 1 -> 
0 0 1 1 0 -> 
0 0 1 1 1 -> 
0 1 0 0 0 -> 
0 1 0 0 1 -> 
0 1 0 1 0 -> 
0 1 0 1 1 -> 
0 1 1 0 0 -> 
0 1 1 0 1 -> 
0 1 1 1 0 -> 
0 1 1 1 1 ->
1 0 0 0 0 -> 
1 0 0 0 1 -> 
1 0 0 1 0 -> 
1 0 0 1 1 -> 
1 0 1 0 0 -> 
1 0 1 0 1 -> 
1 0 1 1 0 -> 
1 0 1 1 1 -> 
1 1 0 0 0 -> 
1 1 0 0 1 -> 
1 1 0 1 0 -> 
1 1 0 1 1 -> 
1 1 1 0 0 -> 
1 1 1 0 1 -> 
1 1 1 1 0 -> 
1 1 1 1 1 -> 


*/
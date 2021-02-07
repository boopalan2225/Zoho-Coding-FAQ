/*
Rotate the matrix elements
For 3*3 matrix
Input
1    2    3
4    5    6
7    8    9

Output:
4    1    2
7    5    3
8    9    6

For 4*4 matrix
Input:
1    2    3    4    
5    6    7    8
9    10    11    12
13    14    15    16

Output:
5    1    2    3
9    10    6    4
13    11    7    8
14    15    16    12
*/
import java.util.*;
public class MatrixRotate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int[][] b = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j && i==n/2)
					b[i][j]=a[i][j];
//				------------------------------
				else if(j==n-1 && i!=n-1)
					b[i+1][j]=a[i][j];
				
				else if(i==n-1 && j!=0)
					b[i][j-1]=a[i][j];
//				------------------------------
				else if(i>=0 && j!=n-1)
					b[i][j+1]=a[i][j];
				
				else if(j>=0 && i!=n-1)
					b[i-1][j]=a[i][j];
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
		sc.close();
	}

}

/*
Given an array of strings dates[], the task is to sort these dates in ascending order.
Input: dates[] = {"01 March 2015", "11 April 1996", "22 October 2007"}
Output:
11 April 1996
22 October 2007
01 March 2015

Input: dates[] = {"03 January 2018", "02 January 2018", "04 January 2017"}
Output:
04 January 2017
02 January 2018
03 January 2018
*/
import java.util.*;
public class SortDate {
	
	public static int MonthCode(String s) {
		String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	    for(int i=0;i<12;i++) {
	    	if(monthNames[i].equals(s))
	    		return i+1;
	    }
	    return -1;
	}
	public static String[][] swap(String[][] s,int i, int j){
		String[][] temp = new String[1][3];
		if(Integer.parseInt(s[i][2]) > Integer.parseInt(s[j][2])) {
			temp[0]=s[i];
			s[i]=s[j];
			s[j]=temp[0];
		}
		else {
			if(Integer.parseInt(s[i][1]) > Integer.parseInt(s[j][1])) {
				temp[0]=s[i];
				s[i]=s[j];
				s[j]=temp[0];
			}
			else {
				if(Integer.parseInt(s[i][0]) > Integer.parseInt(s[j][0])) {
					temp[0]=s[i];
					s[i]=s[j];
					s[j]=temp[0];
				}
			}
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dates[] = {"03 January 2018", "02 January 2018", "04 January 2017"};
		int l = dates.length;
		String[][] str = new String[l][3];
		for(int i=0;i<l;i++) {
			String s = dates[i];
			str[i]=s.split(" ");
			str[i][1]=String.valueOf(MonthCode(str[i][1]));
		}
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				str=swap(str,i,j);
			}
		}
		for(int i=0;i<l;i++) {
			System.out.println(str[i][0]+"-"+str[i][1]+"-"+str[i][2]);
		}
		
		
		
		sc.close();
	}
}
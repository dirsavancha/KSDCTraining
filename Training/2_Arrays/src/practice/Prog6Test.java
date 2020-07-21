// Provide Runtime  values

// Two Dimensonal

package practice;
import java.util.*;

class Prog6{
	
	static void show(){
		String[][] arr=new String[2][3];
		
		arr[0][0]="100";
		arr[0][1]="Ram";
		arr[0][2]="50";
		arr[1][0]="101";
		arr[1][1]="Hari";
		arr[1][2]="80";
		
		//System.out.println(arr[0].length);
		System.out.println("id\tname\tmarks");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		
	}
	
}

public class Prog6Test{
	
	public static void main(String...abc){
		Prog6.show();
	}
}
package ArraysProblems;

import java.util.Scanner;

public class FatherAndChild {
	
	
	public static int find(String names[][],String targetPerson){
		
		int noOfGrandChildren=0;
		
		for(String resultArr[]:names) {
			
			String child=resultArr[0];
			String father=resultArr[1];
			
			if(father.equals(targetPerson)) {
				for(String subResult[]:names) {
					if(subResult[1].equals(child)) {
						 noOfGrandChildren++;
					}
				}
				
			}
			
		}
		return noOfGrandChildren;
		
	}
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the array length you want:");//length=4
		int len=in.nextInt();
		System.out.println("Enter the target of names:");//ronaldo
		String target=in.next();
		System.out.println("Enter the child and father names:");//luke,shaw,wayne,rooney,rooney,ronaldo,shaw,rooney
		String[][] names=new String[len][2];
		
		for(int i=0;i<len;i++) {
			for(int j=0;j<2;j++) {
			names[i][j]=in.next();
			}
		}
		
		int count=find(names,target);
		
		System.out.println(target+" has "+count+" GrandChildren");
		
	}

}

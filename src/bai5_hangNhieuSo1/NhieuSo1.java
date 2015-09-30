package bai5_hangNhieuSo1;

import java.util.Scanner;

public class NhieuSo1 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int[][]array= {{1,1,1,1,0,0},{1,1,0,0,0,0},{1,0,0,0,0,0},{1,1,1,1,1,1},{1,1,1,1,0,0}};
		for(int pos=0; pos<array.length;pos++){
			for(int pos1=0; pos1<array.length;pos1++){
				System.out.print(array[pos][pos1]+" ");
			}
			System.out.println();
		}
		int count1=0,count2=0;
		for(int pos=0;pos<array.length;pos++){
			if(array[0][pos]==0||pos==array.length-1){
				if(pos==array.length){
					System.out.println("Hang co 1 dai nhat la:"+"0");
				}
				count1=pos-1;
				break;
			}
		}
		for(int pos1=1;pos1<array.length;pos1++){
			if(array[pos1][count1]==1){
				while(array[pos1][count1]==1){
					count1++;
					if(count1==array.length-1){
						System.out.println("Hang co 1 dai nhat la "+pos1);
						break;
					}
				}
			}
		}
			
		
	}
}

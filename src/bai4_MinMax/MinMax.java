package bai4_MinMax;

import java.util.Scanner;

public class MinMax {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang:");
		int length = input.nextInt();
		int array[]= new int[10];
		for(int pos=0;pos<length;pos++){
			System.out.println("Nhap phan tu thu "+pos+" vao:");
			array[pos]=input.nextInt();
		}
		int tempMax=array[0];
		int tempMin=array[0];
		int max,min,pos=0;
		max=min=array[0];
		for( pos=0;pos<length-2;pos=pos+2){
			if(array[pos]>array[pos+1]){
				tempMax=array[pos];
				tempMin=array[pos+1];
			}else{
				tempMax=array[pos+1];
				tempMin=array[pos];
			}
			max=tempMax>max?tempMax:max;
			min=tempMin<min?tempMin:min;
		}
		if(pos==length-1){
			max=max>array[pos]?max:array[pos];
			min=min<array[pos]?min:array[pos];
		}
		System.out.println("Min:"+min);
		System.out.println("Max:"+max);
	}

}

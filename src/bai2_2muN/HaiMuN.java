package bai2_2muN;

import java.util.Scanner;

public class HaiMuN {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap n vao:");
		int n = input.nextInt();
		int pos=0,product=1;
		float product1=1;
		if(n>0){
			if(n%2==0){
				product*=2;
				while(pos!=n/2){
					product*=product;
					pos++;
				}
			}else{
				product*=2;
				while(pos!=(int)n/2){
					product*=product;
					pos++;
				}
				product*=2;
			}
			System.out.println("2^"+n+"="+product);
		}else if(n==0){
			product=1;
			System.out.println("2^"+n+"= 1");
		}else{
			if(n%2==0){
				 product1*=0.5;
				while(pos!=Math.abs(n/2)){
					product1*=product1;
					pos++;
				}
			}else{
				product1*=0.5;
				while(pos!=Math.abs(n/2)){
					product1*=product1;
					pos++;
				}
				product1*=0.5;
		}
			
		System.out.println("2^"+n+"="+product1);
		
	}
 }
}
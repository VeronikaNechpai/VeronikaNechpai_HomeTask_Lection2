package by.epam.lesson2.hometask2;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args){
			double a=0;
			double b=0;
			double c=0;
			int sq=2;
			int q=3;
			Scanner sc=new Scanner(System.in);
			System.out.print("Введите a: ");
			if (sc.hasNextDouble()) {
				a=sc.nextDouble();
			}
			System.out.print("Введите b: ");
			if (sc.hasNextDouble()) {
				b=sc.nextDouble();
			}
			System.out.print("Введите c: ");
			if(sc.hasNextDouble()) {
				c=sc.nextDouble();
			}
			
			double one=0;
			double two=0;
			double thr=0;
			double fin=0;
			if (a!=0 & b!=0 & c!=0) {
				one=b+(Math.sqrt((Math.pow(b, sq)+(4*a*c))));
				two=2*a;
				thr=(Math.pow(a, q)*c);
				fin=((one/two)-thr)+b;
			}else {
			System.out.println("Введите a, b, c не равное нулю");
			   fin=Double.NaN;
			}
			System.out.println("Значение выражения = " +fin);
		
	}

}

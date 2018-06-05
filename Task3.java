package by.epam.lesson2.hometask2;

import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args){ 
		double r=0; 
		int ex=2;
		Scanner sc=new Scanner(System.in); 
		System.out.print("Введите r: ");
		if (sc.hasNextDouble()) {
			r=sc.nextDouble();
		}
		
		double c=0;
		double s=0;
		if (r!=0) {
			c=2*Math.PI*r;
			s=Math.PI*(Math.pow(r, ex));
		} else {
			System.out.println("Введите r не равное нулю.");
			c=Double.NaN;
			s=Double.NaN;
		} 
		System.out.println("Длина окружности = " + c);
		System.out.println("Площадь круга = " + s);
}
}
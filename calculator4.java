package Joji_package;
import java.util.Scanner;

public class calculator4 {
	public static void main(String[] args){
		Scanner g = new Scanner (System.in);
		
		System.out.println("put your first number.");
		int a = g.nextInt();
		
		System.out.println("put your second nuklmber.");
		int b = g.nextInt();
		
		System.out.println("put your operator.");
		String c = g.next();
		
		switch (c){
		case "+":{System.out.println(a+b);} break;
		case "-":{System.out.println(a-b);} break;
		case "*":{System.out.println(a*b);} break;
		case "/":{System.out.println(a/b);} break;
		case "%":{System.out.println(a%b);} break;
		
		}
		}
}


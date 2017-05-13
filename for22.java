package Joji_package;
import java.util.Scanner;
public class for22 {
	public static void main(String[] args){
		Scanner g=new Scanner(System.in);
		System.out.println("put your number.");
		int a=g.nextInt();
		if(a == 1){
			for(int b=1;b<=4;b++){
				for(int c=1;c<=b;c++){
					System.out.print(c);
				}
				System.out.println();	
		}
		}
		else{
			for(int d=1;d<=4;d++){
				for(int e=1;e<d;e++){
					System.out.print(" ");
				}
				for(int f=4;f>=d;f--){
					System.out.print(f);
				}
				System.out.println();
			}
		}
		
		
	}

}

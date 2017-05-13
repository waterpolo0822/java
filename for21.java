package Joji_package;

public class for21 {
	public static void main(String[] args){
		for(int a=1;a<=3;a++){
			for(int b=1;b<=4;b++){
				for(int c=1;c<=b;c++){
					System.out.print(" ");
				}
				for(int d=4;d>=b;d--){
					System.out.print(d);
				}
				System.out.println();
			}
		}
	}

}

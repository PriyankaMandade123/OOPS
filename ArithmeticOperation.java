import java.util.Scanner;
class ArithmeticOperation{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
 System.out.println("Enter the first number:");
    int a = sc.nextInt();
	System.out.println("Enter the second number:");
     int b = sc.nextInt();
	 System.out.println("Addition:" + (a+b));
	 System.out.println("Subtraction:" + (a-b));
	 System.out.println("Multiplication:" + (a*b));
	 System.out.println("Division:" + (a/b));
	 System.out.println("modulo :" + (a%b));


}

}
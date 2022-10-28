import java.util.Scanner;
class Addition{
public static void main(String org[]){
Scanner obj=new Scanner(System.in);
System.out.println("Enter The value of X");
int x=obj.nextInt();

System.out.println("Enter The value of Y");
int y=obj.nextInt();

System.out.println("The Addition of X+Y is "+(x+y));

System.out.println("The Subtraction of X-Y is "+(x-y));

System.out.println("The Multiplication of X*Y is "+(x*y));

System.out.println("The Division of X/Y is "+(x/y));
}
}

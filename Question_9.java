import java.util.Scanner;
class fibon{
public static void main(String org[]){
Scanner obj=new Scanner(System.in);
int fibo1=0;
int fibo2=1;
int fibo3;
int count=0;
System.out.println("Enter The Number of trems ");
int num =obj.nextInt();
System.out.printf("%d\n",fibo1);
System.out.printf("%d\n",fibo2);
count=2;
while(count<num){
fibo3=fibo1+fibo2;
count++;
System.out.printf("%d\n",fibo3);
fibo1=fibo2;
fibo2=fibo3;
}



}
}

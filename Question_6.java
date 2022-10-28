import java.util.Scanner;
class menu{
public static void main(String org[]){
Scanner obj=new Scanner(System.in);


System.out.println("Enter The choice ");

System.out.println("Enter 1 to find the price of Burger");

System.out.println("Enter 2 to find the price of Large Fries");

System.out.println("Enter 3 to find the price of Medium Fries");

System.out.println("Enter 4 to find the price of Small Fries");

System.out.println("Enter 5 to find the price Coca-Cola");

System.out.println("Enter 6 to find the price Orange Juice");

System.out.println("Enter 7 to find the price Sandwich");

System.out.println("Enter 8 to find the price Chicken");

System.out.println("Enter 9 to find the price Beef");

int choice =obj.nextInt();

switch(choice){
case 1: System.out.println("The Price Of Burger is: $2");
break;

case 2: System.out.println("The Price Of Large Fries is: $4");
break;


case 3: System.out.println("The Price Of Medium Fries is: $3");
break;


case 4: System.out.println("The Price OfSmall Fries is: $2");
break;


case 5: System.out.println("The Price Of Coca-Cola is: $3");
break;



case 6: System.out.println("The Price Of Orange Juice is: $1");
break;


case 7: System.out.println("The Price of Sandwich is: $2");
break;


case 8: System.out.println("The Price of Chicken is: $6");
break;


case 9: System.out.println("The Price Of Beef is: $5");
break;
}
}
}
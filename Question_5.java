import java.util.Scanner;
class wel{
	public static void main(String[] args){
	String mail;
        String pass;
	String[][] udata = { {"a@gmail.com","111"}, {"b@gmail.com","222"},{"c@gmail.com","333"},
        {"d@gmail.com","444"},{"e@gmail.com","555"}};

            System.out.println(" Welcome");

			Scanner obj = new Scanner(System.in);
			System.out.println("Enter Your Email Address: ");
			mail = obj.nextLine();
if(mail.equalsIgnoreCase(udata[0][0])|| mail.equalsIgnoreCase(udata[1][0]) || mail.equalsIgnoreCase(udata[2][0])|| mail.equalsIgnoreCase(udata[3][0]) || mail.equalsIgnoreCase(udata[4][0]))
            {
                System.out.println("Enter Your Password");
            }
            else 
            {
                System.out.print("Invalid Email");
            }
            pass=obj.nextLine();
if(pass.equalsIgnoreCase([0][1]) || pass.equalsIgnoreCase([1][1]) || pass.equalsIgnoreCase([2][1]) || pass.equalsIgnoreCase(udata[3][1]) || pass.equalsIgnoreCase([4][1]))
            {
              
            System.out.println("Login Successfully");
        }
          else
{
             System.out.print("Enter a valid Password");
}

}
}
}
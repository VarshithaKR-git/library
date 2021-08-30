import java.util.Stack;
import java.util.*;
public class MyStack1 {
public static void main(String[] args) {
	Stack<String> books=new Stack<String>();
	addBook1 ad=new addBook1();
	Scanner scan=new Scanner(System.in);
	while(true) {
		System.out.println("press1--------->Add Books");
		System.out.println("press2--------->to remove");
		System.out.println("press3--------->Display the book at top");
		System.out.println("press4--------->show all books");
		System.out.println("enter any number to exit"); 
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:System.out.println("press1------>add book to read in library");
		System.out.println("press2------->add book to carry home");
		System.out.println("enter any number for menu");
		int ch=scan.nextInt();
		if(ch==1) {
			ad.booktoread();
		       break;
		       }
		else if(ch==2) {
		      ad.checkoutbook();
		       break;
		      
		         }
		break;
		case 2:System.out.println("press1------>delete book which is added as read in library");
		System.out.println("press2------>delete book which is added as book to carry home");
		System.out.println("enter any number for menu");
		int chk=scan.nextInt();
		if(chk==1) {
			ad.removelib();
		}
		else if(chk==2)
		{
			ad.removecarryhome();
		}
		       break;
		       
		case 3: ad.displaytop();
		       break;
		        
		case 4:ad.displayall();
		       break;
		         
		default:System.exit(0);
		    
			
		}
	}
}
}
	
	
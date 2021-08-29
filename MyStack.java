import java.util.Stack;
import java.util.*;
public class MyStack {
public static void main(String[] args) {
	Stack<String> books=new Stack<String>();
	addBook ad=new addBook();
	Scanner scan=new Scanner(System.in);
	while(true) {
		System.out.println("press1--------->Add Books");
		System.out.println("press2--------->add to checkout");
		System.out.println("press3--------->to remove");
		System.out.println("press4--------->Display the book at top");
		System.out.println("press5--------->show all books");
		System.out.println("enter any number to exit"); 
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:ad.booktoread();
		       break;
		case 2:ad.checkoutbook();
		       break;
		case 3:ad.remove();
		       break;
		       
		case 4: ad.displaytop();
		       break;
		        
		case 5:ad.displayall();
		       break;
		         
		default:System.exit(0);
		    
			
		}
	}
}
}
	
	
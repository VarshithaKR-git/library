import java.util.*;
import java.util.Stack;
public class addBook1 {
String bookID,ISBN,title,author,publisher,checkout,duedate;

Stack<String> books=new Stack<String>();
Scanner scan=new Scanner(System.in);		
public void booktoread() {
	System.out.print("Enter the bookId");
	this.bookID=scan.nextLine();
	books.push(bookID);
	System.out.print("Enter the ISBN");
	this.ISBN=scan.nextLine();
	books.push(ISBN);
	System.out.print("Enter the Title");
	this.title=scan.nextLine();
	books.push(title);
	System.out.print("Enter the author");
	this.author=scan.nextLine();
	books.push(author);
	System.out.print("Enter the publisher");
	this.publisher=scan.nextLine();
	books.push(publisher);
	return;
}
	
public void checkoutbook()

{	
	System.out.print("Enter the bookId");
	this.bookID=scan.nextLine();
	books.push(bookID);
	System.out.print("Enter the ISBN");
	this.ISBN=scan.nextLine();
	books.push(ISBN);
	System.out.print("Enter the Title");
	this.title=scan.nextLine();
	books.push(title);
	System.out.print("Enter the author");
	this.author=scan.nextLine();
	books.push(author);
	System.out.print("Enter the publisher");
	this.publisher=scan.nextLine();
	books.push(publisher);
	System.out.print("Enter the checkout");
	this.checkout=scan.nextLine();
	books.push(checkout);
	System.out.print("Enter the duedate");
	this.duedate=scan.nextLine();
	books.push(duedate);
	return;

}

public void removelib() {

    	    if(books.size()==0)
    	    {
    	    		System.out.println("Stack is empty"); 
    	    }
    	    else
    	    {
    	    //System.out.println();
    	    System.out.print("Enter the bookId"); 
    		this.bookID=scan.nextLine();
    		books.remove(bookID);
    		System.out.print("Enter the ISBN");
    		this.ISBN=scan.nextLine();
    		books.remove(ISBN);
    		System.out.print("Enter the Title");
    		this.title=scan.nextLine();
    		books.remove(title);
    		System.out.print("Enter the author");
    		this.author=scan.nextLine();
    		books.remove(author);
    		System.out.print("Enter the publisher");
    		this.publisher=scan.nextLine();
    		books.remove(publisher);
    	    System.out.println("The deleted book is: bookID:"+bookID+", ISBN:"+ISBN+ ", Title:"+title+", author:"+author+", publisher:"+publisher);
    	    }
         }
 public void removecarryhome() {
	 if(books.size()==0)
	    {
	    		System.out.println("Stack is empty"); 
	    }
	 else
	 {
	    //System.out.println();
	    System.out.print("Enter the bookId"); 
		this.bookID=scan.nextLine();
		books.remove(bookID);
		System.out.print("Enter the ISBN");
		this.ISBN=scan.nextLine();
		books.remove(ISBN);
		System.out.print("Enter the Title");
		this.title=scan.nextLine();
		books.remove(title);
		System.out.print("Enter the author");
		this.author=scan.nextLine();
		books.remove(author);
		System.out.print("Enter the publisher");
		this.publisher=scan.nextLine();
		books.remove(publisher);
		System.out.print("Enter the checkout");
		this.checkout=scan.nextLine();
		books.remove(checkout);
		System.out.print("Enter the duedate");
		this.duedate=scan.nextLine();
		books.remove(duedate);
	    System.out.println("The deleted book is:bookid:"+bookID+", ISBN:"+ISBN+ ", title:"+title+", author:"+author+", publisher"+publisher+", duedate"+duedate+", checkout"+checkout);
	 }   
}
     
     
public void displaytop() 
{
    	// for(int i=books.size();i>books.size()-1;i--)
    	 
		 System.out.println("The top book is:bookID:"+bookID+", ISBN:"+ISBN+", title:"+title+", author:"+author+", publisher:"+publisher);
    	 
}
   
     
public void displayall() 
{
    	 System.out.println(books);
    		
 }


}
    	 
     

		

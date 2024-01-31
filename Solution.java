package firstproject;
import java.util.*;


public class Solution {
    public static void main(String args[] ) throws Exception {
    Book[] books = new Book[4];
        double min = 0;
        double max = 0;
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<books.length;i++)
        {
            int id = sc.nextInt();
            String title = sc.nextLine();
            String author = sc.nextLine();
            sc.nextLine();
            double price = sc.nextDouble();
            
            books[i]= new Book(id,title,author,price);
        }
        min = sc.nextDouble();
        max = sc.nextDouble();
        
        sc.close();
        
        Book[] newBooks = booksWithPriceRange(min,max,books);
        
    for(Book b:newBooks)
             System.out.println(b.getId());
    }
    
    //implement business methods here
    public static Book[] booksWithPriceRange(double min,double max,Book[] books){
        Book temp;
        int count = 0,a=0;
        for(int i = 0;i<books.length;i++){
            if(books[i].getPrice()>min && books[i].getPrice()<max){
                count = count + 1;
            }
        }
        
        Book[] b = new Book[count];
        for(int n = 0;n<count;n++){
            if(books[n].getPrice()>min && books[n].getPrice()<max){
                b[a++] = books[n];
            }
        }
        for(int j=0;j<count;j++){
            for(int k=j+1;k<count;k++){
            	if(b[j] != null && b[k] != null) {
            		if(b[j].getId()>b[k].getId()){
                        temp = b[j];
                        b[j] = b[k];
                        b[k] = temp;
                    }
            	}    
            }
        }
        return b;
    
        
    }
}

class Book
{
    //implement class here
    int id;
    String title;
    String author;
    double price;
    
    public Book(int id,String title,String author,double price){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
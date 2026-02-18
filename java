\\1. DATATYPE USING USER INPUT
 import java.util.*;
class   data {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        byte  b = sc.nextByte();
        int i  = sc.nextInt();
        short s = sc. nextShort();
         float f= sc. nextFloat();
         double d = sc. nextDouble();
         char c = sc.next().charAt(0);
         String str= sc.nextLine();
        
          sc.nextLine();// getting string input between some variable
         long l = sc. nextLong();
         System.out.println("b");
        System.out.println("i");
        System.out.println("s");
           System.out.println("f");
           System.out.println("d");
           System.out.println("str");
            System.out.println("l");
    }
    }




% 10 = return last digit
/10 = remove last digit


/// 2.DIGIT EXTRACTION: Sum of the digit

import java.util.*;
class   data {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        while(a>0){
           int r=a%10;
           System.out.println(r);
            sum= sum+r;
            a=a/10;
        }
        
        System.out.println(sum);
    }
}

3. reverse a digit
            



import java.util.*;
class   data {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev=0;
        while(a>0){
           int re=a%10;
           
            rev= rev*10+re;
            a=a/10;
           
        }
        System.out.println(rev);
        
    }
}
  


4.PALINDROME

import java.util.*;
class   data {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev=0;
        int temp=a;
        while(a>0){
           int re=a%10;
           
            rev= rev*10+re;
            a=a/10;
           
        }
        if(rev== temp) {
        System.out.println("palindrome");
        
    }
      else{
          System.out.println("not a palindrome"); 
      }
}
}




5.UPPER LOWER CASE

import java.util.*;
class   data {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if( ch >='A' && ch <='Z'){
            System.out.println((char)(ch+32));
            
        } else if (ch>='a'&& ch >='z'){
            System.out.println((char)(ch -32));
        } else {
            System.out.println(ch);
        }
        
    }
}

////  FACTORIAL AND COUNT

import java.util.*;

public class data {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int count =0;
         for(int i=2; i<=num/2; i++){
           
           if(num%i==0){
           
           count ++;
         }
         }
         
      System.out.println(count+2);
    }
}



/// PRIME OR NOT



import java.util.*;

public class data {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int count =0;
         for(int i=1; i<=num; i++){
           
           if(num%i==0){
           
           count ++;
         }
         }
         if (count==2){
      System.out.println("prime");
    } 
      else {
      System.out.println(" not a prime");
    }
}
}


////  square root 

import java.util.*;

public class data {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
         int base =sc.nextInt();
         int power= sc.nextInt();
         
         int m=1;
          for(int i=1; i<= power; i++){
              m=m*base;
              System.out.print(m);
          }
    }
}
         


////ARMSTRONG NUMBER


import java.util.*;
public class main  {

    Scanner sc = new Scanner(System.in);
    int num= sc.nextInt();
    int count=0;
    int temp=num;
    
    while(num>0){
        
        count++;
       
        num= num/10;
    }
      num= temp;
      int sum =0;
    while(num>0){
        int r= num %10;
        int sum =sum + Math.pow(r,count);
        num = num/10;
    }
    
    if (temp== sum){
        System.out.println("Armstrong number");
        
    }
    
    else {
       System.out.println(" not a Armstrong number");  
    }
}


//////////////////////////////  ALPHABET, DIGIT, SPECIAL CHARACTER

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new sc(System.in);
	    char ch = sc.next().chatAt(0);
	    if (ch>='A'&& ch <='Z'|| ch >='a'&& ch >='z'){
	        	System.out.println("Alphabet");
	        	
	    }
	    
	    else if ( ch>= '0' && ch <=9){
	       	System.out.println("digits");
	       	
	    }
	     else {
	         System.out.println("Specialcharacter ");
	     }
		
	}
}
	https://onlinegdb.com./RPzPB5gnJR


////////ARRAY COPILE TIME INPUT


	import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new  Scanner(System.in);
	    int a []= {1,2,3,4,5};
	    for (int x:a){
	        System.out.print(x + " ");
	    }
	    
	}
}


///////////////////// RUNTIME INPUT ARRAY& sum of the values

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new  Scanner(System.in);
	    int size = sc. nextInt();
	    int arr[] = new int [size];
	    
	    for (int i=0;i<size; i++){
	        arr[i]= sc.nextInt();
	        
	    
	}
	          int sum=0;
	 for (int i=0;i<size; i++){
	     sum= sum + arr[i]
	     System.out.println(sum);
	
}
	    
	}
}



//////////SUM ODD EVEN SEPERATELY



import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new  Scanner(System.in);
	    int size = sc. nextInt();
	    int arr[] = new int [size];
	    
	    for (int i=0;i<size; i++){
	        arr[i]= sc.nextInt();
	        
	    
	}        int sum =0;
	          int oddsum=0;
	          int evensum =0;
	          
	 for (int i=0;i<size; i++){
	     if (arr[i] %2==0){
	         evensum=evensum+arr[i];
	 }
	 else{
	     oddsum=oddsum=arr[i];
	 }
	     sum= sum + arr[i];
	     System.out.println(evensum + ""+oddsum);
	
}
	    
	}
}








\\\\\\\\\\\\\  MINIMUM
	import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new  Scanner(System.in);
	    int size = sc. nextInt();
	    int arr[] = new int [size];
	    
	    for (int i=0;i<size; i++){
	        arr[i]= sc.nextInt();
	        
	    
	}      
	
	int min = arr[0];
	for (int i=1; i>size; i++){
	    if(arr[i]> min){
	        min=arr[i];
	        
	    }
	}
	
	
	 System.out.println(min);
	}
}



\\\\\\\\\\\\\\\SECOND MAX

	import java.util.Scanner;
public class Main
{
    
	public static void main(String[] args) {
	    
	    Scanner sc = new  Scanner(System.in);
	    int size = sc. nextInt();
	    int arr[] = new int [size];
	    
	    for (int i=0;i<size; i++){
	        arr[i]= sc.nextInt();
	        
	    
	}      
	
	int firstmax = arr[0];
	for (int i=0; i>size; i++){
	    if(arr[i]>firstmax){
	        firstmax=arr[i];
	        
	    }
	}
	int  secondmax = arr[0];
	for (int i=0; i>size; i++){
	    if(arr[i]> secondmax&&arr[i]<firstmax ){
	        secondmax=arr[i];
	        
	
	 System.out.println(secondmax);
	}
}
}
}



///////////////////////////////////
import java.util. *;

 public class main {
     public static boolean prime(int a){
         int count =0;
         for(int i=1; i<=a;i++){
             if( a%i==0){
                 count++;
             }
         }
           if(count ==2){
               return true;
           }
           
             else{
                 return false;
             }
     }
     
     
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         int num = sc.nextInt();
         int num1 = sc.nextInt();
         
        System.out.println(prime(num));
          System.out.println(prime(num1));
    }
}






//////////////////////////  METHODS //////////////


set of code for reuseablity;

types:  

predefined methods =  max(), min(), println(), nextInt()
userdefined methods  

	4 types
	with argument with return= (10, 20)
	with argument without return = prinln
	without argument with return = length(), nextInt()
	without  argument without return=   
	
	

	define/ call

	 public/ private  = keyword,
	static / non-static= use object
	return: int ,float / non return: void --------- return single variable

	method name ()

	public static int sum(){
}   ---------------- method defenition



	public static int sum(); ------------ method declarartion

	
     sum();--------- method calling

	 sum(10,20);-------arguments


	public static int sum( int a, int b)------ parameter


	
	


	///////////////// WITH ARGUMENT WITH RETURN ////////////


	import java.util. *;

 public class main {
     public static boolean prime(int a){
         int count =0;
         for(int i=1; i<=a;i++){
             if( a%i==0){
                 count++;
             }
         }
           if(count ==2){
               return true;
           }
           
             else{
                 return false;
             }
     }
     
     
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         int num = sc.nextInt();
         int num1 = sc.nextInt();
         
        System.out.println(prime(num));
          System.out.println(prime(num1));
    }
}



OUTPUT

	23
	23

	true
true



\\\\\\\\\\\\\\\\\\\\  WITH ARGUMENT WITHOUT RETURN (Non static) |||||||||||||||||
	
	import java.util. *;

 public class main {
     public void  prime(int a){
         int count =0;
         for(int i=1; i<=a;i++){
             if( a%i==0){
                 count++;
             }
         }
           if(count ==2){
              System.out.println(true) ;
           }
           
             else{
                System.out.println(false) ;
               
             }
     }
















	 /////////////////////////////////////////////////// DATA STRUCTUR ///// LINKED LIST\\\\\\\\\\\\\\\\\\

	 class Node{
     int data;
      Node next;
}

public class Main{
    public static void main (String[]args){
        Node n1 = new Node();
         n1.data = 34;
         Node n2 = new Node();
         n2.data = 67;
         n1.next= n2;
         Node n3 = new Node();
         n3.data = 90;
         n2.next= n3;
         System.out.println(n1.data+" "+ n1.next.data+" "+ n1.next.next.data);
          System.out.println(n1.data+" "+ n2.data+" "+ n3.data);
         
    }
}



	 //////////////////////  SINGLY LINKED LIST   AT BEGIN ////////////////////////////
	 
     
     //////////////////////  SINGLY LINKED LIST   AT END ////////////////////////////
    



//////////////////////  SINGLY LINKED LIST   AT POSITION //////////////////////
	 class Node{
     int data;
      Node next;
      Node(int d){
          data= d;
          next=null;
      }
}

 class singlylist {
    Node head = null;
    Node  tail= null;
    int size=0;
    void add(int data){
        Node newnode = new Node(data);
        if(head ==null){
            head= tail=newnode;
            
        }
        else{
            tail.next= newnode;
            tail= newnode;
            
        }
    }
    
    void addatbeg(int data){
        Node newnode= new Node(data);
       
        if(head ==null){
            head= tail=newnode;
            
            
        }
           else{
               newnode.next= head;
               head= newnode;
           }
               
    }
    void addatpos(int data, int pos){
    if(pos<=0 || pos>size+1){
        System.out.println("please enter a vaild pos");
        return;
    }
    
    if (pos==1){
        addatbeg(data);
        return;
    }
    if (pos==size +1){
        add(data);
        return;
    }
    Node newnode = new Node(data);
    size ++;
    if (head ==null){
        head=tail=newnode;
    }
    
    else{
        Node temp=head;
        for (int i=1;i< pos-1;i++ ) {
            temp=temp.next;
        }
    newnode.next=temp.next;
    temp.next=newnode;
}
}
    
     void display(){
         Node temp= head;
         while(temp != null ){
             System.out.print(temp.data+" ");
             temp= temp.next;
             
         }
         
         System.out.println();
     }
}
  
 class Main{
    public static void main (String[]args){
        singlylist s= new singlylist ();
        s.add(100);
         s.add(200);
          s.add(300);
        s.display();
        s. addatbeg(400);
        s.display();
        s.addatpos(1050,3);
        s.display();
    }
 }



	 ////////////////////////////////////////////////   LINKED LIST USING SWICH CASE  //////////////
	https://www.onlinegdb.com/vZGIerloL





	 ////////////////LINKED LIST USING SWICH CASE////////////////

	 void deletelast(){
    if(head==null){
        System.out.println("No elemnt to delete");
        return;
    }
    
     Node temp=head;
     while(temp.next!= tail){
         temp= temp.next;
         
     }
     
     
     tail = temp;
     tail.next= null;
     
}


void dispaly(){
    Node temp = head;
    while(temp!= null){
        
    }
}

	 htttps://onlinegdb.com/KASK-Htlm








	 /////////////// DELETE AT BEGINING//////////////////
	 import java.util.*;

class Node{
  int data;
  Node next;
  
  Node(int a){
    data=a;
    next=null;
  }
}
class singlylinkedlist{
  Node head=null;
  Node tail=null;
  int size=0;
  
  void add(int data){
    size++;
    Node newnode=new Node(data);
    if(head==null){
      head=tail=newnode;
    }
    else{
       tail.next=newnode;
       tail=newnode;
    }
    
  }
  void addatbeg(int data){
    Node newnode=new Node(data);
    size++;
    if(head==null){
      head=tail=newnode;
    }
    else{
      newnode.next=head;
       head=newnode;
    }
    
  }
  
  void addatpos(int data,int pos){
  if(pos<=0||pos>size+1){
  System.out.println("enter a valid one");
  return;
  }
  if(pos==1){
    addatbeg(data);
    return;
  }
  if(pos==size+1){
    add(data);
    return;
  }
  Node newnode=new Node(data);
  size++;
  if(head==null){
    head=tail=newnode;
  }
  else{
    Node temp=head;
    for(int i=1;i<pos-1;i++){
      temp=temp.next;
    }
   newnode.next=temp.next;
   temp.next=newnode;
  }
    
  }
  
   void deleteatbeg(){
       if(head==null){
           System.out.println("NO element to delete");
           return;
       }
         head= head.next;
   }
  void display(){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
	  
    System.out.println();
  }
}

public class Main {
    public static void main(String[] args) {
      singlylinkedlist s =new singlylinkedlist();
      s.add(100);
      s.add(200);
      s.add(300);
      s.add(400);
      s.display();
      s.deleteatbeg();
      s.display();
       s.deleteatbeg();
      s.display();
    }
}








https:// onlinegdb.com/Ntju9Nt5p\\\\\\\\\\\\\\\\\\\\\ over all deletion
https:// onlinegdb.com/Ntju9Nt5p
	 



	
	

    

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main     //class
{
    Node head;           //field 
    private int count=0;  //private field which is intilized to 0
    class Node{           // A class node
      String data;      // field of class Node
      Node next;  
      
      Node(String data){     //parametrized constructor which take string as parameter //constructor name is same as class name
          this.data=data;    //this mean data of this specified class
          this.next=null;
      }
    }
    public void addFirst(String data){   //a method which has a visibility modifier as public , return type as void , method name and take paramter as string.
        Node newNode=new Node(data); // we make a reference variable and stored in newNode. Wile using new, we allocated a memory. It take a parameter because it is a parameterized constructor not a default constructor.
        if(head==null)      // it is a base condition if head is null, a newNode is the first element in the list
        {
            head=newNode;
            return;
        }
        newNode.next=head;  //if it is not a first element, then the element will be added further
        head=newNode;
    }
    public void addLast(String data){ //a method which has a visibility modifier as public , return type as void , method name and take paramter as string.
        Node newNode=new Node(data);
        if(head==null)  //base condition
        { 
            head=newNode;
            return;
        }
        Node currentNode=head;  //we will take a tempory node as currentNode. As we do not store head in a tempory node, then the value of head will be lost.
        while(currentNode.next != null)
        {
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }
    public void printList(){
        if(head==null)
        {
            System.out.print("List is empty");  //base condition
        }
        Node currentNode=head;
        while(currentNode!=null)
        {
            System.out.print(currentNode.data+"-->");
            currentNode=currentNode.next;
        }
        System.out.print("null");
    }
    public void deleteFirst(){
        if(head==null)
        {
            System.out.print("List is empty");
        }
        head=head.next;
    }
    public void deleteLast(){   //there are two base condition for this method
        if(head==null)   //if there is no element in list
        {
            System.out.print("List is empty");
        } 
        if(head.next==null)  //if there is only one element in list. If we do not consider this case then it will produce error
        {
           head=null; 
        }
        Node secondLastNode=head;
        Node lastNode=head.next;
        while(lastNode.next != null)
        {
            secondLastNode=secondLastNode.next;
            lastNode=lastNode.next;
        }
        secondLastNode.next=null;
    }
    public int countLength(){   //returntype of this method will be int as it will return size of list
        Node currentNode=head;
        while(currentNode!=null)
        {
            count++;
            currentNode=currentNode.next;
        }
        return count;
    }
	public static void main(String[] args) {
	Main list=new Main();
	list.addFirst("Navya");
	list.addLast("Nehika");
	list.addFirst("Anjal");
	list.addLast("Garima");
	list.deleteLast();
	list.deleteFirst();
	list.printList();
	int length=list.countLength();  //as this method has a return type, so we store it in a variable with int data type and then return its value
	System.out.println("length is "+length);
	}
}

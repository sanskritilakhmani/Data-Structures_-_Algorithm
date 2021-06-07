import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node prevoius;
}

public class DoublylinkedList {
    Node head;
    DoublylinkedList(){
        head=null;
    }
    public void insert(){
        System.out.println("enter the elements");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Node newnode=new Node();
        newnode.data=a;
        newnode.next=null;
        if(head==null){
            head=newnode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }   temp.next=newnode;
            newnode.prevoius=temp.next;
            System.out.println("insertde");
        }
    }
    void Display(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node i;
            for(i=head;i!=null;i=i.next){
                System.out.print( " "+i.data);
            }
        }

    }
    public void addbegin()
    {
       if(head==null)
       {
           System.out.println("you can't add at the beginin because of no other element is there0");
       }
       else
       {   Node newnode=new Node();
           System.out.println("enter the values");
           Scanner sc=new Scanner(System.in);
           int a=sc.nextInt();
           newnode.data=a;
           newnode.next=head;
           head.prevoius=newnode;
           head=newnode;
           System.out.println("valus inserted at the begining");
       }
    }
    public void delete()
    {
        if(head==null)
        {
            System.out.println("can't delete due to empty");
        }
        else
        {
            head=head.next;
            head.prevoius=null;
        }
    }


    public static void main(String[] args) {
        DoublylinkedList obj1=new DoublylinkedList();
        while(true){
            Scanner sc=new Scanner(System.in);
            System.out.println("\n press 1 for insert the values");
            System.out.println("press 2 for display the values");
            System.out.println("press 3 to insert item at the begining");
            System.out.println("press to delete item from the begining");

            int a=sc.nextInt();
            switch (a){
                case 1:
                    obj1.insert();
                    break;
                case 2:
                    obj1.Display();
                    break;
                case 3:
                    obj1.addbegin();
                    break;
                case 4:
                    obj1.delete();
                    break;
                default:
                    System.out.println("hello wrong choice");
            }
        }
    }
}

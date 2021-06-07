 import java.util.Scanner;

class Node{
    int data;
    Node next;

}
public class SinglyLinkedList {
    Node head;

    SinglyLinkedList() {
        head = null;

    }

    void insert() {
        System.out.println("enter the values ");
        Scanner sc = new Scanner(System.in);
        Node newnode = new Node();
        int add = sc.nextInt();
        newnode.next = null;
        newnode.data = add;
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        System.out.println("congratulations! your data successfully inserted");

    }

    void traverse() {
        if (head == null) {
            System.out.println("Sorry it's an empty list");
        } else {
            Node i;
            for (i = head; i != null; i = i.next) {
                System.out.print(" " + i.data);
            }
        }
    }
    void delete(){
        Node temp;
        if(head==null){
            System.out.println("Empty list");
        }else{
            Node one=head;
            Node two=null;
            while(one.next!=null){
                two=one;
                one=one.next;

            }
            System.out.println("deleted:: "+one.data);
            two.next=null;
        }

    }

    void Search(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            System.out.println("enter a value to search");
            Scanner Sc=new Scanner(System.in);
            int num=Sc.nextInt();
            Node temp;
            int c=0;
            for (temp =head; temp!=null; temp=temp.next) {
                if(temp.data==num){
                c++;
                break;
                }
            }
            if(c>0){
                System.out.println("element found");
            }else{
                System.out.println("element not found");
            }

        }

    }
    void addfrnt(){
        if(head==null){
            System.out.print("cant be initialize at begining");
        }else{
            System.out.println("enter a element to insert at the begining");
            Scanner sc=new Scanner(System.in);
            int b=sc.nextInt();
            Node newnode=new Node();
            newnode.data=b;
            newnode.next=head;
            head=newnode;
        }
    }
    void deletefront(){
        if(head==null){
            System.out.println("list is empty");
        }else{
            head=head.next;
            System.out.println("value is deleted from the begining");
        }
    }
    void Addspecificposition(){
        if(head==null){
            System.out.println("list is empty you can't insert");
        }else{
            System.out.println("enter the positon");
            Scanner sc=new Scanner(System.in);
            Node newnode=new Node();
            int a=sc.nextInt();
            System.out.println("enter the element to insert");
            int b=sc.nextInt();
            newnode.data=b;
            Node temp=head;
            for (int i = 0; i < a-1; i++) {
                temp=temp.next;
            } newnode.next=temp.next;
            temp.next=newnode;
            System.out.println("valus inserted at spetificposition");
        }
    }
    void deleteatspecificposition(){
        if(head==null){
            System.out.println("list is empty");
        }else{
            System.out.println("enter the poition to delete the value");
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            Node current=head;
            Node previous=null;
            for (int i = 0; i <=num-1; i++) {
                previous=current;
                current=current.next;
            }
            if(current==head){
                head=null;
            }else{
             previous.next=current.next;
        }}
    }

        public static void main(String[] args){
            SinglyLinkedList obj = new SinglyLinkedList();
            while (true) {
                System.out.println("\npress 1 for insert the value");
                System.out.println(" press 2 for traverse the list");
                System.out.println("press 3 for delete  the value from the list");
                System.out.println("press 4 for search  the value from in the list");
                System.out.println("press 5 for insert the value in the begining");
                System.out.println("press 6 for delete the element from the bigining");
                System.out.println("press 7 for insert the value at the specific position");
                System.out.println("press 8 to delete at specific position");
                System.out.println("press 9 for exit");
                System.out.println("Enter a choice");
                Scanner sk = new Scanner(System.in);
                int a = sk.nextInt();
                switch (a) {
                    case 1:
                        obj.insert();
                        break;
                    case 2:
                        obj.traverse();
                        break;
                    case 3:
                        obj.delete();
                        break;
                    case 4:
                        obj.Search();
                        break;
                    case 5:
                        obj.addfrnt();
                        break;
                    case 6:
                        obj.deletefront();
                        break;
                    case 7:
                        obj.Addspecificposition();
                        break;
                    case 8:
                        obj.deleteatspecificposition();
                        break;
                    case 9:
                        System.exit(0);
                    default:
                        System.out.println("wrong choice");

                }
            }
        }
}

import java.util.Scanner;
class Qnode
{
    int value;
    Qnode next;
}
interface ADTQueue
{
    abstract void insert(int data);
    abstract int delete();
    abstract boolean isEmpty();
    abstract void traverse();
    abstract boolean search(int sea);
    
    
}
public class Myqueue implements ADTQueue
{
    Qnode front ,rear;
    
    Myqueue()
    {
        front=rear=null;
    }
    public void insert(int data)
    {
        Qnode newnode=new Qnode();
        System.out.println("enter the data to be inserted ");
        
        newnode.value=data;
        newnode.next=null;
        if(front==null||rear==null)
        {
            rear=front=newnode;
        }
        else
        {
            Qnode temp;
            temp=front;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
     
        }
    }
    public int delete(){
        int val=front.value;
        front=front.next;
        return val;
    }
    public boolean isEmpty()
    {
        if(rear==null||front==null)
        {
            return true ;
        }
        else return false;
    }
    public void traverse()
    {
        Qnode temp;
        if(front==null||rear==null)
        {
            System.out.println("queue is empty");
        }
        else
        {
            for (temp=front;temp!=null;temp=temp.next)
        
            {
                System.out.println(temp.value);
            
            }
        }
    }
    public boolean search(int sea)
    {
        Qnode temp;
        for(temp=front;temp.next!=null;temp=temp.next)
        {
            if(sea==temp.value)
            {return true;
            }
            else{return false;}
        }
        }
}

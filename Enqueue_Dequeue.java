public class Queuebyarray12 {
    int arr[];
    int top=-1;
    int begin=-1;
    int capacity;
    Queuebyarray12(int capacity)
    {
        arr=new int[capacity];
        begin=-1;
        top=-1;
        this.capacity=capacity;
    }
    public boolean isEmpty()
    {
        return (top==-1);
    }
    public boolean isFull()
    {
        return (begin==0 && top+1==capacity);
    }
    public void Enqueue(int value)
    {
        if(isFull())
        {
            System.out.println("the queue is full");
            return;
        }
        else if(isEmpty())
        {
            begin++;
            top++;
            arr[top]=value;
    }
        else
        {
            arr[top+1]=value;
            top++;
        }
    }
    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("queue is empty");
            return;
        }
        else
        {
            System.out.println(arr[begin]);
            begin++;
        }
        if(begin>top)
        {
            begin=top=-1;
        }
    }

    public void show()
    {
        for (int i = begin; i <=top ; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        Queuebyarray12 obj=new Queuebyarray12(5);
        obj.Enqueue(2);
        obj.Enqueue(3);
        obj.Enqueue(5);
        obj.Enqueue(8);
        obj.show();
        obj.dequeue();
        obj.show();

    }
}

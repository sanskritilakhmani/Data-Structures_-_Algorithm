import java.sql.SQLOutput;

public class QueueByArray1 {
    int arr[];
    int top;
    int begining;
    int size;
    QueueByArray1(int size)
    {
        arr=new int[size];
        top=-1;
        begining=-1;
    }
    public void enqueue(int values)
    {
    if(begining==-1)
        {
         arr[begining+1]=values;
         begining++;
         top++;

        }
        else
        {
            arr[top+1]=values;
            top++;

        }
    }
    public void show()
    {
        if(begining==-1 && top==-1)
        {
            System.out.println("nothing to show");
        }
        else
        {
        for (int i = begining; i <=top; i++) {
            System.out.print(arr[i]+" ");

        }
    }}
    public void delete()
    {
        if(begining==-1 && top==-1)
        {
            System.out.println("you can't delete due to empty queue");
        }
        else
        {
            int remove=arr[begining];
            arr[begining]=0;
            begining++;
            System.out.println("value deleted "+remove);
        }
    }
    public void peek()
    {
        if(top==-1 && begining ==-1)
        {
            System.out.println("no peek value due empty queue");
        }
        else
        {
            System.out.println("the peek value is----> "+arr[begining]);
        }
    }
    public static void main(String[] args) {
        QueueByArray1 obj=new QueueByArray1(8);
        obj.show();
        obj.delete();
        obj.show();
        obj.peek();
        obj.enqueue(14);
        obj.peek();
        obj.enqueue(6);
        obj.enqueue(5);
        obj.enqueue(2);
        obj.delete();
        obj.enqueue(9);
        obj.enqueue(9);
        obj.enqueue(3);
        obj.show();

    }
}

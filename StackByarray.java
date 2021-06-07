class StackByarray {
    int arr[];
    int top;
    StackByarray(int size)
    {
        arr=new int[size];
        top=-1;
    }
public void push(int value)
{
   if(top==arr.length-1)
   {
       System.out.println("Stack is full");
   }else
   {
       arr[top+1]=value;
       top++;
       System.out.println("your data added "+value);
   }
}
public void pop(int values)
{
    if(top==-1)
    {
     System.out.println("you cant pop because stack is deleted");
    }
    else
    {
        System.out.println("your valus deleted "+arr[top]);
        top--;
    }
}
public void peek()
{
    if(top==-1)
    {
        System.out.println("this is empty");
    }
    else
    {
        System.out.println("your peek valus is------>"+arr[top]);
    }
}



    public static void main(String[] args) {
        StackByarray obj=new StackByarray(10);
        obj.push(30);
        obj.push(1);
        obj.push(304);
        obj.push(306);
        //obj.pop(20);
        obj.peek();
    }
}

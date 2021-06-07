class StackwithLinkedlist {
    Node top;
    int data;

    StackwithLinkedlist()
    {
        top = null;
    }

    public void push(int data) {
        Node newnode=new Node();
        newnode.next = top;
        top = newnode;
        System.out.println("valus insertded===---->"+data);
    }

    public void pop() {
        int result = 0;
        if (top == null) {
            System.out.println("you can't delete due to empty satck");
        } else {
            result = top.data;
            top = top.next;
            System.out.println("valus deleted");
        }
    }


    public static void main(String[] args) {
        StackwithLinkedlist obj=new StackwithLinkedlist();
        obj.push(34);
        obj.push(1);
        obj.pop();
        obj.push(142);
        obj.push(122);
        obj.pop();





    }
}


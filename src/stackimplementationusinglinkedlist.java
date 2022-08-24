public class stackimplementationusinglinkedlist {
    //Using Linkedlist

        static class Node{
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
            }
            static  class stack{
                public static Node head;//head is the top of stack and head of the linkedlist
                public static  boolean isEmpty(){
                    return head==null;// return true or false
                }
                public static void push(int data){
                    Node newnode=new Node(data);//create a newnode
                    if(isEmpty()){
                        head=newnode;//if stack is empty then make new Node head and it is top of stack
                        return;
                    }
                    newnode.next=head;//if element available in stack then make head to newnode and after
                    //  this make head newnode
                    head=newnode;
                }
                public static int pop(int data){
                    if(head==null){
                        return -1;
                    }
                    int top=head.data;//top hold peek value of stack and integer value because of .data
                    head=head.next;
                    return top;
                }
                public static int peek(){
                    if(isEmpty()){
                        return -1;
                    }
                    return head.data;//because here head is peek element of stack of stack
                }


            }
        }
    }



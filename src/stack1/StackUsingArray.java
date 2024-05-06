package stack1;

public class StackUsingArray {
  private  int size;
  private  int []a;
  private  int top;

    public StackUsingArray(int size){
        this.size = size;
        a = new int[size];
        top  = -1;
    }


    public boolean push(int e){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        top++;
        a[top] = e;
        return  true;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is Empty");
            return -1;
        }
        int element = a[top];
        top--;
        return element;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("stack is Empty");
            return -1;
        }
        return a[top];
    }


   public void printStack(){
        for(int i = 0; i<= top; i++){
            System.out.print(a[i]+" ");
        }
       System.out.println();
   }

    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top ==  size-1;

    }

}

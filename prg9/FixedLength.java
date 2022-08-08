package prg9;
public class FixedLength implements IsSimpleStack{
    private char[] data;
    private int tos;
    FixedLength(int size)
    {
        data=new char[size];
        tos=0;
    }
public void  push(char ch)
{
    if(isFull())
    {
     System.out.println("Stack is Full");
     return;
    }
    data[tos]=ch;
    tos++;
}
public char pop()
{
    if(isEmpty())
    {
        System.out.println("Stack is Empty");
        return (char) 0;
    }
    tos--;
    return data [tos];
}

public boolean isEmpty(){
    return tos==0;
}
public boolean isFull(){
    return tos==data.length;
}
}   


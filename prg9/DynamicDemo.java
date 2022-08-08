package prg9;

public class DynamicDemo {
    public static void main(String[] args) {
        FixedLength f=new FixedLength(10);
        Dynamic d=new Dynamic(5);
        IsSimpleStack iStack;
        iStack=f;
        System.out.println("Content of Fixe stack");
        for(int i=0;i<10;i++)
        {
        f.push((char)('A'+i));
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(f.pop()+"\t");
        }
        iStack=d;
        System.out.println("Content of Dynamic stack");
        for(int i=0;i<10;i++)
        {
            d.push((char)('A'+i));
        }
        for(int i=0;i<10;i++){
            System.out.print(d.pop()+"\t");
        }
    }
    
}

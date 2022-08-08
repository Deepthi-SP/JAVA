package prg9;

public class DynamicDemo {
    public static void main(String[] args) {
        FixedLength f=new FixedLength(20);
        Dynamic d=new Dynamic(10);
        for(int i=0;i<15;i++){
        f.push('A');
        }
        for(int i=0;i<15;i++){
            System.out.println(f.pop());
        }
        for(int i=0;i<15;i++){
            d.push('A');
        }
        for(int i=0;i<15;i++){
            System.out.println(d.pop());
        }
    }
    
}

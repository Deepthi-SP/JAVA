class method{
    double h,b,l;
    double triangle (double h,double b)
    {
        return (h*b)/2;
    }
   double rectangle(double l,double b)
   {
    return l*b;
   }
   double square(double l)
   {
     return l*l;
   }
    
}
public class area{
    public static void main(String[] args) {
       method ob1=new method();
       double a1=ob1.triangle(10,20);
       double a2=ob1.rectangle(10,20);
       double a3=ob1.square(10);
       System.out.println(a1);
       System.out.println(a2);
       System.out.println(a3);

    }
}

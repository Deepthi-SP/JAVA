class box{
    double l;
    double h;
    double b;
 box (double l,double h,double b)
 {
    this.l=l;
    this.h=h;
    this.b=b;
 }
 box(double l)
 {
     this.l=h=b=l;
 }
   double volume()
   {
         return l*h*b;
   }

void print()
{
System.out.println("METHOD OVERLOADING");
}
void print(double v)
{
   System.out.println("VOLUME OF THE BOX="+v);
}
}
   public class const_demo {
   public static void main(String[] args) 
   {
        double a,b;
        box ob1=new box(10.0,20.0,10.0);
        box ob2=new box(10);
        a=ob1.volume();
        b=ob2.volume();
        ob1.print();
        ob2.print(); 
        ob1.print(a);
        ob2.print(b);
   }
}
    
  
        



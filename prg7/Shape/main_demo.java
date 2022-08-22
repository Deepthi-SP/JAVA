package Shape;
public class main_demo {
   public static void main(String[] args) {
    Square sq=new Square();
    Triangle tri=new Triangle();
    Circle cir=new Circle();
    sq.getdata((float)5.5);
    System.out.println("The area of Square is:"+sq.area());
    tri.getdata((double)10.3,(double)20.5);
    System.out.println("The area of Triangle is:"+tri.area());
    cir.getdata((double)7.8);
    System.out.println("The area of Circle is:"+cir.area());
   }
}

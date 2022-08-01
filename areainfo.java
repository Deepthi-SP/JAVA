interface Rectangle
{
  float rect_area(float length,float breadth);
}
interface Triangle
{
    float tri_area(float length,float breadth);
}
class Area implements Rectangle,Triangle 
{
public  float rect_area(float length,float breadth)
{
return (length*breadth);
}
public  float tri_area(float length,float breadth)
{
return (length*breadth/2);
}
}
public class areainfo {
    public static void main(String[] args) {
        Area a=new Area();
        System.out.println("Area of Rectangle:" +a.rect_area(10,20));
        System.out.println("Area of Rectangle:"+ a.tri_area(10,20));
    }
}

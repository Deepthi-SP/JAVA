class student
{
    int Usn;
    String Name;
    void getdata (int Usn,String Name)
    {
         this.Usn=Usn;
         this.Name=Name;
         
    }
    void printdata()
    {
        System.out.println(Name+"\t"+Usn);
    }
}
public class student_demo {
    public static void main(String[] args) {
        student s=new student();
        s.getdata(10,"deepthi");
        s.printdata();

    }
    
}

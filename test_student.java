 import java.util.Scanner;
class student{
  int roll;
 String name;
 Scanner s2;
     public student(Scanner s1)
   {
      s2=s1;      
   }
    public void insert()
   {
       System.out.println("Enter name");
       name = s1.nextInt();  
       System.out.println("Enter Rollno");
       roll = s1.nextInt();
   }
   public void disp()
   {
     System.out.println("name=" +name);
     System.out.println("Age="+age);
   }
}
class test_student
{
  public static void main(String ...aa) 
  {
      Scanner s=new Scanner(System.in);
      Student s1=new Student(s);

     s1.insert();
    s1.disp();

  }
}
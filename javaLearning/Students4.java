public class Students4 {

    public class Student
{
   private String name;
   private int mark;

   public Student(String n, int m)
   {
      name = n;
      mark = m;
   }

   public String getName()
   {
      return name;
   }

   public int getMark()
   {
      return mark;
   }
}
    public class Test
{
    public static void print(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
         System.out.println(student[i].getMark() + " " +"(" + student[i].getName() + ")");
   }
}
}

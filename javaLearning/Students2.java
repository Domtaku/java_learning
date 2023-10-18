public class Students2 {
    
    public class Student{
        String name;
        int mark;

    public Student(String n, int m){
        name = n;
        mark = m;
   }
}
    public static void print(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
         System.out.println(student[i].mark);
   }
}
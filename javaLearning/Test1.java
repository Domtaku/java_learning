public class Test1 {
    public static int getSum(int[] num)
   {
      int sum = 0;

      for(int i = 0; i < num.length; i++)
      {
          sum += num[i];
      }

      return sum;
   }
}

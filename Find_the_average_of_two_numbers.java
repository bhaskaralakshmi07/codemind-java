import java.util.Scanner;
class Solution
{
   public static void main(String args[])
   {
       Scanner scan = new Scanner(System.in);
       float a = scan.nextFloat();
       float b = scan.nextFloat();
       float s = (a+b)/2;
       System.out.format("%.4f",s);
   }
}

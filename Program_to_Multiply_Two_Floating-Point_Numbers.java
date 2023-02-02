import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
    Scanner scan = new Scanner(System.in);
    float a = scan.nextFloat();
    float b = scan.nextFloat();
    float c = a*b;
    System.out.format("%.2f", c);
    }
}

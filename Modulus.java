import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a%b;
        System.out.format("%d",c);
    }
}

importjava.util.Scanner;
class Ladder
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of rows");
int a=in.nextInt();
for(int i=1;i<=a;i++)
{
for(int j=1;j<=i;j++)
System.out.print(j);
for(int k=i-1;k>=1;k--)
System.out.print(k);
System.out.print("\n");
}
}
}
// Java program to illustrate while loop
class whileLoopDemo {
public static void main(String args[])
{
int x = 1, sum = 0;
// Exit when x becomes greater than 4
while (x <= 10) {
// summing up x
sum = sum + x;
// Increment the value of x for
// next iteration
x++;
}
System.out.println("Summation: " + sum);
}
}
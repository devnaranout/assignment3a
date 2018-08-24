import java.util.Scanner;
class prime
{
public static void main(String args[])
{
int n,i,j,fact;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
System.out.println("prime numbers upto: "+n);
for(i=1; i<=n; i++)
{
fact=0;
for(j=1; j<=n; j++)
{
if(i%j==0)
fact++;
}
if(fact==2)
System.out.println(+i);
}
}
}
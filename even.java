import java.util.Scanner;
class even
{
public static void main(String args[])
{
int i,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
n=sc.nextInt();
System.out.println("Even numbers upto :"+n);
for(i=0;i<=n;i+=2)
{
System.out.println(+i);
}
}
}


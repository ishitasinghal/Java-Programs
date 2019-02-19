class Try 
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int r=0;
for(int i=a;i>0;i/=10)
{
r=(r*10)+i%10;
}
System.out.print(r);
}
}

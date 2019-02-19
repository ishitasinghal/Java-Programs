public class Sumofprimenumbers 
{
public static void main(String[] args) 
{
int n=2;
int temp=1; 
int sum=0;
while(temp<=10) 
{
for(int i =2;i<n;i++) 
{
if( n%2!=0 && n%i!=0 && n%1==0 ) 
{
System.out.println(n);
sum=sum+n;
}
}	
temp++; 
n++;
}
System.out.println(sum);
}


}
class Vehicle
{
int flag=0;
boolean available()
{
if(flag==0)
{
System.out.println("*****NOT AVAILABLE!!*****");
flag=1;
System.out.println("*****NOW MADE AVAILABLE!!*****");
}
else if(flag==1)
{
System.out.println("*****AVAILABLE!!*****");
}
}
}
class Bus extends Vehicle
{
boolean available(int ff);
System.out.println("Bus number: 1234");
}
class Tracker extends Vehicle    
{
System.out.println("Tracker number: 5678");
}

class Driver
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter availability");
int f=Integer.parseInt(br.readLine());
Bus ob1=new Bus(f);
Tracker ob2=new Tracker(f);
ob1.availability();
}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
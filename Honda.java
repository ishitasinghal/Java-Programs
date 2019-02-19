abstract class Bike{
abstract void run();
}
class Honda extends Bike{
void run()
{
System.out.println("running ");
}
public static void main(String args[])
{
Bike ob=new Honda();
ob.run();
}
}
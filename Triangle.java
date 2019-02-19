abstract class Shape{
abstract void tri();
//abstract void cir();
//abstract void rec();
}
class Rectangle extends Shape{
public void rec()
{
System.out.println("Hi rectangle!");
}
//public static void main(String args[])
//{
//Shape ob1=new Rectangle();
//ob1.rec();
//}
}
class Circle extends Shape{
public void cir()
{
System.out.println("Hi circle!");
}
//public static void main(String args[])
//{
//Shape ob2=new Circle();
//ob2.cir();
//}
}
class Triangle extends Shape{
public void tri()
{
System.out.println("Hi triangle!");
}
public static void main(String args[])
{
Shape ob3=new Triangle();
ob3.tri();
}
}

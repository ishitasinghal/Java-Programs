class Animal
{
void detail()
{
System.out.println("Four legs");
System.out.println ("One tail");
}
}
class Dog extends Animal
{
void details()
{
System.out.println("A dog barks");
}
}
class Cat extends Animal
{
void details()
{
System.out.println("A cat meows");
}
}
class Demo
{
public static void main(String args[])
{
Dog ob=new Dog();
ob.detail();
ob.details();
}
}
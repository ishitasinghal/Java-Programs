class Mobj
{
int a,f,g,h;
public Mobj()
{
a=6;
}
public Mobj(int b)
{
a=b;
}
public Mobj(int c, int d, int e)
{
f=c;
g=d;
h=e;
}
public static void main(String args[])
{
Mobj obj1=new Mobj();
System.out.println("Non-parameterized constructor called "+obj1.a); 
Mobj obj2=new Mobj();
System.out.println("Default constructor "+obj2.a);
Mobj obj3=new Mobj(98);
System.out.println("Parameterized constructor called "+obj3.a);
Mobj obj4=new Mobj(3,7,9);
System.out.println("Parameterized constructor with more than one parameters called "+obj4.f+" "+obj4.g+" "+obj4.h);
Mobj obj5=new Mobj();
}
}
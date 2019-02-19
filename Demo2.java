import java.io.*;
class Scs
{
void fd()
{
String facname="Mr.Ajay Sharma";
long sapid=4000123;
String address="Park Street";
int age=37;
System.out.println("Name      :"+facname);
System.out.println("SAPID     :"+sapid);
System.out.println("Address   :"+address);   
System.out.println("Age       :"+age);
}
}
class Systematics extends Scs
{
void net()
{
System.out.println("Faculty of Systematics teach networking");
}
}
class Cybernatics extends Scs
{
void java()
{
System.out.println("Faculty of Cybernatics teach JAVA");
}
}
class Virtualization extends Scs
{
void cloud()
{
System.out.println("Faculty of Virtualization teach cloud");
}
}

class Demo2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Which class you want to call?");
System.out.println("Press 1 for Systematics");
System.out.println("Press 2 for Cybernatics");
System.out.println("Press 3 for Virtualization");
int ch=Integer.parseInt(br.readLine());
Systematics ob1=new Systematics();
Cybernatics ob2=new Cybernatics();
Virtualization ob3=new Virtualization();
switch(ch)
{
case 1 :ob1.fd();
ob1.net();
break;
case 2 :
ob2.fd();
ob2.java();
break;
case 3 :
ob3.fd();
ob3.cloud();
break;
default:System.out.println("Incorrect choice");
}
}
}

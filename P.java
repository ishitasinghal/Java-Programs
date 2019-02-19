class P
{
String returnStrint(String str, int ...i)
{
for(int j :i)
str +=j;
return str;
}
String returnIntStr(int ...i,String str)
{
for(int j :i)
str +=j;
return str;
}
}
public class q9
{
public static void main(String args[])
{
String s1=new P().returnStrint("CodeChef",3,2,1,0);
String s2=new P().returnIntStr(1,2,3,"CodeChef");
System.out.println(s1+s2);
}
}
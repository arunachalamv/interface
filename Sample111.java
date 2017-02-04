interface A
{
public void add();
}
interface B
{
public void sub();
}
class C implements A,B
{
public int a=10,b=19,c;
public void add()
{
c=a+b;
System.out.println("Answer is:"+c);
}
public void sub()
{
c=a-b;
System.out.println("Answer is:"+c);
}
}
class Sample111
{
public static void main(String[] args)
{
C obj=new C();
obj.add();
obj.sub();
}
}
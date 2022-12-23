public class Overloadingriding
{
    public static void main(String args[])
    {
        riding l1=new riding();
        l1.add(8,5);
        l1.add(8,5,7);
        l1.sub(5,3);
    }
}
class loading
{
    int add(int a,int b)
    {
        int c=a+b;
        System.out.println("add a+b" +c);
        return c;
    }
    int add(int a,int b,int c)
    {
        int d=a+b+c;
        System.out.println("add a+b+c" +d);
        return d;
    }
    int sub(int a,int b)
    {
        int c=a-b;
        System.out.println("sub a-b" +c);
        return c;
    }
}
class riding extends loading
{
    int sub(int a,int b)
    {
        int c=a-b+1;
        System.out.println("sub (a-b)+1" +c);
        return c;
    }
}


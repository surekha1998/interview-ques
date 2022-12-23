public class Sumofdigits
{
    static int sumofdigit(int num)
    {
        if(num!=0)
        return(num%10+sumofdigit(num/10));
        return 0;
    }
public static void main(String args[])
{
        int num=2053;
        int result=sumofdigit(num);
        System.out.println("sum of all digits of "+num+" is "+result);
}
}

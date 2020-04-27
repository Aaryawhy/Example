public class palindrome
{
    public static void main(int no)
    {
        int i=1,temp=no,rem,rev=0;
        while(temp!=0)
        {
            rem=temp%10;     
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(rev==no)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
    
using System;
class Thiyagu
{
    public static void Main(String[]args)
    {
        int n=Convert.ToInt32(Console.ReadLine());
        int temp=n;
        int count=0;
        int sum=0,pro=1,t=temp;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        while(temp>0)
        {
            int r=temp%10;
        for(int i=0;i<count;i++)
        {
pro=pro*r;
        }
        sum=sum+pro;
        temp=temp/10;
    }
    if(t==sum)
    Console.WriteLine("Armstrong");
    else
    Console.WriteLine("not Armstrong");
}
}
import java.util.*;
class Comb
{
int count=0;
public  void comb(String s,int l,int r)
{
if(l==r)
{

System.out.println(s);
count++;
}
else
{
for(int i=l;i<=s.length()-1;i++)
{
//String s1;
s=swap(s,l,i);
comb(s,l+1,r);
s=swap(s,l,i);
}
}
}
public String swap(String s,int l,int r)
{
char []c=s.toCharArray();
char temp;
temp=c[l];
c[l]=c[r];
c[r]=temp;
return String.valueOf(c);

}
public static void  main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Strin you Want to permute");
String s=sc.nextLine(); 
Comb c=new Comb();
c.comb(s,0,s.length()-1);
System.out.println("number of combination possible="+c.count);
}
}
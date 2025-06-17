// 12. Integer to Roman
class InttoRoman
{
public static void main(String ar[])
{
int num=3749;
String ans=intToRoman(num);
System.out.println(" Number " +num+ " in Roman is " +ans);
}
public static String intToRoman(int num) {
      int val[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String sym[]={"M","CM","D","CD","C","XC","L",
    "XL","X","IX","V","IV","I"};
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<13;i++)
    {
      if(num==0)
      {
        break;
      }
      int times=num/val[i];
      while(times-- !=0)
      {
        sb.append(sym[i]);
      }
      num=num%val[i];
    }
    
    return sb.toString();
}
}
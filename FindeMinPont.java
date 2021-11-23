import java.util.*;
class Main
{
  public static void main(String arg[])
  {
  	Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int m=1;
    while(c<=b)
    {
      if(c>=a)
      {
        System.out.println(c);
        return;
      }
      c*=++m;
    }
    System.out.println("-1");
    
  }
}
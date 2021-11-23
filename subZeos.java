import java.util.*;
class Main
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    //int n=sc.nextInt();
    //arr[i]=sc.nextInt();
    System.out.println(getSubstringCount(sc.nextLine()));
  }
  static int getSubstringCount(String s)
  {
      int n=s.length();
      System.out.println(s);
      Map<Integer,List<Integer>> hm = new HashMap<>();
      List<Integer> t = new ArrayList<>();
      t.add(-1);
      hm.put(0,t);
      int ans=0;
      int sum=0;
      for(int i=0;i<n;i++)
      {
          char c=s.charAt(i);
          //System.out.println(hm);
          if(c=='1')
            sum+=1;
        else
            sum-=1;
          if(hm.containsKey(sum))
          {
          if(hm.containsKey(sum))
          for(int j:hm.get(sum))
          {
            if( isPoss(s.substring(j+1,i+1)))
            {
                ans++;
            }

          }
              
              //ans+=hm.get(sum);
              hm.get(sum).add(i);
          }
          else
          {
            List<Integer> tm = new ArrayList<>();
            tm.add(i);
            hm.put(sum,tm);
          }
          
      }
      return ans;
  }
  static boolean isPoss(String s)
  {
      for(int i=0;i<s.length()/2;i++)
      {
          if(s.charAt(i)=='0' && s.charAt(s.length()-i-1)=='1'   || s.charAt(i)=='1' && s.charAt(s.length()-i-1)=='0' )
            continue;
         else
            return false;
      }
      return true;
  }
}


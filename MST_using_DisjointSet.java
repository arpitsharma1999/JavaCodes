import java.util.*;
class Edge implements Comparable <Edge>
{

    int f,t,w;
    public int compareTo(Edge e)
    {
        return this.w-e.w;
    }
    Edge(int c, int a, int b)
    {
        f=a;
        t=b;
        w=c;
    }
    public String toString()
    {
        return "w-> "+w+"  frm-> "+f+"  to-> "+t;
    }
}

class MSTDisSet
{

    static int par[];
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Edge grph[] = new Edge[n];
        par=new int[n+1];
    
        for(int i=0;i<n;i++)
        {
            par[i+1]=i+1;
            grph[i]=new Edge(sc.nextInt(), sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(grph);
        int ans=0;
        for(Edge i : grph)
        {
            int p1=getPar(i.t);
            int p2=getPar(i.f);
            if(p1!=p2)
            {
                //System.out.println("  par of "+i.f+"  -> "+ p2+"   par of "+i.t+"  -> "+p1);
                ans+=i.w;
                par[p1]=p2;
               // System.out.println("\n  par of "+i.f+"  -> "+ getPar(i.f)+"   par of "+i.t+"  -> "+getPar(i.t)+"   \n\n\n");
                //System.out.println(i);
            }
    
        }
        System.out.println(ans);

    }
    static int getPar(int i)
    {
        if(i==par[i])
            return i;
        return par[i]=getPar(par[i]);
    }
}
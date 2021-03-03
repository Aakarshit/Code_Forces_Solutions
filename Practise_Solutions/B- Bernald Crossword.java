import java.util.*;
import java.io.*;
public class Phod{
    public static void main(String args[]){
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int u=sc.nextInt();
            int r=sc.nextInt();
            int d=sc.nextInt();
            int l=sc.nextInt();
           
           int ul=0;
           int rl=0;
           int dl=0;
           int ll=0;
           
           if(u<=n-2 && r<=n-2 && l<=n-2 && d<=n-2){
               System.out.println("YES");
               continue;
           }
           
           if(u==n-1){
               if(l-ll>r-rl){
                   ll++;
               }else{
                   rl++;
               }
           }else if(u==n){
               ll++;
               rl++;
           }
           
           if(d==n-1){
               if(l-ll>r-rl){
                   ll++;
               }else{
                   rl++;
               }
           }else if(d==n){
               ll++;
               rl++;
           }
           
           if(r==n-1){
               if(u-ul>d-dl){
                   ul++;
               }else{
                   dl++;
               }
           }else if(r==n){
               ul++;
               dl++;
           }
           
           if(l==n-1){
               if(u-ul>d-dl){
                   ul++;
               }else{
                   dl++;
               }
           }else if(l==n){
               ul++;
               dl++;
           }
           
           if(ul>u || rl>r || dl>d || ll>l){
               System.out.println("NO");
           }else{
               System.out.println("YES");
           }
        }
    }
    public static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
}
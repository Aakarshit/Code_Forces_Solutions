import java.util.*;
import java.io.*;
public class Phod{
    public static void main(String args[]){
        FastReader sc=new FastReader();
        int n=sc.nextInt();
        int q=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int one_count=0;
        int zero_count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero_count++;
            }else{
                one_count++;
            }
        }
        while(q-->0){
            int o=sc.nextInt();
            int pos=sc.nextInt();
            if(o==1){
                if(arr[pos-1]==0){
                    one_count++;
                    zero_count--;
                }else{
                    zero_count++;
                    one_count--;
                }
                arr[pos-1]=1-arr[pos-1];
            }else if(o==2){
                if(pos<=one_count){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
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
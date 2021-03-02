import java.util.*;
import java.io.*;
public class Phod{
    public static void main(String args[]){
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        long ans=0;
        int count[]=new int[n+1];
        for(int i=0;i<n;i++){
            if(arr[i]>1){
                for(int j=2;j<=arr[i]&&i+j<n;j++){
                    count[i+j]++;
                }
            }
            if(count[i]<arr[i]-1){
                ans+= arr[i]-count[i]-1;
            }else{
                count[i+1]+= count[i] -(arr[i]-1);
            }
        }
        System.out.println(ans);
       
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
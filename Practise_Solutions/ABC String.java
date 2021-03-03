import java.util.*;
import java.io.*;
public class Phod{
    public static void main(String args[]){
        FastReader sc=new FastReader();
         int t=sc.nextInt();
         while(t-->0){
             ArrayList<String> arr=new ArrayList<String>();
             String str=sc.next();
             if(str.charAt(0)=='A'){
                 String temp="";
                for(int i=0;i<str.length();i++){
                    char c=str.charAt(i);
                    if(c=='A'){
                        temp+='(';
                    }else if(c=='B'){
                        temp+=')';
                    }else{
                        temp+='(';
                    }
                }
                arr.add(temp);
                temp="";
                for(int i=0;i<str.length();i++){
                    char c=str.charAt(i);
                    if(c=='A'){
                        temp+='(';
                    }else if(c=='B'){
                        temp+='(';
                    }else{
                        temp+=')';
                    }
                }
               
                arr.add(temp);
                temp="";
                for(int i=0;i<str.length();i++){
                    char c=str.charAt(i);
                    if(c=='A'){
                        temp+='(';
                    }else if(c=='B'){
                        temp+=')';
                    }else{
                        temp+=')';
                    }
                }
                arr.add(temp);
                temp="";
                
                
             }else if(str.charAt(0)=='B'){
                 String temp="";
                for(int i=0;i<str.length();i++){
                    char c=str.charAt(i);
                    if(c=='B'){
                        temp+='(';
                    }else if(c=='A'){
                        temp+=')';
                    }else{
                        temp+='(';
                    }
                }
                arr.add(temp);
                temp="";
                for(int i=0;i<str.length();i++){
                    char c=str.charAt(i);
                    if(c=='B'){
                        temp+='(';
                    }else if(c=='A'){
                        temp+='(';
                    }else{
                        temp+=')';
                    }
                }
                arr.add(temp);
                temp="";
                for(int i=0;i<str.length();i++){
                    char c=str.charAt(i);
                    if(c=='B'){
                        temp+='(';
                    }else if(c=='A'){
                        temp+=')';
                    }else{
                        temp+=')';
                    }
                }
                arr.add(temp);
                temp="";

             }else if(str.charAt(0)=='C'){
                 String temp="";
                for(int i=0;i<str.length();i++){
                    char c=str.charAt(i);
                    if(c=='C'){
                        temp+='(';
                    }else if(c=='B'){
                        temp+=')';
                    }else{
                        temp+='(';
                    }
                }
                arr.add(temp);
                temp="";
                for(int i=0;i<str.length();i++){
                    char c=str.charAt(i);
                    if(c=='C'){
                        temp+='(';
                    }else if(c=='B'){
                        temp+='(';
                    }else{
                        temp+=')';
                    }
                }
                arr.add(temp);
                temp="";
                for(int i=0;i<str.length();i++){
                    char c=str.charAt(i);
                    if(c=='C'){
                        temp+='(';
                    }else if(c=='B'){
                        temp+=')';
                    }else{
                        temp+=')';
                    }
                }
                arr.add(temp);
               
             }
             boolean flag=false;
             for(String s:arr){
                 if(isRegular(s)){
                     flag=true;
                     break;
                 }
             }
             if(flag){
                 System.out.println("YES");
             }else{
                 System.out.println("NO");
             }
         }
    }
    public static boolean isRegular(String str){
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
           if(c=='('){
                    stack.push(c);
                }
                if(stack.isEmpty()){
                    return false;
                }
                else if(c==')'){
                    if(stack.peek()=='('){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
        }
        if(stack.size()!=0){
            return false;
        }
        return true;
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
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();  
            int s=a;
            int k=1;
            for (int j=0;j<n;j++){
                s=s+b*k;
                k=k*2;
                System.out.print(s+" ");   
            }
            System.out.println(" ");
            
            
        }
        in.close();
        
    }
}

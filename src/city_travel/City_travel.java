/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_travel;
import java.io.*;
import java.util.StringTokenizer;
/**
 *
 * @author DELL
 */
public class City_travel {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk=new StringTokenizer(br.readLine());
        int S=Integer.parseInt(tk.nextToken());
        int X=Integer.parseInt(tk.nextToken());
        int N=Integer.parseInt(tk.nextToken());
        int sum=0,n=0;
        for(int i=1;i<=N;i++)
        {
            StringTokenizer tr=new StringTokenizer(br.readLine());
            int T=Integer.parseInt(tr.nextToken());
            int Y=Integer.parseInt(tr.nextToken());
            for(int j=1;j<=T;j++)
            {
                if(sum<S)
                {
            if(j!=T)
            {
                sum=sum+X;
                n++;
            }
            else
            {
                sum=sum+Y;
                n++;
            }}}}
            if(sum>=S)
                System.out.println(n-1);
                    
                
                
        
        
        
        // TODO code application logic here
    }
    
}

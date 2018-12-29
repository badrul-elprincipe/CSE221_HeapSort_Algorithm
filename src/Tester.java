/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author BADRUL
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner B=new Scanner (System.in);
        System.out.println("How many numbers");
        int n=B.nextInt();
        int[]a=new int[n+1];
        System.out.println("give me "+n+" numbers");
        for(int i=1;i<a.length;i++)
        {
            a[i]=B.nextInt();
        }
        HeapSort r=new HeapSort(a);
        System.out.println("Give me your Index for Heap Increase");
        int q=B.nextInt(); //index
        System.out.println("Give me your Key for Heap Increase");
        int q1=B.nextInt(); //input or key
        r.Increasekey(q,q1);
        r.printing();
        //r.Insertkey(50);
        //r.printing();
    }
    
}

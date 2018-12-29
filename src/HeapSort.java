/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BADRUL
 */
public class HeapSort {
    int b[];
    public HeapSort(int[] a){
        b=a;
        heap();
        printing();
        
        
    }
    
    public void heap(){
        for(int i=b.length/2;i>=1;i--)
        {
            heapify(i);
          
        }
      
    }
    public void heapify(int i){
        int large=i;
        int l=i*2;
        int r=i*2+1;
        if(l<b.length && b[l]>b[large])
        {
            large=l;
        }
        
        if(r<b.length && b[r]>b[large])
        {
            large=r;
        }
        
        if(large!=i)
        {
            swap(b,large,i);
            heapify(large);
            
        }
        
    }
    public void swap(int a[],int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public void printing(){
        for(int f=1;f<b.length;f++)
        {
            System.out.print(b[f]+"  ");
        }
        System.out.println();
    }
    public void Increasekey( int i, int key){
        b=resize();
        if(b[i]>key)
        {
            System.out.println("there is some error");
        }
        else
        {
            b[i]=key;
            while(i>1&&b[i]>b[i/2])
            {
                swap(b,i,i/2);
                i=i/2;
            }
        }
    }
    public int[] resize(){
        int x[]=new int[b.length+1];
        for(int i=1;i<b.length;i++)
        {
            x[i]=b[i];
        }
        return x;
    }
    public void Insertkey(int key){
        b=resize();
        int i=b.length-1;
        Increasekey(i,key);
    }
}

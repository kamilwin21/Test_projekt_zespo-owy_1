/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorytm_hornera_wartosc_wielomianu;

import java.util.Scanner;

/**
 *
 * @author Kamil
 */
public class Algorytm_Hornera_wartosc_wielomianu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int length=0, x=0;
        System.out.println("Długość wielomianu: ");
        length = wczytaj_dlugosc_tab(length);
        System.out.println("Podaj x: ");
        x= wczytaj_x();
        System.out.println("Długość tablicy: "+length);
        System.out.println("x = "+x);
       
        
          int[] a = wczytaj_a(length);
         
        int[] wynik = new int[length];
        int result1=0;
       
        int g=a.length;
        while(g>1){
           result1= (result1+a[g-1])*x;
           // System.out.println("g="+g+" result1:"+result1);
            g--;
        }
        result1 += a[0];
        System.out.println("W(x): " +result1);
        int w=0;
        w=a[length-1];
        for(int i=a.length-1;i>0;i--)
        {
           // System.out.println("w:"+w);
            w=a[i-1]+w*x;
        }
        System.out.println("b0:"+w);
       
    }
    static int[] wczytaj_a(int length){
        int i=0;
        int[] tab = new int[length];
        do{
            System.out.print("a"+i+" = ");
            Scanner scan=new Scanner(System.in);
            tab[i] = scan.nextByte();
            i++;
           
        }while(i<length);
        
        return tab;
    }   
    static int wczytaj_dlugosc_tab(int length){
        Scanner scan= new Scanner(System.in);
        length = scan.nextInt();
        return length;
    }
    static int wczytaj_x(){
        Scanner scan= new Scanner(System.in);
         int x= scan.nextInt();
        return x;
    }
}

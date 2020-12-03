/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author illes
 */
public class kivalogatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] erdemjegyek=new int [5];
        int [] masolat=new int[5];
        
        System.out.println("Érdemjegyek: ");
        erdemjegyek[0]=1;
        erdemjegyek[1]=2;
        erdemjegyek[2]=3;
        erdemjegyek[3]=4;
        erdemjegyek[4]=5;
        
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1+". jegy: "+String.format("%,2d",erdemjegyek[i]));
        }
        System.out.println("");
        
        int kettesekDb=0;
        for (int i = 0; i < 5; i++) {
            if(erdemjegyek[i]==2){
                masolat[kettesekDb++]=erdemjegyek[i];
            }
        }
        System.out.print("Masolat tömb elemei: ");
        for (int i = 0; i < kettesekDb; i++) {
            System.out.print(masolat[i]+" ");
            
        }
        System.out.println("\nKettesek száma: "+kettesekDb);
    }
}
     
        
    
    


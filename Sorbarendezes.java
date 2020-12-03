/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author illes
 */
public class Sorbarendezes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nSORBARENDEZÉS TÉTELE (buborékos módszer)\n");
        System.out.println("Hány elemű tömböt szeretne létrehozni? ");
        Scanner bemenet=new Scanner(System.in);
        int elemSzam=bemenet.nextInt();
        int[] szamok=new int[elemSzam];
        
        for (int i = 0; i < elemSzam; i++) {
            szamok[i]=(int)(Math.random()*100)-50;
        }
        
        System.out.println("\nTömbünk elemei: ");
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(szamok[i]+" ");
        }
        
        for (int i = 0; i < elemSzam-1; i++) {
            for (int j = 0; j < elemSzam-i-1; j++) {
                if (szamok[j]>szamok[j+1]) {
                    int temp=szamok[j];
                    szamok[j]=szamok[j+1];
                    szamok[j+1]=temp;
                    
                }
                
            }
            
        }
        
        System.out.println("\nRendezett tömbünk:");
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(szamok[i]+" ");
            
        }
    }
    
}

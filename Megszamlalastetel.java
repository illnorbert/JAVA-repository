/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author illes
 */
public class megszamlalastetel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n\tMEGSZÁMLÁLÁS TÉTELE");
        System.out.println("\n\tKészítette: Lévai Viktória\n");
        int[]tomb=new int[5];
        
        int szamlalo=0;
        int parosSzamlalo=0;
        for (int i = 0; i < 5; i++) {
            tomb[i]=(int) (Math.random()*99)+1;
            szamlalo++;
            if (tomb[i]%2==0) {
                parosSzamlalo++;
            }
        }
        System.out.print("A tömb elemei:\n");
        for (int i = 0; i < 5; i++) {
            System.out.print(i+1+". eleme: "+ " ");
            if (tomb[i]%2!=0) {
                System.out.println("páratlan");
            }
            else
                System.out.print(String.format("%,2d",tomb[i])+"\n");

        }
        System.out.println("");
        System.out.println(szamlalo+" elemű tömbunk\n");
        System.out.println("Ebből a tömbből "+parosSzamlalo+" szám páros");
    }
    
}
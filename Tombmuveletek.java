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
public class tombmuveletek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Műveletek tömbökkel \n");

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print("Hány elem legyen a tömbben?: ");
        int elemekszama = sc.nextInt();
        
        int telem = elemekszama; 
        int t2elem = elemekszama;

        int t1[] = new int[telem]; 
        int t2[] = new int[t2elem];

        for (int i = 0; i < telem; i++) { 
            t1[i] = (int) (Math.random() * 999);
        }

        for (int j = 0; j < t2elem; j++) {
            t2[j] = (int) (Math.random() * 999);
        }

        for (int i = 0; i < telem || i < t2elem; i++) {
            System.out.println((i+1) + ".elem: " + (String.format("%,9d", t1[i])) + (String.format("%,9d", t2[i])));
        }
        sc.close();
    }

}
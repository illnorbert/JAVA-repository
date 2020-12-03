/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author illes
 */
public class kettotomb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  int tomb1[] = {2,3,44,77,22};
        int tomb2[] = new int [5];
        for(int i=0; i<5; i++){
         tomb2[i] = (int) (Math.random()*99)+1;
        }
        for(int i=0; i<5; i++){
            System.out.print("tomb1 "+(i+1)+" tagja: ");
            if(tomb1[i]>9){
                System.out.print(tomb1[i]+" tomb2 "+(i+1)+" tagja: ");
            }
            else{
                System.out.print(" "+tomb1[i]+" tomb2 "+(i+1)+" tagja: ");
            }
            if(tomb2[i]>9){
                System.out.println(tomb2[i]);
            }
            else{
                System.out.println(" "+tomb2[i]);
            }
        
        }
        
        
    }
    
}
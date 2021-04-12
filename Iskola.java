import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Iskola {
    public static ArrayList<Tanulo> Tanulo= new ArrayList<>();
   
    
    public static void beolvasas(){
        try{
            RandomAccessFile file = new RandomAccessFile("nevek.txt","r");
            int rekordSzam = Integer.parseInt(file.readLine());
            
            while(file.getFilePointer()<file.length()){
            Tanulo.add(new Tanulo(file.readLine())); 
        }
            file.close();
            System.out.println(rekordSzam);
            System.out.println("\nBeolvasva "+Tanulo.size()+" tanulo");
        }
        catch(IOException e){
            System.out.println("e");
        }
    }
    

    public static void main(String[] args) {
        beolvasas();
        
        
    }   
}


class Tanulo{
        private int kezdesEve;
        private char osztaly;
        private String nev;
        
        public int getKezdesEve(){
        return kezdesEve;
        }
        
        public char getOsztaly(){
            return osztaly;
        }
        
        public String getNev(){
            return nev;
        }
        
        public Tanulo(String sor) {
            String [] adatok=sor.split(";");
            System.out.println(sor);
            this.kezdesEve=Integer.parseInt(adatok[0]);
            this.osztaly=adatok[1].charAt(0);
            this.nev=adatok[2];
        }
        
    }
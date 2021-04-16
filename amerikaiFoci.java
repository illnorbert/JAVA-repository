
package amerikaifoci;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
public class amerikaiFoci {
public static ArrayList<NFL> Jatekos= new ArrayList<>();
   
    
    public static void beolvasas(){
        try{
            RandomAccessFile file = new RandomAccessFile("NFL_iranyitok.txt","r");
            
            while(file.getFilePointer()<file.length()){
            Jatekos.add(new NFL(file.readLine())); 
        }
            file.close();
            System.out.println("\nBeolvasva "+Jatekos.size());
        }
        catch(IOException e){
            System.out.println("e");
        }
    }

    public static void main(String[] args) {
        beolvasas();
    }
    
}
class NFL{
    public String nev;
    public int yardok;
    public int kiserletek;
    public int sikeres;
    public int tdPasszok;
    public int eladott;
    public double iranyitomutato;
    public String egyetem;
    
    public NFL(String sor){
        String [] adatok=sor.split(";");
        System.out.println(sor);
        this.nev=adatok[0];
        this.yardok=Integer.parseInt(adatok[1]);
        this.kiserletek=Integer.parseInt(adatok[2]);
        this.sikeres=Integer.parseInt(adatok[3]);
        this.tdPasszok=Integer.parseInt(adatok[4]);
        this.eladott=Integer.parseInt(adatok[5]);
        this.iranyitomutato=Double.parseDouble(adatok[6]);
        this.egyetem=adatok[7];
    }
}
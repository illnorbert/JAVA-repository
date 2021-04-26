
package amerikaifoci;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
public class amerikaiFoci {
public static ArrayList<NFL> Jatekos= new ArrayList<>();
   
    
    public static void beolvasas(){
      try {
            RandomAccessFile fajl = new RandomAccessFile("NFL_iranyitok.txt", "r");
            String elsoSor = fajl.readLine();
            if (elsoSor.contains(";")) {
                Jatekos.add(new NFL(elsoSor));
            }else{
                System.out.println(elsoSor);}
            
            while (fajl.getFilePointer() < fajl.length()) {
                Jatekos.add(new NFL(fajl.readLine()));
            }
            fajl.close();
            System.out.println("\nBeolvasva " + Jatekos.size() + " rekord.");
        } catch (IOException e) {
            System.out.println("Hiba történt!");
        }
    }
    public static void feladat(int feladatszam){
        System.out.println("\n" + feladatszam + ". feladat");}
    
    
    
    public static void main(String[] args) {
        beolvasas();
        feladat(1);
        feladat(7);
        System.out.println("Legjobb irányítók");
        for (NFL i: Jatekos) {
            if (i.iranyitomutato>=100 && i.yardMeterben(i.yard)>=4000) {
                System.out.println("\t"+i.FormazottNev(i.nev));
            }
        }
        
        for (int i = 0; i < Jatekos.size(); i++) {
            System.out.println(Jatekos.get(i).iranyitomutato);
        }
        
    }

}

class NFL {

    public String nev;
    public int yard;
    public int kiserlet;
    public int sikeres;
    public int passz;
    public int eladott;
    public double iranyitomutato;
    public String egyetem;

    public NFL(String sor) {
        String[] adatok = sor.split(";");
        System.out.println(sor);
        this.nev = adatok[0];
        this.yard = Integer.parseInt(adatok[1]);
        this.kiserlet = Integer.parseInt(adatok[2]);
        this.sikeres = Integer.parseInt(adatok[3]);
        this.passz = Integer.parseInt(adatok[4]);
        this.eladott = Integer.parseInt(adatok[5]);
        String replaceString = adatok[6].replace(",",".");
        this.iranyitomutato = Double.parseDouble(replaceString);
        this.egyetem = adatok[7];
    }
    /*private double Konvertal(String iranyitoMutato)
    {
        char decimalSeparator = System.Globalization.CultureInfo.CurrentCulture.NumberFormat.NumberDecimalSeparator;
        iranyitoMutato = iranyitoMutato.Replace(",", decimalSeparator).Replace(".", decimalSeparator);
        if (double.TryParse(iranyitoMutato, out var ertek))
            return ertek;
        throw new FormatException("Hibás érték (irányítómutató)");
    }*/
	
	public String FormazottNev(String nev)
	{
		String[] n = nev.split(" ");
		n[n.length - 1] = n[n.length - 1].toUpperCase();
		return String.join(" ", n);
	}

    int yardMeterben(int yard) {
        return yard=44556;
    }
}

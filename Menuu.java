/*
 1. Hozz létre egy tömböt: szamok néven! x
2. A tömb elemszáma 20 legyen.x
3. Az elemek a -50 és +50 értéktartományba essenek.x
4. Írasd ki a tömb elemeit egy sorban.x
5. Ekkor kérdezd meg a felhasználót, mit szeretne tenni az adatokkal:
     1 - összeget számoltatni: tömbök összegét kiíratni
     2 - szélsőértékeket kiíratni: legkisebb és legnagyobb értéket kiíratni
     3 - van-e benne 40-50: megtudni, tartalmaz-e számot 40 és 50 között?
     4 - 5-tel osztható páros számok db-száma: mennyi?
     5 - adott számot tartalmazza-e: egy felhasználótól bekért számról mondja meg, h tartalmazza-e a tömb, s ha igen, mi az indexe.
 */
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author illes
 */
public class Menuu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("MENÜ \n113C IN\n");

        int szamok[] = new int[20];

        for (int i = 0; i < 20; i++) {
            szamok[i] = (int) (Math.random() * 100) - 50;
        }
        System.out.println("\nA szamok tömb elemei: ");
        for (int i = 0; i < szamok.length; i++) {
            System.out.print(String.format("%,4d", szamok[i]) + " ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nVálasszon a menűből 1-től 5-ig!");
        System.out.println("\n1 - összeget számoltatni: tömbök összegét kiíratni \n2 - szélsőértékeket kiíratni: legkisebb és legnagyobb értéket kiíratni \n3 - van-e benne 40-50: megtudni, tartalmaz-e számot 40 és 50 között? \n4 - 5-tel osztható páros számok db-száma: mennyi? \n5 - adott számot tartalmazza-e: egy felhasználótól bekért számról mondja meg, h tartalmazza-e a tömb, s ha igen, mi az indexe.");
        System.out.print("Válasz: ");
        int valasztas = sc.nextInt();

        if (valasztas == 1) { //#1
            int szamokOsszege = 0;
            for (int i = 0; i < szamok.length; i++) {
                szamokOsszege += szamok[i];
            }
            System.out.print("A szamok tomb elemeinek összege: " + szamokOsszege);
        } else if (valasztas == 2) { //#2
            int max = 0;
            for (int i = 0; i < szamok.length; i++) {
                if (szamok[i] > max) {
                    max = szamok[i];
                }
            }
            System.out.println("A legnagyobb szám: " + max);

            int min = szamok[0];
            for (int i = 0; i < szamok.length; i++) {
                if (szamok[i] < min) {
                    min = szamok[i];
                }
            }
            System.out.println("A legkisebb szám: " + min);
        } else if (valasztas == 3) { //#3
            for (int i = 0; i < szamok.length; i++) {
                if (szamok[i] >= 40) {
                    if (szamok[i] <= 50) {
                        System.out.println("A szamok lista tartalmaz 40 és 50 közötti számot");
                        break;
                    } else {
                        System.out.println("A szamok lista nem tartalmaz 40 és 50 közötti számot");
                        break;
                    }
                }
            }
        } else if (valasztas == 4) { //#4
            int darabszam = 0;
            for (int i = 0; i < szamok.length; i++) {
                if (szamok[i] % 2 == 0) {
                    if (szamok[i] % 5 == 0) {
                        darabszam++;
                    }
                }
            }
            System.out.println("Az öttel osztható páros számok darabszáma: " + darabszam);
        } else if (valasztas == 5) { //#5 
            System.out.print("Keresett szám: ");
            int bekert = sc.nextInt();
            for (int i = 0; i < szamok.length; i++) {
                if (szamok[i] == bekert) {
                    System.out.println("A keresett szám indexe: " + i + "\nA keresett szám a(z)" + (i+1) +". elem");
                }
            }
        }
    }
}
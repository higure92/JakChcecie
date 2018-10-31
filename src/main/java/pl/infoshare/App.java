package pl.infoshare;

import pl.infoshare.shapes.calculator.stringi.bikes.User;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {

//        double a = 90.99;
//        System.out.println(a);
//
//        int b = (int) a;
//        System.out.println(b);
//        char c = 'a';
//        System.out.println(c);
//        char d = (char) 90;
//        System.out.println(d);
//        System.out.println("Wynik to: " + (b / a + d));
//        byte age = 26;
//        if (age >= 20 && age <= 30) {
//            System.out.println("Wiek jest wiekszy rowny 20 lat i mniejszy rowny 30");
//        }
//        if (age == 26 || age == 28) {
//            System.out.println("Wiek jest rowny 26 lat lub 28");
//        }
//
//        int agePrim = 20;
//        switch (agePrim) {
//
//
//            case 20: {
//                System.out.println("Wiek jest rowny 20");
//                break;
//            }
//            case 30: {
//                System.out.println("Wiek jest rwny 30");
//                break;
//
//            }
//            default: {
//                System.out.println("Po prostu jestes stary.");
//            }
//        }
//
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.println("1 2 3 4 5 6 7 8 9 10");
//        int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


//        }
//
//        int winningNumber = new Random().nextInt(10 ) + 1;
//
//        Scanner liczba = new Scanner (System.in );
//            while (true) {
//        System.out.println("Podaj liczbe od 1 do 10");
//        int liczba2 = Scanner.nextInt();
//        if (liczba2 <1 || liczba2 >10) {
//            System.out.println("Podaj liczbe z innego przedzialu");
//        }
//            if (liczba2= winningNumber) {
//                System.out.println("WYGRALES");
//                break;
//            }
//            else System.out.println("GRAJ DALEJ");
//        List<Stringii> imiona = Files.readAllLines(Paths.get("/home/higure/Desktop/imiona.txt"));
//        System.out.println(imiona);

//       Stringii imiona[] = new Stringii[5];
//       imiona [0] = "Kunegunda";
//       imiona [1]= "Dobrylotr";
//       imiona [2] = "Katarzyna";
//       imiona [3] = "Kazimierz";
//       imiona [4] = "Leonid";
//        PrintWriter zapis = new PrintWriter("./imiona.txt");
//        for(int i = 0; i< imiona.length; i++){
//            zapis.println(imiona[i] + "\n");
//
//        }
//        zapis.close();
//
//        List<Stringii> last = Files.readAllLines(Paths.get("./godnosci.txt"));
//        Stringii lastInOne = "";
//        for (Stringii item:
//             last) {
//            lastInOne += item + "\n";
//        }
//        System.out.println("Podaj godnosc");
//        Scanner godnosc = new Scanner(System.in);
//        Stringii imie = godnosc.nextLine();
//        PrintWriter zapis = new PrintWriter("./godnosci.txt");
//        zapis.append(lastInOne +imie + "\n");
//    zapis.close();


//        Random random = new Random();
//
//            PrintWriter losy = new PrintWriter("./losowanie.txt");
//                    PrintWriter losy2 = new PrintWriter("./losowanie2.txt");
//        for (int i= 0; i<100; i++) {
//            losy.append((random.nextInt(100) + 1) + "\n");
//            losy.append((random.nextInt(100) + 1)+ "\n");
//
//        }
//
//        losy.close();
//        losy2.close();
//
//        System.out.println("Podaj nazwe pliku");
//        Scanner nazwa = new Scanner(System.in);
//        Stringii txt = nazwa.nextLine();
//
//        PrintWriter reverse = new PrintWriter("/zadanie4.txt");
//        Stringii reverseText;
//        char [] letters = txt.toCharArray();
//        for(int i = letters.length -1; i>=0; i--) {
//            reverseText += letters[i];


//
//        double g = 128;
//        float h = (float) g;
//
//        long i = (long) h;
//        int j = (int) i;
//        short k = (short) i;
//        byte l = (byte) k;
//        System.out.println(g + " " +
//                h + " " +
//                i + " " +
//                j + " " +
//                k + " " +
//                l + " ");
        /*
        Tablice wielowymiarowe
         */
//        double[] tablica = new double [5];
//        double[] [] tablica 2 = new double [5] [5];

        //
        /*Switch

         */
//        Stringii  username = "admin2";
//        if (username.equals("admin")) System.out.println("witaj Admin");
//        switch (username){
//            case "admin":
//                System.out.println("WITAJ");
//                break;
//            case "admin1":
//                System.out.println("HEJ");
//                break;
//            case "admin2" : {
//                System.out.println("SIEMANO ADMIN");
//                break;
//
//        }
//            default:
//                System.out.println(("nie jestes zadnym z adminow"));

//
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.add(5,5) );
//        System.out.println(calculator.minus(5,5));
//        System.out.println(calculator.multiply(5,5));
//        System.out.println(calculator.podziel(5,5));

//
//Stringii blat = new Stringii();
//        System.out.println(blat.field);
//        someMethod(blat);
//        System.out.println(blat.field);
//        someMethod(blat);
//        System.out.println(blat.field);
//        someMethod(blat);
//        System.out.println(blat.field);
//        someMethod(blat);
//        System.out.println(blat.field);
//    }
//
//public static void someMethod (Stringii stringii){
//        stringii.field += "x";
//   }

//        Specialized specialized = new Specialized ();
//        System.out.println(specialized.printModel());
//        System.out.println();
//}
//
//    static class Specialized
//         int numberOfgears = 8;
//        String getName () {
//            return "Ariel";
//        }


        System.out.print("Provide username");
        String username = readUserInput();

        System.out.print("Provide password");
        String password = readUserInput();

        User user = new User (username, password);
        System.out.println("Stworzono uzytkownika" + user.username + "\n" + "O hasle" + " " + user.password);
    }
    private static String readUserInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();


    }
}









































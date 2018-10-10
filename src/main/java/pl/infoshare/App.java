package pl.infoshare;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        double a = 90.99;
        System.out.println(a);

        int b = (int) a;
        System.out.println(b);
        char c = 'a';
        System.out.println(c);
        char d = (char) 90;
        System.out.println(d);
        System.out.println("Wynik to: " + (b / a + d));
        byte age = 26;
        if (age >= 20 && age <= 30) {
            System.out.println("Wiek jest wiekszy rowny 20 lat i mniejszy rowny 30");
        }
        if (age == 26 || age == 28) {
            System.out.println("Wiek jest rowny 26 lat lub 28");
        }

        int agePrim = 20;
        switch(agePrim) {




            case 20: {
                System.out.println("Wiek jest rowny 20");
                break;
            }
            case 30: {
                System.out.println("Wiek jest rwny 30");
                break;

            }
            default: {
                System.out.println("Po prostu jestes stary.");
            }
        }

        Scanner scanner = new Scanner(System.in);
        
    }


    }

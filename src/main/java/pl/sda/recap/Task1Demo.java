package pl.sda.recap;

import java.util.Scanner;

public class Task1Demo {
    public static void main(String[] args) {

//        int[] tab = new int[10];
//        for (int i = 0; i <= tab.length - 1 ; i++) {
//            System.out.print(i + " ");
//        }
//        printSecondNumber(tab);
//        System.out.println();
//
//        int[] arrayToPrint = {8, 5, 15, 300, 32, 48};
//
//        print(arrayToPrint);
//        System.out.println();

//        Scanner sc = new Scanner(System.in);
//        String input;
//        input = sc.nextLine();

//        while(true){
//            input = sc.nextLine();
//
//            if(input.toLowerCase().equals("q")){
//                break;
//            }
//
//            try{
//            System.out.println(Integer.parseInt(input));
//        } catch (NumberFormatException ex){
//                System.out.println("Invalid input");
//            }
//
//    }
//        try {
//            int number = Integer.parseInt(input);
//            String message = number % 2 == 0 ? "parzysta" : "nieparzysta";
//            System.out.println(String.format("Liczba jest %s", message));
//        } catch (NumberFormatException ex) {
//            System.out.println("Invalid input");
//        }
//    }
//    private static void printSecondNumber(int[] tab) {
//        for (int i = 0; i <= tab.length - 1; i += 2) {
//            System.out.println(i);
//        }
//    }
//
//    private static void print (int[] arrayToBePrinted){
//        for (int i = 0; i < arrayToBePrinted.length; i+=2) {
//            System.out.println(arrayToBePrinted[i]);
//        }
//    }
        WieleWatkow wieleWatkow = new WieleWatkow("Paweł",10);
        WieleWatkow wieleWatkow1 = new WieleWatkow("Ania",10);

        Thread thread1 = new Thread(wieleWatkow);
        Thread thread2 = new Thread(wieleWatkow1);

        thread1.start();
        thread2.start();


    }
}
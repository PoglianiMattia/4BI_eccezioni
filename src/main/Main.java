package main;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static Scanner tastiera = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("inserire un numero intero tra 1 e 10");
        int[] a= new int[]{ 1,2,3 };
        Scarpa scarpa = new Scarpa(43);
        System.out.println("numero scarpa: "+ scarpa.getNumero());
//        try {
            System.out.println(a[tastiera.nextInt()]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("occhio all'array");
//        }catch(Exception e){
//            System.out.println("inserire un numero");
//        }
        int n = 0;
//        try {
            n = tastiera.nextInt();
//        } catch (Exception e) {
//            System.out.println("eccezione");
//        }
        System.out.println("numero " + n);
    }
}
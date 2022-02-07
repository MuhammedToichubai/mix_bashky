package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                System.out.print(array[j] + " ");
            }
        }
        System.out.println();
        for (int t = 0; t < array.length; t++) {
            if (array[t] % 2 == 1){

                System.out.print(array[t]+" ");
            }

        }
//        for (int a =1; a<11 ; a++){
//            System.out.printf( "5 * %d = %d\n",a,(5*a));  }

//        for ( int a = 1 ; a<6; a++){
//            double b =Math.pow(2, a);
//            System.out.println( "2 * "+a + " = " + (int)b);}

//    for (int i =10; i >1; i--){
//        System.out.println(i*i);
        //      Scanner ekiSan = new Scanner(System.in);
// int a = ekiSan.nextInt();
// int b = ekiSan.nextInt();
// int sum =0;
// for ( ; a<b; a++){
//     if (a %2 == 1){
//         sum +=b;
//     }
// }
//        System.out.println(sum);

//        int  eseptoo = 0;
//        int sum = 0;
//        int a = scanner.nextInt();
//        for (; a > 0; eseptoo++){
//        }
//        System.out.println("Jazylgan sandardy kolichestvo:"+eseptoo);


//                Scanner scanner = new Scanner(System.in) ;
//                int birinchi = scanner.nextInt();
//                int ekinchi = scanner.nextInt();
//                int i = birinchi;
//                while (i < ekinchi) {
//                } i++;
//                if( i % 2 == 1 ) {
//                   System.out.println(i+" ");
//
//


//            koboituunu sykl arkyluu
//           Scanner scanner = new Scanner(System.in);
//              int a = scanner.nextInt();
//              int b = scanner.nextInt();
//              int sum = 0;
//              for (int i =0; i<b;i++)     {
//                  sum+=a ;
//              }
//            System.out.println(sum);


        }
    static int method(int san1,int san2) {
        int summa = 0;
        for (int i = san1; i <= san2; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                summa += i;
                if (i != san2) {
                    System.out.print(i + " + ");
                }
                if (i == san2) {
                    System.out.print(i + " = ");
                }
            }
        }
        return summa;
    }
    static int method2() {
        int summa = 0;
        for (int i = 1; i <= 300; i++) {

            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                summa += i;
                if (i != 300) {

                    System.out.print(i + " + ");
                }
                if (i == 300) {
                    System.out.print(i + " = ");
                }
            }
        }
        return summa;
    }
    }


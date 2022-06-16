package uz.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Mantiqiy toifa  true->rost, false->yolg'on
//        boolean a=false;
//        boolean b=true;
//
//        System.out.println(2>=5);
        Scanner scanner=new Scanner(System.in);
        System.out.print("a=");
        int a=scanner.nextInt();
        System.out.print("b=");
        int b=scanner.nextInt();
        System.out.print("c=");
        int c=scanner.nextInt();
        int d=b*b-4*a*c;
        boolean f=d<0;
        System.out.println(!f);

    }
//    true||true=true
//    true||false=true
//    false||true=true
//    false||false=false

//    true&&true=true
//    true&&false=false
//    false&&true=false
//    false&&false=false

}

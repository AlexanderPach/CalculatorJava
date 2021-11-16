import java.util.Scanner;

public class CalcSimp{

    static void add(int x, int y){
        System.out.println(x + y);
    }

    static void sub(int x, int y){
        System.out.println(x - y);
    }

    static void mul(int x, int y){
        System.out.println(x * y);
    }

    static void div(int x, int y){
        System.out.println(x / y);
    }



    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number");
        int fstnum = scn.nextInt();
        System.out.println("Enter another number");
        int sndnum = scn.nextInt();

        System.out.println("Enter a , s , m, d");
        char sym = scn.next().charAt(0);


        //System.out.println("RESULTS: ");
        switch (sym){
            case 'a':
                add(fstnum, sndnum);
            break;
            case 's':
                sub(fstnum, sndnum);
            break;
            case 'm':
                mul(fstnum, sndnum);
                break;
            case 'd':
                div(fstnum, sndnum);
                break;
        }



    }
}

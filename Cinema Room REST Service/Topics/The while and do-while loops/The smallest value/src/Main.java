import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong();
        fact(n);
    }
    public static void fact(long n){
        long m = 1;

        for (int i = 1; ; i++) {
            m*=i;
//            System.out.println(m);
            if(m > n){
                System.out.println(i);
                break;
            }
        }

    }
}
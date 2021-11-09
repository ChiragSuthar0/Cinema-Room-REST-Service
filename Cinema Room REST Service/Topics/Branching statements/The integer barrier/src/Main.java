import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        int x = 0;
        int sum = 0;
        do {
            x = scn.nextInt();
            sum += x;

            if(sum >= 1000) {
                System.out.println(sum - 1000);
                return;
            }
        }
        while(x != 0);
        System.out.println(sum);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if(a + b > c && b + c > a && c + a > b) {
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
class Main {
    public static void main(String[] args) {
        // put your code here
        int n = new java.util.Scanner(System.in).nextInt();
        int a = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                a++;
                if (a == n) {
                    break;
                }
                System.out.print(" ");
            }
            if (a == n){
                break;
            }
//            System.out.print(" ");
        }
    }
}
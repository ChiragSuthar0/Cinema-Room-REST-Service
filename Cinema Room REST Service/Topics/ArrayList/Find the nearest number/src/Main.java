import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = readArrayList(scanner);

        int N = scanner.nextInt();
        int dis = sameDistance(list, N);

        if (list.contains(N - dis)){
            for (Integer integer : list) {
                if (integer == N - dis) {
                    System.out.print(N - dis + " ");
                }
            }
        }
        if (dis != 0) {
            if (list.contains(dis + N)){
                for (Integer integer : list) {
                    if (integer == N + dis) {
                        System.out.print(N + dis + " ");
                    }
                }
            }
        }

    }

    /* Do not modify this method */
    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static int sameDistance (ArrayList<Integer> a, int N) {
        int dis;
        dis = 100;
        for (Integer I : a) {
            if (dis > N - I && N - I >= 0){
                dis = N - I;
            }
            if (dis > I - N && I - N >= 0){
                dis = I - N;
            }
        }
        return dis;
    }

}
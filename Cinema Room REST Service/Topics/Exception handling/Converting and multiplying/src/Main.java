import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        List<String> Strs = new ArrayList<>();

        while (true) {
            String input = scan.nextLine();

            if (input.equals("0")) {
                break;
            }

            try {
                int inp = Integer.parseInt(input);
                Strs.add(String.valueOf(inp * 10));
            } catch (NumberFormatException e) {
                Strs.add("Invalid user input: " + input);
            }
        }

        Strs.forEach(System.out::println);

    }
}
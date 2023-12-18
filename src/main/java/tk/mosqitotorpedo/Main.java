package tk.mosqitotorpedo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter equation: ");
        String userInput = scanner.nextLine();

        String[] equation = userInput.split(" ");
        float term1 = Integer.parseInt(equation[0]);
        float term2 = Integer.parseInt(equation[2]);
        String operation = equation[1];

        switch (operation) {
            case "+":
                System.out.println(term1 + term2);
                break;

            case "-":
                System.out.println(term1 - term2);
                break;

            case "*":
                System.out.println(term1 * term2);
                break;

            case "/":
                System.out.println(term1 / term2);
                break;
        }


    }
}

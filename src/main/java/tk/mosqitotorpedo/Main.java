package tk.mosqitotorpedo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter equation: ");
        String userInput = scanner.nextLine();

        String[] equation = userInput.split(" ");
        int term1 = Integer.parseInt(equation[0]);
        int term2 = Integer.parseInt(equation[2]);
        String operation = equation[1];


        System.out.println(term1 + term2 + operation);




    }
}

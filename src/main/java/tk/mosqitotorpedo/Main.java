package tk.mosqitotorpedo;

public class Main {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Please enter the equation");
            System.exit(0);
        }

        String[] equation = args[0].split(" ");
        int term1 = Integer.parseInt(equation[0]);
        int term2 = Integer.parseInt(equation[2]);
        String operation = equation[1];


        System.out.println(term1 + term2 + operation);




    }
}

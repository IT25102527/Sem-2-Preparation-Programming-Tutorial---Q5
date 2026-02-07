public class IT25102527 {

    
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {

        // Expression 1: (3 * 4 + 5 * 7)^2
        int exp1 = square(add(multiply(3, 4),multiply(5, 7)));

        // Expression 2: (4 + 7)^2 + (8 + 3)^2
        int exp2 = add(square(add(4, 7)),square(add(8, 3)));

        System.out.println("Result of Expression 1: " + exp1);
        System.out.println("Result of Expression 2: " + exp2);
    }
}

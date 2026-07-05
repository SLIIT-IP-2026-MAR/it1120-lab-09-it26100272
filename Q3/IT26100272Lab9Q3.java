public class IT26100272Lab9Q3 {
    
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to square an integer
    public static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        // i. Calculate (3*4 + 5*7)^2
        int p1 = multiply(3, 4);
        int p2 = multiply(5, 7);
        int sum1 = add(p1, p2);
        int result1 = square(sum1);

        // ii. Calculate (4+7)^2 + (8+3)^2
        int sum2 = add(4, 7);
        int sq1 = square(sum2);
        
        int sum3 = add(8, 3);
        int sq2 = square(sum3);
        
        int result2 = add(sq1, sq2);

        System.out.println("Result of (3*4+5*7)^2 : " + result1);
        System.out.println("Result of (4+7)^2+(8+3)^2 : " + result2);
    }
}
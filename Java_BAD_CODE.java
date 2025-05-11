public class BadExample {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        
        // Poorly structured and unclear logic
        if (a > b) {
            int result = a + b;
            if (result < 10) {
                result = result * 2;
            } else if (result > 20) {
                result = result - 5;
            } else {
                result = result / 2;
            }
            System.out.println(result);
        } else if (a == b) {
            int result = a * 2;
            System.out.println(result);
        } else {
            int result = b - 3;
            System.out.println(result);
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i);  // Unnecessary loop
        }
    }
}

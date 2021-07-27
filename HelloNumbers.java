public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int total = 0;
        while (x < 10) {

            total = total + x;
            x = x + 1;
            System.out.print(total + " ");
        }
        System.out.println("");
    }
}
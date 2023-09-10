
public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.2, 2.4, -4.0, 1.6, -3.4, 4.5, -3.2, 8.7, -4.9, 4.2, -6.4, 8.0, -3.0, 2.9, -4.1};

        double num = 0.0;
        int king = 0;
        boolean kings = false;

        for (double home : numbers) {
            if (home < 0) {
                kings = true;
            } else if (kings && home > 0) {
                num += home;
                king++;
                System.out.println(home);

            }
        }
        System.out.println(num / king);
    }
}

public class Task1 {
    public int f(int x) {
        if (x < 100 || x > 999) {
            throw new IllegalArgumentException("Число должно быть трехзначным");
        }

        int a = x / 100;
        int b = (x / 10) % 10;
        int c = x % 10;

        return a * b * c;
    }
}
public class Task3 {
    public String cows(int n) {
        if (n <= 0 || n >= 100) {
            throw new IllegalArgumentException(
                    "Число должно быть больше 0 и меньше 100");
        }
        if (n >= 11 && n <= 19) {
            return n + " коров";
        }
        switch (n % 10) {
            case 1:
                return n + " корова";
            case 2:
            case 3:
            case 4:
                return n + " коровы";
            default:
                return n + " коров";
        }
    }
}
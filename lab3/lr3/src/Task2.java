public class Task2 {
    public double DegToRad(double D) {
        if (D <= 0 || D >= 360) {
            throw new IllegalArgumentException(
                    "Угол должен быть больше 0 и меньше 360 градусов");
        }
        return D * 3.14 / 180;
    }
}
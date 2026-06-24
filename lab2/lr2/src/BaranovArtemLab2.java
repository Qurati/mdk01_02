public class BaranovArtemLab2 {
    public String CheckNumberX(double x)
    {
        if(x>=-5&& x<=-3 || x>=-1 && x<=1 || x>=3&&x<=5)
            return "принадлежит";
        else
            return "не принадлежит";
    }
}

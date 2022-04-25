package lesson13;

public class Coin implements Comparable<Coin>{
    private int year;
    private int nominal;
    private double diametrt;
    private String metall;

    public Coin() {
    }

    public Coin(int year, int nominal, double diametrt, String metall) {
        this.year = year;
        this.nominal = nominal;
        this.diametrt = diametrt;
        this.metall = metall;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiametrt() {
        return diametrt;
    }

    public void setDiametrt(double diametrt) {
        this.diametrt = diametrt;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "year=" + year +
                ", nominal=" + nominal +
                ", diametrt=" + diametrt +
                ", metall='" + metall + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (year != coin.year) return false;
        if (nominal != coin.nominal) return false;
        if (Double.compare(coin.diametrt, diametrt) != 0) return false;
        return metall != null ? metall.equals(coin.metall) : coin.metall == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = year;
        result = 31 * result + nominal;
        temp = Double.doubleToLongBits(diametrt);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (metall != null ? metall.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Coin o) {
        // sort po diametru, nominal,year,material

        /**
         * this - 1 moneta
         * 0 -2 moneta
         */
        if (this.getDiametrt() != o.getDiametrt()){
            return Double.compare(this.getDiametrt(), o.getDiametrt());
        }
        if(this.getNominal() != o.getNominal()){
            return this.getNominal()-o.getNominal();
        }
        if(this.getYear()!= o.getYear())
            return this.getYear()-o.getYear();
        if(!this.getMetall().equals(o.getMetall())) //проверка на неравенство
            return this.getMetall().compareTo(o.getMetall());
        return 0;
    }
}

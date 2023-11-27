public class Rettangolo implements Forma {

    private double larghezza;
    private double lunghezza;
    public Rettangolo(double larghezza, double lunghezza) {
        this.larghezza = larghezza;
        this.lunghezza = lunghezza;
    }


    @Override
    public double calcolaArea() {
        return larghezza * lunghezza;
    }
}
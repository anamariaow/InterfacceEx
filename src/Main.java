public class Main {
    public static void main(String[] args) {
        Forma rettangolo = new Rettangolo(2,3);
        System.out.println("Area rettangolo: " + rettangolo.calcolaArea());

        Forma triangolo = new Triangolo(4,5);
        System.out.println("Area triangolo: " + triangolo.calcolaArea());
    }
}
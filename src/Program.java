public class Program {
    public static void main(String[] args) {
        Cup<Tea> cup = new Cup<>(new Tea());
        Cup<Coffe> cup1 = new Cup<>(new Coffe());
        Cup<Cacao> cup2 = new Cup<>(new Cacao());
        cup.napitok.getTest();
        cup1.napitok.getTest();
        cup2.napitok.getTest();
    }
}

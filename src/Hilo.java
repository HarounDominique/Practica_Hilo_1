public class Hilo extends Thread {

    public Hilo(String nombre) {
        super(nombre);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName()+": iteración "+i);
        }
    }

    public static void main(String[] args) {
        Hilo h1 = new Hilo("Hilo1");
        Hilo h2 = new Hilo("Hilo2");
        Hilo h3 = new Hilo("Hilo3");
        h1.start();
        h2.start();
        h3.start();
    }
}


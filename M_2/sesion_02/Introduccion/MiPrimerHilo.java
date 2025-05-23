package M_2.sesion_01.sesion_02.Introduccion;

public class MiPrimerHilo extends Thread{
    // el método run se ejecutará de manera concurrente

    @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("=>" +i);
            }
        }

}

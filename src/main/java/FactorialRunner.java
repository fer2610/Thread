class FactorialRunner implements Runnable {
    public static final int MAX = 10;
    private static int[] numero;

    private int i;

    public void run() {
        i = 0;

        while (true) {
            String name = Thread.currentThread().getName();
            int numero = i+1;
            System.out.printf(name+": El factorial del número "+numero+" es: "+i+"\n", i++);
            if (i == MAX) {
                break;
            }
        }
    }
    public static void main(String args[]) {
       /* if(args.length == 0)
            System.exit(0);

       for(int counter = 0; counter < args.length; counter++){
            int i=0;
            numero[i]= Integer.parseInt(args[i]);
            int cont=numero[i-1];
            while (cont !=0) {
                int factorial= numero[i] * cont;
                cont--;
            }
       } */

        System.out.println("main: inicio");
        Thread t = new Thread( new FactorialRunner() );
        t.start();
        System.out.println("main: fin");
    }
}
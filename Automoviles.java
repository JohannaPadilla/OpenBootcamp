public class Automoviles {
    public static void main (String[] args){
        Coches Micoche = new Coches();

        Micoche.maspuertas();
        Micoche.maspuertas();

        System.out.println(Micoche.cantpuertas);
    }


    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }
}

class Coches{
    public int cantpuertas = 0;

    public void maspuertas(){
        this.cantpuertas++;
    }
 }


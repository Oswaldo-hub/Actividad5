import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        float numeroa,numerob,suma,resta,multiplicacion,division;
         Scanner entrada = new Scanner(System.in);
         System.out.println("Hola, escribe  el valor de X: ");
         numeroa= entrada.nextFloat();
        System.out.println("Ahora el valor de Y: ");
        numerob= entrada.nextFloat();
        suma= numeroa+numerob;
        resta= numeroa-numerob;
        multiplicacion=numeroa*numerob;
        division= numeroa/numerob;
    System.out.println("los resultados de las operaciones con la variable X: " +numeroa + " y con la variable Y:  " + numerob+ " fueron: \n"+
            "suma: "+suma +"\n"+
            "resta: "+resta +"\n"+
            "multiplicacion: "+multiplicacion+"\n"+
            "division: "+division+"\n"



    );

    }
}

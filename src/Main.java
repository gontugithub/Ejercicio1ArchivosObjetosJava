import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Gestor g1 = new Gestor();

    public static void main(String[] args) {



        g1.agregarEmail("gonzalo@gmail.com", "1234", "Gonzalo", LocalDate.parse("2005-02-08"));
        g1.agregarEmail("david@gmail.com", "1234", "David", LocalDate.parse("1997-01-18"));
        g1.agregarEmail("juan@gmail.com", "1234", "Juan", LocalDate.parse("2000-12-14"));

        ArrayList<String> destinatarios = new ArrayList<>();
        destinatarios.add("david@gmail.com");
        destinatarios.add("juan@gmail.com");

        g1.enviarMensaje("gonzalo@gmail.com", destinatarios, "PDF CLASE", "Adjunto el pdf visto en clase, un saludo");

        destinatarios.clear();
        destinatarios.add("pepe@gmail.com");

        g1.enviarMensaje("gonzalo@gmail.com", destinatarios, "PDF CLASE", "Adjunto el pdf visto en clase, un saludo");

        System.out.println(g1.getEmailsRegistrados().get(0).getBandejaentrada().toString());


        menuRegistro();


    }

    private static void menuRegistro() {

        System.out.print("INTRODUZCA SUS CREDENCIALES:\n  CORREO: ");
        String in_direccion = sc.next();
        System.out.print("  CONTRASEÑA: ");
        String in_password = sc.next();
        if ( g1.comprobarCredenciales(in_direccion,in_password) == 0 ){
            // CREDENCIALES CORRECTAS
            System.out.println("Iniciando sesion");
        } else {
            System.out.println("correo o contraseña incorrectos");
        }




    }


}
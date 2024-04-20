import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Gestor g1 = new Gestor();

        g1.agregarEmail("gonzalo@gmail.com","1234","Gonzalo", LocalDate.parse("2005-02-08"));
        g1.agregarEmail("david@gmail.com","1234","David", LocalDate.parse("1997-01-18"));
        g1.agregarEmail("juan@gmail.com","1234","Juan", LocalDate.parse("2000-12-14"));

        ArrayList<String> destinatarios = new ArrayList<>();
        destinatarios.add("david@gmail.com");
        destinatarios.add("juan@gmail.com");

        g1.enviarMensaje("gonzalo@gmail.com", destinatarios,"PDF CLASE", "Adjunto el pdf visto en clase, un saludo");



        System.out.println( g1.getEmailsRegistrados().get(1).getBandejaentrada().getFirst().getAsunto());





    }

}

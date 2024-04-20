import java.time.LocalDate;
import java.util.ArrayList;

public class Gestor {

    private ArrayList<Email> emailsRegistrados;

    public ArrayList<Email> getEmailsRegistrados() {
        return emailsRegistrados;
    }

    public void enviarMensaje(String direccionemisor, ArrayList<String> direcciones, String asunto, String cuerpo){

        for (int j = 0; j < emailsRegistrados.size(); j++) {
            for (int i = 0; i < direcciones.size() ; i++) {
                if (emailsRegistrados.get(j).getDireccion().equals(direcciones.get(i))){
                    // CORREO VALIDO
                    emailsRegistrados.get(j).getBandejaentrada().add(new Mensaje(direccionemisor,direcciones,asunto,cuerpo));
                }
            }


        }

    }

    public void agregarEmail(String direccion, String password, String nombre, LocalDate fnac){
        Email email = new Email(direccion, password, nombre, fnac);
        emailsRegistrados.add(email);
    }





}


import java.time.LocalDate;
import java.util.ArrayList;

public class Gestor {

    private final ArrayList<Email> emailsRegistrados = new ArrayList<Email>(0);

    public ArrayList<Email> getEmailsRegistrados() {
        return emailsRegistrados;
    }

    public void enviarMensaje(String direccionemisor, ArrayList<String> direcciones, String asunto, String cuerpo){

        boolean flag = true;
        for (int j = 0; j < direcciones.size(); j++) {
            for (int i = 0; i < emailsRegistrados.size() ; i++) {
                if (direcciones.get(j).equals(emailsRegistrados.get(i).getDireccion())){
                    // CORREO VALIDO
                    emailsRegistrados.get(i).getBandejaentrada().add(new Mensaje(direccionemisor,direcciones,asunto,cuerpo));
                    System.out.println("mensaje envidao con exito a: " + direcciones.get(j));
                    flag = false;
                    break;
                }
            }

            if (flag){
                System.out.println(direcciones.get(j) + " no esta registrada en el gestor");
            }


        }

    }

    public void agregarEmail(String direccion, String password, String nombre, LocalDate fnac){
        Email email = new Email(direccion, password, nombre, fnac);
        emailsRegistrados.add(email);
    }

    public int comprobarCredenciales(String direccion, String password){
        int posicionDireccion = -1;

        for (int i = 0; i < emailsRegistrados.size(); i++) {

            if (direccion.equals(emailsRegistrados.get(i).getDireccion())){
                // SE HA ENCONTRADO EL CORREO
                if (emailsRegistrados.get(i).getPassword().equals(password)){
                    // CONTRASEÑA CORRECTA
                    posicionDireccion = i;
                    break;
                }
            }
        }
        return posicionDireccion;
    }





}


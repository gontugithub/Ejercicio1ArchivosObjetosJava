import java.time.LocalDate;
import java.util.ArrayList;


public class Email {

    private String direccion;
    private String password;
    private String nombre;
    private LocalDate fnac;
    private ArrayList<Mensaje> bandejaEntrada = new ArrayList<Mensaje>(0);

    public Email(String direccion, String password, String nombre, LocalDate fnac) {
        this.direccion = direccion;
        this.password = password;
        this.nombre = nombre;
        this.fnac = fnac;
    }

    public void verBandejaEntrada(){

        if (bandejaEntrada.size() == 0){
            System.out.println("NO HAY MENSAJES");
        } else {

            for (int i = 0; i < bandejaEntrada.size(); i++) {

                System.out.print(bandejaEntrada.get(i).getDireccionemisor() + " | " + bandejaEntrada.get(i).getAsunto() + " | ");

                if (bandejaEntrada.get(i).getCuerpo().length() >= 29){
                    System.out.println(bandejaEntrada.get(i).getCuerpo().substring(0,29) + "...");

                } else {
                    System.out.println(bandejaEntrada.get(i).getCuerpo());
                }

                System.out.println(bandejaEntrada.get(i).getDireccionesenvio());

            }
        }


    }

    public void abrirMensaje(int posmensaje){
        if (posmensaje > bandejaEntrada.size() || posmensaje < 0){
            System.out.println("MENSAJE QUE QUIERES SELECCIONAR INCORRECTO");
        } else {
            System.out.println("EMISOR: " + bandejaEntrada.get(posmensaje).getDireccionemisor() + "\nLISTA DESTINATARIOS:");
            for (String a : bandejaEntrada.get(posmensaje).getDireccionesenvio()){
                System.out.println("  - " + a);
            }
            System.out.println("ASUNTO: " + bandejaEntrada.get(posmensaje).getAsunto());
            System.out.println("CUERPO: " + bandejaEntrada.get(posmensaje).getCuerpo());
        }

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFnac() {
        return fnac;
    }

    public void setFnac(LocalDate fnac) {
        this.fnac = fnac;
    }

    public ArrayList<Mensaje> getBandejaentrada() {
        return bandejaEntrada;
    }

    public void setBandejaentrada(ArrayList<Mensaje> bandejaentrada) {
        this.bandejaEntrada = bandejaentrada;
    }
}

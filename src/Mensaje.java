import java.util.ArrayList;

public class Mensaje {

    private String direccionemisor;
    private ArrayList<String> direccionesenvio;
    private String asunto;
    private String cuerpo;

    public Mensaje(String direccionemisor, ArrayList<String> direccionesenvio, String asunto, String cuerpo) {
        this.direccionemisor = direccionemisor;
        this.direccionesenvio = direccionesenvio;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
    }




    public String getDireccionemisor() {
        return direccionemisor;
    }

    public void setDireccionemisor(String direccionemisor) {
        this.direccionemisor = direccionemisor;
    }

    public ArrayList<String> getDireccionesenvio() {
        return direccionesenvio;
    }

    public void setDireccionesenvio(ArrayList<String> direccionesenvio) {
        this.direccionesenvio = direccionesenvio;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
}


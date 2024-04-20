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

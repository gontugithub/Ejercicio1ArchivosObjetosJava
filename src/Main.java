import com.sun.jdi.request.StepRequest;

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
        g1.enviarMensaje("gonzalo@gmail.com", destinatarios, "VIDEOJUEGOS", "Has visto el nuevo juego?");
        g1.enviarMensaje("gonzalo@gmail.com", destinatarios, "ANIMALES", "Peligo de un animal en extincion, lo adoptamos ma g ?");




        System.out.println(g1.getEmailsRegistrados().get(1).getBandejaentrada().toString());


        menuRegistro();


    }

    private static void menuRegistro() {

        System.out.print("INTRODUZCA SUS CREDENCIALES:\n  CORREO: ");
        String in_direccion = sc.next();
        System.out.print("  CONTRASEÑA: ");
        String in_password = sc.next();
        int posicionDireccion = 0;
        if ( ( posicionDireccion = g1.comprobarCredenciales(in_direccion,in_password)) == -1 ){
            // CREDENCIALES INCORRECTAS
            System.out.println("correo o contraseña incorrectos");
            menuRegistro();

        } else {
            System.out.println("Iniciando sesion");
            opcionesUsuario(g1.getEmailsRegistrados().get(posicionDireccion));
        }

    }

    private static void opcionesUsuario(Email direccion){
        boolean flag = true;

        do {
            System.out.print("  VER BANDEJA DE ENTRADA (1)\n  ABRIR UN MENSAJE (2)\n  REDACTAR MENSAJE (3)\n  IMPRIMIR MENSAJE (4)\n   > ");
            switch (sc.nextInt()){
                case 1:
                    direccion.verBandejaEntrada();
                    break;

                case 2 :
                    System.out.println("SELECCIONE EL NUMERO DE MENSAJE QUE QUIERE VER: ");
                    direccion.abrirMensaje(sc.nextInt());
                    break;

                case 3:
                    redactarMensaje(direccion);
                    break;

                case 4:
                    menuRegistro();
                    flag = false;
                    break;
            }

        }  while (flag);


    }

    private  static void redactarMensaje(Email emailemisor){
        System.out.println("REDACTAR MENSAJE\n");
        boolean flag = true;
        ArrayList<String> listadestinatarios = new ArrayList<String>();
        String asunto = "";
        String cuerpo = "";
        do {
            System.out.print("INTRODUZCA LA DIRECCION DE CORREO: ");
            listadestinatarios.add(sc.next());
            System.out.print("QUIERE AGREGAR MAS DIRECCIONES (S/N): ");
            if (sc.next().toUpperCase().equals("N")){
                flag = false;
            }
        } while (!flag);

        System.out.print("ASUNTO DEL CORREO: ");
        asunto = sc.nextLine();
        System.out.print("CUERPO DEL CORREO:");
        cuerpo = sc.nextLine();

        g1.enviarMensaje(emailemisor.getDireccion(),listadestinatarios,asunto,cuerpo);


    }


}
//inicio de secion usuario y contraseña donde si son iguales te diga bienvenido
import java.util.Scanner;
public class IniciodeSecion{
    private static final Scanner scanner = new Scanner(System.in);
    public static String obtenerCadena(String mensaje){
        String cadenaTemporal;
        System.out.println(mensaje + ": ");
        cadenaTemporal = scanner.nextLine();
        return cadenaTemporal;
    }

    public static void main(String[] args){
        String nombreUsuario = "FerChikito";
        String contresenia = "Final777";
        String usuarioInteresado = obtenerCadena("escribe el Usuario");
        String contraseniaInteresada = obtenerCadena("escribe tu contraseña");
       if (usuarioInteresado.equals(nombreUsuario) && contraseniaInteresada.equals (contresenia)){
        System.out.println("Bienvenido al sistema");
       } else {
        System.out.println("Muuuuuuy mal mano, no te la sabes");
       }
    }
}
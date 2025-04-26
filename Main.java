import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("***** REGISTRO DE USUARIOS *****");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        if (!ValidadorUsuario.validarNombre(nombre)) {
            System.out.println(" ~~~~~~~ Nombre inválido (debe tener solo letras y al menos 2 caracteres). ~~~~~~~");
            return;
        }

        System.out.print("Correo: ");
        String correo = scanner.nextLine();

        if (!ValidadorUsuario.validarCorreo(correo)) {
            System.out.println("~~~~~~~ Correo inválido (formato incorrecto)~~~~~~~.");
            return;
        }

        System.out.print("Contraseña: ");
        String contraseña = scanner.nextLine();

        if (!ValidadorUsuario.validarContrasena(contraseña)) {
            System.out.println("~~~~~~~ Contraseña inválida (mínimo 8 caracteres, 1 mayúscula, 1 minúscula y 1 número). ~~~~~~~");
            return;
        }

    Usuario usuario = new Usuario(nombre, correo, contraseña);
    System.out.println("!!! Usuario registrado correctamente: !!! " + usuario.getNombre());
    }
}
}   

public class ValidadorUsuario {

    public static boolean validarNombre(String nombre) {
        return nombre.matches("[a-zA-Z\\s]{2,}");
    }

    public static boolean validarCorreo(String correo) {
        return correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
    }

    public static boolean validarContrasena(String contraseña) {
        return contraseña.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$");
    }
}
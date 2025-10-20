package pruebaJava;
import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] usuarios = {};
        String opcionBucle = "N";
        while(!opcionBucle.equalsIgnoreCase("S")){
            System.out.print("Por favor, ingrese su nombre de usuario: ");
            String user = teclado.nextLine();
            for(String usuario : usuarios){
                if(user.equalsIgnoreCase(usuario)){
                    System.out.println("Iniciar Sesión [I] | Registrar [R] | Salir [S]\nPor favor, ingrese que opcion desea hacer: ");
                    opcionBucle = teclado.nextLine();
                    if(opcionBucle.equalsIgnoreCase("I")){
                        if(usuario.equals(user)){
                        System.out.println("Felicidades, usted está registrado!");
                        }
                        else{
                            System.out.print("El usuario no ha sido encontrado, desea registrarse? [S|N]: ");
                            String opcion = teclado.nextLine();
                            if(opcion.equalsIgnoreCase("S")){
                                System.out.print("Por favor, ingrese el nombre de usuario que quiera: ");
                                String usuarioNuevo = teclado.nextLine();
                                usuarios[ usuarios.length + 1] = usuarioNuevo;
                                System.out.println("Usuario registrado, inicie sesión");
                            }
                        }
                    }
                }
                
                else if(opcionBucle.equalsIgnoreCase("R")){
                    System.out.print("El usuario no ha sido encontrado, desea registrarse? [S|N]: ");
                    String opcion = teclado.nextLine();
                    if(opcion.equalsIgnoreCase("S")){
                        System.out.print("Por favor, ingrese el nombre de usuario que quiera: ");
                        String usuarioNuevo = teclado.nextLine();
                        usuarios[ usuarios.length + 1] = usuarioNuevo;
                        System.out.println("Usuario registrado, inicie sesión");
                    }
                }
                else if(opcionBucle.equalsIgnoreCase("S")){
                    System.exit(0);
                }
                else{
                    System.out.println("Opción no reconocida, por favor, intentelo de nuevo");
                }
            }
        }
        System.out.println("Fin de programa");
        teclado.close();
    }
}

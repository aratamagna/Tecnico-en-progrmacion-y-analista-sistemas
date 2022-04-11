import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalcularImposicion {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("Ingresar Nombre...");
            String name = keyboard.next();
            System.out.println("Ingresar Rut...");
            String rut = keyboard.next();
            System.out.println("Ingresar sueldo base...");
            Long sueldoBase = 0L;
            try {
                sueldoBase = keyboard.nextLong();
                Long afp = sueldoBase*7/100;
                Long salud = sueldoBase*12/100;
                Long sueldoLiq = sueldoBase-afp-salud;
                System.out.println("el sueldo lìquido de ".concat(name).concat(" es $").concat(String.valueOf(sueldoLiq)));
            } catch (InputMismatchException e) {
                System.out.println("El sueldo debe ser un número entero.");
            }
            System.out.println("Desea realizar otro cálculo? (s = si / n = no)");
            String res = keyboard.next();
            if (res.toLowerCase(Locale.ROOT).equals("n")) {
                break;
            }
        }
    }
}

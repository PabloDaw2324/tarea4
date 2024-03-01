import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Por favor, introduce tu edad: ");
			int edad = scanner.nextInt();

			Persona persona = new Persona(edad);
			persona.calcularAñosHastaJubilacion();
		}
    }
}
public class Persona {
   
	private int edadActual;
    public Persona(int edadActual) {
        this.edadActual = edadActual;
    }

    public void calcularAñosHastaJubilacion() {
        int añosRestantes = 67 - edadActual;
        if (añosRestantes < 10) {
            System.out.println("Sólo te quedan " + añosRestantes + " años. ¡Vamos que ya queda poco!");
        } else if (añosRestantes > 20) {
            System.out.println("Te quedan " + añosRestantes + " años. ¡A seguir trabajando gandul!");
        } else {
            System.out.println("Te quedan " + añosRestantes + " años para jubilarte.");
        }
    }
}
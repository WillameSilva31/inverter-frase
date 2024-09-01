import java.util.Scanner;

public class InverterFrase {

    public static String inverter(String frase) {
        String resultado = "";
        
        for (int i = frase.length() - 1; i >= 0; i--) {
            resultado += frase.charAt(i);
        }
        
        return resultado;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase para inverter: ");
        String frase = scanner.nextLine();
        scanner.close();
        
        System.out.println("Frase invertida: " + inverter(frase));
    }
}

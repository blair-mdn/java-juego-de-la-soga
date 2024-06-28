import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // clase scanner que nos permite que el usuario escriba
     Scanner scanner = new Scanner(System.in);
     // declaraciones y asignaciones
     String palabraSecreta = "inteligencia";
     int intentosMaximos = 10;
     int intentos = 0;
     boolean palabraAdivinada = false;
     //arreglos: 
      char[] letrasAdivinadas = new char[palabraSecreta.length()];

      //estructura de control: iterativa (bucle) 
      for (int i = 0; i< letrasAdivinadas.length; i++) {
             letrasAdivinadas[i]='_';
      }
       // estructura de control: iterativa (bucle)
       while (!palabraAdivinada && intentos < intentosMaximos ) {
                                                    //permite formar una palabra de un arrays, en teste caso del la palabra
                                                    //secreta, para que podamos compararlo con equals.
        System.out.println("palabra a adivinar: " + String.valueOf(letrasAdivinadas) + "(12 letras)");
        System.out.println("introduce una letra, por favor¡¡");
       
        // espera una letra y solo cuenta la primera
        char letra = Character.toLowerCase(scanner.next().charAt(0));
                        //convierte la palabra ingresada a minuscula.

        boolean letraCorrecta = false;
        //estructura de control: iterativa (bucle) 
        for (int i = 0; i < palabraSecreta.length(); i++) {
                 //estructura de control: condicional
                 if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;//intercambiar la letra adivinada por el guion
                    letraCorrecta = true;

                    
                 } 
        }
                if (!letraCorrecta) {
                    intentos++;
                  System.out.println("letra incorrecta, te quedan " + (intentosMaximos-intentos)+ " intentos." );
                    
                }
                
                if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                    
                  palabraAdivinada = true;
                  System.out.println("felicidades adivinaste la palabra secreta: "+ palabraSecreta);

                }
             }
             if (!palabraAdivinada) {
                System.out.println("perdiste, te quedaste sin intentos:  GAME OVER");

             }
                scanner.close();
    
         
                 
     
              
    }

}

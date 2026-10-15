package palindromorecursivo;

/**
 *UNIVERSIDAD TECNOLÓICA DE LA HUASTECA HIDALGUENSE
 * @author Oscar Cortes Solares 20251052
 * Cuatrimestre: 4 Grupo: A
 */
public class PalindromoRecursivo {
    //El metodo wrapper es aquel que se encarga de revisar que no este vacia(null) y evitar tronar el programa como al igual elimina los espacios y mayusculas
    public static boolean esPalindromo(String palabra){
        if(palabra == null)return false;
        
        //Convierte las letras en minusculas(tolowercase) como tambien elimina los espacios en blanco("\\s+", "")
        String limpia = palabra.toLowerCase().replaceAll("\\s+", "");
        
        //esto es donde inicia y termina(palabra, int inicio, int fin)
        return esPalindromoAux(limpia, 0, limpia.length() -1);  
    }
    
    // 2. Método Recursivo Auxiliar (Privado): Realiza la validación lógica
    private static boolean esPalindromoAux(String palabra, int inicio, int fin) {
        //Los punteros se cruzan o coinciden (significa que se revisó todo con éxito)
        if (inicio >= fin)return true;
        
        //verifica que la palabra no es políndromo
        if(palabra.charAt(inicio)!=palabra.charAt(fin))return false;
        
        //acerca los punteros hacia el centro
        return esPalindromoAux(palabra,inicio +1, fin -1);
    }
    
    public static void main(String[] args){
    System.out.println(esPalindromo("Radar"));
    System.out.println(esPalindromo("ana"));
    System.out.println(esPalindromo("JSSU"));
    }
}

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Ciao, scrivi un numero da 1 a 5");
        Scanner scanner = new Scanner(System.in);
        int nNumber = getNextNumber(scanner);
        Set<String> stringSet = new HashSet<>();
        scanner.nextLine();
        System.out.println("Adesso inserisci " + nNumber + " parole:");
        String string="";
        Set<String> repeatedWords = new HashSet<>();
        for (int i = 1; i <= nNumber; i++) {
            System.out.print("Parola n° " + i + ": ");
            string = scanner.nextLine();
            if (stringSet.contains(string)) {
                repeatedWords.add(string);
            }
            stringSet.add(string);
        }

        System.out.println(repeatedWords);
        System.out.println(stringSet.size());
        System.out.println("Elenco delle parole distinte :");
        for(String word:stringSet){
            System.out.println(word);
        }
        scanner.close();
    }
    private static int getNextNumber(Scanner scanner) {
        while (true) {
            try { int number = scanner.nextInt();
                if(number>0&&number<=5){
                    return number;
                }
                else{
                    scanner.nextLine();
                    System.out.println("Inserisci un numero maggiore di 0 e minore o uguale a 5. Riprova: ");
                }
            } catch (java.util.InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Il tuo numero è : " + e.getMessage());
                System.out.print("Riprova: ");
            }
        }
    }

}

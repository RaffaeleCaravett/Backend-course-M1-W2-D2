package ExerciseN2;

import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("Inserisci un numero");
        Scanner scanner = new Scanner(System.in);
        int number = getNextNumber(scanner);
        ExerciseN2 exerciseN2 = new ExerciseN2();
        List<Integer> result = exerciseN2.functionN1(number);
        System.out.println(result);
        result= new ArrayList<>();
        result = exerciseN2.functionN2(number);
        System.out.println(result);



        List<Integer> numbersArray = new ArrayList<>();
        Random random = new Random();
        for (int i =1;i <=number;i++){
            int randomNumber=random.nextInt(101);
            numbersArray.add(randomNumber);
        }
        System.out.println(numbersArray);
        System.out.println(exerciseN2.functionN3(numbersArray,true));
        System.out.println(exerciseN2.functionN3(numbersArray,false));
    }

    private static int getNextNumber(Scanner scanner) {
        while (true) {
            try { int number = scanner.nextInt();
                if(number>0){
                    return number;
                }
                else{
                    scanner.nextLine();
                    System.out.println("Inserisci un numero maggiore di 0. Riprova: ");
                }
            } catch (java.util.InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Il tuo numero è : " + e.getMessage());
                System.out.print("Riprova: ");
            }
        }
    }
}

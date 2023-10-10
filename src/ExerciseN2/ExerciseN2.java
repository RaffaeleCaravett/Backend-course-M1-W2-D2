package ExerciseN2;

import java.util.*;

public class ExerciseN2 {

    public List<Integer> functionN1(int number){
        List<Integer> numbersArray = new ArrayList<>();

        Random random = new Random();
        for (int i =1;i <=number;i++){
           int randomNumber=random.nextInt(101);
           numbersArray.add(randomNumber);
        }
         Collections.sort(numbersArray);
        return numbersArray;
    }

    public List<Integer> functionN2(int number){
        List<Integer> numbersArray = new ArrayList<>();
        Random random = new Random();
        for (int i =1;i <=number;i++){
            int randomNumber=random.nextInt(101);
            numbersArray.add(randomNumber);
        }
        numbersArray.sort(Collections.reverseOrder());
        return numbersArray;
    }

    public List<Integer> functionN3(List<Integer> List,boolean bool){
        List<Integer> numbersArray = new ArrayList<>();
        if(bool){
        for (int i=1;i<=List.size();i++){
            int number=List.get(i-1);
            if(i%2==0){
            numbersArray.add(number);
            }
        }
        return  numbersArray;
    }else{
            for (int i=1;i<=List.size();i++){
                int number=List.get(i-1);
                if(i%2!=0){
                    numbersArray.add(number);
                }
            }
            return  numbersArray;
        }
    }
}

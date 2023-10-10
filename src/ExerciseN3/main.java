package ExerciseN3;

import java.util.HashMap;
import java.util.Map;

public class main {

    public static void main(String[] args) {

        RubricaTelefonica first = new RubricaTelefonica("Aldo",3333333333L);
        RubricaTelefonica second = new RubricaTelefonica("Giovanni",3334444444L);
        RubricaTelefonica third = new RubricaTelefonica("Giacomo",33355555533L);
        RubricaTelefonica fourth = new RubricaTelefonica("Lampretto",33666663333L);
        RubricaTelefonica fifth = new RubricaTelefonica("Fusillo",3888883333L);


        HashMap<String, Long> hashMap = new HashMap<>();


        hashMap.put(first.getNome(),first.getNumeroDiTelefono());
        hashMap.put(second.getNome(),second.getNumeroDiTelefono());
        hashMap.put(third.getNome(),third.getNumeroDiTelefono());
        hashMap.put(fourth.getNome(),fourth.getNumeroDiTelefono());
        hashMap.put(fifth.getNome(),fifth.getNumeroDiTelefono());

        insertCouple("Gianni",3333334444L,hashMap);
        System.out.println(hashMap);
        deleteCouple("Gianni",hashMap);
        System.out.println(hashMap);
        searchByNumber(33355555533L,hashMap);
        searchByName("Fusillo",hashMap);
        printEveryone(hashMap);
    }




    static void insertCouple(String name, Long telephonNumber,HashMap<String, Long> hashMap){
        hashMap.put(name,telephonNumber);
    }

    static void deleteCouple(String name,HashMap<String, Long> hashMap){
        hashMap.remove(name);
    }
    static void searchByNumber( Long telephonNumber,HashMap<String, Long> hashMap){

        if(hashMap.containsValue(telephonNumber)){
            for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
                if (entry.getValue().equals(telephonNumber)) {

                    System.out.println("La persona corrispondente è : " + entry.getKey());

                    break;
                }
            }
        }

    }

    static void searchByName( String name,HashMap<String, Long> hashMap){
        if(hashMap.containsKey(name)){
            for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
                if (entry.getKey().equals(name)) {
                    System.out.println("Il numero di telefono corrispondente è : " + entry.getValue());
                    break;
                }
            }
        }

    }
    static void printEveryone(HashMap<String, Long> hashMap){
            for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
                    System.out.println(entry);
                }
            }
        }




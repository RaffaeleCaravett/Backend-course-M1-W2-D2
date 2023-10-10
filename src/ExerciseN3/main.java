package ExerciseN3;

import java.util.HashMap;

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




    }

}

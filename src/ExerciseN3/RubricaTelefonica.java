package ExerciseN3;

public class RubricaTelefonica {

    String nome;
    Long numeroDiTelefono;

    public RubricaTelefonica(String nome,Long numeroDiTelefono){
        if(nome!=null) {
            this.nome = nome;
        }
    }

    public Long getNumeroDiTelefono() {
        return numeroDiTelefono;
    }

    public void setNumeroDiTelefono(Long numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }





}

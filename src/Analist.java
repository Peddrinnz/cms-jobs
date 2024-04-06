import java.util.Date;

public class Analist extends Employee{
    String equipe;
    String especialidade;
    
    public Analist(String nome2, Date data_de_admissao2, double salario_base2) {
        super(nome2, data_de_admissao2, salario_base2, salario_base2, salario_base2);
    }
    
    public String getEquipe() {
        return equipe;
    }
    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    
}

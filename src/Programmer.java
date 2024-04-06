import java.util.Date;

public class Programmer extends Employee {
    String linguagem;
    String nivel; // int ou string???

    public Programmer(String nome, Date data_de_admissao, double salario_base) {
        super(nome, data_de_admissao, salario_base, salario_base, salario_base);
    }
    
    public String getLinguagem() {
        return linguagem;
    }
    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    
}
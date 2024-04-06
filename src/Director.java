import java.util.Date;

public class Director extends Employee {
    public Director(String nome, Date data_de_admissao, double salario_base, double salario_bruto, double liquido) {
        super(nome, data_de_admissao, salario_base, salario_bruto, liquido);
    }
    String departamento;
    Date inicioVigencia;
    Date fimVigencia;
    
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
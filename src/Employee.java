import java.util.Date;

public class Employee {
    private String nome;
    private Date data_de_admissao;
    private Double salario_base;
    private Double salario_bruto; 
    private Double salario;
    private Double liquido;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getData_de_admissao() {
        return data_de_admissao;
    }
    public void setData_de_admissao(Date data_de_admissao) {
        this.data_de_admissao = data_de_admissao;
    }
    public Double getSalario_base() {
        return salario_base;
    }
    public void setSalario_base(Double salario_base) {
        this.salario_base = salario_base;
    }
    public Double getSalario_bruto() {
        return salario_bruto;
    }
    public void setSalario_bruto(Double salario_bruto) {
        this.salario_bruto = salario_bruto;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Double getLiquido() {
        return liquido;
    }
    public void setLiquido(Double liquido) {
        this.liquido = liquido;
    }
    
}

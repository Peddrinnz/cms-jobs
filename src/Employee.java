import java.util.Date;

public class Employee {
    private String nome;
    private Date data_de_admissao;
    private double salario_base;
    private double salario_bruto; 
    private double salario;
    private double liquido;

    protected final double salarioBaseProgramador = 3000;
    protected final double salarioBaseDiretor = 9000;
    protected final double salarioBaseAnalista = 9000;

    public Employee(String nome, Date data_de_admissao, double salario_base, double salario_bruto, double liquido){
        this.nome = nome;
        this.data_de_admissao = data_de_admissao;
        this.salario_base = salario_base;
        this.salario_bruto = 0;
        this.liquido = 0;
    }
   

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
    
    public void calcularRemuneracao( Double salarioBase, Double salarioBruto, Double salarioLiquido){
        
    }
}

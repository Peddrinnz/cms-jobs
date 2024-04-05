public class Employee {
    private String nome;
    private String data_de_admissao;
    private String salario_base;
    private String salario_bruto; 
    private String salario;
    private String liquido;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getData_de_admissao() {
        return data_de_admissao;
    }
    public void setData_de_admissao(String data_de_admissao) {
        this.data_de_admissao = data_de_admissao;
    }
    public String getSalario_base() {
        return salario_base;
    }
    public void setSalario_base(String salario_base) {
        this.salario_base = salario_base;
    }
    public String getSalario_bruto() {
        return salario_bruto;
    }
    public void setSalario_bruto(String salario_bruto) {
        this.salario_bruto = salario_bruto;
    }
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }
    public String getLiquido() {
        return liquido;
    }
    public void setLiquido(String liquido) {
        this.liquido = liquido;
    }

}

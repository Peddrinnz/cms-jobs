import java.util.Date;

public class Director extends Employee {
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
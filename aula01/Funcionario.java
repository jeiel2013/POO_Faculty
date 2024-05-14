class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    
    Funcionario() {
        this.cargo = "";
        this.salario = 0;
    }
    
    void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    void setSalario(double salario) {
        this.salario = salario;
    }
    
    String getCargo() {
        return this.cargo;
    }
    
    double getSalario() {
        return this.salario;
    }
    
    String getDadosFuncionario() {
        String resultado = "";
	System.out.println("\nFUNCIONARIO");
        resultado = resultado + "NOME: " + this.getNome();
        resultado = resultado + "\nCPF: " + this.getCpf();
        resultado = resultado + "\nIDADE: " + this.getIdade();
        resultado = resultado + "\nCARGO: " + this.getCargo();
        resultado = resultado + "\nSALARIO: " + this.getSalario();
        return resultado;
    }
}
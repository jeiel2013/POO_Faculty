class Cliente extends Pessoa {
    private String email;
    private String senha;
    
    Cliente() {
        this.email = "";
        this.senha = "";
    }
    
    void setEmail(String email) {
        this.email = email;
    }
    
    void setSenha(String senha) {
        this.senha = senha;
    }
    
    String getEmail() {
        return this.email;
    }
    
    String getSenha() {
        return this.senha;
    }
    
    String getDadosCliente() {
        String resultado = "";
	System.out.println("\nCLIENTE");
        resultado = resultado + "NOME: " + this.getNome();
        resultado = resultado + "\nCPF: " + this.getCpf();
        resultado = resultado + "\nIDADE: " + this.getIdade();
        resultado = resultado + "\nEMAIL: " + this.getEmail();
        resultado = resultado + "\nSENHA: " + this.getSenha();
        return resultado;
    }
}
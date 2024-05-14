class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    
    Pessoa() {
        this.nome = "";
        this.cpf = "";
        this.idade = 0;
    }
    
    void setNome(String nome) {
        this.nome = nome;
    }
    
    void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    void setIdade(int idade) {
        this.idade = idade;
    }
    
    String getNome() {
        return this.nome;
    }
    
    String getCpf() {
        return this.cpf;
    }
    
    int getIdade() {
        return this.idade;
    }
}
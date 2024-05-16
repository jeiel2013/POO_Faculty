package aula02;

class Veiculo {
    private String marca;
    private String modelo;
    private String cor;
    
    Veiculo() {
        this.marca = "";
        this.modelo = "";
        this.cor = "";
    }
    
    void setMarca(String marca) {
        this.marca = marca;
    }
    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    void setCor(String cor) {
        this.cor = cor;
    }
    String getMarca() {
        return this.marca;
    }
    String getModelo() {
        return this.modelo;
    }
    String getCor() {
        return this.cor;
    }
}

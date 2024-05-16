package aula02;

class Carro extends Veiculo {
    private int qtdePass;
    private double valor;
    private double peso;
    
    Carro() {
        qtdePass = 0;
        valor = 0;
        peso = 0;
    }
    
    void setQtdePass(int qtdePass) { this.qtdePass = qtdePass; }
    
    void setValor(double valor) { this.valor = valor; }
    
    void setPeso(double peso) { this.peso = peso; }
    
    int getQtdePass() { return this.qtdePass; }
    
    String getValor() { return "R$ " + this.valor; }
    
    String getPeso() { return this.peso + " Toneladas"; }
    
    String getDadosCarro() {
        String resultado = "";
        resultado = resultado + "\nMARCA: " + this.getMarca();
        resultado = resultado + "\nMODELO: " + this.getModelo();
        resultado = resultado + "\nCOR: " + this.getCor();
        resultado = resultado + "\nPASSAGEIROS: " + this.getQtdePass();
        resultado = resultado + "\nVALOR: " + this.getValor();
        resultado = resultado + "\nPESO: " + this.getPeso();
        return resultado;
    }
}

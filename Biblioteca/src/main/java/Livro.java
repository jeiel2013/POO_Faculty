public class Livro extends CadastroDAO {
    private String titulo;
    private String autor;
    private String genero;
    private String editora;
    private int anoPublicacao;
    
    Livro() {
        titulo = "";
        autor = "";
        genero = "";
        editora = "";
        anoPublicacao = 0;
    }
    
    public void cadastrar() {
        // TODO herdar do CadastroDAO = função insertMySQL
        insertMySQL(titulo, autor, genero, editora, anoPublicacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}

package s;

public class Livro {
    private int livro;
    private String titulo;
    
    Livro(int livro, String titulo){
        this.livro = livro;
        this.titulo = titulo;
    }
    @Override
    public String toString(){
        return "livro: " + Integer.toString(this.livro)+ " - Titulo: " + this.titulo;
        
    }
    public static void main(String[] args) {
    Livro livro = new Livro(1, "teste livro");
	System.out.println(livro.toString());
    }
}

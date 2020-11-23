
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private int paginas;
    private String numeroReferencia;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        paginas = numeroDePaginas;
        numeroReferencia = "";
    }
   
    public String getAutorLibro(){
        return autor;
    }
    
    public String getTituloLibro(){
        return titulo;
    }
    
    public void imprimeAutor(){
        System.out.println("El autor del libro es " + autor);
    }
    
    public void imprimeTitulo(){
        System.out.println("El t�tulo del libro es " + titulo);
    }
    
    public int getNumeroPaginas(){
        return paginas;
    }
    
    public void imprimirDetalles(){
        if(numeroReferencia != ""){
            System.out.println("T�tulo: " + titulo + ", Autor: " + autor + ", P�ginas: " +
            paginas + ", N�m. de referencia: " + numeroReferencia);
        }
        else{
            System.out.println("T�tulo: " + titulo + ", Autor: " + autor + ", P�ginas: " +
            paginas + ", N�m. de referencia: ZZZ");
        }
       
    }
    
    public String getDetalles(){
        return "T�tulo: " + titulo + ", Autor: " + autor + ", P�ginas: " +
        paginas + ", N�m. de referencia: " + numeroReferencia;
    }
    
    public void setNumeroReferencia(String referencia){
        numeroReferencia = referencia;
        if(numeroReferencia.length() < 3){
            numeroReferencia = "";
            System.out.println("El n�mero de referencia es demasiado corto");
        } 
    }
    
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
}

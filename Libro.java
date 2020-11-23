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
    private int vecesPrestado;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        paginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = 0;
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
        System.out.println("El título del libro es " + titulo);
    }
    
    public int getNumeroPaginas(){
        return paginas;
    }
    
    public void imprimirDetalles(){
        if(numeroReferencia != ""){
            System.out.println("Título: " + titulo + ", Autor: " + autor + ", Páginas: " +
            paginas + ", Núm. de referencia: " + numeroReferencia + ", Veces prestado: " + vecesPrestado);
        }
        else{
            System.out.println("Título: " + titulo + ", Autor: " + autor + ", Páginas: " +
            paginas + ", Núm. de referencia: ZZZ " + ", Veces prestado: " + vecesPrestado);
        }
       
    }
    
    public String getDetalles(){
        String estadoReferencia;
        if(numeroReferencia != ""){
            estadoReferencia = numeroReferencia;
        }
        else{
            estadoReferencia = "ZZZ";
        }
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " +
            paginas + ", Núm. de referencia: " + estadoReferencia + ", Veces prestado: " + vecesPrestado;
    }
    
    public void setNumeroReferencia(String referencia){
        if(referencia.length() < 3){
            System.out.println("El número de referencia es demasiado corto");
        } 
        else{
            numeroReferencia = referencia;
        }
    }
    
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    
    public void prestarLibro(){
        vecesPrestado = vecesPrestado + 1;
    }
    
    public int getVecesPrestado(){
        return vecesPrestado;
    }
}

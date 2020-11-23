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
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, 
    boolean libroDeTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        paginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = 0; 
        esLibroDeTexto = libroDeTexto;
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
        String estadoReferencia;
        String esDeTexto;
        if(numeroReferencia != ""){
            estadoReferencia = numeroReferencia;
        }
        else{
            estadoReferencia = "ZZZ";
        }
        
        if(esLibroDeTexto == true){
            esDeTexto = "Sí";
        }
        else{
            esDeTexto = "No";
        }
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Páginas: " +
        paginas + ", Núm. de referencia: " + estadoReferencia + ", Veces prestado: " + vecesPrestado
         + ", ¿El libro es de texto?: " + esDeTexto);
    }
    
    public String getDetalles(){
        String estadoReferencia;
        String esDeTexto;
        if(numeroReferencia != ""){
            estadoReferencia = numeroReferencia;
        }
        else{
            estadoReferencia = "ZZZ";
        }
        
        if(esLibroDeTexto == true){
            esDeTexto = "Sí";
        }
        else{
            esDeTexto = "No";
        }
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " +
        paginas + ", Núm. de referencia: " + estadoReferencia + ", Veces prestado: " + vecesPrestado
         + ", ¿El libro es de texto?: " + esDeTexto;
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
    
    public boolean GetEsLibroDeTexto(){
        return esLibroDeTexto;
    }
}

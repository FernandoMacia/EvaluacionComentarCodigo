/**
 * Clase para manejar las entradas de un blog.
 * @author FERNANDO MACIÁ LÓPEZ
 * @version 2.3 Class
 * @since 17/02/2022
 */
public class EntradaBlogFML {
	
	/**
	 * separador es el carácter que separa ENTRADA DE del
	 * nombre del autor
	 */	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	/**
	 * Constructor de la clase. 
	 *@param id : número de la entrada.
	 *@param autor : nombre del autor de la entrada.
	 *@param texto : texto que contiene la entrada.
	 *@exception IllegalArgumentException : si el número de entrada es negativo.
	 */
	public EntradaBlogFML(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	

	/**
	 * @return número de la entrada
	 */
	public int getId(){
		return this.id;
	}
	
	/**
	 * @return texto completo de la entrada
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**
	 * @return nombre del autor de la entrada en mayúsculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**
	 * @return nombre del autor. 
	 * @deprecated  Mejor ver getAutor
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**
	 * @param args : No tiene porqué tener argumentos.
	 */
	public static void main(String[] args) {
        try {
		EntradaBlogFML e1=new EntradaBlogFML (1,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
		}
        catch(IllegalArgumentException e) {
        	System.out.println(e.getMessage()); 
        }    
	}
}
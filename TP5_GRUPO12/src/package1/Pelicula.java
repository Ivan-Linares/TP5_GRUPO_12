package package1;

public class Pelicula {
	
	private final int id;
	private String nombre;
	private Categorias categoria;
	private static int idAux = 1;
	
	public Pelicula() {
		this.id = idAux;
		idAux++;
	}
	
	public Pelicula(String nombre, Categorias categoria) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.id = idAux;
		idAux++;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Categorias getCategoria() {
		return categoria;
	}
	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}
	public static int getIdAux() {
		return idAux;
	}
	
	@Override
	public String toString() {
		return "Pelicula "+ nombre + ", categoria " + categoria;
	}
	
}

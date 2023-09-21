package package1;

public class Pelicula 
{
	
	private int ID;
	private String nombre;
	private Categorias categoria;
	
	
	public Pelicula()
	{
		
	}
	
	public Pelicula(String nombre, Categorias categoria, int iD) 
	{
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		ID = iD;
	
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
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	@Override
	public String toString()
	{
		return "Pelicula "+ nombre + ", categoria " + categoria;
	}
	
}

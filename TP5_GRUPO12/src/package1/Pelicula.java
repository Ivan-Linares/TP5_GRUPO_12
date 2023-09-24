package package1;

public class Pelicula {
	private int ID;
	private String nombre;
	private Categoria categoria;
	
	
	public Pelicula()
	{
		
	}
	
	public Pelicula(String nombre, Categoria categoria, int iD) 
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
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}
	
	@Override
	public String toString()
	{
		return nombre;
	
	}
}

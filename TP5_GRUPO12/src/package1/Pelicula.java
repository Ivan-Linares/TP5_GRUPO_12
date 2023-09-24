package package1;


public class Pelicula implements Comparable<Pelicula>{
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
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		if (nombre == null) {
			if (other.getNombre() != null)
				return false;
		} else if (!categoria.equals(other.getCategoria()))
			return false;
		if (nombre == null) {
			if (other.getNombre() != null)
				return false;
		} else if (!nombre.equals(other.getNombre()))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public int compareTo(Pelicula obj) {
		return this.nombre.compareTo(obj.getNombre());	
	}
}

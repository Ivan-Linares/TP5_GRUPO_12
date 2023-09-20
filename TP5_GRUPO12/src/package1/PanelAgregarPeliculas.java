package package1;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import package1.Categorias;
import package1.Pelicula;

import javax.swing.JComboBox;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class PanelAgregarPeliculas extends JPanel {
	
	private JTextField txtNombre;
	private JComboBox<Categorias> cboGeneros;
	private DefaultListModel<Pelicula> listModel;

	public PanelAgregarPeliculas() {
		dibujar();
	}
	
	public void dibujar() {
		setLayout(null);
		listModel=new DefaultListModel<>();
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(70, 30, 46, 14);
		add(lblId);
		
		JLabel lblShowID = new JLabel(String.valueOf(Pelicula.getIdAux()));
		lblShowID.setBounds(170, 30, 46, 14);
		add(lblShowID);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(70, 55, 46, 14);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(70, 80, 46, 14);
		add(lblGenero);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(170, 55, 155, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		cboGeneros = new JComboBox<Categorias>();
		cboGeneros.setBounds(170, 77, 155, 20);
		cboGeneros.addItem(new Categorias(-1, "Seleccione un Genero"));
		cboGeneros.addItem(new Categorias(1, "Terror"));
		cboGeneros.addItem(new Categorias(2, "Accion"));
		cboGeneros.addItem(new Categorias(3, "Suspenso"));
		cboGeneros.addItem(new Categorias(4, "Romantica"));
		add(cboGeneros);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(116, 108, 89, 23);
		add(btnAceptar);
	}
	
	public DefaultListModel<Pelicula> getListModel() {
		return listModel;
	}

	public void setListModel(DefaultListModel<Pelicula> listModel) {
		this.listModel = listModel;
	}
	
}

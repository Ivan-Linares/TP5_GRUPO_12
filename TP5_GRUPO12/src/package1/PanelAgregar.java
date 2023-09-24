package package1;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAgregar extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int cont = 1;
	private final int id = cont;
	/**
	 * Create the panel.
	 */
	private DefaultListModel<Pelicula> dlModel;
	private JTextField txtNombre;
	private JComboBox<Categoria>  cbogenero;
	private JLabel lblid;
	
	public PanelAgregar() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(55, 44, 58, 23);
		add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(55, 78, 58, 23);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(55, 113, 58, 23);
		add(lblGenero);
		
		JButton btnaceptar = new JButton("Aceptar");
		btnaceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pelicula pelicula = new Pelicula();
				if(txtNombre.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre para la pelicula");
				}
				else 
				{
					if(((Categoria)cbogenero.getSelectedItem()).getId() == -1) {
						JOptionPane.showMessageDialog(null, "Por favor, seleccione un genero");						
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Se agrego la pelicula: "+txtNombre.getText() + " ,de " + cbogenero.getSelectedItem());
						
						pelicula.setID(Integer.parseInt(lblid.getText()));
						pelicula.setNombre(txtNombre.getText());
						dlModel.addElement(pelicula);
						
						cont ++; 
						
						txtNombre.setText("");
						cbogenero.setSelectedIndex(0);
						lblid.setText(String.valueOf(cont));
					}
				}
			}
		});
		btnaceptar.setBounds(55, 156, 117, 30);
		add(btnaceptar);
		
		lblid = new JLabel(String.valueOf(id));
		lblid.setBounds(136, 44, 123, 23);
		add(lblid);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(135, 78, 155, 23);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		cbogenero = new JComboBox<Categoria>();
		cbogenero.setBounds(136, 115, 154, 23);
		cbogenero.addItem(new Categoria(-1, "Seleccione un Genero"));
		cbogenero.addItem(new Categoria(1, "Terror"));
		cbogenero.addItem(new Categoria(2, "Accion"));
		cbogenero.addItem(new Categoria(3, "Suspenso"));
		cbogenero.addItem(new Categoria(4, "Romantica"));
		add(cbogenero);

	}

	public void setListModel(DefaultListModel<Pelicula> dlModel1) {
		// TODO Auto-generated method stub
		this.dlModel=dlModel1;
	}
}
package package1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import package1.Categorias;
import package1.Pelicula;

import javax.swing.JComboBox;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class PanelAgregarPeliculas extends JPanel
{
	private static int cont = 1;
	private final int id = cont;
	
	private JTextField txtNombre;
	private JComboBox<Categorias> cboGeneros;
	private JLabel lblShowID;
	
	private DefaultListModel<Pelicula> listModel;

	public PanelAgregarPeliculas() 
	{
		dibujar();
		
		listModel = new DefaultListModel<Pelicula>();
	}
	
	public void dibujar() 
	{
		setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(70, 30, 46, 14);
		add(lblId);
		
		lblShowID = new JLabel(String.valueOf(this.id));
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
		
		
		////////////////////////////////////////////////IMPLEMENTO EL ACTIONLISTENER
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new eventoBtnAceptar());
		btnAceptar.setBounds(116, 108, 89, 23);
		add(btnAceptar);
	}
	
	class eventoBtnAceptar implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(txtNombre.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(null, "Por favor ingrese un nombre para la pelicula");
			}
			else if(((Categorias)cboGeneros.getSelectedItem()).getId() == 0)
			{
				JOptionPane.showMessageDialog(null, "Por favor seleccione un genero");
			}
			else
			{
				JOptionPane.showMessageDialog(null, txtNombre.getText() + " " + cboGeneros.getSelectedItem());
				
				Pelicula pelicula = new Pelicula();
				
				pelicula.setID(Integer.parseInt(lblShowID.getText()));
				pelicula.setNombre(txtNombre.getText());
				pelicula.setCategoria((Categorias)cboGeneros.getSelectedItem());
				
				listModel.addElement(pelicula);
				
				cont ++; 
				
				txtNombre.setText("");
				cboGeneros.setSelectedIndex(0);
				lblShowID.setText(String.valueOf(cont));
			}			
		}	
	}

	public void setListModel(DefaultListModel<Pelicula> dlModel) 
	{
		this.listModel = dlModel;
	}
}
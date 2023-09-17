package package1;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

@SuppressWarnings("serial")
public class VentanaPricipal extends JFrame
{
	private JPanel contentPane;
	
	JMenuBar menuBar;
	JMenu mnPeliculas;
	JMenuItem mnItemAgregar;
	JMenuItem mnItemListar;
	
	public VentanaPricipal() 
	{	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);
		
		mnItemAgregar = new JMenuItem("Agregar");
		mnPeliculas.add(mnItemAgregar);
		
		mnItemListar = new JMenuItem("Listar");
		mnPeliculas.add(mnItemListar);
		
	}
	
}

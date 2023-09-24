package package1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.util.TreeSet;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static DefaultListModel<Pelicula> dlModel;

	
	 /* Launch the application.*/
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					dlModel= new DefaultListModel<Pelicula>();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private JMenuBar menuBar;
	private JMenu mnPelicula;
	private JMenuItem mntmNewMenuItem;
	
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnPelicula = new JMenu("Peliculas");
		menuBar.add(mnPelicula);
		
		mntmNewMenuItem = new JMenuItem("Agregar");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PanelAgregar panel = new PanelAgregar();
				panel.setListModel(dlModel);
				contentPane.removeAll();
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnPelicula.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Listar");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelListar panel = new PanelListar();
				
				TreeSet<Pelicula> list = new TreeSet<Pelicula>();
				panel.setListModel(dlModel);

				for(int x=0; x<dlModel.getSize(); x++) {
					list.add((Pelicula)dlModel.get(x));
				}
				for (Pelicula x : list) {
					System.out.println(x.toString());
				}
				contentPane.removeAll();
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnPelicula.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}

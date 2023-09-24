package package1;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;

public class PanelListar extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JList<Pelicula> list;
	private DefaultListModel<Pelicula> dlmodel;
	/**
	 * Create the panel.
	 */
	public PanelListar() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Peliculas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 86, 69, 29);
		add(lblNewLabel);
		
		list = new JList<Pelicula>();
		list.setBounds(116, 25, 308, 172);
		add(list);

	}
	public void setListModel(DefaultListModel<Pelicula> dlModel2) {
		this.dlmodel=dlModel2;
		this.list.setModel(dlmodel);
	}
}

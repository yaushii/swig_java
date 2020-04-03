import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ConteneurFenetre extends JPanel {

	private JLabel etiquette;
	private JButton bouton;
	private JTextField text;
	private JLabel imageLbl;
	private ImageIcon IconPhoto;
	
	public  ConteneurFenetre(){
	super();	
	this.proprieteConteneur();
		}
	
	private void proprieteConteneur(){
	
		// position par default
		this.setLayout(null);
		this.propreiteEtiquette();
		this.propBouton();
		this.propText();
		this.afficheImage();
		}
	private void propreiteEtiquette(){
		
		etiquette = new JLabel();
		this.etiquette.setBounds(20, 10, 350, 20);
		this.etiquette.setText("Texte de l'etiquette");
		this.add(etiquette);
	}
	
	private void propBouton(){
		
		bouton = new JButton();
		this.bouton.setText("Appuyer");
		this.bouton.setBounds(30, 50,90,20);
		this.add(bouton);
	}
	private void propText(){
		text = new JTextField();
		this.text.setBounds(130, 50,100,20);
		this.add(text);
	}
	
	private void afficheImage(){
		imageLbl = new JLabel();
		IconPhoto = new ImageIcon("image/TEA-HOUSE_Appearance-1024x682.jpg");
		this.imageLbl.setBounds(100, 100, 800, 600);
		this.imageLbl.setIcon(IconPhoto);
		this.add(imageLbl);
		
	}
	}
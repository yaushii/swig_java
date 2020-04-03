import javax.swing.JFrame;


public class Fenetre extends JFrame {
	
	ConteneurFenetre Pan;

	public Fenetre(){
		super();
		proprieteFenetre();
		
	}
	private void proprieteFenetre(){
		// dimension la fenetre
		this.setSize(2000, 800);
		// empeche de redimensionner la fenetre
		this.setResizable(false);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// garde la fenetre au 1er plan
		this.setAlwaysOnTop(true);
		
		Pan = new ConteneurFenetre();
		this.setContentPane(Pan);
	}
	
}

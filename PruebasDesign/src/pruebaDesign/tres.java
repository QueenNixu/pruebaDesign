package pruebaDesign;

import java.awt.Image;
import java.awt.Toolkit;

public class tres {
	
	public static Image getImage() {
		Image im =  Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Diablo-III-Logo-PNG-Pic.png"));
		return im;
	}

}

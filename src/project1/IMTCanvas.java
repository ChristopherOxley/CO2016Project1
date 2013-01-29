import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
/**
 * IMTCanvas.java
 *
 *
 * Created: Mon Aug  1 14:29:03 2005
 *
 * @author <a href="mailto:">M. Hoffmann</a>
 * @version 1.0
 */
public class IMTCanvas extends Canvas {
  
    private BufferedImage i, ti,tti ;
  

    public IMTCanvas() {
			   
	try{
	    i = ImageIO.read(new File("picture.jpg")).
		getSubimage(100,0,400,400);
	    ti = ImageIO.read(new File("picture.jpg")).
		getSubimage(100,0,400,400);
	    tti = ImageIO.read(new File("picture.jpg")).
		getSubimage(100,0,400,400);
            
            
            
	}catch(Exception ex){
        
        
            try{
                
            i = ImageIO.read(new File("src/project1/picture.jpg")).
		getSubimage(100,0,400,400);
	    ti = ImageIO.read(new File("src/project1/picture.jpg")).
		getSubimage(100,0,400,400);
	    tti = ImageIO.read(new File("src/project1/picture.jpg")).
		getSubimage(100,0,400,400);
                
            }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }  
        
	reset();
    } // IMTCanvas constructor

    public void paint (Graphics g) {
	update(g);
    }

    public void update(Graphics g) {
	    g.drawImage(ti,0,0,400,400,this);
    }
    
    public BufferedImage getImage() {
	return i;
    }

    public BufferedImage getTempImage() {
	(tti.getGraphics()).drawImage(i,0,0,400,400,this);
	return tti;
    }

    public void reset() {
	ti=getTempImage();
    }

    public void setTempImage(BufferedImage b) {
	ti=b;
    }
    
} // IMTCanvas

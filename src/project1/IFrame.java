import javax.swing.*;
import javax.swing.plaf.basic.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
/**
 * IFrame.java
 *
 *
 * Created: Mon Aug  1 14:18:55 2005
 *
 * @author <a href="mailto:">M. Hoffmann</a>
 * @version 1.0
 */
public class IFrame extends JFrame implements MouseListener, MouseMotionListener{

    private IMTCanvas canvas;
    private JComboBox box;
    private JCheckBox checkBox;
    private String[] options ={"phaseShift","spiral"};
    private JSpinner sp;
 
    
    public final int size=80;
    
    public IFrame() {
	
	// Setting for the Frame
	setTitle("Image Manipulation Tool");
	setSize(600,400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	Container cp = getContentPane();
	cp.setLayout(null);

	
	// creating and adding the canvas to the frame
	canvas= new IMTCanvas();
	canvas.setBounds(0,0,400,400);
	canvas.addMouseListener(this);
	canvas.addMouseMotionListener(this);
	cp.add(canvas);
	

	// creating and adding the drop box to the frame
	box = new JComboBox(options);
	box.setBounds(420,50,150,50);
	cp.add(box);

	// creating and adding the check box to the frame
	checkBox= new JCheckBox( "active on movement");
	checkBox.setBounds(420,150,170,50);
	cp.add(checkBox);
	    
	sp = new JSpinner();
	sp.setBounds(420,200,40,20);
	cp.add(sp);


    } // IFrame constructor
    
    public static void main(String[] args) {

	IFrame i= new IFrame();
	i.setVisible(true);
    }

    //------------------------mouse listener methods

    public void	mouseClicked(MouseEvent e) {
        int parameter = Integer.parseInt( sp.getValue().toString());
	
	int answer=box.getSelectedIndex();
	switch (answer) {
	case 0 : 
	    ImageManipulation.phaseShift(canvas.getImage(), parameter,
					   e.getX(),e.getY(), size);
	    canvas.reset();
	    
	    break;
	case 1 : 
	    ImageManipulation.spiral(canvas.getImage(), parameter,
					   e.getX(),e.getY(), size);

	    canvas.reset();
	    break;
	}
	canvas.repaint();
    }
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e) {}

    public void mouseDragged(MouseEvent e){}
    public void mouseMoved(MouseEvent e) {
	if (checkBox.isSelected()) {           
		int parameter = Integer.parseInt( sp.getValue().toString());
		int answer=box.getSelectedIndex();
		switch (answer) {
		case 0 : 
		    BufferedImage temp=canvas.getTempImage();
		    
		    ImageManipulation.phaseShift(temp, parameter,
					   e.getX(),e.getY(), size);
		    break;
		case 1 : 
		    temp=canvas.getTempImage();
		    ImageManipulation.spiral(temp, parameter,
					   e.getX(),e.getY(), size);
		    break;
		    
		}
		canvas.repaint();
	    }
    }
	    

    

} // IFrame

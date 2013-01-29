import java.awt.image.*;
import java.awt.*;
import java.util.*;
/**
 * ImageManipulation.java
 *
 * Class allows the manipulation of an image by 
 * various methods.
 *
 * Created: Mon Aug  1 15:06:31 2005
 *
 * @author <a href="mailto:mh55@mcs.le.ac.uk">M. Hoffmann</a>
 * @version 1.0
 */
public class ImageManipulation { 


    /**
     * Twirls the pixels in at the given area.
     *
     * The area effected is normally a square with center (x,y) 
     * and corners (x-size, y-size), (x+size,y-size), (x+size, y+size),
     * (x-size, y+size).
     * In case the area is not entirely within the image, 
     * the spiral method keeps the entire image unchanged.
     *
     * <p>
     *  Every pixel with distance to x,y of less than size and greater than n, will 
     *  be rotated around the point x,y. The rotation is clockwise and the angle for a
     *  pixel at distance to x,y will be 0, for pixels at distance n to x,y will be 2 PI. 
     *  For pixels in between the two distances the angle changes linearly (see formula below).
     * </p>
     *  
     * <p> 
     * Due to potential rounding errors the method should not go through each pixel 
     * and moving it to the new location. It should, however, go through each effected pixel, calculating which pixel 
     * will be moved to this location and then perform the change.
     * </p>
     *
     *
     * <p>
     *   Hints:<br/> 
     *   <ul>
     *     <li>
     *	     The distance of a point (a,b) to the point (c,d) is the square root of (a-c)*(a-c)+(b-d)*(b-d).
     *     </li>
     *     <li>
     *       A anti clockwise rotation of a point (a,b) around the origin (0,0) with angle alpha will result in 
     *       the point (a*cos(alpha)-b*sin(alpha), a*sin(alpha)+b*cos(alpha))
     *     </li>
     *     <li>
     *       The angle by which a pixel is moved is equal to 2*PI*(1-(d-n)/(size-n)), where d is distance
     *       of the pixel to the point (x,y).
     *     </li>
     *   </ul>
     *
     * </p>
     *
     * <p> Note: Due to the rounding/integer division effects you should work with 
     * doubles and only convert to an int when needed. </p>
     *
     *
     * <p> Note: In the provided skeleton program a copy, called temp,
     * of the BufferedImage is made.
     * Use the temp image to get the rgb values and set the new
     * values to the BufferedImage image. </p>
     *
     * @param image the image you are performing the swap on
     * @param n the inner radius around the position x y
     * @param x x-coordinate of the centre of the rectangle
     * @param y y-coordinate of the centre of the rectangle
     * @param size half the length/width of the square
     */
    static public void spiral(BufferedImage image,
			      int n,
				 int x, int y,int size) {
					 
	BufferedImage temp=new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
        (temp.getGraphics()).drawImage(image,0,0,image.getWidth(), image.getHeight(),null );


	// ... your code goes here
	
    }
    




    /** 
    * performs a shift of color in a specified area.<p>
    * 
    * 
    * <p> The area effected is normally a square with center (x,y) 
    * and corners (x-size, y-size), (x+size,y-size), (x+size, y+size),
    * (x-size, y+size).
    * In case the point (x,y) is close the edge of the image the 
    * affected are will be truncated.
    * </p>
    * 
    *  <p> A pixel in the effected area that is less than n pixels away 
    *	from any edge of the image will not be changed.
    *   All other pixels of the effected area will be changed in the following way:
    *	The red component will be the red component of the pixel that is n-pixels to the left. 
    *   The blue component will stay unchanged.
    *   The green component will be the blue component of the pixel that is n-pixels to up.
    *  </p>
    *
    *
    *
    * <p> Note: In the provided skeleton program a copy, called temp,
    * of the BufferedImage is made.
    * Use the temp image to get the rgb values and set the new
    * values to the BufferedImage image. </p>
    *
    *
    * @param image BufferedImage object representing the 
    * image that will be changed by the method
    * @param n indicates the distance for the shift of colors.
    * @param x x-coordinate of the centre of the rectangle
    * @param y y-coordinate of the centre of the rectangle
    * @param size half the length/width of the square
    *
    */
    static public void phaseShift(BufferedImage image, int n,
			     int x, int y, int size) {

	// creates a copy of the image called temp
        BufferedImage temp=new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
        (temp.getGraphics()).drawImage(image,0,0,image.getWidth(), image.getHeight(),null );

	// ... your code goes here
	
	
    }


} // ImageManipulation

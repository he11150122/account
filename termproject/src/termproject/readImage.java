package termproject;

import java.awt.*;
import java.awt.image.*;

import javax.swing.*;
import java.io.*;
import javax.imageio.*;



public class readImage extends Frame{
	BufferedImage bi = null;
	
	public readImage(){
		try{
			bi=bufferedImage();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}private BufferedImage bufferedImage() throws Exception{
		File file = new File("a.jpg");
		BufferedImage bi=ImageIO.read(file);
		return bi;
	}public void paint(Graphics g){
		if(this.bi != null){
			g.drawImage(this.bi, 0, 20, this);
		}
	}public static void main(String args[]){
		readImage itm=new readImage();
		itm.setSize(300,400);
		itm.setVisible(true);
	}

	
	
	
}

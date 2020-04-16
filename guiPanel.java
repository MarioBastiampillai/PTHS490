import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList; 
import java.awt.geom.Ellipse2D;

public class guiPanel extends JPanel
{
	@Override 
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D graphicsObject= (Graphics2D) g; 
		//underline for Performance Tracking Hockey Stick Title and Team 7
		graphicsObject.drawLine(800,60, 1250, 60); 
		graphicsObject.drawLine(1000,79, 1075, 79);
		//top gray rectangle for toolbar area
		graphicsObject.drawRect(20, 0, 650, 45);
		g.setColor(new Color(44, 60, 92));  
		g.fillRect(20,0,650, 45);
		
		//first black rectangle, Export as csv, Help, About buttons
		graphicsObject.drawRect(20, 45, 650, 70);	
		g.setColor(new Color(10, 25, 54));  
		g.fillRect(20,45,650,70);	
		
		//top gray rectangle, Recording Area
		graphicsObject.drawRect(20, 140, 650, 45);
		g.setColor(new Color(44, 60, 92));  
		g.fillRect(20,140,650, 45);
		
		//second black rectangle, Number of recordings, pressure readings display
		graphicsObject.drawRect(20, 185, 650, 300);	
		g.setColor(new Color(10, 25, 54));  
		g.fillRect(20,185,650,300);	
		
		//third gray rectangle, Control Area
		graphicsObject.drawRect(20, 510, 650, 50);	
		g.setColor(new Color(44, 60, 92));  
		g.fillRect(20,510,650, 50);	
		
		//fourth black rectangle, Record, Stop Recording, Show recordings, Clear recordings buttons
		graphicsObject.drawRect(20, 560, 650, 100);	
		g.setColor(new Color(10, 25, 54));  
		g.fillRect(20,560,650,100);			
		
		//show recordings rectangle
		graphicsObject.drawRect(800, 140, 497, 45);	
		g.setColor(new Color(44, 60, 92)); 
		g.fillRect(800,140,497, 45);
		
	}
}
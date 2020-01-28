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
		//drawing the two different axes
		graphicsObject.drawRect(20, 50, 650, 45);
		g.setColor(new Color(44, 60, 92));  //was 11, 29, 64
		g.fillRect(20,50,650, 45);
		graphicsObject.drawRect(20, 95, 650, 100);
		g.setColor(new Color(10, 25, 54));  //was 11, 29, 64
		g.fillRect(20,95,650,100);
		
	}
}
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

public class graphingPanel1 extends JPanel
{
	@Override
	public void paintComponent(Graphics g)
	{
		Graphics2D graphicsObject= (Graphics2D) g;
		//drawing the two different axes
		graphicsObject.drawLine(50, 0, 50, 400);
		graphicsObject.drawLine(50, 400, 400, 400);
		//drawing the x axes points
		graphicsObject.drawLine(50, 400, 50, 410);
		graphicsObject.drawLine(100, 400, 100, 410);
		graphicsObject.drawLine(150, 400, 150, 410);
		graphicsObject.drawLine(200, 400, 200, 410);
		graphicsObject.drawLine(250, 400, 250, 410);
		graphicsObject.drawLine(300, 400, 300, 410);
		graphicsObject.drawLine(350, 400, 350, 410);
		graphicsObject.drawLine(400, 400, 400, 410);
		//drawing the y axes points
		graphicsObject.drawLine(40, 350, 50, 350);
		graphicsObject.drawLine(40, 300, 50, 300);
		graphicsObject.drawLine(40, 250, 50, 250);
		graphicsObject.drawLine(40, 200, 50, 200);
		graphicsObject.drawLine(40, 150, 50, 150);
		graphicsObject.drawLine(40, 100, 50, 100);
		graphicsObject.drawLine(40, 50, 50, 50);
		graphicsObject.drawLine(40, 5, 50, 5);
		capstoneProject capstoneProjectObject=new capstoneProject();
		for( int i=0; i<=capstoneProjectObject.randomPressureArray1.size()-1; i++)
		{
			if(i==0)
			{
				if(capstoneProjectObject.randomPressureArray1.get(i)<210&&capstoneProjectObject.randomPressureArray1.get(i)>200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(50, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<220&&capstoneProjectObject.randomPressureArray1.get(i)>210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(50, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<230&&capstoneProjectObject.randomPressureArray1.get(i)>220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(50, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<240&&capstoneProjectObject.randomPressureArray1.get(i)>230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(50, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<250&&capstoneProjectObject.randomPressureArray1.get(i)>240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(50, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<260&&capstoneProjectObject.randomPressureArray1.get(i)>250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(50, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<270&&capstoneProjectObject.randomPressureArray1.get(i)>260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(50, 25, 10, 10);
				}
			}
			else if(i==1)
			{
				if(capstoneProjectObject.randomPressureArray1.get(i)<210&&capstoneProjectObject.randomPressureArray1.get(i)>200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(100, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<220&&capstoneProjectObject.randomPressureArray1.get(i)>210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(100, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<230&&capstoneProjectObject.randomPressureArray1.get(i)>220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(100, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<240&&capstoneProjectObject.randomPressureArray1.get(i)>230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(100, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<250&&capstoneProjectObject.randomPressureArray1.get(i)>240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(100, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<260&&capstoneProjectObject.randomPressureArray1.get(i)>250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(100, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<270&&capstoneProjectObject.randomPressureArray1.get(i)>260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(100, 25, 10, 10);
				}
			}
			else if(i==2)
			{
				if(capstoneProjectObject.randomPressureArray1.get(i)<210&&capstoneProjectObject.randomPressureArray1.get(i)>200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(150, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<220&&capstoneProjectObject.randomPressureArray1.get(i)>210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(150, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<230&&capstoneProjectObject.randomPressureArray1.get(i)>220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(150, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<240&&capstoneProjectObject.randomPressureArray1.get(i)>230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(150, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<250&&capstoneProjectObject.randomPressureArray1.get(i)>240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(150, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<260&&capstoneProjectObject.randomPressureArray1.get(i)>250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(150, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<270&&capstoneProjectObject.randomPressureArray1.get(i)>260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(150, 25, 10, 10);
				}
			}
			else if(i==3)
			{
				if(capstoneProjectObject.randomPressureArray1.get(i)<210&&capstoneProjectObject.randomPressureArray1.get(i)>200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(200, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<220&&capstoneProjectObject.randomPressureArray1.get(i)>210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(200, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<230&&capstoneProjectObject.randomPressureArray1.get(i)>220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(200, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<240&&capstoneProjectObject.randomPressureArray1.get(i)>230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(200, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<250&&capstoneProjectObject.randomPressureArray1.get(i)>240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(200, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<260&&capstoneProjectObject.randomPressureArray1.get(i)>250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(200, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<270&&capstoneProjectObject.randomPressureArray1.get(i)>260)
				{
					graphicsObject.draw(new Ellipse2D.Double(200, 25,10,10));
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(200, 25, 10, 10);
				}
			}
			else if(i==4)
			{
				if(capstoneProjectObject.randomPressureArray1.get(i)<210&&capstoneProjectObject.randomPressureArray1.get(i)>200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(250, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<220&&capstoneProjectObject.randomPressureArray1.get(i)>210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(250, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<230&&capstoneProjectObject.randomPressureArray1.get(i)>220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(250, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<240&&capstoneProjectObject.randomPressureArray1.get(i)>230)
				{
					graphicsObject.draw(new Ellipse2D.Double(250, 175,10,10));
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(250, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<250&&capstoneProjectObject.randomPressureArray1.get(i)>240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(250, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<260&&capstoneProjectObject.randomPressureArray1.get(i)>250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(250, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<270&&capstoneProjectObject.randomPressureArray1.get(i)>260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(250, 25, 10, 10);
				}
			}
			else if(i==5)
			{
				if(capstoneProjectObject.randomPressureArray1.get(i)<210&&capstoneProjectObject.randomPressureArray1.get(i)>200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(300, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<220&&capstoneProjectObject.randomPressureArray1.get(i)>210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(300, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<230&&capstoneProjectObject.randomPressureArray1.get(i)>220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(300, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<240&&capstoneProjectObject.randomPressureArray1.get(i)>230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(300, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<250&&capstoneProjectObject.randomPressureArray1.get(i)>240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(300, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<260&&capstoneProjectObject.randomPressureArray1.get(i)>250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(300, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<270&&capstoneProjectObject.randomPressureArray1.get(i)>260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(300, 25, 10, 10);
				}
			}
			else if(i==6)
			{
				if(capstoneProjectObject.randomPressureArray1.get(i)<210&&capstoneProjectObject.randomPressureArray1.get(i)>200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(350, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<220&&capstoneProjectObject.randomPressureArray1.get(i)>210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(350, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<230&&capstoneProjectObject.randomPressureArray1.get(i)>220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(350, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<240&&capstoneProjectObject.randomPressureArray1.get(i)>230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(350, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<250&&capstoneProjectObject.randomPressureArray1.get(i)>240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(350, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<260&&capstoneProjectObject.randomPressureArray1.get(i)>250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(350, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<270&&capstoneProjectObject.randomPressureArray1.get(i)>260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(350, 25, 10, 10);
				}
			}
			else if(i==7)
			{
				if(capstoneProjectObject.randomPressureArray1.get(i)<210&&capstoneProjectObject.randomPressureArray1.get(i)>200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(400, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<220&&capstoneProjectObject.randomPressureArray1.get(i)>210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(400, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<230&&capstoneProjectObject.randomPressureArray1.get(i)>220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(400, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<240&&capstoneProjectObject.randomPressureArray1.get(i)>230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(400, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<250&&capstoneProjectObject.randomPressureArray1.get(i)>240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(490, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<260&&capstoneProjectObject.randomPressureArray1.get(i)>250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(400, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<270&&capstoneProjectObject.randomPressureArray1.get(i)>260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(400, 25, 10, 10);
				}
			}
		}
	}
}
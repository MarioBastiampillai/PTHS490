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
		graphicsObject.drawRect(20, 220, 650, 50);
		g.setColor(new Color(44, 60, 92));  //was 11, 29, 64 
		g.fillRect(20,220,650, 50);
		graphicsObject.drawRect(20, 270, 650, 100);
		g.setColor(new Color(10, 25, 54));  //was 11, 29, 64
		g.fillRect(20,270,650,100);
		//call function here to check whether recorded values are to be displayed
		graphicsObject.drawRect(900, 500, 497, 45);
		g.setColor(new Color(44, 60, 92));  //was 11, 29, 64
		g.fillRect(900,500,497, 45);
		
		g.setColor(Color.blue);  //was 11, 29, 64
		graphicsObject.drawRect(1290, 50, 50, 10);
		g.fillRect(1290,50,50,10);
		
		g.setColor(Color.green);  //was 11, 29, 64
		graphicsObject.drawRect(1290, 100, 50, 10);
		g.fillRect(1290,100,50,10);
		
		g.setColor(Color.gray);  //was 11, 29, 64
		graphicsObject.drawRect(1290, 150, 50, 10);
		g.fillRect(1290,150,50,10);
		
		g.setColor(Color.cyan);  //was 11, 29, 64
		graphicsObject.drawRect(1290, 200, 50, 10);
		g.fillRect(1290,200,50,10);
		
		//appearance of the graph 
		//drawing the two different axes
		g.setColor(Color.black);  //was 11, 29, 64
		graphicsObject.drawLine(900, 0, 900, 400);
		graphicsObject.drawLine(900, 400, 1250, 400);
		//drawing the x axes points
		graphicsObject.drawLine(900, 400, 900, 410); 
		graphicsObject.drawLine(950, 400, 950, 410);
		graphicsObject.drawLine(1000, 400, 1000, 410);
		graphicsObject.drawLine(1050, 400, 1050, 410);
		graphicsObject.drawLine(1100, 400, 1100, 410);
		graphicsObject.drawLine(1150, 400, 1150, 410);
		graphicsObject.drawLine(1200, 400, 1200, 410);
		graphicsObject.drawLine(1250, 400, 1250, 410);
		graphicsObject.drawString("Recording #", 1075, 450);
		//drawing the y axes points
		graphicsObject.drawLine(890, 350, 900, 350);
		graphicsObject.drawLine(890, 300, 900, 300);
		graphicsObject.drawLine(890, 250, 900, 250);
		graphicsObject.drawLine(890, 200, 900, 200);
		graphicsObject.drawLine(890, 150, 900, 150);
		graphicsObject.drawLine(890, 100, 900, 100);
		graphicsObject.drawLine(890, 50, 900, 50);
		graphicsObject.drawLine(890, 5, 900, 5);
		graphicsObject.drawString("Pressure in kPa", 800, 175);

		
		//must put if statements in the case where 2 points overlap, lower one of them
		//must include if statements for when the point is exactly on the y values
		capstoneProject capstoneProjectObject=new capstoneProject();
		for( int i=0; i<=capstoneProjectObject.randomPressureArray1.size()-1; i++)
		{
			if(i==0)
			{
				if(capstoneProjectObject.randomPressureArray1.get(i)==200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(895, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(895, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(895, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(895, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(895, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(895, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(895, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(895, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<210&&capstoneProjectObject.randomPressureArray1.get(i)>200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(895, 325, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<220&&capstoneProjectObject.randomPressureArray1.get(i)>210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(895, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<230&&capstoneProjectObject.randomPressureArray1.get(i)>220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(895, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<240&&capstoneProjectObject.randomPressureArray1.get(i)>230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(895, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<250&&capstoneProjectObject.randomPressureArray1.get(i)>240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(895, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<260&&capstoneProjectObject.randomPressureArray1.get(i)>250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(895, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<270&&capstoneProjectObject.randomPressureArray1.get(i)>260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(895, 25, 10, 10);
				}
			}
			else if(i==1)
			{
				if(capstoneProjectObject.randomPressureArray1.get(i)==200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(945, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(945, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(945, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(945, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(945, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(945, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(945, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(945, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<210&&capstoneProjectObject.randomPressureArray1.get(i)>200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(945, 325, 10, 10);	//was 100
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<220&&capstoneProjectObject.randomPressureArray1.get(i)>210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(945, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<230&&capstoneProjectObject.randomPressureArray1.get(i)>220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(945, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<240&&capstoneProjectObject.randomPressureArray1.get(i)>230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(945, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<250&&capstoneProjectObject.randomPressureArray1.get(i)>240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(945, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<260&&capstoneProjectObject.randomPressureArray1.get(i)>250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(945, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<270&&capstoneProjectObject.randomPressureArray1.get(i)>260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(945, 25, 10, 10);
				}
			}
			else if(i==2)
			{
				if(capstoneProjectObject.randomPressureArray1.get(i)==200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(995, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(995, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(995, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(995, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(995, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(995, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(995, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(995, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<210&&capstoneProjectObject.randomPressureArray1.get(i)>200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(995, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<220&&capstoneProjectObject.randomPressureArray1.get(i)>210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(995, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<230&&capstoneProjectObject.randomPressureArray1.get(i)>220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(995, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<240&&capstoneProjectObject.randomPressureArray1.get(i)>230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(995, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<250&&capstoneProjectObject.randomPressureArray1.get(i)>240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(995, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<260&&capstoneProjectObject.randomPressureArray1.get(i)>250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(995, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<270&&capstoneProjectObject.randomPressureArray1.get(i)>260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(995, 25, 10, 10);
				}
			}
			else if(i==3)
			{
				if(capstoneProjectObject.randomPressureArray1.get(i)==200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1045, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1045, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1045, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1045, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1045, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1045, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1045, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1045, 0, 10, 10);	//was 50
				}
				if(capstoneProjectObject.randomPressureArray1.get(i)<210&&capstoneProjectObject.randomPressureArray1.get(i)>200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1045, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<220&&capstoneProjectObject.randomPressureArray1.get(i)>210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1045, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<230&&capstoneProjectObject.randomPressureArray1.get(i)>220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1045, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<240&&capstoneProjectObject.randomPressureArray1.get(i)>230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1045, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<250&&capstoneProjectObject.randomPressureArray1.get(i)>240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1045, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<260&&capstoneProjectObject.randomPressureArray1.get(i)>250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1045, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<270&&capstoneProjectObject.randomPressureArray1.get(i)>260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1045, 25, 10, 10);
				}
			}
			else if(i==4)
			{
				if(capstoneProjectObject.randomPressureArray1.get(i)==200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1095, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1095, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1095, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1095, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1095, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1095, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1095, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1095, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<210&&capstoneProjectObject.randomPressureArray1.get(i)>200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1095, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<220&&capstoneProjectObject.randomPressureArray1.get(i)>210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1095, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<230&&capstoneProjectObject.randomPressureArray1.get(i)>220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1095, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<240&&capstoneProjectObject.randomPressureArray1.get(i)>230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1095, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<250&&capstoneProjectObject.randomPressureArray1.get(i)>240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1095, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<260&&capstoneProjectObject.randomPressureArray1.get(i)>250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1095, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<270&&capstoneProjectObject.randomPressureArray1.get(i)>260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1095, 25, 10, 10);
				}
			}
			else if(i==5)
			{
				if(capstoneProjectObject.randomPressureArray1.get(i)==200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1145, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1145, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1145, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1145, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1145, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1145, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1145, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1145, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<210&&capstoneProjectObject.randomPressureArray1.get(i)>200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1145, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<220&&capstoneProjectObject.randomPressureArray1.get(i)>210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1145, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<230&&capstoneProjectObject.randomPressureArray1.get(i)>220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1145, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<240&&capstoneProjectObject.randomPressureArray1.get(i)>230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1145, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<250&&capstoneProjectObject.randomPressureArray1.get(i)>240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1145, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<260&&capstoneProjectObject.randomPressureArray1.get(i)>250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1145, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<270&&capstoneProjectObject.randomPressureArray1.get(i)>260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1145, 25, 10, 10);
				}
			}
			else if(i==6)
			{
				if(capstoneProjectObject.randomPressureArray1.get(i)==200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1195, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1195, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1195, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1195, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1195, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1195, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1195, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1195, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<210&&capstoneProjectObject.randomPressureArray1.get(i)>200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1195, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<220&&capstoneProjectObject.randomPressureArray1.get(i)>210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1195, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<230&&capstoneProjectObject.randomPressureArray1.get(i)>220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1195, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<240&&capstoneProjectObject.randomPressureArray1.get(i)>230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1195, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<250&&capstoneProjectObject.randomPressureArray1.get(i)>240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1195, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<260&&capstoneProjectObject.randomPressureArray1.get(i)>250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1195, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<270&&capstoneProjectObject.randomPressureArray1.get(i)>260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1195, 25, 10, 10);
				}
			}
			else if(i==7)
			{
				if(capstoneProjectObject.randomPressureArray1.get(i)==200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1245, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1245, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1245, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1245, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1245, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1245, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1245, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1245, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<210&&capstoneProjectObject.randomPressureArray1.get(i)>200)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1245, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<220&&capstoneProjectObject.randomPressureArray1.get(i)>210)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1245, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<230&&capstoneProjectObject.randomPressureArray1.get(i)>220)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1245, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<240&&capstoneProjectObject.randomPressureArray1.get(i)>230)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1245, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<250&&capstoneProjectObject.randomPressureArray1.get(i)>240)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1245, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<260&&capstoneProjectObject.randomPressureArray1.get(i)>250)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1245, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)<270&&capstoneProjectObject.randomPressureArray1.get(i)>260)
				{
					graphicsObject.setColor(Color.blue);
					graphicsObject.fillOval(1245, 25, 10, 10);
				}
			}
		}
		for( int i=0; i<=capstoneProjectObject.randomPressureArray2.size()-1; i++)
		{
			if(i==0)
			{
				if(capstoneProjectObject.randomPressureArray2.get(i)==200)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(895, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(895, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(895, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(895, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(895, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(895, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(895, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(895, 0, 10, 10);	//was 50
				}
				if(capstoneProjectObject.randomPressureArray2.get(i)<210&&capstoneProjectObject.randomPressureArray2.get(i)>200)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(895, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<220&&capstoneProjectObject.randomPressureArray2.get(i)>210)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(895, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<230&&capstoneProjectObject.randomPressureArray2.get(i)>220)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(895, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<240&&capstoneProjectObject.randomPressureArray2.get(i)>230)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(895, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<250&&capstoneProjectObject.randomPressureArray2.get(i)>240)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(895, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<260&&capstoneProjectObject.randomPressureArray2.get(i)>250)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(895, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<270&&capstoneProjectObject.randomPressureArray2.get(i)>260)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(895, 25, 10, 10);
				}
			}
			else if(i==1)
			{
				if(capstoneProjectObject.randomPressureArray2.get(i)==200)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(945, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(945, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(945, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(945, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(945, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(945, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(945, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(945, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<210&&capstoneProjectObject.randomPressureArray2.get(i)>200)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(945, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<220&&capstoneProjectObject.randomPressureArray2.get(i)>210)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(945, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<230&&capstoneProjectObject.randomPressureArray2.get(i)>220)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(945, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<240&&capstoneProjectObject.randomPressureArray2.get(i)>230)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(945, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<250&&capstoneProjectObject.randomPressureArray2.get(i)>240)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(945, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<260&&capstoneProjectObject.randomPressureArray2.get(i)>250)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(945, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<270&&capstoneProjectObject.randomPressureArray2.get(i)>260)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(945, 25, 10, 10);
				}
			}
			else if(i==2)
			{
				if(capstoneProjectObject.randomPressureArray2.get(i)==200)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(995, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(995, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(995, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(995, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(995, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(995, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(995, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(995, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<210&&capstoneProjectObject.randomPressureArray2.get(i)>200)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(995, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<220&&capstoneProjectObject.randomPressureArray2.get(i)>210)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(995, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<230&&capstoneProjectObject.randomPressureArray2.get(i)>220)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(995, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<240&&capstoneProjectObject.randomPressureArray2.get(i)>230)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(995, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<250&&capstoneProjectObject.randomPressureArray2.get(i)>240)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(995, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<260&&capstoneProjectObject.randomPressureArray2.get(i)>250)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(995, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<270&&capstoneProjectObject.randomPressureArray2.get(i)>260)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(995, 25, 10, 10);
				}
			}
			else if(i==3)
			{
				if(capstoneProjectObject.randomPressureArray2.get(i)==200)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1045, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1045, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1045, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1045, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1045, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1045, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1045, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1045, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<210&&capstoneProjectObject.randomPressureArray2.get(i)>200)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1045, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<220&&capstoneProjectObject.randomPressureArray2.get(i)>210)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1045, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<230&&capstoneProjectObject.randomPressureArray2.get(i)>220)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1045, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<240&&capstoneProjectObject.randomPressureArray2.get(i)>230)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1045, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<250&&capstoneProjectObject.randomPressureArray2.get(i)>240)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1045, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<260&&capstoneProjectObject.randomPressureArray2.get(i)>250)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1045, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<270&&capstoneProjectObject.randomPressureArray2.get(i)>260)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1045, 25, 10, 10);
				}
			}
			else if(i==4)
			{
				if(capstoneProjectObject.randomPressureArray2.get(i)==200)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1095, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1095, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1095, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1095, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1095, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1095, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1095, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1095, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<210&&capstoneProjectObject.randomPressureArray2.get(i)>200)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1095, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<220&&capstoneProjectObject.randomPressureArray2.get(i)>210)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1095, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<230&&capstoneProjectObject.randomPressureArray2.get(i)>220)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1095, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<240&&capstoneProjectObject.randomPressureArray2.get(i)>230)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1095, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<250&&capstoneProjectObject.randomPressureArray2.get(i)>240)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1095, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<260&&capstoneProjectObject.randomPressureArray2.get(i)>250)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1095, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<270&&capstoneProjectObject.randomPressureArray2.get(i)>260)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1095, 25, 10, 10);
				}
			}
			else if(i==5)
			{
				if(capstoneProjectObject.randomPressureArray2.get(i)==200)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1145, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1145, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1145, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1145, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1145, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1145, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1145, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1145, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<210&&capstoneProjectObject.randomPressureArray2.get(i)>200)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1145, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<220&&capstoneProjectObject.randomPressureArray2.get(i)>210)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1145, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<230&&capstoneProjectObject.randomPressureArray2.get(i)>220)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1145, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<240&&capstoneProjectObject.randomPressureArray2.get(i)>230)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1145, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<250&&capstoneProjectObject.randomPressureArray2.get(i)>240)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1145, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<260&&capstoneProjectObject.randomPressureArray2.get(i)>250)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1145, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<270&&capstoneProjectObject.randomPressureArray2.get(i)>260)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1145, 25, 10, 10);
				}
			}
			else if(i==6)
			{
				if(capstoneProjectObject.randomPressureArray2.get(i)==200)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1195, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1195, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1195, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1195, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1195, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1195, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1195, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1195, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<210&&capstoneProjectObject.randomPressureArray2.get(i)>200)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1195, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<220&&capstoneProjectObject.randomPressureArray2.get(i)>210)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1195, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<230&&capstoneProjectObject.randomPressureArray2.get(i)>220)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1195, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<240&&capstoneProjectObject.randomPressureArray2.get(i)>230)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1195, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<250&&capstoneProjectObject.randomPressureArray2.get(i)>240)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1195, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<260&&capstoneProjectObject.randomPressureArray2.get(i)>250)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1195, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<270&&capstoneProjectObject.randomPressureArray2.get(i)>260)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1195, 25, 10, 10);
				}
			}
			else if(i==7)
			{
				if(capstoneProjectObject.randomPressureArray2.get(i)==200)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1245, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1245, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1245, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1245, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1245, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1245, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1245, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1245, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<210&&capstoneProjectObject.randomPressureArray2.get(i)>200)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1245, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<220&&capstoneProjectObject.randomPressureArray2.get(i)>210)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1245, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<230&&capstoneProjectObject.randomPressureArray2.get(i)>220)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1245, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<240&&capstoneProjectObject.randomPressureArray2.get(i)>230)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1245, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<250&&capstoneProjectObject.randomPressureArray2.get(i)>240)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1245, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<260&&capstoneProjectObject.randomPressureArray2.get(i)>250)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1245, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray2.get(i)<270&&capstoneProjectObject.randomPressureArray2.get(i)>260)
				{
					graphicsObject.setColor(Color.green);
					graphicsObject.fillOval(1245, 25, 10, 10);
				}
			}
		}
		for( int i=0; i<=capstoneProjectObject.randomPressureArray3.size()-1; i++)
		{
			if(i==0)
			{
				if(capstoneProjectObject.randomPressureArray3.get(i)==200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(895, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(895, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(895, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(895, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(895, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(895, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(895, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(895, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<210&&capstoneProjectObject.randomPressureArray3.get(i)>200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(895, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<220&&capstoneProjectObject.randomPressureArray3.get(i)>210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(895, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<230&&capstoneProjectObject.randomPressureArray3.get(i)>220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(895, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<240&&capstoneProjectObject.randomPressureArray3.get(i)>230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(895, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<250&&capstoneProjectObject.randomPressureArray3.get(i)>240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(895, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<260&&capstoneProjectObject.randomPressureArray3.get(i)>250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(895, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<270&&capstoneProjectObject.randomPressureArray3.get(i)>260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(895, 25, 10, 10);
				}
			}
			else if(i==1)
			{
				if(capstoneProjectObject.randomPressureArray3.get(i)==200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(945, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(945, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(945, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(945, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(945, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(945, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(945, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(945, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<210&&capstoneProjectObject.randomPressureArray3.get(i)>200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(945, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<220&&capstoneProjectObject.randomPressureArray3.get(i)>210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(945, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<230&&capstoneProjectObject.randomPressureArray3.get(i)>220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(945, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<240&&capstoneProjectObject.randomPressureArray3.get(i)>230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(945, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<250&&capstoneProjectObject.randomPressureArray3.get(i)>240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(945, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<260&&capstoneProjectObject.randomPressureArray3.get(i)>250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(945, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<270&&capstoneProjectObject.randomPressureArray3.get(i)>260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(945, 25, 10, 10);
				}
			}
			else if(i==2)
			{
				if(capstoneProjectObject.randomPressureArray3.get(i)==200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(995, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(995, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(995, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(995, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(995, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(995, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(995, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(995, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<210&&capstoneProjectObject.randomPressureArray3.get(i)>200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(995, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<220&&capstoneProjectObject.randomPressureArray3.get(i)>210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(995, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<230&&capstoneProjectObject.randomPressureArray3.get(i)>220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(995, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<240&&capstoneProjectObject.randomPressureArray3.get(i)>230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(995, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<250&&capstoneProjectObject.randomPressureArray3.get(i)>240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(995, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<260&&capstoneProjectObject.randomPressureArray3.get(i)>250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(995, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<270&&capstoneProjectObject.randomPressureArray3.get(i)>260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(995, 25, 10, 10);
				}
			}
			else if(i==3)
			{
				if(capstoneProjectObject.randomPressureArray3.get(i)==200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1045, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1045, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1045, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1045, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1045, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1045, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1045, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1045, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<210&&capstoneProjectObject.randomPressureArray3.get(i)>200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1045, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<220&&capstoneProjectObject.randomPressureArray3.get(i)>210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1045, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<230&&capstoneProjectObject.randomPressureArray3.get(i)>220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1045, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<240&&capstoneProjectObject.randomPressureArray3.get(i)>230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1045, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<250&&capstoneProjectObject.randomPressureArray3.get(i)>240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1045, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<260&&capstoneProjectObject.randomPressureArray3.get(i)>250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1045, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<270&&capstoneProjectObject.randomPressureArray3.get(i)>260)
				{
					graphicsObject.draw(new Ellipse2D.Double(200, 25,10,10));
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1045, 25, 10, 10);
				}
			}
			else if(i==4)
			{
				if(capstoneProjectObject.randomPressureArray3.get(i)==200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<210&&capstoneProjectObject.randomPressureArray3.get(i)>200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<220&&capstoneProjectObject.randomPressureArray3.get(i)>210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<230&&capstoneProjectObject.randomPressureArray3.get(i)>220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<240&&capstoneProjectObject.randomPressureArray3.get(i)>230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<250&&capstoneProjectObject.randomPressureArray3.get(i)>240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<260&&capstoneProjectObject.randomPressureArray3.get(i)>250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<270&&capstoneProjectObject.randomPressureArray3.get(i)>260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 25, 10, 10);
				}
			}
			else if(i==5)
			{
				if(capstoneProjectObject.randomPressureArray3.get(i)==200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1145, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1145, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1145, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1145, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1145, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1145, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1145, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1145, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<210&&capstoneProjectObject.randomPressureArray3.get(i)>200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1145, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<220&&capstoneProjectObject.randomPressureArray3.get(i)>210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1145, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<230&&capstoneProjectObject.randomPressureArray3.get(i)>220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1145, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<240&&capstoneProjectObject.randomPressureArray3.get(i)>230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1145, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<250&&capstoneProjectObject.randomPressureArray3.get(i)>240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1145, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<260&&capstoneProjectObject.randomPressureArray3.get(i)>250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1145, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<270&&capstoneProjectObject.randomPressureArray3.get(i)>260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1145, 25, 10, 10);
				}
			}
			else if(i==6)
			{
				if(capstoneProjectObject.randomPressureArray3.get(i)==200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1195, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1195, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1195, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1195, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1195, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1195, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1195, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1195, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<210&&capstoneProjectObject.randomPressureArray3.get(i)>200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1195, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<220&&capstoneProjectObject.randomPressureArray3.get(i)>210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1195, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<230&&capstoneProjectObject.randomPressureArray3.get(i)>220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1195, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<240&&capstoneProjectObject.randomPressureArray3.get(i)>230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1195, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<250&&capstoneProjectObject.randomPressureArray3.get(i)>240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1195, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<260&&capstoneProjectObject.randomPressureArray3.get(i)>250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1195, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<270&&capstoneProjectObject.randomPressureArray3.get(i)>260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1195, 25, 10, 10);
				}
			}
			else if(i==7)
			{
				if(capstoneProjectObject.randomPressureArray3.get(i)==200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1245, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1245, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1245, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1245, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1245, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1245, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1245, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1245, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<210&&capstoneProjectObject.randomPressureArray3.get(i)>200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1245, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<220&&capstoneProjectObject.randomPressureArray3.get(i)>210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1245, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<230&&capstoneProjectObject.randomPressureArray3.get(i)>220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1245, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<240&&capstoneProjectObject.randomPressureArray3.get(i)>230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1245, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<250&&capstoneProjectObject.randomPressureArray3.get(i)>240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1245, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<260&&capstoneProjectObject.randomPressureArray3.get(i)>250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1245, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<270&&capstoneProjectObject.randomPressureArray3.get(i)>260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1245, 25, 10, 10);
				}
			}
		}
		for( int i=0; i<=capstoneProjectObject.randomPressureArray4.size()-1; i++)
		{
			if(i==0)
			{
				if(capstoneProjectObject.randomPressureArray4.get(i)==200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<210&&capstoneProjectObject.randomPressureArray3.get(i)>200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<220&&capstoneProjectObject.randomPressureArray3.get(i)>210)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<230&&capstoneProjectObject.randomPressureArray3.get(i)>220)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<240&&capstoneProjectObject.randomPressureArray3.get(i)>230)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<250&&capstoneProjectObject.randomPressureArray3.get(i)>240)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<260&&capstoneProjectObject.randomPressureArray3.get(i)>250)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<270&&capstoneProjectObject.randomPressureArray3.get(i)>260)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 25, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<210&&capstoneProjectObject.randomPressureArray4.get(i)>200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<220&&capstoneProjectObject.randomPressureArray4.get(i)>210)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<230&&capstoneProjectObject.randomPressureArray4.get(i)>220)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<240&&capstoneProjectObject.randomPressureArray4.get(i)>230)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<250&&capstoneProjectObject.randomPressureArray4.get(i)>240)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<260&&capstoneProjectObject.randomPressureArray4.get(i)>250)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<270&&capstoneProjectObject.randomPressureArray4.get(i)>260)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(895, 25, 10, 10);
				}
			}
			else if(i==1)
			{
				if(capstoneProjectObject.randomPressureArray4.get(i)==200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<210&&capstoneProjectObject.randomPressureArray3.get(i)>200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<220&&capstoneProjectObject.randomPressureArray3.get(i)>210)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<230&&capstoneProjectObject.randomPressureArray3.get(i)>220)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<240&&capstoneProjectObject.randomPressureArray3.get(i)>230)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<250&&capstoneProjectObject.randomPressureArray3.get(i)>240)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<260&&capstoneProjectObject.randomPressureArray3.get(i)>250)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<270&&capstoneProjectObject.randomPressureArray3.get(i)>260)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 25, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<210&&capstoneProjectObject.randomPressureArray4.get(i)>200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<220&&capstoneProjectObject.randomPressureArray4.get(i)>210)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<230&&capstoneProjectObject.randomPressureArray4.get(i)>220)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<240&&capstoneProjectObject.randomPressureArray4.get(i)>230)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<250&&capstoneProjectObject.randomPressureArray4.get(i)>240)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<260&&capstoneProjectObject.randomPressureArray4.get(i)>250)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<270&&capstoneProjectObject.randomPressureArray4.get(i)>260)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(945, 25, 10, 10);
				}
			}
			else if(i==2)
			{
				if(capstoneProjectObject.randomPressureArray4.get(i)==200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<210&&capstoneProjectObject.randomPressureArray3.get(i)>200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<220&&capstoneProjectObject.randomPressureArray3.get(i)>210)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<230&&capstoneProjectObject.randomPressureArray3.get(i)>220)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<240&&capstoneProjectObject.randomPressureArray3.get(i)>230)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<250&&capstoneProjectObject.randomPressureArray3.get(i)>240)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<260&&capstoneProjectObject.randomPressureArray3.get(i)>250)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<270&&capstoneProjectObject.randomPressureArray3.get(i)>260)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 25, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<210&&capstoneProjectObject.randomPressureArray4.get(i)>200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<220&&capstoneProjectObject.randomPressureArray4.get(i)>210)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<230&&capstoneProjectObject.randomPressureArray4.get(i)>220)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<240&&capstoneProjectObject.randomPressureArray4.get(i)>230)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<250&&capstoneProjectObject.randomPressureArray4.get(i)>240)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<260&&capstoneProjectObject.randomPressureArray4.get(i)>250)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<270&&capstoneProjectObject.randomPressureArray4.get(i)>260)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(995, 25, 10, 10);
				}
			}
			else if(i==3)
			{
				if(capstoneProjectObject.randomPressureArray4.get(i)==200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1045, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1095, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1095, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1095, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1095, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1095, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1095, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<210&&capstoneProjectObject.randomPressureArray3.get(i)>200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<220&&capstoneProjectObject.randomPressureArray3.get(i)>210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<230&&capstoneProjectObject.randomPressureArray3.get(i)>220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<240&&capstoneProjectObject.randomPressureArray3.get(i)>230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<250&&capstoneProjectObject.randomPressureArray3.get(i)>240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<260&&capstoneProjectObject.randomPressureArray3.get(i)>250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<270&&capstoneProjectObject.randomPressureArray3.get(i)>260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 25, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<210&&capstoneProjectObject.randomPressureArray4.get(i)>200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1045, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<220&&capstoneProjectObject.randomPressureArray4.get(i)>210)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1045, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<230&&capstoneProjectObject.randomPressureArray4.get(i)>220)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1045, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<240&&capstoneProjectObject.randomPressureArray4.get(i)>230)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1045, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<250&&capstoneProjectObject.randomPressureArray4.get(i)>240)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1045, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<260&&capstoneProjectObject.randomPressureArray4.get(i)>250)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1045, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<270&&capstoneProjectObject.randomPressureArray4.get(i)>260)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1045, 25, 10, 10);
				}
			}
			else if(i==4)
			{
				if(capstoneProjectObject.randomPressureArray4.get(i)==200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1095, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<210&&capstoneProjectObject.randomPressureArray3.get(i)>200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<220&&capstoneProjectObject.randomPressureArray3.get(i)>210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<230&&capstoneProjectObject.randomPressureArray3.get(i)>220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<240&&capstoneProjectObject.randomPressureArray3.get(i)>230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<250&&capstoneProjectObject.randomPressureArray3.get(i)>240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<260&&capstoneProjectObject.randomPressureArray3.get(i)>250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<270&&capstoneProjectObject.randomPressureArray3.get(i)>260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 25, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<210&&capstoneProjectObject.randomPressureArray4.get(i)>200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1095, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<220&&capstoneProjectObject.randomPressureArray4.get(i)>210)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1095, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<230&&capstoneProjectObject.randomPressureArray4.get(i)>220)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1095, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<240&&capstoneProjectObject.randomPressureArray4.get(i)>230)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1095, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<250&&capstoneProjectObject.randomPressureArray4.get(i)>240)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1095, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<260&&capstoneProjectObject.randomPressureArray4.get(i)>250)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1095, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<270&&capstoneProjectObject.randomPressureArray4.get(i)>260)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1095, 25, 10, 10);
				}
			}
			else if(i==5)
			{
				if(capstoneProjectObject.randomPressureArray4.get(i)==200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1145, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<210&&capstoneProjectObject.randomPressureArray3.get(i)>200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<220&&capstoneProjectObject.randomPressureArray3.get(i)>210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<230&&capstoneProjectObject.randomPressureArray3.get(i)>220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<240&&capstoneProjectObject.randomPressureArray3.get(i)>230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<250&&capstoneProjectObject.randomPressureArray3.get(i)>240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<260&&capstoneProjectObject.randomPressureArray3.get(i)>250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<270&&capstoneProjectObject.randomPressureArray3.get(i)>260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 25, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<210&&capstoneProjectObject.randomPressureArray4.get(i)>200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1145, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<220&&capstoneProjectObject.randomPressureArray4.get(i)>210)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1145, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<230&&capstoneProjectObject.randomPressureArray4.get(i)>220)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1145, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<240&&capstoneProjectObject.randomPressureArray4.get(i)>230)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1145, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<250&&capstoneProjectObject.randomPressureArray4.get(i)>240)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1145, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<260&&capstoneProjectObject.randomPressureArray4.get(i)>250)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1145, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<270&&capstoneProjectObject.randomPressureArray4.get(i)>260)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1145, 25, 10, 10);
				}
			}
			else if(i==6)
			{
				if(capstoneProjectObject.randomPressureArray4.get(i)==200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1195, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<210&&capstoneProjectObject.randomPressureArray3.get(i)>200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<220&&capstoneProjectObject.randomPressureArray3.get(i)>210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<230&&capstoneProjectObject.randomPressureArray3.get(i)>220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<240&&capstoneProjectObject.randomPressureArray3.get(i)>230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<250&&capstoneProjectObject.randomPressureArray3.get(i)>240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<260&&capstoneProjectObject.randomPressureArray3.get(i)>250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<270&&capstoneProjectObject.randomPressureArray3.get(i)>260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 25, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<210&&capstoneProjectObject.randomPressureArray4.get(i)>200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1195, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<220&&capstoneProjectObject.randomPressureArray4.get(i)>210)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1195, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<230&&capstoneProjectObject.randomPressureArray4.get(i)>220)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1195, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<240&&capstoneProjectObject.randomPressureArray4.get(i)>230)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1195, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<250&&capstoneProjectObject.randomPressureArray4.get(i)>240)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1195, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<260&&capstoneProjectObject.randomPressureArray4.get(i)>250)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1195, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<270&&capstoneProjectObject.randomPressureArray4.get(i)>260)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1195, 25, 10, 10);
				}
			}
			else if(i==7)
			{
				if(capstoneProjectObject.randomPressureArray4.get(i)==200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1245, 350, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 300, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 250, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 200, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 150, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 100, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 50, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray1.get(i)==270)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 0, 10, 10);	//was 50
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<210&&capstoneProjectObject.randomPressureArray3.get(i)>200)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<220&&capstoneProjectObject.randomPressureArray3.get(i)>210)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<230&&capstoneProjectObject.randomPressureArray3.get(i)>220)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<240&&capstoneProjectObject.randomPressureArray3.get(i)>230)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<250&&capstoneProjectObject.randomPressureArray3.get(i)>240)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<260&&capstoneProjectObject.randomPressureArray3.get(i)>250)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray3.get(i)<270&&capstoneProjectObject.randomPressureArray3.get(i)>260)
				{
					graphicsObject.setColor(Color.gray);
					graphicsObject.fillOval(1095, 25, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<210&&capstoneProjectObject.randomPressureArray4.get(i)>200)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1245, 325, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<220&&capstoneProjectObject.randomPressureArray4.get(i)>210)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1245, 275, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<230&&capstoneProjectObject.randomPressureArray4.get(i)>220)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1245, 225, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<240&&capstoneProjectObject.randomPressureArray4.get(i)>230)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1245, 175, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<250&&capstoneProjectObject.randomPressureArray4.get(i)>240)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1245, 125, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<260&&capstoneProjectObject.randomPressureArray4.get(i)>250)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1245, 75, 10, 10);
				}
				else if(capstoneProjectObject.randomPressureArray4.get(i)<270&&capstoneProjectObject.randomPressureArray4.get(i)>260)
				{
					graphicsObject.setColor(Color.cyan);
					graphicsObject.fillOval(1245, 25, 10, 10);
				}
			}
		}
	}
}
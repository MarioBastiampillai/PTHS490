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

class graphingPanel extends JPanel
{
	public void computation(int i)
	{
		
	}
	@Override
	public void paintComponent(Graphics g)
	{
		Graphics2D graphicsObject= (Graphics2D) g;
		//drawing the two different axes
		graphicsObject.drawLine(50, 50, 50, 400);
		graphicsObject.drawLine(50, 400, 400, 400);
		//drawing the x axes points
		graphicsObject.drawLine(50, 400, 50, 410);
		graphicsObject.drawLine(100, 400, 100, 410);
		graphicsObject.drawLine(150, 400, 150, 410);
		graphicsObject.drawLine(200, 400, 200, 410);
		graphicsObject.drawLine(250, 400, 250, 410);
		graphicsObject.drawLine(300, 400, 300, 410);
		graphicsObject.drawLine(350, 400, 350, 410);
		capstoneProject capstoneProjectObject=new capstoneProject();
		for( int i=0; i<=capstoneProjectObject.randomPressureArray1.size()-1; i++)
		{
			System.out.println(capstoneProjectObject.randomPressureArray1.get(i));
		}
	}
}

public class capstoneProject
{
	static ArrayList<Integer> randomPressureArray1=new ArrayList<Integer>(100);
	public static void main(String[] args)
	{
		JFrame frameObject=new JFrame("Capstone Project");
		frameObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panelObject=new JPanel();
		panelObject.setLayout(null);
		panelObject.setBackground(new java.awt.Color(157, 242, 245));
		
		JLabel titleLabel=new JLabel();
		titleLabel.setText("Performance Tracking Software:");
		titleLabel.setBounds(50,50, 300, 100);
		panelObject.add(titleLabel);
		
		JLabel pressureLabel1=new JLabel();
		pressureLabel1.setText("Pressure Reading 1:");
		pressureLabel1.setBounds(50,100, 150, 100);
		panelObject.add(pressureLabel1);
		
		JLabel pressure1Reading=new JLabel();
		pressure1Reading.setText(" ");
		pressure1Reading.setBounds(170,100, 150, 100);
		panelObject.add(pressure1Reading);
		
		JLabel pressureLabel2=new JLabel();
		pressureLabel2.setText("Pressure Reading 2:");
		pressureLabel2.setBounds(50,120, 150, 100);
		panelObject.add(pressureLabel2);
		
		JLabel pressure2Reading=new JLabel();
		pressure2Reading.setText(" ");
		pressure2Reading.setBounds(170,120, 150, 100);
		panelObject.add(pressure2Reading);
		
		JLabel pressureLabel3=new JLabel();
		pressureLabel3.setText("Pressure Reading 3:");
		pressureLabel3.setBounds(250,100, 150, 100);
		panelObject.add(pressureLabel3);
		
		JLabel pressure3Reading=new JLabel();
		pressure3Reading.setText(" ");
		pressure3Reading.setBounds(370,100, 150, 100);
		panelObject.add(pressure3Reading);
		
		JLabel pressureLabel4=new JLabel();
		pressureLabel4.setText("Pressure Reading 4:");
		pressureLabel4.setBounds(250,120, 150, 100);
		panelObject.add(pressureLabel4);
		
		JLabel pressure4Reading=new JLabel();
		pressure4Reading.setText(" ");
		pressure4Reading.setBounds(370,120, 150, 100);
		panelObject.add(pressure4Reading);
		
		JLabel accelerationLabel1=new JLabel();
		accelerationLabel1.setText("Acceleration:");
		accelerationLabel1.setBounds(450, 100, 100, 100);
		panelObject.add(accelerationLabel1);
		
		JLabel accelerationValue=new JLabel();
		accelerationValue.setText(" ");
		accelerationValue.setBounds(525, 100, 100, 100);
		panelObject.add(accelerationValue);
		
		JButton recordButton=new JButton();
		recordButton.setText("Record");
		recordButton.setBounds(50, 270, 100, 50);
		recordButton.setBackground(new Color(90, 173, 237));
		frameObject.add(recordButton);
		
		JButton exportToFileButton=new JButton();
		exportToFileButton.setText("Export to file");
		exportToFileButton.setBounds(0, 0, 170, 25);
		exportToFileButton.setBackground(new Color(90, 173, 237));
		frameObject.add(exportToFileButton);
		
		JButton plotDataButton=new JButton();
		plotDataButton.setText("Plot Data");
		plotDataButton.setBounds(170, 0, 170, 25);
		plotDataButton.setBackground(new Color(90, 173, 237));
		frameObject.add(plotDataButton);
		
		JButton helpButton=new JButton();
		helpButton.setText("Help");
		helpButton.setBounds(340, 0, 170, 25);
		helpButton.setBackground(new Color(90, 173, 237));
		frameObject.add(helpButton);
		
		JButton aboutButton=new JButton();
		aboutButton.setText("About");
		aboutButton.setBounds(510, 0, 170, 25);
		aboutButton.setBackground(new Color(90, 173, 237));
		frameObject.add(aboutButton);
		
		frameObject.add(panelObject);
		frameObject.setSize(700,700);
		frameObject.setVisible(true);
		
		Random randomObject=new Random();
		//ArrayList<Integer> randomPressureArray1=new ArrayList<Integer>(100);
		ArrayList<Integer> randomPressureArray2=new ArrayList<Integer>(100);
		ArrayList<Integer> randomPressureArray3=new ArrayList<Integer>(100);
		ArrayList<Integer> randomPressureArray4=new ArrayList<Integer>(100);
		recordButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				//put in code related to recording here
				//For demo purposes will create random numbers for both acceleration and pressure
				//based on reference problem 
				
				//average pressure when tool handling 250 kPa
				//need to generate four different values
				
				Timer timerObject=new Timer();
				timerObject.schedule(new TimerTask()
				{
					int index1=0;
					int index2=0;
					int index3=0;
					int index4=0;
					@Override
					public void run()
					{
						int randomAcceleration=randomObject.nextInt(500-100)+100;
						String randomAccelerationString=Integer.toString(randomAcceleration)+"m/s^2";
						accelerationValue.setText(randomAccelerationString);
						for(int i=0; i<=3; i++)
						{
							if(i==0)
							{
								randomPressureArray1.add(randomObject.nextInt(300-200)+200);
								String randomPressureArray1Reading=Integer.toString(randomPressureArray1.get(index1));
								pressure1Reading.setText(randomPressureArray1Reading+" kPa");
								index1++;
							}
							else if(i==1)
							{
								randomPressureArray2.add(randomObject.nextInt(300-200)+200);
								String randomPressureArray2Reading=Integer.toString(randomPressureArray2.get(index2));
								pressure2Reading.setText(randomPressureArray2Reading+" kPa");
								index2++;
							}
							else if(i==2)
							{
								randomPressureArray3.add(randomObject.nextInt(300-200)+200);
								String randomPressureArray3Reading=Integer.toString(randomPressureArray3.get(index3));
								pressure3Reading.setText(randomPressureArray3Reading+" kPa");
								index3++;
							}
							else if(i==3)
							{
								randomPressureArray4.add(randomObject.nextInt(300-200)+200);
								String randomPressureArray4Reading=Integer.toString(randomPressureArray4.get(index4));
								pressure4Reading.setText(randomPressureArray4Reading+" kPa");
								index4++;
							}
						}
					}
				}, 0, 5000);
				
			}
		});
		exportToFileButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				try{
					FileWriter fileWriterObject=new FileWriter("RecordedValues.txt", true);
					for(int i=0; i<=randomPressureArray1.size()-1; i++)
					{
						String randomPressureArray1StringValue=Integer.toString(randomPressureArray1.get(i));
						fileWriterObject.write("Pressure sensor 1 Recording "+i+": "+randomPressureArray1StringValue+" kPa");
						fileWriterObject.write("\n");
					}
					for(int i=0; i<=randomPressureArray2.size()-1; i++)
					{
						String randomPressureArray2StringValue=Integer.toString(randomPressureArray2.get(i));
						fileWriterObject.write("Pressure sensor 2 Recording "+i+": "+randomPressureArray2StringValue+" kPa");
						fileWriterObject.write("\n");
					}
					for(int i=0; i<=randomPressureArray3.size()-1; i++)
					{
						String randomPressureArray3StringValue=Integer.toString(randomPressureArray3.get(i));
						fileWriterObject.write("Pressure sensor 3 Recording "+i+": "+randomPressureArray3StringValue+" kPa");
						fileWriterObject.write("\n");
					}
					for(int i=0; i<=randomPressureArray4.size()-1; i++)
					{
						String randomPressureArray4StringValue=Integer.toString(randomPressureArray4.get(i));
						fileWriterObject.write("Pressure sensor 4 Recording "+i+": "+randomPressureArray4StringValue+" kPa");
						fileWriterObject.write("\n");
					}
					fileWriterObject.close();

				}catch(IOException w)
				{
					w.printStackTrace();
				}
			}
		});
		plotDataButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				JFrame plottingFrameObject=new JFrame("Plot");
				plottingFrameObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				graphingPanel plottingPanelObject=new graphingPanel();
				plottingPanelObject.setLayout(null);
				JLabel positionZeroX = new JLabel();
				positionZeroX.setText("0");
				positionZeroX.setBounds(45,370,100,100);
				JLabel positionOneX = new JLabel();
				positionOneX.setText("1");
				positionOneX.setBounds(95,370,100,100);
				JLabel positionTwoX = new JLabel();
				positionTwoX.setText("2");
				positionTwoX.setBounds(145,370,100,100);
				JLabel positionThreeX = new JLabel();
				positionThreeX.setText("3");
				positionThreeX.setBounds(195,370,100,100);
				plottingPanelObject.add(positionZeroX);
				plottingPanelObject.add(positionOneX);
				plottingPanelObject.add(positionTwoX);
				plottingPanelObject.add(positionThreeX);
				plottingFrameObject.add(plottingPanelObject);
				plottingFrameObject.setSize(700,700);
				plottingFrameObject.setVisible(true);
			}
		});
	}
}
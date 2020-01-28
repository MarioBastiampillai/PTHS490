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


public class capstoneProject
{
	static ArrayList<Integer> randomPressureArray1=new ArrayList<Integer>(100);
	static ArrayList<Integer> randomPressureArray2=new ArrayList<Integer>(100);
	static ArrayList<Integer> randomPressureArray3=new ArrayList<Integer>(100);
	static ArrayList<Integer> randomPressureArray4=new ArrayList<Integer>(100);
	static boolean stopRecording=false;
	public static void main(String[] args)
	{
		JFrame frameObject=new JFrame("Capstone Project");
		frameObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiPanel panelObject=new guiPanel();	//was JPanel
		panelObject.setLayout(null);
		panelObject.setBackground(new java.awt.Color(157, 242, 245));
		
		JLabel titleLabel=new JLabel();
		titleLabel.setText("Performance Tracking Software:");
		titleLabel.setBounds(50,20, 300, 100);	//was 50, 50, 300, 100
		titleLabel.setForeground(Color.white);
		panelObject.add(titleLabel);
		
		JLabel numberOfRecordingsLabel1=new JLabel();
		numberOfRecordingsLabel1.setText("Number of recordings:");
		numberOfRecordingsLabel1.setBounds(50,70, 150, 100);
		numberOfRecordingsLabel1.setForeground(Color.white);
		panelObject.add(numberOfRecordingsLabel1);
		
		JLabel numberOfRecordingsValueLabel1=new JLabel();
		numberOfRecordingsValueLabel1.setText(" ");
		numberOfRecordingsValueLabel1.setBounds(200,70, 150, 100);
		numberOfRecordingsValueLabel1.setForeground(Color.white);
		panelObject.add(numberOfRecordingsValueLabel1);
		
		JLabel pressureLabel1=new JLabel();
		pressureLabel1.setText("Pressure Reading 1:");
		pressureLabel1.setBounds(50,100, 150, 100);
		pressureLabel1.setForeground(Color.white);
		panelObject.add(pressureLabel1);
		
		JLabel pressure1Reading=new JLabel();
		pressure1Reading.setText(" ");
		pressure1Reading.setBounds(170,100, 150, 100);
		pressure1Reading.setForeground(Color.white);
		panelObject.add(pressure1Reading);
		
		JLabel pressureLabel2=new JLabel();
		pressureLabel2.setText("Pressure Reading 2:");
		pressureLabel2.setBounds(50,120, 150, 100);
		pressureLabel2.setForeground(Color.white);
		panelObject.add(pressureLabel2);
		
		JLabel pressure2Reading=new JLabel();
		pressure2Reading.setText(" ");
		pressure2Reading.setBounds(170,120, 150, 100);
		pressure2Reading.setForeground(Color.white);
		panelObject.add(pressure2Reading);
		
		JLabel pressureLabel3=new JLabel();
		pressureLabel3.setText("Pressure Reading 3:");
		pressureLabel3.setBounds(250,100, 150, 100);
		pressureLabel3.setForeground(Color.white);
		panelObject.add(pressureLabel3);
		
		JLabel pressure3Reading=new JLabel();
		pressure3Reading.setText(" ");
		pressure3Reading.setBounds(370,100, 150, 100);
		pressure3Reading.setForeground(Color.white);
		panelObject.add(pressure3Reading);
		
		JLabel pressureLabel4=new JLabel();
		pressureLabel4.setText("Pressure Reading 4:");
		pressureLabel4.setBounds(250,120, 150, 100);
		pressureLabel4.setForeground(Color.white);
		panelObject.add(pressureLabel4);
		
		JLabel pressure4Reading=new JLabel();
		pressure4Reading.setText(" ");
		pressure4Reading.setBounds(370,120, 150, 100);
		pressure4Reading.setForeground(Color.white);
		panelObject.add(pressure4Reading);
		
		JLabel accelerationLabel1=new JLabel();
		accelerationLabel1.setText("Acceleration:");
		accelerationLabel1.setBounds(450, 100, 100, 100);
		accelerationLabel1.setForeground(Color.white);
		panelObject.add(accelerationLabel1);
		
		JLabel accelerationValue=new JLabel();
		accelerationValue.setText(" ");
		accelerationValue.setBounds(525, 100, 100, 100);
		accelerationValue.setForeground(Color.white);
		panelObject.add(accelerationValue);
		
		JButton recordButton=new JButton();
		recordButton.setText("Record");
		recordButton.setBounds(200, 270, 100, 50);
		recordButton.setBackground(new Color(90, 173, 237));
		frameObject.add(recordButton);
		
		JButton stopRecordingButton=new JButton();
		stopRecordingButton.setText("Stop Recording");
		stopRecordingButton.setBounds(370, 270, 150, 50);
		stopRecordingButton.setBackground(new Color(90, 173, 237));
		frameObject.add(stopRecordingButton);
		
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
		
		JLabel helpDescriptionLabel1=new JLabel();
		helpDescriptionLabel1.setText(" ");
		helpDescriptionLabel1.setBounds(50, 400, 1000, 100);
		
		JLabel helpDescriptionLabel2=new JLabel();
		helpDescriptionLabel2.setText(" ");
		helpDescriptionLabel2.setBounds(50, 420, 1000, 100);

		JLabel helpDescriptionLabel3=new JLabel();
		helpDescriptionLabel3.setText(" ");
		helpDescriptionLabel3.setBounds(50, 440, 1000, 100);
		
		JLabel aboutDescriptionLabel=new JLabel();
		aboutDescriptionLabel.setText(" ");
		aboutDescriptionLabel.setBounds(50, 500, 1000, 100);
		
		panelObject.add(helpDescriptionLabel1);
		panelObject.add(helpDescriptionLabel2);
		panelObject.add(helpDescriptionLabel3);
		
		panelObject.add(aboutDescriptionLabel);
		frameObject.setSize(700,700);
		//frameObject.setLayout(new GridLayout(1,1,0,0));
		frameObject.add(panelObject);
		//frameObject.pack();
		frameObject.setVisible(true);
		
		Random randomObject=new Random();
		//ArrayList<Integer> randomPressureArray1=new ArrayList<Integer>(100);
		//ArrayList<Integer> randomPressureArray2=new ArrayList<Integer>(100);
		//ArrayList<Integer> randomPressureArray3=new ArrayList<Integer>(100);
		//ArrayList<Integer> randomPressureArray4=new ArrayList<Integer>(100);
		recordButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				//put in code related to recording here
				//For demo purposes will create random numbers for both acceleration and pressure
				//based on reference problem 
				
				//average pressure when tool handling 250 kPa
				//need to generate four different values
				stopRecording=false;
				Timer timerObject=new Timer();
				timerObject.schedule(new TimerTask()
				{
					int index1=0;
					int index2=0;
					int index3=0;
					int index4=0;
					int recordingNumber=0;
					@Override
					public void run()
					{
						if(stopRecording==false)
						{
							int randomAcceleration=randomObject.nextInt(500-100)+100;
							String randomAccelerationString=Integer.toString(randomAcceleration)+"m/s^2";
							accelerationValue.setText(randomAccelerationString);
							for(int i=0; i<=3; i++)
							{
								if(i==0)
								{
									randomPressureArray1.add(randomObject.nextInt(270-200)+200); //was 300
									String randomPressureArray1Reading=Integer.toString(randomPressureArray1.get(index1));
									pressure1Reading.setText(randomPressureArray1Reading+" kPa");
									index1++;
								}
								else if(i==1)
								{
									randomPressureArray2.add(randomObject.nextInt(270-200)+200); //was 300
									String randomPressureArray2Reading=Integer.toString(randomPressureArray2.get(index2));
									pressure2Reading.setText(randomPressureArray2Reading+" kPa");
									index2++;
								}
								else if(i==2)
								{
									randomPressureArray3.add(randomObject.nextInt(270-200)+200); //was 300
									String randomPressureArray3Reading=Integer.toString(randomPressureArray3.get(index3));
									pressure3Reading.setText(randomPressureArray3Reading+" kPa");
									index3++;
								}
								else if(i==3)
								{
									randomPressureArray4.add(randomObject.nextInt(270-200)+200); //was 300 
									String randomPressureArray4Reading=Integer.toString(randomPressureArray4.get(index4));
									pressure4Reading.setText(randomPressureArray4Reading+" kPa");
									index4++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								}       
							}
						}
					}
				}, 0, 5000);
				
			}
		});
		stopRecordingButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				stopRecording=true;
			}
		});
		exportToFileButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				if(stopRecording==true&&randomPressureArray1.size()!=0&&randomPressureArray2.size()!=0&&randomPressureArray3.size()!=0&&randomPressureArray4.size()!=0)
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
			}
		});
		plotDataButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				if(stopRecording==true&&randomPressureArray1.size()!=0&&randomPressureArray2.size()!=0&&randomPressureArray3.size()!=0&&randomPressureArray4.size()!=0)
				{
					JFrame plottingFrameObject1=new JFrame("Pressure Sensor 1 Plot");
					plottingFrameObject1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					graphingPanel1 plottingPanelObject1=new graphingPanel1();
					plottingPanelObject1.setLayout(null);
					JLabel positionZeroX1 = new JLabel();
					positionZeroX1.setText("0");
					positionZeroX1.setBounds(45,370,100,100);
					JLabel positionOneX1 = new JLabel();
					positionOneX1.setText("1");
					positionOneX1.setBounds(95,370,100,100);
					JLabel positionTwoX1 = new JLabel();
					positionTwoX1.setText("2");
					positionTwoX1.setBounds(145,370,100,100);
					JLabel positionThreeX1 = new JLabel();
					positionThreeX1.setText("3");
					positionThreeX1.setBounds(195,370,100,100);
					JLabel positionFourX1 = new JLabel();
					positionFourX1.setText("4");
					positionFourX1.setBounds(245,370,100,100);
					JLabel positionFiveX1 = new JLabel();
					positionFiveX1.setText("5");
					positionFiveX1.setBounds(295,370,100,100);
					JLabel positionSixX1 = new JLabel();
					positionSixX1.setText("6");
					positionSixX1.setBounds(345,370,100,100);
					JLabel positionSevenX1 = new JLabel();
					positionSevenX1.setText("7");
					positionSevenX1.setBounds(395,370,100,100);
					JLabel positionTwoHundredY1 = new JLabel();
					positionTwoHundredY1.setText("200");
					positionTwoHundredY1.setBounds(20,300,100,100);
					JLabel positionTwoHundredTenY1 = new JLabel();
					positionTwoHundredTenY1.setText("210");
					positionTwoHundredTenY1.setBounds(20,250,100,100);
					JLabel positionTwoHundredTwentyY1 = new JLabel();
					positionTwoHundredTwentyY1.setText("220");
					positionTwoHundredTwentyY1.setBounds(20,200,100,100);
					JLabel positionTwoHundredThirtyY1 = new JLabel();
					positionTwoHundredThirtyY1.setText("230");
					positionTwoHundredThirtyY1.setBounds(20,150,100,100);
					JLabel positionTwoHundredFourtyY1 = new JLabel();
					positionTwoHundredFourtyY1.setText("240");
					positionTwoHundredFourtyY1.setBounds(20,100,100,100);
					JLabel positionTwoHundredFiftyY1 = new JLabel();
					positionTwoHundredFiftyY1.setText("250");
					positionTwoHundredFiftyY1.setBounds(20,50,100,100);
					JLabel positionTwoHundredSixtyY1 = new JLabel();
					positionTwoHundredSixtyY1.setText("260");
					positionTwoHundredSixtyY1.setBounds(20,0,100,100);
					JLabel positionTwoHundredSeventyY1 = new JLabel();
					positionTwoHundredSeventyY1.setText("270");
					positionTwoHundredSeventyY1.setBounds(20,-40,100,100);
					plottingPanelObject1.add(positionZeroX1);
					plottingPanelObject1.add(positionOneX1);
					plottingPanelObject1.add(positionTwoX1);
					plottingPanelObject1.add(positionThreeX1);
					plottingPanelObject1.add(positionFourX1);
					plottingPanelObject1.add(positionFiveX1);
					plottingPanelObject1.add(positionSixX1);
					plottingPanelObject1.add(positionSevenX1);
					plottingPanelObject1.add(positionTwoHundredY1);
					plottingPanelObject1.add(positionTwoHundredTenY1);
					plottingPanelObject1.add(positionTwoHundredTwentyY1);
					plottingPanelObject1.add(positionTwoHundredThirtyY1);
					plottingPanelObject1.add(positionTwoHundredFourtyY1);
					plottingPanelObject1.add(positionTwoHundredFiftyY1);
					plottingPanelObject1.add(positionTwoHundredSixtyY1);
					plottingPanelObject1.add(positionTwoHundredSeventyY1);
					plottingFrameObject1.add(plottingPanelObject1);
					plottingFrameObject1.setSize(700,700);
					plottingFrameObject1.setVisible(true);
					
					JFrame plottingFrameObject2=new JFrame("Pressure Sensor 2 Plot");
					plottingFrameObject2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					graphingPanel2 plottingPanelObject2=new graphingPanel2();
					plottingPanelObject2.setLayout(null);
					JLabel positionZeroX2 = new JLabel();
					positionZeroX2.setText("0");
					positionZeroX2.setBounds(45,370,100,100);
					JLabel positionOneX2 = new JLabel();
					positionOneX2.setText("1");
					positionOneX2.setBounds(95,370,100,100);
					JLabel positionTwoX2 = new JLabel();
					positionTwoX2.setText("2");
					positionTwoX2.setBounds(145,370,100,100);
					JLabel positionThreeX2 = new JLabel();
					positionThreeX2.setText("3");
					positionThreeX2.setBounds(195,370,100,100);
					JLabel positionFourX2 = new JLabel();
					positionFourX2.setText("4");
					positionFourX2.setBounds(245,370,100,100);
					JLabel positionFiveX2 = new JLabel();
					positionFiveX2.setText("5");
					positionFiveX2.setBounds(295,370,100,100);
					JLabel positionSixX2 = new JLabel();
					positionSixX2.setText("6");
					positionSixX2.setBounds(345,370,100,100);
					JLabel positionSevenX2 = new JLabel();
					positionSevenX2.setText("7");
					positionSevenX2.setBounds(395,370,100,100);
					JLabel positionTwoHundredY2 = new JLabel();
					positionTwoHundredY2.setText("200");
					positionTwoHundredY2.setBounds(20,300,100,100);
					JLabel positionTwoHundredTenY2 = new JLabel();
					positionTwoHundredTenY2.setText("210");
					positionTwoHundredTenY2.setBounds(20,250,100,100);
					JLabel positionTwoHundredTwentyY2 = new JLabel();
					positionTwoHundredTwentyY2.setText("220");
					positionTwoHundredTwentyY2.setBounds(20,200,100,100);
					JLabel positionTwoHundredThirtyY2 = new JLabel();
					positionTwoHundredThirtyY2.setText("230");
					positionTwoHundredThirtyY2.setBounds(20,150,100,100);
					JLabel positionTwoHundredFourtyY2 = new JLabel();
					positionTwoHundredFourtyY2.setText("240");
					positionTwoHundredFourtyY2.setBounds(20,100,100,100);
					JLabel positionTwoHundredFiftyY2 = new JLabel();
					positionTwoHundredFiftyY2.setText("250");
					positionTwoHundredFiftyY2.setBounds(20,50,100,100);
					JLabel positionTwoHundredSixtyY2 = new JLabel();
					positionTwoHundredSixtyY2.setText("260");
					positionTwoHundredSixtyY2.setBounds(20,0,100,100);
					JLabel positionTwoHundredSeventyY2 = new JLabel();
					positionTwoHundredSeventyY2.setText("270");
					positionTwoHundredSeventyY2.setBounds(20,-40,100,100);
					plottingPanelObject2.add(positionZeroX2);
					plottingPanelObject2.add(positionOneX2);
					plottingPanelObject2.add(positionTwoX2);
					plottingPanelObject2.add(positionThreeX2);
					plottingPanelObject2.add(positionFourX2);
					plottingPanelObject2.add(positionFiveX2);
					plottingPanelObject2.add(positionSixX2);
					plottingPanelObject2.add(positionSevenX2);
					plottingPanelObject2.add(positionTwoHundredY2);
					plottingPanelObject2.add(positionTwoHundredTenY2);
					plottingPanelObject2.add(positionTwoHundredTwentyY2);
					plottingPanelObject2.add(positionTwoHundredThirtyY2);
					plottingPanelObject2.add(positionTwoHundredFourtyY2);
					plottingPanelObject2.add(positionTwoHundredFiftyY2);
					plottingPanelObject2.add(positionTwoHundredSixtyY2);
					plottingPanelObject2.add(positionTwoHundredSeventyY2);
					plottingFrameObject2.add(plottingPanelObject2);
					plottingFrameObject2.setSize(700,700);
					plottingFrameObject2.setVisible(true);
					
					JFrame plottingFrameObject3=new JFrame("Pressure Sensor 3 Plot");
					plottingFrameObject3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					graphingPanel3 plottingPanelObject3=new graphingPanel3();
					plottingPanelObject3.setLayout(null);
					JLabel positionZeroX3 = new JLabel();
					positionZeroX3.setText("0");
					positionZeroX3.setBounds(45,370,100,100);
					JLabel positionOneX3 = new JLabel();
					positionOneX3.setText("1");
					positionOneX3.setBounds(95,370,100,100);
					JLabel positionTwoX3 = new JLabel();
					positionTwoX3.setText("2");
					positionTwoX3.setBounds(145,370,100,100);
					JLabel positionThreeX3 = new JLabel();
					positionThreeX3.setText("3");
					positionThreeX3.setBounds(195,370,100,100);
					JLabel positionFourX3 = new JLabel();
					positionFourX3.setText("4");
					positionFourX3.setBounds(245,370,100,100);
					JLabel positionFiveX3 = new JLabel();
					positionFiveX3.setText("5");
					positionFiveX3.setBounds(295,370,100,100);
					JLabel positionSixX3 = new JLabel();
					positionSixX3.setText("6");
					positionSixX3.setBounds(345,370,100,100);
					JLabel positionSevenX3 = new JLabel();
					positionSevenX3.setText("7");
					positionSevenX3.setBounds(395,370,100,100);
					JLabel positionTwoHundredY3 = new JLabel();
					positionTwoHundredY3.setText("200");
					positionTwoHundredY3.setBounds(20,300,100,100);
					JLabel positionTwoHundredTenY3 = new JLabel();
					positionTwoHundredTenY3.setText("210");
					positionTwoHundredTenY3.setBounds(20,250,100,100);
					JLabel positionTwoHundredTwentyY3 = new JLabel();
					positionTwoHundredTwentyY3.setText("220");
					positionTwoHundredTwentyY3.setBounds(20,200,100,100);
					JLabel positionTwoHundredThirtyY3 = new JLabel();
					positionTwoHundredThirtyY3.setText("230");
					positionTwoHundredThirtyY3.setBounds(20,150,100,100);
					JLabel positionTwoHundredFourtyY3 = new JLabel();
					positionTwoHundredFourtyY3.setText("240");
					positionTwoHundredFourtyY3.setBounds(20,100,100,100);
					JLabel positionTwoHundredFiftyY3 = new JLabel();
					positionTwoHundredFiftyY3.setText("250");
					positionTwoHundredFiftyY3.setBounds(20,50,100,100);
					JLabel positionTwoHundredSixtyY3 = new JLabel();
					positionTwoHundredSixtyY3.setText("260");
					positionTwoHundredSixtyY3.setBounds(20,0,100,100);
					JLabel positionTwoHundredSeventyY3 = new JLabel();
					positionTwoHundredSeventyY3.setText("270");
					positionTwoHundredSeventyY3.setBounds(20,-40,100,100);
					plottingPanelObject3.add(positionZeroX3);
					plottingPanelObject3.add(positionOneX3);
					plottingPanelObject3.add(positionTwoX3);
					plottingPanelObject3.add(positionThreeX3);
					plottingPanelObject3.add(positionFourX3);
					plottingPanelObject3.add(positionFiveX3);
					plottingPanelObject3.add(positionSixX3);
					plottingPanelObject3.add(positionSevenX3);
					plottingPanelObject3.add(positionTwoHundredY3);
					plottingPanelObject3.add(positionTwoHundredTenY3);
					plottingPanelObject3.add(positionTwoHundredTwentyY3);
					plottingPanelObject3.add(positionTwoHundredThirtyY3);
					plottingPanelObject3.add(positionTwoHundredFourtyY3);
					plottingPanelObject3.add(positionTwoHundredFiftyY3);
					plottingPanelObject3.add(positionTwoHundredSixtyY3);
					plottingPanelObject3.add(positionTwoHundredSeventyY3);
					plottingFrameObject3.add(plottingPanelObject3);
					plottingFrameObject3.setSize(700,700);
					plottingFrameObject3.setVisible(true);
					
					JFrame plottingFrameObject4=new JFrame("Pressure Sensor 4 Plot");
					plottingFrameObject4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					graphingPanel4 plottingPanelObject4=new graphingPanel4();
					plottingPanelObject4.setLayout(null);
					JLabel positionZeroX4 = new JLabel();
					positionZeroX4.setText("0");
					positionZeroX4.setBounds(45,370,100,100);
					JLabel positionOneX4 = new JLabel();
					positionOneX4.setText("1");
					positionOneX4.setBounds(95,370,100,100);
					JLabel positionTwoX4 = new JLabel();
					positionTwoX4.setText("2");
					positionTwoX4.setBounds(145,370,100,100);
					JLabel positionThreeX4 = new JLabel();
					positionThreeX4.setText("3");
					positionThreeX4.setBounds(195,370,100,100);
					JLabel positionFourX4 = new JLabel();
					positionFourX4.setText("4");
					positionFourX4.setBounds(245,370,100,100);
					JLabel positionFiveX4 = new JLabel();
					positionFiveX4.setText("5");
					positionFiveX4.setBounds(295,370,100,100);
					JLabel positionSixX4 = new JLabel();
					positionSixX4.setText("6");
					positionSixX4.setBounds(345,370,100,100);
					JLabel positionSevenX4 = new JLabel();
					positionSevenX4.setText("7");
					positionSevenX4.setBounds(395,370,100,100);
					JLabel positionTwoHundredY4 = new JLabel();
					positionTwoHundredY4.setText("200");
					positionTwoHundredY4.setBounds(20,300,100,100);
					JLabel positionTwoHundredTenY4 = new JLabel();
					positionTwoHundredTenY4.setText("210");
					positionTwoHundredTenY4.setBounds(20,250,100,100);
					JLabel positionTwoHundredTwentyY4 = new JLabel();
					positionTwoHundredTwentyY4.setText("220");
					positionTwoHundredTwentyY4.setBounds(20,200,100,100);
					JLabel positionTwoHundredThirtyY4 = new JLabel();
					positionTwoHundredThirtyY4.setText("230");
					positionTwoHundredThirtyY4.setBounds(20,150,100,100);
					JLabel positionTwoHundredFourtyY4 = new JLabel();
					positionTwoHundredFourtyY4.setText("240");
					positionTwoHundredFourtyY4.setBounds(20,100,100,100);
					JLabel positionTwoHundredFiftyY4 = new JLabel();
					positionTwoHundredFiftyY4.setText("250");
					positionTwoHundredFiftyY4.setBounds(20,50,100,100);
					JLabel positionTwoHundredSixtyY4 = new JLabel();
					positionTwoHundredSixtyY4.setText("260");
					positionTwoHundredSixtyY4.setBounds(20,0,100,100);
					JLabel positionTwoHundredSeventyY4 = new JLabel();
					positionTwoHundredSeventyY4.setText("270");
					positionTwoHundredSeventyY4.setBounds(20,-40,100,100);
					plottingPanelObject4.add(positionZeroX4);
					plottingPanelObject4.add(positionOneX4);
					plottingPanelObject4.add(positionTwoX4);
					plottingPanelObject4.add(positionThreeX4);
					plottingPanelObject4.add(positionFourX4);
					plottingPanelObject4.add(positionFiveX4);
					plottingPanelObject4.add(positionSixX4);
					plottingPanelObject4.add(positionSevenX4);
					plottingPanelObject4.add(positionTwoHundredY4);
					plottingPanelObject4.add(positionTwoHundredTenY4);
					plottingPanelObject4.add(positionTwoHundredTwentyY4);
					plottingPanelObject4.add(positionTwoHundredThirtyY4);
					plottingPanelObject4.add(positionTwoHundredFourtyY4);
					plottingPanelObject4.add(positionTwoHundredFiftyY4);
					plottingPanelObject4.add(positionTwoHundredSixtyY4);
					plottingPanelObject4.add(positionTwoHundredSeventyY4);
					plottingFrameObject4.add(plottingPanelObject4);
					plottingFrameObject4.setSize(700,700);
					plottingFrameObject4.setVisible(true);
				}
			}
		});
		helpButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				helpDescriptionLabel1.setText("To record data, please press the 'record' button above. Once data has been recorded");
				helpDescriptionLabel2.setText("you may press the 'Export to file' button in order for the recorded values to be saved  and written to a file.");
				helpDescriptionLabel3.setText("After data has been recorded you may also press the 'Plot Data' button to view the plots for all recorded sensor values.");
			}
		});
		aboutButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				aboutDescriptionLabel.setText("Software used to record and display values for pressure and acceleration.");
			}
		});
	}
}
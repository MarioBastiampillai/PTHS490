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
	static String recordingString=new String();
	static JTextArea recordedValues=new JTextArea();
	static JScrollPane recordedValuesScrollPane=new JScrollPane(recordedValues);
	static int recordingNumber=0;
	static boolean plotDataEnable=false;
	static boolean dataCleared=false;

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
		
		JLabel controlButtonsLabel=new JLabel();
		controlButtonsLabel.setText("Control Buttons:");
		controlButtonsLabel.setBounds(50,190, 150, 100);
		controlButtonsLabel.setForeground(Color.white);
		panelObject.add(controlButtonsLabel);
		
		JLabel recordingsLabel=new JLabel();
		recordingsLabel.setText("Recordings:");
		recordingsLabel.setBounds(910,470, 150, 100);
		recordingsLabel.setForeground(Color.white);
		panelObject.add(recordingsLabel);
		
		JLabel positionZeroX1 = new JLabel();
		positionZeroX1.setText("0");
		positionZeroX1.setBounds(895,370,100,100);
		positionZeroX1.setVisible(false);
		JLabel positionOneX1 = new JLabel();
		positionOneX1.setText("1");
		positionOneX1.setBounds(945,370,100,100);
		positionOneX1.setVisible(false);
		JLabel positionTwoX1 = new JLabel();
		positionTwoX1.setText("2");
		positionTwoX1.setBounds(995,370,100,100);
		positionTwoX1.setVisible(false);
		JLabel positionThreeX1 = new JLabel();
		positionThreeX1.setText("3");
		positionThreeX1.setBounds(1045,370,100,100);
		positionThreeX1.setVisible(false);
		JLabel positionFourX1 = new JLabel();
		positionFourX1.setText("4");
		positionFourX1.setBounds(1095,370,100,100);
		positionFourX1.setVisible(false);
		JLabel positionFiveX1 = new JLabel();
		positionFiveX1.setText("5");
		positionFiveX1.setBounds(1145,370,100,100);
		positionFiveX1.setVisible(false);
		JLabel positionSixX1 = new JLabel();
		positionSixX1.setText("6");
		positionSixX1.setBounds(1195,370,100,100);
		positionSixX1.setVisible(false);
		JLabel positionSevenX1 = new JLabel();
		positionSevenX1.setText("7");
		positionSevenX1.setBounds(1245,370,100,100);
		positionSevenX1.setVisible(false);
		JLabel positionTwoHundredY1 = new JLabel();
		positionTwoHundredY1.setText("200");
		positionTwoHundredY1.setBounds(870,300,100,100);
		positionTwoHundredY1.setVisible(false);
		JLabel positionTwoHundredTenY1 = new JLabel();
		positionTwoHundredTenY1.setText("210");
		positionTwoHundredTenY1.setBounds(870,250,100,100);
		positionTwoHundredTenY1.setVisible(false);
		JLabel positionTwoHundredTwentyY1 = new JLabel();
		positionTwoHundredTwentyY1.setText("220");
		positionTwoHundredTwentyY1.setBounds(870,200,100,100);
		positionTwoHundredTwentyY1.setVisible(false); 
		JLabel positionTwoHundredThirtyY1 = new JLabel();
		positionTwoHundredThirtyY1.setText("230");
		positionTwoHundredThirtyY1.setBounds(870,150,100,100);
		positionTwoHundredThirtyY1.setVisible(false);
		JLabel positionTwoHundredFourtyY1 = new JLabel();
		positionTwoHundredFourtyY1.setText("240");
		positionTwoHundredFourtyY1.setBounds(870,100,100,100);
		positionTwoHundredFourtyY1.setVisible(false);
		JLabel positionTwoHundredFiftyY1 = new JLabel();
		positionTwoHundredFiftyY1.setText("250");
		positionTwoHundredFiftyY1.setBounds(870,50,100,100);
		positionTwoHundredFiftyY1.setVisible(false);
		JLabel positionTwoHundredSixtyY1 = new JLabel();
		positionTwoHundredSixtyY1.setText("260");
		positionTwoHundredSixtyY1.setBounds(870,0,100,100);
		positionTwoHundredSixtyY1.setVisible(false);
		JLabel positionTwoHundredSeventyY1 = new JLabel();
		positionTwoHundredSeventyY1.setText("270");
		positionTwoHundredSeventyY1.setBounds(870,-40,100,100);
		positionTwoHundredSeventyY1.setVisible(false);
		JLabel xAxisTitle = new JLabel();
		xAxisTitle.setText("Recording #");
		xAxisTitle.setBounds(1070,400,50,50);
		xAxisTitle.setVisible(false);
		JLabel yAxisTitle = new JLabel();
		yAxisTitle.setText("Pressure (kpa)");
		xAxisTitle.setBounds(855,125,100,100);
		xAxisTitle.setVisible(false);
		JLabel pressureSensor1Label = new JLabel();
		pressureSensor1Label.setText("Pressure sensor 1");
		pressureSensor1Label.setBounds(1350,0,150,100);
		pressureSensor1Label.setVisible(false);
		JLabel pressureSensor2Label = new JLabel();
		pressureSensor2Label.setText("Pressure sensor 2");
		pressureSensor2Label.setBounds(1350,50,150,100);
		pressureSensor2Label.setVisible(false);
		JLabel pressureSensor3Label = new JLabel();
		pressureSensor3Label.setText("Pressure sensor 3");
		pressureSensor3Label.setBounds(1350,100,150,100);
		pressureSensor3Label.setVisible(false);
		JLabel pressureSensor4Label = new JLabel();
		pressureSensor4Label.setText("Pressure sensor 4");
		pressureSensor4Label.setBounds(1350,150,150,100);
		pressureSensor4Label.setVisible(false);
		panelObject.add(positionZeroX1);
		panelObject.add(positionOneX1);
		panelObject.add(positionTwoX1);
		panelObject.add(positionThreeX1);
		panelObject.add(positionFourX1);
		panelObject.add(positionFiveX1);
		panelObject.add(positionSixX1);
		panelObject.add(positionSevenX1);
		panelObject.add(positionTwoHundredY1);
		panelObject.add(positionTwoHundredTenY1);
		panelObject.add(positionTwoHundredTwentyY1);
		panelObject.add(positionTwoHundredThirtyY1);
		panelObject.add(positionTwoHundredFourtyY1);
		panelObject.add(positionTwoHundredFiftyY1);
		panelObject.add(positionTwoHundredSixtyY1);
		panelObject.add(positionTwoHundredSeventyY1);
		//panelObject.add(xAxisTitle);
		//panelObject.add(yAxisTitle);
		panelObject.add(pressureSensor1Label);
		panelObject.add(pressureSensor2Label);
		panelObject.add(pressureSensor3Label);
		panelObject.add(pressureSensor4Label);
		
		JTextArea graphArea=new JTextArea();
		graphArea.setEditable(false);
		graphArea.setBackground(new Color(157, 242, 245));	//was new Color(90, 173, 237)
		graphArea.setBounds(850, 0, 550, 500);
		panelObject.add(graphArea);
		
		JTextArea showRecordingsArea=new JTextArea();
		showRecordingsArea.setEditable(false);
		showRecordingsArea.setBackground(new Color(157, 242, 245));	//was new Color(90, 173, 237)
		showRecordingsArea.setBounds(850, 500, 550, 1000);
		panelObject.add(showRecordingsArea);
		
		JButton recordButton=new JButton();
		recordButton.setText("Record");
		recordButton.setBounds(55, 290, 100, 50);
		recordButton.setBackground(new Color(90, 173, 237));
		frameObject.add(recordButton);
		
		JButton stopRecordingButton=new JButton();
		stopRecordingButton.setText("Stop Recording");
		stopRecordingButton.setBounds(165, 290, 150, 50);
		stopRecordingButton.setBackground(new Color(90, 173, 237));
		frameObject.add(stopRecordingButton);
		
		JButton showRecordingsButton=new JButton();
		showRecordingsButton.setText("Show recordings");
		showRecordingsButton.setBounds(325, 290, 150, 50);
		showRecordingsButton.setBackground(new Color(90, 173, 237));
		frameObject.add(showRecordingsButton);
		
		JButton clearRecordingsButton=new JButton();
		clearRecordingsButton.setText("Clear Recordings");
		clearRecordingsButton.setBounds(490, 290, 150, 50);
		clearRecordingsButton.setBackground(new Color(90, 173, 237));
		frameObject.add(clearRecordingsButton);
		
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
		aboutButton.setBounds(510, 0, 180, 25);
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
		frameObject.setResizable(false);
		
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
					frameObject.setSize(new Dimension(3000,1000));
					if(plotDataEnable==true)		//from show recordings to plot data
					{
						graphArea.setVisible(false);
						//panelObject.remove(showRecordingsArea);
						positionZeroX1.setVisible(true);
						positionOneX1.setVisible(true);
						positionTwoX1.setVisible(true);
						positionThreeX1.setVisible(true);
						positionFourX1.setVisible(true);
						positionFiveX1.setVisible(true);
						positionSixX1.setVisible(true);
						positionSevenX1.setVisible(true);
						positionTwoHundredY1.setVisible(true);
						positionTwoHundredTenY1.setVisible(true);
						positionTwoHundredTwentyY1.setVisible(true); 
						positionTwoHundredThirtyY1.setVisible(true);
						positionTwoHundredFourtyY1.setVisible(true);
						positionTwoHundredFiftyY1.setVisible(true);
						positionTwoHundredSixtyY1.setVisible(true);
						positionTwoHundredSeventyY1.setVisible(true);
						//xAxisTitle.setVisible(true);
						//yAxisTitle.setVisible(true);
						pressureSensor1Label.setVisible(true);
						pressureSensor2Label.setVisible(true);
						pressureSensor3Label.setVisible(true);
						pressureSensor4Label.setVisible(true);
					}
					else if(plotDataEnable==false)	//from plot data right away
					{
						graphArea.setVisible(false);  
						recordingsLabel.setVisible(false);
						showRecordingsArea.setVisible(true);
						positionZeroX1.setVisible(true);
						positionOneX1.setVisible(true);
						positionTwoX1.setVisible(true);
						positionThreeX1.setVisible(true);
						positionFourX1.setVisible(true);
						positionFiveX1.setVisible(true);
						positionSixX1.setVisible(true);
						positionSevenX1.setVisible(true);
						positionTwoHundredY1.setVisible(true);
						positionTwoHundredTenY1.setVisible(true);
						positionTwoHundredTwentyY1.setVisible(true); 
						positionTwoHundredThirtyY1.setVisible(true);
						positionTwoHundredFourtyY1.setVisible(true);
						positionTwoHundredFiftyY1.setVisible(true);
						positionTwoHundredSixtyY1.setVisible(true);
						positionTwoHundredSeventyY1.setVisible(true);
						//xAxisTitle.setVisible(true);
						//yAxisTitle.setVisible(true);
						pressureSensor1Label.setVisible(true);
						pressureSensor2Label.setVisible(true);
						pressureSensor3Label.setVisible(true);
						pressureSensor4Label.setVisible(true);
					}
					if(dataCleared==true)
					{
						showRecordingsArea.setVisible(true);
						panelObject.add(showRecordingsArea);
						panelObject.remove(recordedValuesScrollPane);
						panelObject.revalidate();
						panelObject.repaint();
					}
				}
				if(dataCleared==true)
				{
					graphArea.setVisible(true);  
					positionZeroX1.setVisible(false);
					positionOneX1.setVisible(false);
					positionTwoX1.setVisible(false);
					positionThreeX1.setVisible(false);
					positionFourX1.setVisible(false);
					positionFiveX1.setVisible(false);
					positionSixX1.setVisible(false);
					positionSevenX1.setVisible(false);
					positionTwoHundredY1.setVisible(false);
					positionTwoHundredTenY1.setVisible(false);
					positionTwoHundredTwentyY1.setVisible(false); 
					positionTwoHundredThirtyY1.setVisible(false);
					positionTwoHundredFourtyY1.setVisible(false);
					positionTwoHundredFiftyY1.setVisible(false);
					positionTwoHundredSixtyY1.setVisible(false);
					positionTwoHundredSeventyY1.setVisible(false);
					//xAxisTitle.setVisible(false);
					//yAxisTitle.setVisible(false);
					pressureSensor1Label.setVisible(false);
					pressureSensor2Label.setVisible(false);
					pressureSensor3Label.setVisible(false);
					pressureSensor4Label.setVisible(false);
					dataCleared=false;
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
		showRecordingsButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				if(dataCleared==true)
				{
					graphArea.setVisible(true);  
					positionZeroX1.setVisible(false);
					positionOneX1.setVisible(false);
					positionTwoX1.setVisible(false);
					positionThreeX1.setVisible(false);
					positionFourX1.setVisible(false);
					positionFiveX1.setVisible(false);
					positionSixX1.setVisible(false);
					positionSevenX1.setVisible(false);
					positionTwoHundredY1.setVisible(false);
					positionTwoHundredTenY1.setVisible(false);
					positionTwoHundredTwentyY1.setVisible(false); 
					positionTwoHundredThirtyY1.setVisible(false);
					positionTwoHundredFourtyY1.setVisible(false);
					positionTwoHundredFiftyY1.setVisible(false);
					positionTwoHundredSixtyY1.setVisible(false);
					positionTwoHundredSeventyY1.setVisible(false);
					//xAxisTitle.setVisible(false);
					//yAxisTitle.setVisible(false);
					pressureSensor1Label.setVisible(false);
					pressureSensor2Label.setVisible(false);
					pressureSensor3Label.setVisible(false);
					pressureSensor4Label.setVisible(false);
					
					/*showRecordingsArea.setVisible(true);
					panelObject.add(showRecordingsArea);
					panelObject.remove(recordedValuesScrollPane);
					panelObject.revalidate();
					panelObject.repaint();*/
					dataCleared=false;
				}
				if(randomPressureArray1.isEmpty()&&randomPressureArray2.isEmpty()&&randomPressureArray3.isEmpty()&&randomPressureArray4.isEmpty())
				{
					
				}
				else{
				frameObject.setResizable(true);
				frameObject.setSize(new Dimension(3000,1000));
				recordingsLabel.setVisible(true);
				plotDataEnable=true;
				panelObject.remove(showRecordingsArea);
				panelObject.revalidate();
				panelObject.repaint();
				}
				for(int i=0; i<=randomPressureArray1.size()-1; i++)
				{
					String randomPressureArray1StringValue=Integer.toString(randomPressureArray1.get(i));
					recordingString=recordingString+"Pressure sensor 1 Recording "+i+": "+randomPressureArray1StringValue+" kPa\n";
					recordedValues.setText(recordingString);
				}
				for(int i=0; i<=randomPressureArray2.size()-1; i++)
				{
					String randomPressureArray2StringValue=Integer.toString(randomPressureArray2.get(i));
					recordingString=recordingString+"Pressure sensor 2 Recording "+i+": "+randomPressureArray2StringValue+" kPa\n";
					recordedValues.setText(recordingString);
				}
				for(int i=0; i<=randomPressureArray3.size()-1; i++)
				{
					String randomPressureArray3StringValue=Integer.toString(randomPressureArray3.get(i));
					recordingString=recordingString+"Pressure sensor 3 Recording "+i+": "+randomPressureArray3StringValue+" kPa\n";
					recordedValues.setText(recordingString);
				}
				for(int i=0; i<=randomPressureArray4.size()-1; i++)
				{
					String randomPressureArray4StringValue=Integer.toString(randomPressureArray4.get(i));
					recordingString=recordingString+"Pressure sensor 4 Recording "+i+": "+randomPressureArray4StringValue+" kPa\n";
					recordedValues.setText(recordingString);
				}
				recordedValues.setBackground(new Color(10, 25, 54));	//was new Color(90, 173, 237)
				recordedValues.setForeground(Color.white);
				recordedValues.setEditable(false);
				recordedValuesScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				recordedValuesScrollPane.setBounds(900, 540, 500, 200);
				//recordingsDisplay recordingsDisplayObject=new recordingsDisplay();
				//recordingsDisplayObject.recordingsDisplayBoolean=true;
				panelObject.add(recordedValuesScrollPane);
			}
		});
		clearRecordingsButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				recordingString=null;
				recordedValues.setText(recordingString);
				frameObject.setSize(new Dimension(700,700));
				frameObject.setResizable(false);
				pressure1Reading.setText(" ");
				pressure2Reading.setText(" ");
				pressure3Reading.setText(" ");
				pressure4Reading.setText(" ");
				accelerationValue.setText(" ");
				numberOfRecordingsValueLabel1.setText(" ");
				recordingNumber=0;
				dataCleared=true;
				//should empty the arraylists
				//randomPressureArray1.clear();
				//randomPressureArray2.clear();
				//randomPressureArray3.clear();
				//randomPressureArray4.clear();
				panelObject.revalidate();
				panelObject.repaint();
			}
		});
	}
}

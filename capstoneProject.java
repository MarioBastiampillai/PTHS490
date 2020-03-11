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
import java.util.Iterator;
import java.util.*;


public class capstoneProject
{
	//used to hold the final average value per 25 ms for each sensor, can hold up to 1000 values, used for the log
	static ArrayList<Integer> randomPressureArray1=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray2=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray3=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray4=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray5=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray6=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray7=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray8=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray9=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray10=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray11=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray12=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray13=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray14=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray15=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray16=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray17=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray18=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray19=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray20=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray21=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray22=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray23=new ArrayList<Integer>(1000);
	static ArrayList<Integer> randomPressureArray24=new ArrayList<Integer>(1000);
	//used to hold the initial 1000 values per 25 for each sensor, before calculation of the average
	static int totalRandomPressureArray1[]=new int[1000];
	static int totalRandomPressureArray2[]=new int[1000];
	static int totalRandomPressureArray3[]=new int[1000];
	static int totalRandomPressureArray4[]=new int[1000];
	static int totalRandomPressureArray5[]=new int[1000];
	static int totalRandomPressureArray6[]=new int[1000];
	static int totalRandomPressureArray7[]=new int[1000];
	static int totalRandomPressureArray8[]=new int[1000];
	static int totalRandomPressureArray9[]=new int[1000];
	static int totalRandomPressureArray10[]=new int[1000];
	static int totalRandomPressureArray11[]=new int[1000];
	static int totalRandomPressureArray12[]=new int[1000];
	static int totalRandomPressureArray13[]=new int[1000];
	static int totalRandomPressureArray14[]=new int[1000];
	static int totalRandomPressureArray15[]=new int[1000];
	static int totalRandomPressureArray16[]=new int[1000];
	static int totalRandomPressureArray17[]=new int[1000];
	static int totalRandomPressureArray18[]=new int[1000];
	static int totalRandomPressureArray19[]=new int[1000];
	static int totalRandomPressureArray20[]=new int[1000];
	static int totalRandomPressureArray21[]=new int[1000];
	static int totalRandomPressureArray22[]=new int[1000];
	static int totalRandomPressureArray23[]=new int[1000];
	static int totalRandomPressureArray24[]=new int[1000];
	//used to hold all similar numbers to determine the mode, or most often occuring number
	static ArrayList<Integer> temporaryRandomPressureArray1=new ArrayList<Integer>(1000);
	static ArrayList<Integer> temporaryRandomPressureArray2=new ArrayList<Integer>(1000);
	static ArrayList<Integer> temporaryRandomPressureArray3=new ArrayList<Integer>(1000);
	static ArrayList<Integer> temporaryRandomPressureArray4=new ArrayList<Integer>(1000);
	//used to determine the mode, or most often occuring number
	static HashMap<Integer, Integer> randomPressureArray1HashMap=new HashMap<Integer, Integer>();
	static HashMap<Integer, Integer> randomPressureArray2HashMap=new HashMap<Integer, Integer>();
	static HashMap<Integer, Integer> randomPressureArray3HashMap=new HashMap<Integer, Integer>();
	static HashMap<Integer, Integer> randomPressureArray4HashMap=new HashMap<Integer, Integer>();
	static boolean stopRecording=false;
	static String recordingString=new String();
	static JTextArea recordedValues=new JTextArea();
	static JScrollPane recordedValuesScrollPane=new JScrollPane(recordedValues);
	static int recordingNumber=0;
	static boolean plotDataEnable=false;
	static boolean dataCleared=false;
	static int highestCountKey=0;
	static boolean recordingContinued=false;

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
		Iterator temporaryRandomPressureArray1Iterator=temporaryRandomPressureArray1.iterator();
		recordButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				//put in code related to recording here
				//For demo purposes will create random numbers for both acceleration and pressure
				//based on reference problem 
				
				//average pressure when tool handling 250 kPa
				//need to generate four different values
				//if stopRecording==false meaning that recording is happening, the show recordings window should be closed and cleared
				recordingString=null;
				recordedValues.setText(recordingString);
				frameObject.setSize(new Dimension(700,700));
				frameObject.setResizable(false);
				dataCleared=true;
				panelObject.revalidate();
				panelObject.repaint();
				stopRecording=false;
				Timer timerObject=new Timer();
				timerObject.schedule(new TimerTask()
				{
					int index1=0;
					int index2=0;
					int index3=0;
					int index4=0;
					//in the event that the averages must be calculated in parallel and not one after the other due to time constraint
					int total1, total2, total3, total4, total5, total6, total7, total8, total9, total10, total11, total12, total13, total14, total15, total16, total17, total18, total19, total20, total21, total22, total23, total24=0;
					int average1, average2, average3, average4, average5, average6, average7, average8, average9, average10, average11, average12, average13, average14, average15, average16, average17, average18, average19, average20, average21, average22, average23, average24=0;
					@Override
					public void run()
					{
						if(stopRecording==false)
						{
							int randomAcceleration=randomObject.nextInt(500-100)+100;
							String randomAccelerationString=Integer.toString(randomAcceleration)+"m/s^2";
							accelerationValue.setText(randomAccelerationString);
							for(int i=0; i<=23; i++)	//was initially 0 to 3, which was chosen since the program was initially tested for 4 sensors
							{
								if(i==0)
								{
									//assuming 100 samples/sec for each sensor
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per 25 ms per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray1[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor1=0; indexSensor1<=totalRandomPressureArray1.length-1; indexSensor1++)
									{
										System.out.println("The current value for sensor 1 is"+totalRandomPressureArray1[indexSensor1]+" at index "+indexSensor1);
										total1=total1+totalRandomPressureArray1[indexSensor1];
										if(indexSensor1==totalRandomPressureArray1.length-1)
										{
											average1=total1/(indexSensor1+1);
											System.out.println("The average value for sensor 1 is"+average1);
											randomPressureArray1.add(average1);
											average1=0;
											total1=0;
										}
									}
									//randomPressureArray1.add(randomObject.nextInt(270-200)+200); //was 300
									String randomPressureArray1Reading=Integer.toString(randomPressureArray1.get(index1));	//should put highestCountKey
									pressure1Reading.setText(randomPressureArray1Reading+" kPa");
									index1++;
									/*
									//code for calculating the mode or most often appearing number
									for(int j=0; j<totalRandomPressureArray1.length-1; j++)
									{
										for(int l=j; l<totalRandomPressureArray1.length; l++)
										{
											if(totalRandomPressureArray1[l]<totalRandomPressureArray1[j])
											{
												int smallestNumber=totalRandomPressureArray1[l];
												totalRandomPressureArray1[l]=totalRandomPressureArray1[j];
												totalRandomPressureArray1[j]=smallestNumber;
											}
										}
									}
									int begin=0;
									int last=totalRandomPressureArray1.length-1;
									int middle=0;
									while(begin<=last)
									{
										middle=(begin+last)/2;
										if(totalRandomPressureArray1[middle+1]>totalRandomPressureArray1[middle])
										{
											//collect all the similar values
											for(int m=begin;  m<=middle; m++)
											{
												//store in a temporary arraylist
												temporaryRandomPressureArray1.add(totalRandomPressureArray1[m]);
											}
											while(temporaryRandomPressureArray1Iterator.hasNext())
											{
												//count number of elements
												int count=temporaryRandomPressureArray1.size();
												int value=(Integer)temporaryRandomPressureArray1Iterator.next();
												randomPressureArray1HashMap.put(value, count);
												System.out.println("The value for mode calculation is "+value);
												System.out.println("The count for mode calculation is "+count);
											}
											begin=middle+1;
										}
									}
									//The randomPressureArray1Reading string should contain the final chosen value after the algorithm has performed
									//its selection during that particular second
									//iterate through HashMap to calculate the average or mode, depending on what is wanted
									
									for(int z: randomPressureArray1HashMap.keySet())
									{
										//in the case where the number with the highest count is chosen (mode)
										//order the entries from lest to greatest count and select the last entry
										if(randomPressureArray1HashMap.get(z)>randomPressureArray1HashMap.get(z+1))
										{
											highestCountKey=z;
										}
									}
									int starter=0;
									for(int indexer1=0; indexer1<totalRandomPressureArray1.length-1; indexer1++)
									{
										if(totalRandomPressureArray1[indexer1+1]>totalRandomPressureArray1[indexer1])
										{
											for(int indexer2=starter; indexer2<=indexer1; indexer2++)
											{
												temporaryRandomPressureArray1.add(totalRandomPressureArray1[indexer2]);
												starter=indexer1+1;
												if(indexer2==indexer1)
												{
													System.out.println("The value is "+totalRandomPressureArray1[indexer2]);
													System.out.println("The count is "+temporaryRandomPressureArray1.size());
													temporaryRandomPressureArray1.clear();
												}
											}
										}
									}*/
									//end of mode calculation algorithm
								}
								else if(i==1)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per 25 ms per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray2[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor2=0; indexSensor2<=totalRandomPressureArray2.length-1; indexSensor2++)
									{
										total2=total2+totalRandomPressureArray2[indexSensor2];
										if(indexSensor2==totalRandomPressureArray2.length-1)
										{
											average2=total2/(indexSensor2+1);
											System.out.println("The average value for sensor 2 is"+average2); 
											//store the average value in the randomPressureArray2 arraylist
											randomPressureArray2.add(average2);
											average2=0;
											total2=0;
										}
									}
									//randomPressureArray2.add(randomObject.nextInt(270-200)+200); //was 300
									String randomPressureArray2Reading=Integer.toString(randomPressureArray2.get(index2));
									pressure2Reading.setText(randomPressureArray2Reading+" kPa");
									index2++;
								}
								else if(i==2)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per 25 ms per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray3[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor3=0; indexSensor3<=totalRandomPressureArray2.length-1; indexSensor3++)
									{
										total3=total3+totalRandomPressureArray3[indexSensor3];
										if(indexSensor3==totalRandomPressureArray3.length-1)
										{
											average3=total3/(indexSensor3+1);
											System.out.println("The average value for sensor 3 is"+average3);
											//store the average value in the randomPressureArray2 arraylist
											randomPressureArray3.add(average3);
											average3=0;
											total3=0;
										}
									}
									//randomPressureArray3.add(randomObject.nextInt(270-200)+200); //was 300
									String randomPressureArray3Reading=Integer.toString(randomPressureArray3.get(index3));
									pressure3Reading.setText(randomPressureArray3Reading+" kPa");
									index3++;
								}
								else if(i==3)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per 25 ms per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray4[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor4=0; indexSensor4<=totalRandomPressureArray4.length-1; indexSensor4++)
									{
										total4=total4+totalRandomPressureArray4[indexSensor4];
										if(indexSensor4==totalRandomPressureArray4.length-1)
										{
											average4=total4/(indexSensor4+1);
											System.out.println("The average value for sensor 4 is"+average4);
											//store the average value in the randomPressureArray2 arraylist
											randomPressureArray4.add(average4);
											average4=0;
											total4=0;
										}
									}
									//randomPressureArray4.add(randomObject.nextInt(270-200)+200); //was 300 
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
				}, 0, 25);	//was 5000 for 5 seconds, not 25 ms
				
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
				//if record button is pressed again, close the recordings window 
				
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

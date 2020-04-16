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
	//used to hold the final average value per second for each sensor, can hold up to 1000 values, used for the log
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
	//used to hold the initial 1000 values per second for each sensor, before calculation of the average
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
		JFrame frameObject=new JFrame("Performance Tracking Hockey Stick");
		frameObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiPanel panelObject=new guiPanel();	
		panelObject.setLayout(null);
		panelObject.setBackground(new java.awt.Color(157, 242, 245));
		  
		JLabel toolbarAreaLabel=new JLabel();
		toolbarAreaLabel.setText("Toolbar area:");
		toolbarAreaLabel.setBounds(50, -25, 300, 100);
		toolbarAreaLabel.setForeground(Color.white);
		panelObject.add(toolbarAreaLabel);
		
		JLabel titleLabel=new JLabel(); 
		titleLabel.setText("Performance Tracking Hockey Stick Software:");
		titleLabel.setBounds(800,0, 600, 100);	
		titleLabel.setFont(new Font("Calibri", Font.BOLD, 24));
		panelObject.add(titleLabel);
		
		JLabel teamLabel=new JLabel();
		teamLabel.setText("Team 7");
		teamLabel.setBounds(1000,25,300, 100);
		teamLabel.setFont(new Font("Calibri", Font.BOLD, 24));
		panelObject.add(teamLabel);
		
		JLabel recordingAreaLabel=new JLabel();
		recordingAreaLabel.setText("Recording Area:");
		recordingAreaLabel.setBounds(50,110,300,100);
		recordingAreaLabel.setForeground(Color.white);
		panelObject.add(recordingAreaLabel);
		
		JLabel numberOfRecordingsLabel1=new JLabel();
		numberOfRecordingsLabel1.setText("Number of recordings:");
		numberOfRecordingsLabel1.setBounds(50,160, 150, 100);
		numberOfRecordingsLabel1.setForeground(Color.white);
		panelObject.add(numberOfRecordingsLabel1);
		
		JLabel numberOfRecordingsValueLabel1=new JLabel();
		numberOfRecordingsValueLabel1.setText(" ");
		numberOfRecordingsValueLabel1.setBounds(200,160, 150, 100);
		numberOfRecordingsValueLabel1.setForeground(Color.white);
		panelObject.add(numberOfRecordingsValueLabel1);
		
		JLabel pressureLabel1=new JLabel();
		pressureLabel1.setText("Pressure Reading 1:");
		pressureLabel1.setBounds(50,190, 150, 100);	
		pressureLabel1.setForeground(Color.white);
		panelObject.add(pressureLabel1);
		
		JLabel pressure1Reading=new JLabel();
		pressure1Reading.setText(" ");
		pressure1Reading.setBounds(170,190, 150, 100);	
		pressure1Reading.setForeground(Color.white);
		panelObject.add(pressure1Reading);
		
		JLabel pressureLabel2=new JLabel();
		pressureLabel2.setText("Pressure Reading 2:");
		pressureLabel2.setBounds(250,190, 150, 100);	
		pressureLabel2.setForeground(Color.white);
		panelObject.add(pressureLabel2);
		
		JLabel pressure2Reading=new JLabel();
		pressure2Reading.setText(" ");
		pressure2Reading.setBounds(370,190, 150, 100);	
		pressure2Reading.setForeground(Color.white);
		panelObject.add(pressure2Reading);
		
		JLabel pressureLabel3=new JLabel();
		pressureLabel3.setText("Pressure Reading 3:");
		pressureLabel3.setBounds(450,190, 150, 100);	
		pressureLabel3.setForeground(Color.white);
		panelObject.add(pressureLabel3);
		
		JLabel pressure3Reading=new JLabel();
		pressure3Reading.setText(" ");
		pressure3Reading.setBounds(570,190, 100, 100);
		pressure3Reading.setForeground(Color.white);
		panelObject.add(pressure3Reading);
		
		JLabel pressureLabel4=new JLabel();
		pressureLabel4.setText("Pressure Reading 4:");
		pressureLabel4.setBounds(50,210, 150, 100);
		pressureLabel4.setForeground(Color.white);
		panelObject.add(pressureLabel4);
		
		JLabel pressure4Reading=new JLabel();
		pressure4Reading.setText(" ");
		pressure4Reading.setBounds(170,210, 150, 100);
		pressure4Reading.setForeground(Color.white);
		panelObject.add(pressure4Reading);
		
		JLabel pressureLabel5=new JLabel();
		pressureLabel5.setText("Pressure Reading 5:");
		pressureLabel5.setBounds(250, 210, 150, 100);
		pressureLabel5.setForeground(Color.white);
		panelObject.add(pressureLabel5);
		
		JLabel pressure5Reading=new JLabel();
		pressure5Reading.setText(" ");
		pressure5Reading.setBounds(370, 210, 150, 100);
		pressure5Reading.setForeground(Color.white);
		panelObject.add(pressure5Reading);
		
		JLabel pressureLabel6=new JLabel();
		pressureLabel6.setText("Pressure Reading 6:");
		pressureLabel6.setBounds(450, 210, 150, 100);
		pressureLabel6.setForeground(Color.white);
		panelObject.add(pressureLabel6);
		
		JLabel pressure6Reading=new JLabel();
		pressure6Reading.setText(" ");
		pressure6Reading.setBounds(570, 210, 150, 100);
		pressure6Reading.setForeground(Color.white);
		panelObject.add(pressure6Reading);
		
		JLabel pressureLabel7=new JLabel();
		pressureLabel7.setText("Pressure Reading 7:");
		pressureLabel7.setBounds(50, 230, 150, 100);
		pressureLabel7.setForeground(Color.white);
		panelObject.add(pressureLabel7);
		
		JLabel pressure7Reading=new JLabel();
		pressure7Reading.setText(" ");
		pressure7Reading.setBounds(170,230, 100, 100);
		pressure7Reading.setForeground(Color.white);
		panelObject.add(pressure7Reading);
		
		JLabel pressureLabel8=new JLabel();
		pressureLabel8.setText("Pressure Reading 8:");
		pressureLabel8.setBounds(250, 230, 150, 100);
		pressureLabel8.setForeground(Color.white);
		panelObject.add(pressureLabel8);
		
		JLabel pressure8Reading=new JLabel();
		pressure8Reading.setText(" ");
		pressure8Reading.setBounds(370,230, 100, 100);
		pressure8Reading.setForeground(Color.white);
		panelObject.add(pressure8Reading);
		
		JLabel pressureLabel9=new JLabel();
		pressureLabel9.setText("Pressure Reading 9:");
		pressureLabel9.setBounds(450, 230, 150, 100);
		pressureLabel9.setForeground(Color.white);
		panelObject.add(pressureLabel9);
		
		JLabel pressure9Reading=new JLabel();
		pressure9Reading.setText(" ");
		pressure9Reading.setBounds(570,230, 100, 100);
		pressure9Reading.setForeground(Color.white);
		panelObject.add(pressure9Reading);
		
		JLabel pressureLabel10=new JLabel();
		pressureLabel10.setText("Pressure Reading 10:");
		pressureLabel10.setBounds(50, 250, 150, 100);
		pressureLabel10.setForeground(Color.white);
		panelObject.add(pressureLabel10);
		
		JLabel pressure10Reading=new JLabel();
		pressure10Reading.setText(" ");
		pressure10Reading.setBounds(175,250, 100, 100);
		pressure10Reading.setForeground(Color.white);
		panelObject.add(pressure10Reading);
		
		JLabel pressureLabel11=new JLabel();
		pressureLabel11.setText("Pressure Reading 11:");
		pressureLabel11.setBounds(250, 250, 150, 100);
		pressureLabel11.setForeground(Color.white);
		panelObject.add(pressureLabel11);
		
		JLabel pressure11Reading=new JLabel();
		pressure11Reading.setText(" ");
		pressure11Reading.setBounds(375,250, 100, 100);
		pressure11Reading.setForeground(Color.white);
		panelObject.add(pressure11Reading);
		
		JLabel pressureLabel12=new JLabel();
		pressureLabel12.setText("Pressure Reading 12:");
		pressureLabel12.setBounds(450, 250, 150, 100);
		pressureLabel12.setForeground(Color.white);
		panelObject.add(pressureLabel12);
		
		JLabel pressure12Reading=new JLabel();
		pressure12Reading.setText(" ");
		pressure12Reading.setBounds(575,250, 100, 100);
		pressure12Reading.setForeground(Color.white);
		panelObject.add(pressure12Reading);
		
		JLabel pressureLabel13=new JLabel();
		pressureLabel13.setText("Pressure Reading 13:");
		pressureLabel13.setBounds(50, 270, 150, 100);
		pressureLabel13.setForeground(Color.white);
		panelObject.add(pressureLabel13);
		
		JLabel pressure13Reading=new JLabel();
		pressure13Reading.setText(" ");
		pressure13Reading.setBounds(175,270, 100, 100);
		pressure13Reading.setForeground(Color.white);
		panelObject.add(pressure13Reading);
		
		JLabel pressureLabel14=new JLabel();
		pressureLabel14.setText("Pressure Reading 14:");
		pressureLabel14.setBounds(250, 270, 150, 100);
		pressureLabel14.setForeground(Color.white);
		panelObject.add(pressureLabel14);
		
		JLabel pressure14Reading=new JLabel();
		pressure14Reading.setText(" ");
		pressure14Reading.setBounds(375,270, 100, 100);
		pressure14Reading.setForeground(Color.white);
		panelObject.add(pressure14Reading);
		
		JLabel pressureLabel15=new JLabel();
		pressureLabel15.setText("Pressure Reading 15:");
		pressureLabel15.setBounds(450, 270, 150, 100);
		pressureLabel15.setForeground(Color.white);
		panelObject.add(pressureLabel15);
		
		JLabel pressure15Reading=new JLabel();
		pressure15Reading.setText(" ");
		pressure15Reading.setBounds(575,270, 100, 100);
		pressure15Reading.setForeground(Color.white);
		panelObject.add(pressure15Reading);
		
		JLabel pressureLabel16=new JLabel();
		pressureLabel16.setText("Pressure Reading 16:");
		pressureLabel16.setBounds(50, 290, 150, 100);
		pressureLabel16.setForeground(Color.white);
		panelObject.add(pressureLabel16);
		
		JLabel pressure16Reading=new JLabel();
		pressure16Reading.setText(" ");
		pressure16Reading.setBounds(175,290, 100, 100);
		pressure16Reading.setForeground(Color.white);
		panelObject.add(pressure16Reading);
		
		JLabel pressureLabel17=new JLabel();
		pressureLabel17.setText("Pressure Reading 17:");
		pressureLabel17.setBounds(250, 290, 150, 100);
		pressureLabel17.setForeground(Color.white);
		panelObject.add(pressureLabel17);
		
		JLabel pressure17Reading=new JLabel();
		pressure17Reading.setText(" ");
		pressure17Reading.setBounds(375,290, 100, 100);
		pressure17Reading.setForeground(Color.white);
		panelObject.add(pressure17Reading);
		
		JLabel pressureLabel18=new JLabel();
		pressureLabel18.setText("Pressure Reading 18:");
		pressureLabel18.setBounds(450, 290, 150, 100);
		pressureLabel18.setForeground(Color.white);
		panelObject.add(pressureLabel18);
		
		JLabel pressure18Reading=new JLabel();
		pressure18Reading.setText(" ");
		pressure18Reading.setBounds(575,290, 100, 100);
		pressure18Reading.setForeground(Color.white);
		panelObject.add(pressure18Reading);
		
		JLabel pressureLabel19=new JLabel();
		pressureLabel19.setText("Pressure Reading 19:");
		pressureLabel19.setBounds(50, 310, 150, 100);
		pressureLabel19.setForeground(Color.white);
		panelObject.add(pressureLabel19);
		
		JLabel pressure19Reading=new JLabel();
		pressure19Reading.setText(" ");
		pressure19Reading.setBounds(175,310, 100, 100);
		pressure19Reading.setForeground(Color.white);
		panelObject.add(pressure19Reading);
		
		JLabel pressureLabel20=new JLabel();
		pressureLabel20.setText("Pressure Reading 20:");
		pressureLabel20.setBounds(250, 310, 150, 100);
		pressureLabel20.setForeground(Color.white);
		panelObject.add(pressureLabel20);
		
		JLabel pressure20Reading=new JLabel();
		pressure20Reading.setText(" ");
		pressure20Reading.setBounds(375,310, 100, 100);
		pressure20Reading.setForeground(Color.white);
		panelObject.add(pressure20Reading);
		
		JLabel pressureLabel21=new JLabel();
		pressureLabel21.setText("Pressure Reading 21:");
		pressureLabel21.setBounds(450, 310, 150, 100);
		pressureLabel21.setForeground(Color.white);
		panelObject.add(pressureLabel21);
		
		JLabel pressure21Reading=new JLabel();
		pressure21Reading.setText(" ");
		pressure21Reading.setBounds(575,310, 100, 100);
		pressure21Reading.setForeground(Color.white);
		panelObject.add(pressure21Reading);
		
		JLabel pressureLabel22=new JLabel();
		pressureLabel22.setText("Pressure Reading 22:");
		pressureLabel22.setBounds(50, 330, 150, 100);
		pressureLabel22.setForeground(Color.white);
		panelObject.add(pressureLabel22);
		
		JLabel pressure22Reading=new JLabel();
		pressure22Reading.setText(" ");
		pressure22Reading.setBounds(175,330, 100, 100);
		pressure22Reading.setForeground(Color.white);
		panelObject.add(pressure22Reading);
		
		JLabel pressureLabel23=new JLabel(); 
		pressureLabel23.setText("Pressure Reading 23:");
		pressureLabel23.setBounds(250, 330, 150, 100);
		pressureLabel23.setForeground(Color.white);
		panelObject.add(pressureLabel23);
		
		JLabel pressure23Reading=new JLabel();
		pressure23Reading.setText(" ");
		pressure23Reading.setBounds(375,330, 100, 100);
		pressure23Reading.setForeground(Color.white);
		panelObject.add(pressure23Reading);
		
		JLabel pressureLabel24=new JLabel();
		pressureLabel24.setText("Pressure Reading 24:");
		pressureLabel24.setBounds(450, 330, 150, 100);
		pressureLabel24.setForeground(Color.white);
		panelObject.add(pressureLabel24);
		
		JLabel pressure24Reading=new JLabel();
		pressure24Reading.setText(" ");
		pressure24Reading.setBounds(575,330, 100, 100); 
		pressure24Reading.setForeground(Color.white);
		panelObject.add(pressure24Reading);
		
		JLabel accelerationLabel1=new JLabel();
		accelerationLabel1.setText("Acceleration x:");
		accelerationLabel1.setBounds(50, 350, 100, 100);
		accelerationLabel1.setForeground(Color.white);
		panelObject.add(accelerationLabel1);
		
		JLabel accelerationLabel2=new JLabel();
		accelerationLabel2.setText("Acceleration y:");
		accelerationLabel2.setBounds(250, 350, 100, 100);
		accelerationLabel2.setForeground(Color.white);
		panelObject.add(accelerationLabel2);
		
		JLabel accelerationLabel3=new JLabel();
		accelerationLabel3.setText("Acceleration z:");
		accelerationLabel3.setBounds(450, 350, 100, 100);
		accelerationLabel3.setForeground(Color.white);
		panelObject.add(accelerationLabel3);
		
		JLabel controlButtonsLabel=new JLabel();
		controlButtonsLabel.setText("Control Area:");
		controlButtonsLabel.setBounds(50,480, 150, 100);
		controlButtonsLabel.setForeground(Color.white);
		panelObject.add(controlButtonsLabel);
		
		JLabel recordingsLabel=new JLabel();
		recordingsLabel.setText("Recordings:");	
		recordingsLabel.setBounds(810,110, 150, 100);	
		recordingsLabel.setForeground(Color.white);
		recordingsLabel.setVisible(false);
		panelObject.add(recordingsLabel);
		
		JLabel showRecordingsLoadingLabel=new JLabel();
		showRecordingsLoadingLabel.setText("Please wait a few moments for the recordings to load");
		showRecordingsLoadingLabel.setBounds(300, 390, 300, 100);
		showRecordingsLoadingLabel.setForeground(Color.white);
		showRecordingsLoadingLabel.setVisible(false);
		panelObject.add(showRecordingsLoadingLabel);
		
		JTextArea showRecordingsArea=new JTextArea();
		showRecordingsArea.setEditable(false);
		showRecordingsArea.setBackground(new Color(157, 242, 245));	
		showRecordingsArea.setBounds(800, 140, 500, 525);	
		panelObject.add(showRecordingsArea); 
		
		JButton recordButton=new JButton();
		recordButton.setText("Record");
		recordButton.setBounds(55, 580, 100, 50);	
		recordButton.setBackground(new Color(90, 173, 237));
		frameObject.add(recordButton);
		
		JButton stopRecordingButton=new JButton();
		stopRecordingButton.setText("Stop Recording");
		stopRecordingButton.setBounds(165, 580, 150, 50);
		stopRecordingButton.setBackground(new Color(90, 173, 237));
		frameObject.add(stopRecordingButton);
		
		JButton showRecordingsButton=new JButton();
		showRecordingsButton.setText("Show recordings");
		showRecordingsButton.setBounds(325, 580, 150, 50);
		showRecordingsButton.setBackground(new Color(90, 173, 237));
		frameObject.add(showRecordingsButton);
		
		JButton clearRecordingsButton=new JButton();
		clearRecordingsButton.setText("Clear Recordings");
		clearRecordingsButton.setBounds(490, 580, 150, 50);
		clearRecordingsButton.setBackground(new Color(90, 173, 237));
		frameObject.add(clearRecordingsButton);
		
		JButton exportToFileButton=new JButton();
		exportToFileButton.setText("Export as csv");
		exportToFileButton.setBounds(55, 70, 170, 25);	
		exportToFileButton.setBackground(new Color(90, 173, 237));
		frameObject.add(exportToFileButton);
		
		JButton plotDataButton=new JButton();
		plotDataButton.setText("Plot Data");
		plotDataButton.setBounds(170, 90, 170, 25);
		plotDataButton.setBackground(new Color(90, 173, 237));
		//frameObject.add(plotDataButton);
		
		JButton helpButton=new JButton();
		helpButton.setText("Help");
		helpButton.setBounds(250, 70, 170, 25);	
		helpButton.setBackground(new Color(90, 173, 237));
		frameObject.add(helpButton);
		
		JButton aboutButton=new JButton();
		aboutButton.setText("About");
		aboutButton.setBounds(440, 70, 180, 25);	
		aboutButton.setBackground(new Color(90, 173, 237));
		frameObject.add(aboutButton);
		
		JLabel helpDescriptionLabel1=new JLabel();
		helpDescriptionLabel1.setText(" ");
		helpDescriptionLabel1.setBounds(27, 630, 1000, 100);	
		
		JLabel helpDescriptionLabel2=new JLabel();
		helpDescriptionLabel2.setText(" ");
		helpDescriptionLabel2.setBounds(27, 645, 1000, 100);		
		 
		JLabel aboutDescriptionLabel1=new JLabel();
		aboutDescriptionLabel1.setText(" ");
		aboutDescriptionLabel1.setBounds(800, 50, 1000, 100);	
		
		JLabel aboutDescriptionLabel2=new JLabel();
		aboutDescriptionLabel2.setText(" ");
		aboutDescriptionLabel2.setBounds(800, 65, 1000, 100);
		
		panelObject.add(helpDescriptionLabel1);
		panelObject.add(helpDescriptionLabel2);
		
		panelObject.add(aboutDescriptionLabel1);
		panelObject.add(aboutDescriptionLabel2);
		frameObject.setSize(3000,830);	
		frameObject.add(panelObject);
		frameObject.setVisible(true);
		frameObject.setResizable(false);
		
		Random randomObject=new Random();
		recordButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				//put in code related to recording here
				//For demo purposes will create random numbers for both acceleration and pressure
				//based on reference problem 
				//average pressure when tool handling 250 kPa
				recordingString=null;
				recordedValues.setText(recordingString);
				dataCleared=true;
				stopRecording=false;
				Timer timerObject=new Timer();
				timerObject.schedule(new TimerTask()
				{
					int index1, index2, index3, index4, index5, index6, index7, index8, index9, index10, index11, index12, index13, index14, index15, index16, index17, index18, index19, index20, index21, index22, index23, index24=0;
					int total1, total2, total3, total4, total5, total6, total7, total8, total9, total10, total11, total12, total13, total14, total15, total16, total17, total18, total19, total20, total21, total22, total23, total24=0;
					int average1, average2, average3, average4, average5, average6, average7, average8, average9, average10, average11, average12, average13, average14, average15, average16, average17, average18, average19, average20, average21, average22, average23, average24=0;
					@Override
					public void run()
					{
						if(stopRecording==false)
						{
							for(int i=0; i<=23; i++)	
							{
								if(i==0)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average of 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray1[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor1=0; indexSensor1<=totalRandomPressureArray1.length-1; indexSensor1++)
									{
										total1=total1+totalRandomPressureArray1[indexSensor1];
										if(indexSensor1==totalRandomPressureArray1.length-1)
										{
											average1=total1/(indexSensor1+1);
											randomPressureArray1.add(average1);
											average1=0;
											total1=0;
										}
									}
									String randomPressureArray1Reading=Integer.toString(randomPressureArray1.get(index1));	//should put highestCountKey
									pressure1Reading.setText(randomPressureArray1Reading+" kPa");
									index1++;
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
									String randomPressureArray2Reading=Integer.toString(randomPressureArray2.get(index2));
									pressure2Reading.setText(randomPressureArray2Reading+" kPa");
									index2++;
								}
								else if(i==2)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
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
											//store the average value in the randomPressureArray3 arraylist
											randomPressureArray3.add(average3);
											average3=0;
											total3=0;
										}
									}
									String randomPressureArray3Reading=Integer.toString(randomPressureArray3.get(index3));
									pressure3Reading.setText(randomPressureArray3Reading+" kPa");
									index3++;
								}
								else if(i==3)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
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
											//store the average value in the randomPressureArray4 arraylist
											randomPressureArray4.add(average4);
											average4=0;
											total4=0;
										}
									}
									String randomPressureArray4Reading=Integer.toString(randomPressureArray4.get(index4));
									pressure4Reading.setText(randomPressureArray4Reading+" kPa");
									index4++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								} 
								else if(i==4)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray5[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor5=0; indexSensor5<=totalRandomPressureArray5.length-1; indexSensor5++)
									{
										total5=total5+totalRandomPressureArray5[indexSensor5];
										if(indexSensor5==totalRandomPressureArray5.length-1)
										{
											average5=total5/(indexSensor5+1);
											System.out.println("The average value for sensor 5 is"+average5);
											//store the average value in the randomPressureArray5 arraylist
											randomPressureArray5.add(average5);
											average5=0;
											total5=0;
										}
									}
									String randomPressureArray5Reading=Integer.toString(randomPressureArray5.get(index5));
									pressure5Reading.setText(randomPressureArray5Reading+" kPa");
									index5++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								} 
								else if(i==5)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray6[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor6=0; indexSensor6<=totalRandomPressureArray6.length-1; indexSensor6++)
									{
										total6=total6+totalRandomPressureArray6[indexSensor6];
										if(indexSensor6==totalRandomPressureArray6.length-1)
										{
											average6=total6/(indexSensor6+1);
											System.out.println("The average value for sensor 6 is"+average6);
											//store the average value in the randomPressureArray6 arraylist
											randomPressureArray6.add(average6);
											average6=0;
											total6=0;
										}
									}
									String randomPressureArray6Reading=Integer.toString(randomPressureArray6.get(index6));
									pressure6Reading.setText(randomPressureArray6Reading+" kPa");
									index6++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								} 
								else if(i==6)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray7[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor7=0; indexSensor7<=totalRandomPressureArray7.length-1; indexSensor7++)
									{
										total7=total7+totalRandomPressureArray7[indexSensor7];
										if(indexSensor7==totalRandomPressureArray7.length-1)
										{
											average7=total7/(indexSensor7+1);
											System.out.println("The average value for sensor 7 is"+average7);
											//store the average value in the randomPressureArray7 arraylist
											randomPressureArray7.add(average7);
											average7=0;
											total7=0;
										}
									}
									String randomPressureArray7Reading=Integer.toString(randomPressureArray7.get(index7));
									pressure7Reading.setText(randomPressureArray7Reading+" kPa");
									index7++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								}
								else if(i==7)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray8[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor8=0; indexSensor8<=totalRandomPressureArray8.length-1; indexSensor8++)
									{
										total8=total8+totalRandomPressureArray8[indexSensor8];
										if(indexSensor8==totalRandomPressureArray8.length-1)
										{
											average8=total8/(indexSensor8+1);
											System.out.println("The average value for sensor 8 is"+average8);
											//store the average value in the randomPressureArray8 arraylist
											randomPressureArray8.add(average8);
											average8=0;
											total8=0;
										}
									}
									String randomPressureArray8Reading=Integer.toString(randomPressureArray8.get(index8));
									pressure8Reading.setText(randomPressureArray8Reading+" kPa");
									index8++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								} 
								else if(i==8)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray9[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor9=0; indexSensor9<=totalRandomPressureArray9.length-1; indexSensor9++)
									{
										total9=total9+totalRandomPressureArray9[indexSensor9];
										if(indexSensor9==totalRandomPressureArray9.length-1)
										{
											average9=total9/(indexSensor9+1);
											System.out.println("The average value for sensor 9 is"+average9);
											//store the average value in the randomPressureArray9 arraylist
											randomPressureArray9.add(average9);
											average9=0;
											total9=0;
										}
									} 
									String randomPressureArray9Reading=Integer.toString(randomPressureArray9.get(index9));
									pressure9Reading.setText(randomPressureArray9Reading+" kPa");
									index9++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								}
								else if(i==9)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray10[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor10=0; indexSensor10<=totalRandomPressureArray10.length-1; indexSensor10++)
									{
										total10=total10+totalRandomPressureArray10[indexSensor10];
										if(indexSensor10==totalRandomPressureArray10.length-1)
										{
											average10=total10/(indexSensor10+1);
											System.out.println("The average value for sensor 10 is"+average10);
											//store the average value in the randomPressureArray10 arraylist
											randomPressureArray10.add(average10);
											average10=0;
											total10=0;
										}
									}
									String randomPressureArray10Reading=Integer.toString(randomPressureArray10.get(index10));
									pressure10Reading.setText(randomPressureArray10Reading+" kPa");
									index10++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								} 
								else if(i==10)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray11[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor11=0; indexSensor11<=totalRandomPressureArray11.length-1; indexSensor11++)
									{
										total11=total11+totalRandomPressureArray11[indexSensor11];
										if(indexSensor11==totalRandomPressureArray11.length-1)
										{
											average11=total11/(indexSensor11+1);
											System.out.println("The average value for sensor 11 is"+average11);
											//store the average value in the randomPressureArray11 arraylist
											randomPressureArray11.add(average11);
											average11=0;
											total11=0;
										}
									} 
									String randomPressureArray11Reading=Integer.toString(randomPressureArray11.get(index11));
									pressure11Reading.setText(randomPressureArray11Reading+" kPa");
									index11++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								} 
								else if(i==11)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray12[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor12=0; indexSensor12<=totalRandomPressureArray12.length-1; indexSensor12++)
									{
										total12=total12+totalRandomPressureArray12[indexSensor12];
										if(indexSensor12==totalRandomPressureArray12.length-1)
										{
											average12=total12/(indexSensor12+1);
											System.out.println("The average value for sensor 12 is"+average12);
											//store the average value in the randomPressureArray12 arraylist
											randomPressureArray12.add(average12);
											average12=0;
											total12=0;
										}
									}
									String randomPressureArray12Reading=Integer.toString(randomPressureArray12.get(index12));
									pressure12Reading.setText(randomPressureArray12Reading+" kPa");
									index12++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								} 
								else if(i==12)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray13[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor13=0; indexSensor13<=totalRandomPressureArray13.length-1; indexSensor13++)
									{
										total13=total13+totalRandomPressureArray13[indexSensor13];
										if(indexSensor13==totalRandomPressureArray13.length-1)
										{
											average13=total13/(indexSensor13+1);
											System.out.println("The average value for sensor 13 is"+average13);
											//store the average value in the randomPressureArray13 arraylist
											randomPressureArray13.add(average13);
											average13=0;
											total13=0;
										}
									}
									String randomPressureArray13Reading=Integer.toString(randomPressureArray13.get(index13));
									pressure13Reading.setText(randomPressureArray13Reading+" kPa");
									index13++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								} 
								else if(i==13)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray14[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor14=0; indexSensor14<=totalRandomPressureArray14.length-1; indexSensor14++)
									{
										total14=total14+totalRandomPressureArray14[indexSensor14];
										if(indexSensor14==totalRandomPressureArray14.length-1)
										{
											average14=total14/(indexSensor14+1);
											System.out.println("The average value for sensor 14 is"+average14);
											//store the average value in the randomPressureArray14 arraylist
											randomPressureArray14.add(average14);
											average14=0;
											total14=0;
										}
									}
									String randomPressureArray14Reading=Integer.toString(randomPressureArray14.get(index14));
									pressure14Reading.setText(randomPressureArray14Reading+" kPa");
									index14++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								} 
								else if(i==14)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray15[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor15=0; indexSensor15<=totalRandomPressureArray15.length-1; indexSensor15++)
									{
										total15=total15+totalRandomPressureArray15[indexSensor15];
										if(indexSensor15==totalRandomPressureArray15.length-1)
										{
											average15=total15/(indexSensor15+1);
											System.out.println("The average value for sensor 15 is"+average15);
											//store the average value in the randomPressureArray15 arraylist
											randomPressureArray15.add(average15);
											average15=0;
											total15=0;
										}
									}
									String randomPressureArray15Reading=Integer.toString(randomPressureArray15.get(index15));
									pressure15Reading.setText(randomPressureArray15Reading+" kPa");
									index15++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								}
								else if(i==15)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray16[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor16=0; indexSensor16<=totalRandomPressureArray16.length-1; indexSensor16++)
									{
										total16=total16+totalRandomPressureArray16[indexSensor16];
										if(indexSensor16==totalRandomPressureArray16.length-1)
										{
											average16=total16/(indexSensor16+1);
											System.out.println("The average value for sensor 16 is"+average16);
											//store the average value in the randomPressureArray16 arraylist
											randomPressureArray16.add(average16);
											average16=0;
											total16=0;
										}
									}
									String randomPressureArray16Reading=Integer.toString(randomPressureArray16.get(index16));
									pressure16Reading.setText(randomPressureArray16Reading+" kPa");
									index16++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								}
								else if(i==16)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray17[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor17=0; indexSensor17<=totalRandomPressureArray17.length-1; indexSensor17++)
									{
										total17=total17+totalRandomPressureArray17[indexSensor17];
										if(indexSensor17==totalRandomPressureArray17.length-1)
										{
											average17=total17/(indexSensor17+1);
											System.out.println("The average value for sensor 17 is"+average17);
											//store the average value in the randomPressureArray17 arraylist
											randomPressureArray17.add(average17);
											average17=0;
											total17=0;
										}
									}
									String randomPressureArray17Reading=Integer.toString(randomPressureArray17.get(index17));
									pressure17Reading.setText(randomPressureArray17Reading+" kPa");
									index17++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								}
								else if(i==17)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray18[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor18=0; indexSensor18<=totalRandomPressureArray18.length-1; indexSensor18++)
									{
										total18=total18+totalRandomPressureArray18[indexSensor18];
										if(indexSensor18==totalRandomPressureArray18.length-1)
										{
											average18=total18/(indexSensor18+1);
											System.out.println("The average value for sensor 18 is"+average18);
											//store the average value in the randomPressureArray18 arraylist
											randomPressureArray18.add(average18);
											average18=0;
											total18=0;
										}
									}
									String randomPressureArray18Reading=Integer.toString(randomPressureArray18.get(index18));
									pressure18Reading.setText(randomPressureArray18Reading+" kPa");
									index18++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								}
								else if(i==18)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray19[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor19=0; indexSensor19<=totalRandomPressureArray19.length-1; indexSensor19++)
									{
										total19=total19+totalRandomPressureArray19[indexSensor19];
										if(indexSensor19==totalRandomPressureArray19.length-1)
										{
											average19=total19/(indexSensor19+1);
											System.out.println("The average value for sensor 19 is"+average19);
											//store the average value in the randomPressureArray19 arraylist
											randomPressureArray19.add(average19);
											average19=0;
											total19=0;
										}
									}
									String randomPressureArray19Reading=Integer.toString(randomPressureArray19.get(index19));
									pressure19Reading.setText(randomPressureArray19Reading+" kPa");
									index19++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								}
								else if(i==19)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray20[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor20=0; indexSensor20<=totalRandomPressureArray20.length-1; indexSensor20++)
									{
										total20=total20+totalRandomPressureArray20[indexSensor20];
										if(indexSensor20==totalRandomPressureArray20.length-1)
										{
											average20=total20/(indexSensor20+1);
											System.out.println("The average value for sensor 20 is"+average20);
											//store the average value in the randomPressureArray20 arraylist
											randomPressureArray20.add(average20);
											average20=0;
											total20=0;
										}
									}
									String randomPressureArray20Reading=Integer.toString(randomPressureArray20.get(index20));
									pressure20Reading.setText(randomPressureArray20Reading+" kPa");
									index20++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								}
								else if(i==20)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray21[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor21=0; indexSensor21<=totalRandomPressureArray21.length-1; indexSensor21++)
									{
										total21=total21+totalRandomPressureArray21[indexSensor21];
										if(indexSensor21==totalRandomPressureArray21.length-1)
										{
											average21=total21/(indexSensor21+1);
											System.out.println("The average value for sensor 21 is"+average21);
											//store the average value in the randomPressureArray21 arraylist
											randomPressureArray21.add(average21);
											average21=0;
											total21=0;
										}
									}
									String randomPressureArray21Reading=Integer.toString(randomPressureArray21.get(index21));
									pressure21Reading.setText(randomPressureArray21Reading+" kPa");
									index21++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								}
								else if(i==21)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray22[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor22=0; indexSensor22<=totalRandomPressureArray22.length-1; indexSensor22++)
									{
										total22=total22+totalRandomPressureArray22[indexSensor22];
										if(indexSensor22==totalRandomPressureArray22.length-1)
										{
											average22=total22/(indexSensor22+1);
											System.out.println("The average value for sensor 22 is"+average22);
											//store the average value in the randomPressureArray22 arraylist
											randomPressureArray22.add(average22);
											average22=0;
											total22=0;
										}
									}
									String randomPressureArray22Reading=Integer.toString(randomPressureArray22.get(index22));
									pressure22Reading.setText(randomPressureArray22Reading+" kPa");
									index22++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								}
								else if(i==22)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray23[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor23=0; indexSensor23<=totalRandomPressureArray23.length-1; indexSensor23++)
									{
										total23=total23+totalRandomPressureArray23[indexSensor23];
										if(indexSensor23==totalRandomPressureArray23.length-1)
										{
											average23=total23/(indexSensor23+1);
											System.out.println("The average value for sensor 23 is"+average23);
											//store the average value in the randomPressureArray23 arraylist
											randomPressureArray23.add(average23);
											average23=0;
											total23=0;
										}
									}
									String randomPressureArray23Reading=Integer.toString(randomPressureArray23.get(index23));
									pressure23Reading.setText(randomPressureArray23Reading+" kPa");
									index23++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								}
								else if(i==23)
								{
									for(int w=0; w<=999; w++)	//assuming finding the average 1000 samples per second per sensor
									{
										//generate 1000 random samples 
										totalRandomPressureArray24[w]=randomObject.nextInt(270-200)+200;
									}
									for(int indexSensor24=0; indexSensor24<=totalRandomPressureArray24.length-1; indexSensor24++)
									{
										total24=total24+totalRandomPressureArray24[indexSensor24];
										if(indexSensor24==totalRandomPressureArray24.length-1)
										{
											average24=total24/(indexSensor24+1);
											System.out.println("The average value for sensor 24 is"+average24);
											//store the average value in the randomPressureArray24 arraylist
											randomPressureArray24.add(average24);
											average24=0;
											total24=0;
										}
									}
									String randomPressureArray24Reading=Integer.toString(randomPressureArray24.get(index24));
									pressure24Reading.setText(randomPressureArray24Reading+" kPa");
									index24++;
									recordingNumber++;
									String recordingNumberString=Integer.toString(recordingNumber);
									numberOfRecordingsValueLabel1.setText(recordingNumberString);
								}
							}
						}
					}
				}, 0, 1000);	
				
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
						
						FileWriter fileWriterObjectCSV=new FileWriter("RecordedValuesCSV.txt", true);
						fileWriterObjectCSV.write("Sensor #, Recording #, Pressure Value (kPa)");
						fileWriterObjectCSV.write("\n");
						//a for loop is used to iterate through each sensor array list since the sensors won't record the same number of values as each other
						for(int i=0; i<=randomPressureArray1.size()-1; i++)
						{
							String randomPressureArray1StringValue=Integer.toString(randomPressureArray1.get(i));
							fileWriterObjectCSV.write("1,"+i+","+randomPressureArray1StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray2.size()-1; i++)
						{
							String randomPressureArray2StringValue=Integer.toString(randomPressureArray2.get(i));
							fileWriterObjectCSV.write("2,"+i+","+randomPressureArray2StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray3.size()-1; i++)
						{
							String randomPressureArray3StringValue=Integer.toString(randomPressureArray3.get(i));
							fileWriterObjectCSV.write("3,"+i+","+randomPressureArray3StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray4.size()-1; i++)
						{
							String randomPressureArray4StringValue=Integer.toString(randomPressureArray4.get(i));
							fileWriterObjectCSV.write("4,"+i+","+randomPressureArray4StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray5.size()-1; i++)
						{
							String randomPressureArray5StringValue=Integer.toString(randomPressureArray5.get(i));
							fileWriterObjectCSV.write("5,"+i+","+randomPressureArray5StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray6.size()-1; i++)
						{
							String randomPressureArray6StringValue=Integer.toString(randomPressureArray6.get(i));
							fileWriterObjectCSV.write("6,"+i+","+randomPressureArray6StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray7.size()-1; i++)
						{
							String randomPressureArray7StringValue=Integer.toString(randomPressureArray7.get(i));
							fileWriterObjectCSV.write("7,"+i+","+randomPressureArray7StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray8.size()-1; i++)
						{
							String randomPressureArray8StringValue=Integer.toString(randomPressureArray8.get(i));
							fileWriterObjectCSV.write("8,"+i+","+randomPressureArray8StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray9.size()-1; i++) 
						{
							String randomPressureArray9StringValue=Integer.toString(randomPressureArray9.get(i));
							fileWriterObjectCSV.write("9,"+i+","+randomPressureArray9StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray10.size()-1; i++)
						{
							String randomPressureArray10StringValue=Integer.toString(randomPressureArray10.get(i));
							fileWriterObjectCSV.write("10,"+i+","+randomPressureArray10StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray11.size()-1; i++)
						{
							String randomPressureArray11StringValue=Integer.toString(randomPressureArray11.get(i));
							fileWriterObjectCSV.write("11,"+i+","+randomPressureArray11StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray12.size()-1; i++)
						{
							String randomPressureArray12StringValue=Integer.toString(randomPressureArray12.get(i));
							fileWriterObjectCSV.write("12,"+i+","+randomPressureArray12StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray13.size()-1; i++)
						{
							String randomPressureArray13StringValue=Integer.toString(randomPressureArray13.get(i));
							fileWriterObjectCSV.write("13,"+i+","+randomPressureArray13StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray14.size()-1; i++)
						{
							String randomPressureArray14StringValue=Integer.toString(randomPressureArray14.get(i));
							fileWriterObjectCSV.write("14,"+i+","+randomPressureArray14StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray15.size()-1; i++)
						{
							String randomPressureArray15StringValue=Integer.toString(randomPressureArray15.get(i));
							fileWriterObjectCSV.write("15,"+i+","+randomPressureArray15StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray16.size()-1; i++)
						{
							String randomPressureArray16StringValue=Integer.toString(randomPressureArray16.get(i));
							fileWriterObjectCSV.write("16,"+i+","+randomPressureArray16StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray17.size()-1; i++)
						{
							String randomPressureArray17StringValue=Integer.toString(randomPressureArray17.get(i));
							fileWriterObjectCSV.write("17,"+i+","+randomPressureArray17StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray18.size()-1; i++)
						{
							String randomPressureArray18StringValue=Integer.toString(randomPressureArray18.get(i));
							fileWriterObjectCSV.write("18,"+i+","+randomPressureArray18StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray19.size()-1; i++)
						{
							String randomPressureArray19StringValue=Integer.toString(randomPressureArray19.get(i));
							fileWriterObjectCSV.write("19,"+i+","+randomPressureArray19StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray20.size()-1; i++)
						{
							String randomPressureArray20StringValue=Integer.toString(randomPressureArray20.get(i));
							fileWriterObjectCSV.write("20,"+i+","+randomPressureArray20StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray21.size()-1; i++)
						{
							String randomPressureArray21StringValue=Integer.toString(randomPressureArray21.get(i));
							fileWriterObjectCSV.write("21,"+i+","+randomPressureArray21StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray22.size()-1; i++)
						{
							String randomPressureArray22StringValue=Integer.toString(randomPressureArray22.get(i));
							fileWriterObjectCSV.write("22,"+i+","+randomPressureArray22StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray23.size()-1; i++)
						{
							String randomPressureArray23StringValue=Integer.toString(randomPressureArray23.get(i));
							fileWriterObjectCSV.write("23,"+i+","+randomPressureArray23StringValue);
							fileWriterObjectCSV.write("\n");
						}
						for(int i=0; i<=randomPressureArray24.size()-1; i++)
						{
							String randomPressureArray24StringValue=Integer.toString(randomPressureArray24.get(i));
							fileWriterObjectCSV.write("24,"+i+","+randomPressureArray24StringValue);
							fileWriterObjectCSV.write("\n");
						}
						fileWriterObjectCSV.close();
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
						
					}
					else if(plotDataEnable==false)	//from plot data right away
					{
						
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
				if(dataCleared==true)	//graph stuff was contained here
				{
					dataCleared=false;
				}
			}
		});
		helpButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				helpDescriptionLabel1.setText("Usage: To record data, please press the 'record' button above. Once data has been recorded");
				helpDescriptionLabel2.setText("you may press the 'Export to file' button in order for the recorded values to be saved  and written to a file.");
				//helpDescriptionLabel3.setText("After data has been recorded you may also press the 'Plot Data' button to view the plots for all recorded sensor values.");
			}
		});
		aboutButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				aboutDescriptionLabel1.setText("About:Software used to record and display values for pressure and acceleration.");
				aboutDescriptionLabel2.setText("1000 pressure values were generated per second for each of the 24 sensors.");
			}
		});
		showRecordingsButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				if(dataCleared==true)	//graphing stuff was contained here
				{
					dataCleared=false;
				}
				if(randomPressureArray1.isEmpty()&&randomPressureArray2.isEmpty()&&randomPressureArray3.isEmpty()&&randomPressureArray4.isEmpty()
					&&randomPressureArray5.isEmpty()&&randomPressureArray6.isEmpty()&&randomPressureArray7.isEmpty()&&randomPressureArray8.isEmpty()
					&&randomPressureArray9.isEmpty()&&randomPressureArray10.isEmpty()&&randomPressureArray11.isEmpty()&&randomPressureArray12.isEmpty()
					&&randomPressureArray13.isEmpty()&&randomPressureArray14.isEmpty()&&randomPressureArray15.isEmpty()&&randomPressureArray16.isEmpty()
					&&randomPressureArray17.isEmpty()&&randomPressureArray18.isEmpty()&&randomPressureArray19.isEmpty()&&randomPressureArray20.isEmpty()
					&&randomPressureArray21.isEmpty()&&randomPressureArray22.isEmpty()&&randomPressureArray23.isEmpty()&&randomPressureArray24.isEmpty())
				{
					
				}
				else
				{
					//code related to show recordings extension
					if(recordingNumber>3000)
					{
						System.out.println("Cannot display recordings if number of recordings exceeds 1000");
						showRecordingsLoadingLabel.setText("Cannot display recordings if number of recordings exceeds 1000");
					}
					else 
					{
						frameObject.setResizable(true);
						frameObject.setSize(new Dimension(3000,830));
						recordingsLabel.setVisible(true);
						showRecordingsLoadingLabel.setVisible(true);
						plotDataEnable=true;
						showRecordingsArea.setVisible(false);
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
						for(int i=0; i<=randomPressureArray5.size()-1; i++)
						{
							String randomPressureArray5StringValue=Integer.toString(randomPressureArray5.get(i));
							recordingString=recordingString+"Pressure sensor 5 Recording "+i+": "+randomPressureArray5StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray6.size()-1; i++)
						{
							String randomPressureArray6StringValue=Integer.toString(randomPressureArray6.get(i));
							recordingString=recordingString+"Pressure sensor 6 Recording "+i+": "+randomPressureArray6StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray7.size()-1; i++)
						{
							String randomPressureArray7StringValue=Integer.toString(randomPressureArray7.get(i));
							recordingString=recordingString+"Pressure sensor 7 Recording "+i+": "+randomPressureArray7StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray8.size()-1; i++)
						{
							String randomPressureArray8StringValue=Integer.toString(randomPressureArray8.get(i));
							recordingString=recordingString+"Pressure sensor 8 Recording "+i+": "+randomPressureArray8StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray9.size()-1; i++)
						{
							String randomPressureArray9StringValue=Integer.toString(randomPressureArray9.get(i));
							recordingString=recordingString+"Pressure sensor 9 Recording "+i+": "+randomPressureArray9StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray10.size()-1; i++)
						{
							String randomPressureArray10StringValue=Integer.toString(randomPressureArray10.get(i));
							recordingString=recordingString+"Pressure sensor 10 Recording "+i+": "+randomPressureArray10StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray11.size()-1; i++)
						{
							String randomPressureArray11StringValue=Integer.toString(randomPressureArray11.get(i));
							recordingString=recordingString+"Pressure sensor 11 Recording "+i+": "+randomPressureArray11StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray12.size()-1; i++)
						{
							String randomPressureArray12StringValue=Integer.toString(randomPressureArray12.get(i));
							recordingString=recordingString+"Pressure sensor 12 Recording "+i+": "+randomPressureArray12StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray13.size()-1; i++)
						{
							String randomPressureArray13StringValue=Integer.toString(randomPressureArray13.get(i));
							recordingString=recordingString+"Pressure sensor 13 Recording "+i+": "+randomPressureArray13StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray14.size()-1; i++)
						{
							String randomPressureArray14StringValue=Integer.toString(randomPressureArray14.get(i));
							recordingString=recordingString+"Pressure sensor 14 Recording "+i+": "+randomPressureArray14StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray15.size()-1; i++)
						{
							String randomPressureArray15StringValue=Integer.toString(randomPressureArray15.get(i));
							recordingString=recordingString+"Pressure sensor 15 Recording "+i+": "+randomPressureArray15StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray16.size()-1; i++)
						{
							String randomPressureArray16StringValue=Integer.toString(randomPressureArray16.get(i));
							recordingString=recordingString+"Pressure sensor 16 Recording "+i+": "+randomPressureArray16StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray17.size()-1; i++)
						{
							String randomPressureArray17StringValue=Integer.toString(randomPressureArray17.get(i));
							recordingString=recordingString+"Pressure sensor 17 Recording "+i+": "+randomPressureArray17StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray18.size()-1; i++)
						{
							String randomPressureArray18StringValue=Integer.toString(randomPressureArray18.get(i));
							recordingString=recordingString+"Pressure sensor 18 Recording "+i+": "+randomPressureArray18StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray19.size()-1; i++)
						{
							String randomPressureArray19StringValue=Integer.toString(randomPressureArray19.get(i));
							recordingString=recordingString+"Pressure sensor 19 Recording "+i+": "+randomPressureArray19StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray20.size()-1; i++)
						{
							String randomPressureArray20StringValue=Integer.toString(randomPressureArray20.get(i));
							recordingString=recordingString+"Pressure sensor 20 Recording "+i+": "+randomPressureArray20StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray21.size()-1; i++)
						{
							String randomPressureArray21StringValue=Integer.toString(randomPressureArray21.get(i));
							recordingString=recordingString+"Pressure sensor 21 Recording "+i+": "+randomPressureArray21StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray22.size()-1; i++)
						{
							String randomPressureArray22StringValue=Integer.toString(randomPressureArray22.get(i));
							recordingString=recordingString+"Pressure sensor 22 Recording "+i+": "+randomPressureArray22StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray23.size()-1; i++)
						{
							String randomPressureArray23StringValue=Integer.toString(randomPressureArray23.get(i));
							recordingString=recordingString+"Pressure sensor 23 Recording "+i+": "+randomPressureArray23StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
						for(int i=0; i<=randomPressureArray24.size()-1; i++)
						{
							String randomPressureArray24StringValue=Integer.toString(randomPressureArray24.get(i));
							recordingString=recordingString+"Pressure sensor 24 Recording "+i+": "+randomPressureArray24StringValue+" kPa\n";
							recordedValues.setText(recordingString);
						}
					}
					recordedValues.setBackground(new Color(10, 25, 54));	
					recordedValues.setForeground(Color.white);
					recordedValues.setEditable(false);
					recordedValuesScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
					recordedValuesScrollPane.setBounds(800, 185, 500, 476);	
					panelObject.add(recordedValuesScrollPane);
					panelObject.revalidate();
					showRecordingsLoadingLabel.setVisible(false);
				}
			}
		});
		clearRecordingsButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				recordingString=null;
				recordedValues.setText(recordingString);
				pressure1Reading.setText(" ");
				pressure2Reading.setText(" ");
				pressure3Reading.setText(" ");
				pressure4Reading.setText(" ");
				pressure5Reading.setText(" ");
				pressure6Reading.setText(" ");
				pressure7Reading.setText(" ");
				pressure8Reading.setText(" ");
				pressure9Reading.setText(" ");
				pressure10Reading.setText(" ");
				pressure11Reading.setText(" ");
				pressure12Reading.setText(" ");
				pressure13Reading.setText(" ");
				pressure14Reading.setText(" ");
				pressure15Reading.setText(" ");
				pressure16Reading.setText(" ");
				pressure17Reading.setText(" ");
				pressure18Reading.setText(" ");
				pressure19Reading.setText(" ");
				pressure20Reading.setText(" ");
				pressure21Reading.setText(" ");
				pressure22Reading.setText(" ");
				pressure23Reading.setText(" ");
				pressure24Reading.setText(" ");
				numberOfRecordingsValueLabel1.setText(" ");
				recordingNumber=0;
				dataCleared=true;
				//should empty the arraylists
				randomPressureArray1.clear();
				randomPressureArray2.clear();
				randomPressureArray3.clear();
				randomPressureArray4.clear();
				randomPressureArray5.clear();
				randomPressureArray6.clear();
				randomPressureArray7.clear();
				randomPressureArray8.clear();
				randomPressureArray9.clear();
				randomPressureArray10.clear();
				randomPressureArray11.clear();
				randomPressureArray12.clear();
				randomPressureArray13.clear();
				randomPressureArray14.clear();
				randomPressureArray15.clear();
				randomPressureArray16.clear();
				randomPressureArray17.clear();
				randomPressureArray18.clear();
				randomPressureArray19.clear();
				randomPressureArray20.clear();
				randomPressureArray21.clear();
				randomPressureArray22.clear();
				randomPressureArray23.clear();
				randomPressureArray24.clear();
			}
		});
	}
}

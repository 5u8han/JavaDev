import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.io.*;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javax.sound.sampled.*;

public class AudioRecorder extends Application
{
	private AudioFormat audioFormat;
  	private TargetDataLine targetDataLine;
  	
	@Override
    public void start(Stage primaryStage)
    {
    	Button startButton = new Button("Start");
    	Button stopButton = new Button("Stop");
    	startButton.setLayoutX(40);
    	startButton.setLayoutY(40);
    	startButton.setDisable(false);
    	stopButton.setLayoutX(100);
    	stopButton.setLayoutY(40);
    	stopButton.setDisable(true);
    	
    	startButton.setOnAction((ActionEvent e) -> 
      {
    		//write code here
         stopButton.setDisable(false);
         startButton.setDisable(true); 
         recordAudio();   
    	}); 
    	
    	stopButton.setOnAction((ActionEvent e) -> 
      {
    		//write code here
         startButton.setDisable(false);
         stopButton.setDisable(true);
         targetDataLine.stop();
         targetDataLine.close();
    	}); 
    	
    	Pane pane = new Pane();
    	Text text = new Text(20, 20, "Microphone recorder");
    	pane.getChildren().addAll(text, startButton, stopButton);
    	
    	Scene scene = new Scene(pane, 300, 100);
    	primaryStage.setTitle("Audio Recorder");
    	primaryStage.setScene(scene);
    	primaryStage.show();
    	
    	primaryStage.setOnCloseRequest((WindowEvent e) -> {
        	Platform.exit();
	   });	
   }
    
   private void recordAudio()
   {
      AudioFormat audioFormat = new AudioFormat(8000.0F, 16, 1,true,false);
      AudioFormat af = new AudioFormat(float sampleRate, int sampleSizeInBits, int channels, boolean signed, boolean bigEndian);
      DataLine.Info dataLineInfo = new DataLine.Info(TargetDataLine.class, audioFormat);
      
      try
      {
         targetDataLine = (TargetDataLine) AudioSystem.getLine(dataLineInfo);
      }catch(Exception e)
      {
         e.printStackTrace();
         System.exit(0);
      }
      RecordingThread recordingThread = new RecordingThread();
      recordingThread.start();
   }
      
  	
  	protected class RecordingThread extends Thread 
  	{
  		@Override
  		public void run()
  	  {
         AudioFormat audioFormat = new AudioFormat(8000.0F, 16, 1,true,false);
    		AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;
         File f = new File("MyRecording.wav");
         try
        {
            targetDataLine.open(audioFormat);
            targetDataLine.start();
            AudioInputStream audioInputStram = new AudioInputStream(targetDataLine);
            AudioSystem.write(audioInputStram, fileType, f);
            
		   }
          catch (LineUnavailableException lue) 
            {
            lue.printStackTrace();    
             }
             
             catch (IOException ioe) 
        {
            ioe.printStackTrace();
            
        }
      }  
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
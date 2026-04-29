package AudioPlayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Main{
	
	public static void main(String[] args) throws FileNotFoundException, UnsupportedAudioFileException, IOException, LineUnavailableException{
		
		Scanner scanner = new Scanner(System.in);
		
		File file = new File("src/AudioPlayer/retro_beat.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		String response = "";
		
		while(!response.equals("Q")){
			System.out.println("P for Play, S for Stop, R for Reset, Q for Quit");
			System.out.print("Enter your choice: ");
			
			response = scanner.next();				;
			response = response.toUpperCase();
			
			switch(response) {
			case ("P"): clip.start();
			break;
			case ("S"): clip.stop();
			break;
			case ("R"): clip.setMicrosecondPosition(0);
			break;
			case ("Q"): clip.close();
			break;
			default: System.out.println("This is not a valid response");
			}
				
		}
		System.out.println("Byeee!");
	}
}
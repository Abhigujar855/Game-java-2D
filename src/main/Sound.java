package main;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
    
	Clip clip;
	URL soundURL[] = new URL[30];
	
	public Sound() {
		
		soundURL[0] = getClass().getResource("/sound/BlueBoyAdventure.wav");
		soundURL[1] = getClass().getResource("/sound/coin.wav");
		soundURL[2] = getClass().getResource("/sound/powerup.wav");
		soundURL[3] = getClass().getResource("/sound/unlock.wav");
		soundURL[4] = getClass().getResource("/sound/fanfare.wav");

	}
	
	public void setFile(int i) {
		
		try {
			//this is like a format to open an audio file in java
			AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
			
		}catch(Exception e) {
			
		}
	}
	// start the sound 
	public void play() {
		
		clip.start();
	}
	// continuously play the sound
	public void loop() {
		
		clip.loop(clip.LOOP_CONTINUOUSLY);
	}
	// stop the sound
	public void stop() {
		
		clip.stop();
	}
}

package main;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import logic.Track;

/**
 * This class exists only for testing purposes. It will be deleted later on.
 * @author MichalBoron
 *
 */
public class TempPlayer implements Runnable {

	private Thread t;
	
	TempPlayer() {
		
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		File wavFile = null;
		AudioInputStream stream = null;
		AudioFormat format = null;
		DataLine.Info info = null;
		Clip clip = null;
		
		wavFile = new File("applause.wav");
		try {
			stream = AudioSystem.getAudioInputStream(wavFile);
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		format = stream.getFormat();
		info = new DataLine.Info(Clip.class, format);
		try {
			clip = (Clip)AudioSystem.getLine(info);
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//clip.start();
		Track track;
		track = new Track(stream, clip);
		track.playTrack();
		System.out.println(track.getTrackLength());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("bbb");
		track.stopTrack();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		track.playTrack();
	}


	
}

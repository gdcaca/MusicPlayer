package fileLoading;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class WavLoader implements FileLoader {

	@Override
	public Track loadFile(String path) {
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
		
		return track;
	}

}

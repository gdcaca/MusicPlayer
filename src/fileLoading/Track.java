package fileLoading;

import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;

/**
 * Handler to one song. Enables playing, stopping, pausing
 * operations, as well as dispatching informations about song
 * length etc.
 * 
 * @author MichalBoron
 *
 */
public class Track {

	private Clip clip;
	
	public Track(AudioInputStream stream, Clip clip) {
		this.clip = clip;
		
		try {
			this.clip.open(stream);
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Starts/resumes track. 
	 */
	public void playTrack() {
		clip.start();
	}
	
	/**
	 * Pauses the track. To resume call playTrack(). 
	 */
	public void pauseTrack() {
		clip.stop();
	}
	
	/**
	 * Stops the track and rewinds it to beggining.
	 */
	public void stopTrack() {
		clip.stop();
		clip.setFramePosition(0);
	}
	
	/**
	 * @return track length in seconds
	 */
	public double getTrackLength() {
		return clip.getMicrosecondLength() / 1000000.0;
	}
	
	/**
	 * @return current position in seconds
	 */
	public double getCurrentPosition() {
		return clip.getMicrosecondPosition() / 1000000.0;
	}
	
	/**
	 * Rewinds track to given time.
	 * @param seconds - new position at which track should be played.
	 */
	public void setPosition(int seconds) {
		clip.setMicrosecondPosition(seconds * 1000000);
	}
}

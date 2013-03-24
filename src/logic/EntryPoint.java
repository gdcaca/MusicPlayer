package logic;

import fileLoading.Track;
import fileLoading.TrackBuilder;
import gui.Chooser;

/**
 * This is the entry point of whole application.
 * 
 * @author MichalBoron
 *
 */
public class EntryPoint {

	public static void main(String[] args) {

		Player player = new Player();
		Chooser chooser = new Chooser();
		
		TrackBuilder trackBuilder = new TrackBuilder();
		Track currentTrack = trackBuilder.getWavTrack("applause.wav");
		currentTrack.playTrack();
	}

}

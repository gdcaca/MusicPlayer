package logic;

import java.util.ArrayList;

import fileLoading.Track;

/**
 * List of tracks.
 * 
 * @author MichalBoron
 *
 */
public class Playlist {

	ArrayList<Track> trackList;
	int currentTrackIndex;
	
	public void removeTrack(int index) {}
	public void addTrack(Track track) {}
	
	/**
	 * Sets current track to one indexed by index.
	 *  
	 * @return new current track
	 */
	public Track getTrackByIndex(int index) {
		return null;
	}
	
	public Track getCurrentTrack() { return null; }
	public Track nextTrack() {	return null;	}
	public Track previousTrack() {	return null;	}
	
	public ArrayList<Track> getTrackList() { return null; }
	
}

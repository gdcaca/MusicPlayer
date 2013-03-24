package fileLoading;


public class TrackBuilder {

	/**
	 * Simplifies creating new tracks.
	 * 
	 * @param args
	 */

	public Track getWavTrack(String path){
		WavLoader wavLoader = new WavLoader();
		return wavLoader.loadFile(path);
	}
}

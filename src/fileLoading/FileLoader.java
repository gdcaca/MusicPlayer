package fileLoading;

import logic.Track;

public interface FileLoader {

	/**
	 * 
	 * @param path - path to file, which will be loaded
	 */
	Track loadFile(String path);
	
}

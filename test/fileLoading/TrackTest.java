package fileLoading;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrackTest {

	TrackBuilder trackBuilder = new TrackBuilder();
	
	@Test
	public void trackLength() {
		Track track = trackBuilder.getWavTrack("applause.wav");
		assertEquals(8.04, track.getTrackLength(), 0.1);
	}
	
	@Test
	public void trackPos() {
		Track track = trackBuilder.getWavTrack("applause.wav");
		assertEquals(0, track.getCurrentPosition(), 0.1);
		
		track.playTrack();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertEquals(1, track.getCurrentPosition(), 0.3);
		
		track.pauseTrack();
		assertEquals(1, track.getCurrentPosition(), 0.3);
		
		track.stopTrack();
		assertEquals(0, track.getCurrentPosition(), 0.3);
	}

}

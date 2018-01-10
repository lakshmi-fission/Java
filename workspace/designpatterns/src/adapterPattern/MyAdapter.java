package adapterPattern;

public class MyAdapter implements MediaPlayer{

	AdvancedAudioPlayer advAudioPlayer = new AdvancedAudioPlayer();
	@Override
	public void play(String type, String song) {
		if(type.equalsIgnoreCase("mp4")){
			advAudioPlayer.playVlc(song);
		}
		else if(type.equalsIgnoreCase("vlc")){
			advAudioPlayer.playVlc(song);
		}
		
	}

}

package adapterPattern;

public class AdvancedAudioPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String song) {
		System.out.println("this is the song:"+song);
		
	}

	@Override
	public void playMp4(String song) {
		System.out.println("this is the song:"+song);
		
	}

}

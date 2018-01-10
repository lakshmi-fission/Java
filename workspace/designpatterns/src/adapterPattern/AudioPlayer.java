package adapterPattern;

public class AudioPlayer implements MediaPlayer {

		public void  mp3Player(String song){
		System.out.println("this is the song:"+song);
	}
	@Override
	public void play(String type, String song) {
	
	if(("mp3").equalsIgnoreCase(type)){
		mp3Player(song);
	}
	else{
		MyAdapter adapter = new MyAdapter();
		adapter.play(type,song);
	}
	}

}

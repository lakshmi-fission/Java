package adapterPattern;

public class AdapterPatternDemo {
public static void main(String args[]){
	AudioPlayer audioPlayer = new AudioPlayer();
	audioPlayer.play("mp3","mp3 song");
	audioPlayer.play("vlc","vlc song");
	audioPlayer.play("mp4","mp4 song");
}
}

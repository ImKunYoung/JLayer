
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;
/*
 * @author ur2ku
*/
public class MP3Player extends Thread {
	private final String mp3FileToPlay;
	private Player jlPlayer;
	// constructor
	public MP3Player(String mp3FileToPlay) {this.mp3FileToPlay = mp3FileToPlay;}
	public void play() {
		try {
			FileInputStream fileInputStream=new FileInputStream(mp3FileToPlay);
			BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
			jlPlayer = new Player(bufferedInputStream);
		} catch (Exception e) {System.out.println(e.getMessage());}
		this.start();
	}
	public void run() {
		try {jlPlayer.play();} catch(Exception e) {e.printStackTrace();}
	}
	public void close() {if(jlPlayer!=null) jlPlayer.close();}
}


/*
 * @author ur2ku
*/
public class MMain {
    public static void main(String[] args) {
        String filename = "data/file_example_MP3_700KB.mp3";
        MP3Player mp3Player = new MP3Player(filename);
        mp3Player.play();
    }
}

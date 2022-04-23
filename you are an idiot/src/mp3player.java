import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class mp3player extends Thread{
	@Override
	public void run()
	{
		try {
			PlayMp3();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void PlayMp3() throws FileNotFoundException, JavaLayerException {
		FileInputStream fileInputStream = new FileInputStream("youareanidiot.mp3");
		Player player = new Player(fileInputStream);
		player.play();
}

}

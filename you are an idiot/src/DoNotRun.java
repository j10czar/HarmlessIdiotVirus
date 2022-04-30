
import java.util.Random;


public class DoNotRun{

	public static void main(String[] args) throws InterruptedException{

			System.out.println("x out any window to stop the payload");
			Thread.sleep(2000);
			Random rand = new Random();
			mp3player player = new mp3player();
			player.start();
			new popup(400, 400);
			Thread.sleep(10000);



			for(int i = 0; i < 10; i++)
			{
				new popup(rand.nextInt(1500),rand.nextInt(1500));
				Thread.sleep(3000);
			}
			
			
			for(int i =0; i<17; i++)
			{
				mp3player temp = new mp3player();
				temp.start();
				new popup(rand.nextInt(1500),rand.nextInt(1500));
				Thread.sleep(1000);
				new popup(rand.nextInt(1500),rand.nextInt(1500));
				Thread.sleep(1000);
			}
			for(int i = 0; i < 10; i++)
			{
				mp3player temp = new mp3player();
				temp.start();
				new popup(rand.nextInt(1500),rand.nextInt(1500));
				Thread.sleep(500); //start mp3
			}
			imSoSorry();
			Thread.sleep(5000);
			System.out.println("lol");
			System.exit(0);


	}	
	

	
	public static void imSoSorry() throws InterruptedException
	{
		Random rand = new Random();
		//start mp3
		popup[] popups = new popup[50];
		for(int i =0; i<popups.length;i++)
		{
			popups[i] = new popup(rand.nextInt(2000),rand.nextInt(2000)); 
			popups[i].start();
			Thread.sleep(500);
		}
		
	}
}

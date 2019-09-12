package multithread;

public class FirstThread extends Thread {
		
	public void run()
	{
		
		try
		{
			System.out.println("First thread started...");
			while(true)
			{
				synchronized(MainThread.RandomValue)
				{
					if(MainThread.RandomValue>=100)
					{
						System.out.println("Value is greater than or equal to hundred");
						System.out.println("Answer="+(MainThread.RandomValue+10));
						MainThread.RandomValue=-1;
					}
				}
			
				Thread.sleep(100);
			}
		}catch(InterruptedException ex)
		{
			System.out.println("Error:"+ex);
		}
		
	}
}

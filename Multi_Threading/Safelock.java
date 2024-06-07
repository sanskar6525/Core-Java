package Multi_Threading;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;

public class Safelock {
	static class Friend {
		private final String name;
		private final Lock lock=new ReentrantLock();
		
		public Friend(String s)
		{
			this.name=s;
		}
		
		public String getName()
		{
			return this.name;
		}
		
		public boolean impendingBow(Friend bower)
		{
			Boolean myLock=false;
			Boolean yourLock=false;
			try {
				myLock=lock.tryLock();
				yourLock=bower.lock.tryLock();
			}
			finally {
				if(!(myLock && yourLock)) {
					if(myLock) {
						lock.unlock();
					}
					if(yourLock) {
						bower.lock.unlock();
					}
				}
			}
			return myLock && yourLock;
		}
		
		public void bow(Friend bower)
		{
			if(impendingBow(bower)) {
				try {
					System.out.format("%s: %s has"+" bowed to me !%n" ,
							this.name, bower.getName());
					bower.bowBack(this);
				}
				finally {
					lock.unlock();
					bower.lock.unlock();
				}
			}
			else {
				System.out.format("%s: %s started" +" to bow to me, but saw that"+" I was already bowing to"+" him.%n",
						this.name, bower.getName());
			}
		}
		
		public void bowBack(Friend bower)
		{
			System.out.format("%s: %s has"+" bowed back to me!%n",
					this.name, bower.getName());
		} 
	}
	
	static class BowLoop extends Thread{
		private Friend bower;
		private Friend bowee;
		
		public BowLoop(Friend bower, Friend bowee)
		{
			this.bower=bower;
			this.bowee=bowee;
		}
		
		public void run()
		{
			Random random=new Random();
			for(int i =0;i<4;i++)
			{
				try {
					Thread.sleep(random.nextInt(10));
				}
				catch(InterruptedException e) {}
				bowee.bow(bower);
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args)
	{
		final Friend Rahul=new Friend("Rahul");
		final Friend Daksh=new Friend("Daksh");
		new BowLoop(Rahul,Daksh).start();
		new BowLoop(Daksh,Rahul).start();
	}
}
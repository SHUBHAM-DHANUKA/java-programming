import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author techie-monk
 *
 */
class ScheduledTaskExample {
	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	public void startScheduleTask() {
		@SuppressWarnings("unused")
		final ScheduledFuture<?> taskHandle = scheduler.scheduleAtFixedRate(
				new Runnable() {
					@Override
					public void run() {
						try {
							Automatedtask();
						}catch(Exception ex) {
							ex.printStackTrace(); //or loggger would be better
						}
					}
				}, 0, 10, TimeUnit.SECONDS);
	}

	public void Automatedtask() {

		// write your script here 
		System.out.println("Working ");
		try {
			Process proc = Runtime.getRuntime().exec("/home/techie-monk/eclipse-workspace/NetworkLoadBalancer/listening.sh"); //Whatever you want to execute
			try {
				proc.waitFor();
			}catch (InterruptedException e) {
				System.out.println(e.getMessage());
			     }

		}catch (IOException e) {
			System.out.println(e.getMessage());
			}
	 }


}
public class Scripter {
	public static void main(String[] args) {
		ScheduledTaskExample ste = new ScheduledTaskExample();
		ste.startScheduleTask();
	}
}
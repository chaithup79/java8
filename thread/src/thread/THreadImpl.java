package thread;

public class THreadImpl extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		THreadImpl thimpl = new THreadImpl();
//		Thread thread=new Thread();
//		thread.start();
		thimpl.setName("hehe");
		thimpl.setPriority(1);
		thimpl.start();
		System.out.println(Thread.currentThread().getName());
	}
}

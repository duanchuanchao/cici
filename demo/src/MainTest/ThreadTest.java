package MainTest;

public class ThreadTest extends Thread {
	
	public void run(){
		for(int i =0;i<100;i++){
			if(i%10==0){
				System.out.println("--------"+i);
			}
			System.out.print(i);
            try {
                Thread.sleep(i);
                System.out.print("    线程睡眠1毫秒！\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
		}
	}
	
	public static void main(String[] args){
		new ThreadTest().start();
	}

}

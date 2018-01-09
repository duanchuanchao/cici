package MainTest;

public class NumberTest {
	
	public static void main(String[] args){
		int n = 1;
		for(int i=1;i<101;i++){
			if(i%3 == 0){
				System.out.println("第"+n+"个数： "+i);
				n++;
				while(n==6)
				{
					System.out.println("第"+n+"个数： "+i);
					break;
				}
//				if(n == 6){
//					break;
//				}
			}
		}
		
	}

}

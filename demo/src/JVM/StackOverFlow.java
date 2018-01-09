package JVM;

/**
 * @Described：栈层级不足探究
 * @VM args:-Xss128k -XX:+PrintGCDetails
 * @author duanchuanchao1
 */

public class StackOverFlow {
	
	 private int i ;

	    public void plus() {
	       i++;
	       plus();
	    }
	    /**
	     * @param args
	     * @author duanchuanchao1
	     */
	    public static void main(String[] args) {
	       StackOverFlow stackOverFlow = new StackOverFlow();
	       try {
	           stackOverFlow.plus();
	       } catch (Exception e) {
	           System.out.println("Exception:stack length:"+stackOverFlow.i);
	           e.printStackTrace();
	       } catch (Error e) {
	           System.out.println("Error:stack length:"+stackOverFlow.i);
	           e.printStackTrace();
	       }
	    }
}

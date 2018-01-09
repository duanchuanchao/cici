package MainTest;

public class StringTest {
	
	public  static void main(String[] args){
	  Long d = 12344l;
	  String c = d.toString();
	  c.charAt(2);
	  String e = "123124";
	  System.out.println("1 "+c.compareTo(e));
	  System.out.println("2 "+c.hashCode());
	  System.out.println("3 "+c.equals(e));
	  System.out.println("4 "+c.endsWith(e));
	  System.out.println("5 "+c.indexOf(3));
	  System.out.println("6 "+c.replace("haha", "heihei"));
	  System.out.println("7 "+c.getBytes());
	  System.out.println("8 "+c.getClass());
//	  System.out.println(c.notify());
	  StringBuffer sb  = new StringBuffer();
	  StringBuilder sbr = new StringBuilder();
	}

}

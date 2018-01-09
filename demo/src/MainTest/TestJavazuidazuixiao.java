package MainTest;

public class TestJavazuidazuixiao{
	  public static void main(String args[]){
	    int i,min,max;
	    int A[]={12,14,36,75};
	    min=max=A[0];
	    System.out.print("数组A的元素包括：");
	    for(i=0;i<A.length;i++)   
	      {System.out.print(A[i]+"\t");
	       if(A[i]>max)
	         max=A[i];
	       if(A[i]<min)
	         min=A[i];
	       }
	System.out.println("\n"+"数组A的最大值是："+max) ;
	System.out.println("数组A的最小值是："+min) ;
	     
	}

	}
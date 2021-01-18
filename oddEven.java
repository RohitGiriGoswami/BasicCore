
public class oddEven {
	public static void main(String[] args) {
		
		/*int i=200;
		if(i%2==0) {
			System.out.println("number is even");
		}
		else
			System.out.println("number is odd"); */
		
		int[] a= {10,30,40,20,60,55,43,23,90,79};
		for(int i=0; i<a.length; i++) {
			
			if(a[i] %2==0) {
				System.out.println(" " +"number is even="+ a[i]);
			}else
				System.out.println("odd number="+ a[i]);
		}
	}

}

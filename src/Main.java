
public class Main {

	public static void main(String[] args) {
	
		LargeInt a= new LargeInt("999999999999999999999999999999","99999999999999999999999999999");
		long st = System.nanoTime();
		int[] d=a.multi();
		long et = System.nanoTime();
		System.out.println(a);
		System.out.print("In "+(et-st)/1000+" micro seconds, A*B: ");
		for(int i=0;i<d.length;i++){
			System.out.print(d[i]);
		}
	}

}


public class Main {

	public static void main(String[] args) {
	
		//LargeInt a= new LargeInt("999999999999999999999999999999","999999999999999999999999999999");
		//LargeInt a= new LargeInt("0522","0110"); //522*110 = 57420
		LargeInt a= new LargeInt("5224","1103");//5224 * 1103 = 5762072
		//LargeInt a= new LargeInt("6642","6532");//6642*6532 = 43385544
		//LargeInt a= new LargeInt("778953","658953");//778953*658953 = 513293416209
		long st = System.nanoTime();
		int[] d=a.multiDAC();
		long et = System.nanoTime();
		System.out.println(a);
		System.out.print("In "+(et-st)/1000+" micro seconds, A*B: ");
		for(int i=0;i<d.length;i++){
			System.out.print(d[i]);
		}
	}

}


public class Main {

	public static void main(String[] args) {
		
		//LargeInt a= new LargeInt("999999999999999999999999999999","999999999999999999999999999999");
		//LargeInt a= new LargeInt("522","110"); //522*110 = 57420
		//LargeInt a= new LargeInt("5224","1103");//5224 * 1103 = 5762072
		//LargeInt a= new LargeInt("6642","6532");//6642*6532 = 43385544
		//LargeInt a= new LargeInt("778953","658953");//778953*658953 = 513293416209
		//LargeInt a= new LargeInt("1000005000","0200200200");//778953*658953 = 513293416209
		LargeInt a= new LargeInt("9030","5");
		long st = System.nanoTime();
		int[] d=a.multi();
		long et = System.nanoTime();
		
		System.out.println("Solution by linear : ");
		System.out.println(a);
		System.out.print("In "+(et-st)/1000+" \u00B5s\nA*B = ");//\u00B5 is micro symbol doesn't show in console but it well show in GUI. now it shows '?'
		boolean startW0 = false;
		for(int i=0;i<d.length;i++){ // print the Solution
			if(d[i] == 0){
				if(startW0)
					System.out.print(d[i]);
			}
			else{
				startW0 = true;
				System.out.print(d[i]);
			}
		}
		
		st = System.nanoTime();
		d=a.multiDAC();
		et = System.nanoTime();
		System.out.println("\n\nSolution by divide and conquer : ");
		System.out.println(a);
		System.out.print("In "+(et-st)/1000+" \u00B5s\nA*B = ");//\u00B5 is micro symbol doesn't show in console but it well show in GUI. now it shows '?'
		startW0 = false;
		for(int i=0;i<d.length;i++){ // print the Solution
			if(d[i] == 0){
				if(startW0)
					System.out.print(d[i]);
			}
			else{
				startW0 = true;
				System.out.print(d[i]);
			}
		}
	}

}

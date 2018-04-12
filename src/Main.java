public class Main {
    LargeInt ald;
    public String A;
    public String B;
    public long timel;
    public long timed;
    public String d1;
    public String d2;
    public void setA(String A){
		this.A=A;
	}
	public void setB(String B){
		this.B=B;
	}
	
	public  void main() {
		
		//LargeInt a= new LargeInt("999999999999999999999999999999","999999999999999999999999999999");
		//LargeInt a= new LargeInt("522","110"); //522*110 = 57420
		//LargeInt a= new LargeInt("5224","1103");//5224 * 1103 = 5762072
		//LargeInt a= new LargeInt("6642","6532");//6642*6532 = 43385544
		//LargeInt a= new LargeInt("778953","658953");//778953*658953 = 513293416209
		//LargeInt a= new LargeInt("1000005000","0200200200");//778953*658953 = 513293416209
		//LargeInt a= new LargeInt("9030","5");
		LargeInt a=new LargeInt(A,B);
		
		long st = System.nanoTime();
		int[] d=a.multi();
		long et = System.nanoTime();
		timel=(et-st)/1000;
	
		boolean startW0 = false;
		String n="";
		for(int i=0;i<d.length;i++){ // print the Solution
			if(d[i] == 0){
				if(startW0){
					n+=n.valueOf(d[i]);
				}
			}
			else{
				startW0 = true;
				n+=n.valueOf(d[i]);
			}
		}
		d1=n;
		for(int i=0;i<50;i++){
			st = System.nanoTime();
			d=a.multiDAC();
			et = System.nanoTime();
			timed+=(et-st);
		}
		timed =timed/50000;
		startW0 = false;
		n="";
		for(int i=0;i<d.length;i++){ // print the Solution
			if(d[i] == 0){
				if(startW0){
					n+=n.valueOf(d[i]);
				}
			}
			else{
				startW0 = true;
				n+=n.valueOf(d[i]);
			}
		}
		d2=n;
			}
	public String getA(){
		return A;
		
	}
	public String getB(){
		return B;
	}
	public LargeInt getaLD(){
		return ald;
		
	}
	public long gettimeL(){
		return timel;
		
	}
	public long gettimeD(){
		return timed;
		
	}
	public String getd1(){
		return d1;
		
	}
	public String getd2(){
		return d2;
		
	}
	
}
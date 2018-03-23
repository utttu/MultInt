
public class LargeInt {

	private int[] a;
	private int[] b;
	
	public LargeInt(){
		a= new int[2];
		b= new int[2];
		a[0]=1;
		a[1]=1;
		b[0]=1;
		b[1]=1;
	}
	
	public LargeInt(int[] aa,int[] bb){
		a=aa;
		b=bb;
	}
	
	public LargeInt(String aa,String bb){
		a = new int[aa.length()];
		b= new int[bb.length()];
		for(int i=0;i<aa.length();i++){
			a[i]=Character.getNumericValue(aa.charAt(i));
		}
		for(int i=0;i<bb.length();i++){
			b[i]=Character.getNumericValue(bb.charAt(i));
		}
	}
	
	public void setA(int aa[]){
		a=aa;
	}
	
	public void setB(int bb[]){
		b=bb;
	}
	
	public void setA(String aa){
		a = new int[aa.length()];	
		for(int i=0;i<aa.length();i++){
			a[i]=Character.getNumericValue(aa.charAt(i));
		}

	}
	
	public void setB(String bb){
		b= new int[bb.length()];
		for(int i=0;i<bb.length();i++){
			b[i]=Character.getNumericValue(bb.charAt(i));
		}
	}
	
	public String getA(){
		String aa="";
		for(int i=0;i<a.length;i++)
			aa+=a[i];
		return aa;
	}
	
	public String getB(){
		String bb="";
		for(int i=0;i<b.length;i++)
			bb+=b[i];
		return bb;
	}
	
	public int[] getAa(){
		return a;
	}
	
	public int[] getBa(){
		return b;
	}
	
	public int[] multi(){
		int[] p = new int[a.length+b.length];
		int c=0;
		for(int i=0;i<p.length;i++){
			p[i]=0;
		}
		for(int i=b.length-1;i>=0;i--){
			c=0;
			for(int j=a.length-1;j>=0;j--){
				p[i+j]+= c + (a[j]*b[i]);
				c=p[i+j]/10;
				p[i+j]=p[i+j]%10;
			}
			if(i!=0)
				p[i-1]+=c;
			else
				p[p.length-1]+=c;
		}
	
			
			for(int i=p.length-1;i>0;i--){
				int t= p[i];
				p[i]=p[i-1];
				p[i-1]=t;
			}
			
		
		
		return p;
	}
	
	public int[] multiDAC(){
		int[] result = new int[a.length+b.length];
		
		multiDAC(result,a,b,0,a.length-1,0,b.length-1);/// divide
		///////////////////////////////////////////////// &
		for(int i = result.length-1;i>0;i--){/////////// conquer
			if(result[i] >= 10){
				int X = result[i];
				result[i] = X % 10;
				result[i-1] += X / 10;
			}
		}
		return result;
	}
	
	private int[] multiDAC(int[] result,int[] A,int[] B,int startA,int endA,int startB,int endB){
		
		int offsetA =(endA-startA+1)%2;
		int offsetB =(endB-startB+1)%2;
		int Afloor = Math.floorDiv(endA+startA,2)-offsetA;
		int Aceil = (int)Math.ceil((endA+startA)/2.0);
		int Bfloor = Math.floorDiv(endB+startB,2)-offsetB;
		int Bceil = (int)Math.ceil((endB+startB)/2.0);
		
		if(startA == endA ){
			if(startB == endB){ // ^AA ^BB
				int X = A[startA]*B[startB];
				result[startA+startB+1] += X;
			}
			else{ // ^AA !BB
				multiDAC(result,A,B,startA,endA,startB,Bfloor);
				multiDAC(result,A,B,startA,endA,Bceil,endB);
			}
		}
		else{
			if(startB == endB){ // !AA ^BB
				multiDAC(result,A,B,startA,Afloor,startB,endB);
				multiDAC(result,A,B,Aceil,endA,startB,endB);
			}
			else{ // !AA !BB
				multiDAC(result,A,B,startA,Afloor,startB,Bfloor);
				multiDAC(result,A,B,startA,Afloor,Bceil,endB);
				multiDAC(result,A,B,Aceil,endA,startB,Bfloor);
				multiDAC(result,A,B,Aceil,endA,Bceil,endB);
			}
			
		}
		
		return result;
	}
	
	public String toString(){
		String s ="A: ";
		s+=getA()+", B: "+getB();
		return s;
	}

}


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
	
	public String toString(){
		String s ="A: ";
		s+=getA()+", B: "+getB();
		return s;
	}

}

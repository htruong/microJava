public class Test {

	public static void main(){
		int num=10;
		for(int curcount=2,i=0;i<num;curcount++){
			if(isPrime(curcount)){
				UC.logln(curcount);
				i++;
			} 
		}
		// The UC.logln bridges from the native interface that is implemented in pc_main
		// to the UC class that is implemnted in BUILDENV/fake whatever that is.
	}

	static boolean isPrime(int n){
		for(int i=2;i<n;i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
}

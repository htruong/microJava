public class Test {

	public static void main(){
		int i;
		i = 0;
		// This bridges from the native interface that is implemented in pc_main.c
		// to the UC class that is implemnted in BUILDENV/fake whatever that is.
		UC.logln(i);	
	}
}

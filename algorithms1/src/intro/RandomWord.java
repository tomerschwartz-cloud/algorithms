package intro;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;

public class RandomWord {
	public static void main(String[] argv) {
		String champion = "";
		int i = 1;
		
		while(!StdIn.isEmpty()) {
			if(StdRandom.bernoulli(1.0/(i++))) {
				champion = StdIn.readString();
			}
			else{
				StdIn.readString();
			}
		}
		StdOut.println(champion);
	}
}

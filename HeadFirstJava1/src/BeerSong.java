import java.io.InputStream;
import java.util.Scanner;

public class BeerSong {

	public static void main(String[] args) {
		int beerNum =10;
		String word = "bottles";

		while (beerNum > 0) {

			if (beerNum == 1)
				word = "bottle";

			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer");
			System.out.println("take one down");
			System.out.println("pass it around");
			System.out.println();
			beerNum = beerNum - 1;
			;
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall");
			} else {
				System.out.println("go home you're drunk");
			}
		}
	}
}
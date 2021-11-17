package unit11;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Task02 {
	public static String generateRandomCard() {
		char[] ranks = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'J', 'Q', 'K'};
		char[] suits = {'♣', '♦', '♥', '♠'};
		Random random = ThreadLocalRandom.current();
		
		return Character.toString(ranks[random.nextInt(ranks.length)]) + Character.toString(suits[random.nextInt(suits.length)]);
	}
	
	public static boolean linearSearch(String[] array, String e) {
		for (int i = 0; i < array.length; i++) {
			if (e == array[i]) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		String[] cards = new String[4];
		String card;
		for (int i = 0; i < 4; i++) {
			do {
				card = generateRandomCard();
			}
			while (linearSearch(cards, card));
			cards[i] = card;
		}
		
		System.out.print("{");
		for(int i = 0; i < cards.length; i++) {
			System.out.print((i!=(cards.length-1))? String.format("%s, ", cards[i]) : String.format("%s}\n", cards[i]));
		}
	}
}

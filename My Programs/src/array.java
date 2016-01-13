public class array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] someDigitsOfPi = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };
		// int[] someDigitsOfE = new int[4];
		// someDigitsOfE[0] = 2;
		// someDigitsOfE[1] = 7;
		// someDigitsOfE[0] = 1;
		// someDigitsOfE[1] = 8;
		//
		// System.out.println("The number of digits of pi we have is "
		// + someDigitsOfPi.length);
		// System.out.println("The number of digits of E we have is "
		// + someDigitsOfE.length);
		//
		// long startTime = System.currentTimeMillis();
		// int[] randomArray1 = generateRandomArray(1000);
		// printArrayContent(randomArray1);
		// long endTime = System.currentTimeMillis();
		//
		// System.out.println(endTime - startTime + "ms");
		//
		// makeCards();

		countPrimes(10);

	}

	public static void printArrayContent(boolean[] array) {
		String arrayContent = "[";
		for (int index = 0; index < array.length; index++) {
			arrayContent = arrayContent + array[index] + ", ";
		}

		arrayContent = arrayContent + "]";
		System.out.println(arrayContent);

	}

	public static int[] generateRandomArray(int arrayLength) {
		int[] array = new int[arrayLength];

		for (int index = 0; index < arrayLength; index++) {
			array[index] = index + 1;

		}

		return array;
	}

	public static void makeCards() {
		String[] suits = { "Hearts", "Diamond", "Club", "Spades" };
		String[] cards = { "Ace", "Two", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		String[] allCards = new String[52];

		for (int index = 0; index < suits.length; index++) {
			for (int indexx = 0; indexx < cards.length; indexx++) {
				String card = cards[indexx] + " of " + suits[index];
				System.out.println(card);
			}
		}

	}

	public static void swap(String[] deck, int a, int b) {
		String placeholder = deck[a];
		deck[a] = deck[b];
		deck[b] = placeholder;

	}

	public static void shuffle(String[] deck) {
		int swapCard = (int) Math.random() * deck.length;

		for (int index = 0; index < deck.length; index++) {
			swap(deck, index, swapCard);
		}

		System.out.println(deck);
	}

	public static void countPrimes(int max) {
		boolean[] theNumbers = new boolean[max + 1];
		for (int index = 2; index < theNumbers.length; index++) {
			theNumbers[index] = true;
		}
		for (int index = 2; index < theNumbers.length; index++) {
			if (theNumbers[index]) {
				for (int multipleIndex = index + index; multipleIndex < theNumbers.length; multipleIndex+=index) {
					theNumbers[multipleIndex]=false;
				}
			}
		}
		String statement = "";
		int count = 0;
		for(int index = 0; index < theNumbers.length; index++){
			if(theNumbers[index]){
				count++;
				statement+= " " + index + ",";
				
			}
		}
		
		statement += "\n There are " + count + " primes between 1 and " + max + ".";
		System.out.println(statement);
	}
	
}


public class array2d {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] grid3x3 = new int[3][3];
//		printArrayContent(grid3x3[0]);
//		printArrayContent(grid3x3[1]);
//		printArrayContent(grid3x3[2]);
		
		grid3x3[1][0] = 1;
		
		print2DArrayContent(grid3x3);

	}
	
	public static void printArrayContent(double[] array) {
		String arrayContent = "[";
		for (int index = 0; index < array.length; index++) {
			arrayContent = arrayContent + array[index] + ", ";
		}

		arrayContent = arrayContent + "]";
		System.out.println(arrayContent);

	}
	
	public static void print2DArrayContent(int[][] array){
		for (int [] x: array){
			printArrayContent(x);
		}
	}
	
	public static void checkAdjacentValues(){
		boolean[][] mines = new boolean[3][3];
		mines [2][1] = true;
		int row = getRandomInt(2);
		int column = getRandomInt(2);
		int typeOfSpace = checkSpace( );
		
		if (typeOfSpace==0){
			System.out.println("At row " + row + ", " + column +"column, the mine was found!");
			
		}
		
		if (typeofSpace==1){
			System.out.println("At row " + row + ", " + column +"column, there is a mine nearby!");
			
		}
		
		else{
			System.out.println("At row " + row + ", " + column +"column, there are no mines nearby!");
		}
	}
	
	public static int getRandomInt(int max){
		int random = (int)(Math.random()*max)+1;
		return random;
	}
	
	public static int checkSpace(int[][] array, int row, int column){
		if (array[row + 1][column] == 1){
		System.out.println("bingo");
		}
		
		return 
		
	}

}

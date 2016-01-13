
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] myIntArray = {6,2,1};
		 System.out.println(isSorted(myIntArray));

	}
	
	 public static boolean isSorted(int[] array){
	        /**
	         * This method takes an in array as a parameter and returns 'true' if the array is already sorted in DESCENDING order
	         * */
		 
		 for(int i = 0; i < array.length; i++){
    		 for(int j = i+1; j < array.length; j++){
    			 if(array[i] < array[j]){
    				 return false;
    			 }	 
    		 }
    	 }
	       return true;
	    }
	
}	
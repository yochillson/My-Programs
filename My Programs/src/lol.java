
public class lol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        boolean[][] neighborhood = new boolean[3][3]; //create boolean array
        neighborhood[1][1] = true; // set 2nd row 2nd column to 1;
        int checkNeighborhood = checkNeighbors(neighborhood,1,1);
        System.out.println(checkNeighborhood);
       
        }

    
    
    public static int checkNeighbors(boolean[][] neighborhood, int r, int c){
    	 if(neighborhood[r][c] = true){
            
         } 
         
         if (neighborhood[r][c+1] = true){
        	 
         }
    	//If neighborhood[r][c] is adjacent (above, below, right, left) of a true value, return 1. If neighborhood is not adjacent to a true value, return -1.
        //return zero if IS a true value
        
    }

}

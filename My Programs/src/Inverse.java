
public class Inverse {

    public static void main(String[] args) {
    	double[] test = {1.2, 3.4}; 
        array2d.printArrayContent(getInverses(test));
    }
    
   public static double[] getInverses(double[] values){
		double[] inverse = new double[values.length];
		
		for(int index = 0; index < values.length; index++){
			if(values[index] != 0){
				inverse[index] = 1/(values[index]); 
			}
			else{
				inverse[index] = 0;
			}
		}
		
		return inverse;
	}
    
}
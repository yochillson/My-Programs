
public class testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(assignLetterGrade(.63));
	}
	

    public static String assignLetterGrade(double grade){
        /** This method assigns a letter grade based on a percetage, in decimal form
         * Grades, g,  are assigned accordingly:
         * .97 <= g <= 1.0 = A+
         * .94 <= g < .97 = A
         * .90 <= g < .94 = A-
         * .87 <= g < .90 = B+
         * .84 <= g < .87 = B
         * .80 <= g < .84 = B-
         * .77 <= g < .80 = C+
         * .74 <= g < .77 = C
         * .70 <= g < .74 = C-
         * .60 <= g < .70 = D
         * g <= .64  = F
         * */
         
         if(grade<=1.0 && grade>=.97) return "A+";
         if(grade<.97 && grade>=.94) return "A";
         if(grade<.94 && grade>=.97) return "A-";
         if(grade<.90 && grade>=.87) return "B+";
         if(grade<.87 && grade>=.84) return "B";
         if(grade<.84 && grade>=.80) return "B-";
         if(grade<.80 && grade>=.77) return "C+";
         if(grade<.77 && grade>=.74) return "C";
         if(grade<.74 && grade>=.70) return "C-";
         if(grade<.70 && grade>.60) return "D";
         else return "F";
    }

}

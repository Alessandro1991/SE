package ch.hfict.math;
public class statisticsMain{
    public static void main(String [] args){
	statistics s = new statistics();
	s.addNumbers(3.4);
	s.addNumbers(6.7);
	s.addNumbers(2.1);
	s.addNumbers(19.4);
	s.printValues();
	System.out.println("AVG: " + s.getAverage());
    }
    
}


//
//String s="123";
//double d = Double.parseDouble(s);
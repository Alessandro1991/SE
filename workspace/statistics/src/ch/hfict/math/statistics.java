package ch.hfict.math;

public class statistics{
    private java.util.ArrayList<Double> c = null;
    
    public statistics(){
    	c =  new java.util.ArrayList<Double>();	
    }
    
    public void addNumbers(double n){
    	c.add(n);
    }

    public void printValues(){
    	System.out.println("printValues():");
    	for (Double d : c) {
    		
    		System.out.println(d);
    	}
    	
    }


    public double getAverage(){
	double tmp = 0;
	java.util.Iterator<Double> itr = c.iterator();
	while(itr.hasNext()){
	    tmp += itr.next();
	}

	System.out.println("SUM(tmp): " + tmp);   //Nicht machen wenn methode get heisst amk!
	return tmp / c.size();
    }
    
  
	
}

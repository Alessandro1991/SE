package ch.hfict.math;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class StatisticsTest {

  public static void main(String[] args) throws FileNotFoundException  {
    Statistics stat = new Statistics();
 
    BufferedReader r = new BufferedReader(
        new FileReader("test.dat"));

    stat.readSplitString(r);
    
    System.out.println(stat.getAverage());
  }
}

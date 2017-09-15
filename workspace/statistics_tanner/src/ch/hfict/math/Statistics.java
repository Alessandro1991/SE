package ch.hfict.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Statistics {
  private List<Double> numbers = new ArrayList<Double>();

  public Statistics() {}

  public void addNumber(double n) {
    this.numbers.add(n);
  }

  public double getAverage() {
    double sum = 0;
    for (double d : this.numbers) {
      sum += d;
    }
    return sum / this.numbers.size();
  }

  public int read(BufferedReader r) {
    int from = 0;
    int last = 0;
    try {
      String line = r.readLine();
      while (last >= 0) {
        last = line.indexOf(' ', from);
        if (last > 0 || from < line.length()) {
          if (from > last) {
            numbers.add(new Double(line.substring(from)));
          } else {
            numbers.add(new Double(line.substring(from, last)));
          }
        }
        from = last + 1;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return numbers.size();
  }

  public int readSplitString(BufferedReader r) {
    try {
    String line = r.readLine();
    for (String n : line.split(" ")) {
      numbers.add(new Double(n));
    }
    }catch(IOException e) {
      e.printStackTrace();
    }
    return numbers.size();
  }
}

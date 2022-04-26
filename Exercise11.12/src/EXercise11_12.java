import java.util.*;
import java.util.ArrayList;

public class EXercise11_12 {

  public static void main(String[] args) {
    double sum, totalsum = 0.0;
    Scanner input = new Scanner(System.in);
    ArrayList<Double> list = new ArrayList<Double>();

    System.out.println("Please enter 5 numbers: ");
    for (int i = 0; i < 5; i++) {
      sum = input.nextDouble();
      totalsum = totalsum + sum;
      list.add(totalsum);
    }
    System.out.println("The sum = " + totalsum);
  }

  public static double sum(ArrayList<Double> list) {
    double sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i);
    }
    return sum;
  }
}
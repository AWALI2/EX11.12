import java.util.*;

public class EX11_12 {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();

		Scanner Num = new Scanner(System.in);
		System.out.print("Enter 5 numbers: ");
		
			for (int i = 0; i < 5; i++) 
		{
			list.add(Num.nextDouble());
			}
		System.out.println("Sum = " + sum(list));

		Num.close();
	}

		public static double sum(ArrayList<Double> list) {
			double sum = 0;
			ListIterator<Double> iterator = list.listIterator();
			while (iterator.hasNext()) {
			sum += iterator.next();
		}
		return sum;
	}

}
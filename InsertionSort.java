import java.util.ArrayList;


public class InsertionSort {

	
	public static void main(String[] args) {
	ArrayList<Double> data = new ArrayList<Double>();
	data.add(1.0);
	data.add(7.0);
	data.add(8.0);
	data.add(3.0);
	data.add(2.0);
	data.add(10.0);
	data.add(4.0);
	data.add(9.0);
	data.add(5.0);
	data.add(6.0);
			
	System.out.println("DATA : "+data.toString());
		
	ArrayList<Double> output = sort(data);
	
	System.out.println("HASIL SORTING : "+ output.toString());

	}

	private static ArrayList<Double> sort(ArrayList<Double> data) {
		for(int i=1;i<=data.size()-1;i++){
			double v = data.get(i);
			int j = i;
			while(j > 0 && data.get(j-1) > v){
				data.set(j, data.get(j-1));
				j--;
			}
				data.set(j, v);
				System.out.println("Step : -> "+i+ data.toString());
		}
			
			
		return data;
	}

}

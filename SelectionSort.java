import java.util.ArrayList;


public class SelectionSort {

	
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
	
	System.out.println("HASIL SORTING : " + output.toString());
	}

	private static ArrayList<Double> sort(ArrayList<Double> data) {
		int n = data.size();
		for (int i=0;i<n-1;i++){
			int min = i;
			for (int j=i+1;j<n;j++){
				if(data.get(j)<data.get(min)){
				min = j;
			
			}
		}
			if (min != i){
			Double tempData = data.get(i);
			data.set(i, data.get(min));
			data.set(min, tempData);
			
			}
		System.out.println("Step : -> "+data.toString());
		
		
		}
			return data;
	}
	
}

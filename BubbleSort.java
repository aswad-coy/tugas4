import java.util.ArrayList;


public class BubbleSort {

	
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
		int tukar = 1;
		for(int i = data.size()-1;i>=0 && data.size()-1>=tukar; i--){
			tukar = 0;
			for(int j=0;j<=i-1;j++){
				if(data.get(j)>data.get(j+1)){
					double temp =data.get(j);
					data.set(j, data.get(j+1));
					data.set(j+1, temp);
					tukar = 1;
				}
			}	
				
	System.out.println("Step : -> "+data.toString ());		
			
		}
			
	
		return data;
	}
}

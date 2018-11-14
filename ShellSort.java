import java.util.ArrayList;


public class ShellSort {

	
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
	
	System.out.println("HASIL SORTING : "+data.toString());
	}

	private static ArrayList<Double> sort(ArrayList<Double> data) {
		int i = 1, j;
		while(9*i < data.size()){
			i=3*i+1;
		}
		while(i>0){
			for(int k = i;k < data.size();k++){
				double l = data.get(k);
				j = k;
				while(j>=i && data.get(j-i)>l){
					data.set(j, data.get(j-i));
					j -= i;
				}
				data.set(j, l);
			
				}
			i/=3;
			}
		System.out.println("Step : -> "+data.toString());
		return data;
		
	}

}

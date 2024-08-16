package SeccionA;

public class Calculation {
	
	//Despues
	public static int findMax(int arr[]){
		if (arr.length == 0)
	        throw new IllegalArgumentException("Arreglo vacío");
	    int max = arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	
	//Antes
	/*
	public static int findMax(int arr[]){
		int max=0;
		for(int i=1;i<arr.length;i++){
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}*/
}





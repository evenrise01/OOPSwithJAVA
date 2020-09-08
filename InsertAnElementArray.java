import java.util.*; 
  

class ArrayInsertion{
	public static void main(String args []){
	
	
	int arr[] = new int[5];
	
	int i,j;
	Scanner item = new Scanner(System.in);
	
	for(i=0;i<5;i++){
		System.out.println("Enter the "+i+" number : ");
		int tmp = item.nextInt();
		arr[i] = tmp;
	}
	
	
	for (j = 0; j < 5; j++) 
         System.out.println("Element at index " + j + " : "+ arr[j]);           
    
	
	}
	
}

package one;

class Main {
	public static void main(String[] args)
	{
		Indeses test1 = new Indeses(); 
		int size2 = 6;
		int [] Arrxy2 = new int [size2];
		
		Arrxy2[0] = 10;
		Arrxy2[1] = 20;
		Arrxy2[2] = 30;
		Arrxy2[3] = 40;
		Arrxy2[4] = 50;
		Arrxy2[5] = 60;

		
		
		test1.calculate_combinations(Arrxy2,60); 
		
	}

}

class Indeses{
	
	public void calculate_combinations(int[] arrxy, int target){
	
		for(int a= 0; a < arrxy.length; a++) {
			if (arrxy[a] == target) {
				
				
				System.out.print(arrxy[a] );
		}
			
			
		}
	
		
	
			for(int j = 0; j < arrxy.length; j++) {
			
				for (int h = 0; h < arrxy.length; h++) {
			
				
						if (j == h) {
					
							continue; }
					
						
				
							
						
							else if (arrxy[j] + arrxy[h] == target) {
						
						
								System.out.print(arrxy[j] + " AND ");
								System.out.print(arrxy[h]);
								System.out.print("\r\n");
					}
						
						
					}
				}
			
		}
		
}

		
	
	
	


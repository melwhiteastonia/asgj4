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
	
	public void calculate_combinations(int[] arrxy, int target)
	
	{
		for( int i = 0; i < arrxy.length; i++) {
			
			for (int j = 0; j <arrxy.length; j++) {
			
				
					if (i == j) {
					
					continue; }
				
				
					else if (arrxy[i] + arrxy[j] == target) {
					
						System.out.print(arrxy[i] + " and ");
						System.out.print(arrxy[j]);
						System.out.print("\r\n");
					}
				}
				}
			}
		}
	
	
	


public class part1{
	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length;j++) {
    			matrix[i][j]=(int)(Math.random()*2);
    			System.out.print(matrix[i][j]+ " ");
    			}
    		System.out.println();
			
		}
		int maxR=0;
	    int maxC=0;
	    int row=0;
	    int column=0;
	    
	    for(int i=0; i<4;i++) {
	    	int tempR=0;
	    	for(int j=0; j<4; j++) {
	    		if(matrix[i][j]==1) 
	    			tempR++;
	    		}
	    	if(maxR<tempR) {
	    		maxR=tempR;
	    		row=i;
	    		}
	    	
	    }
	    for(int i=0; i<4; i++) {
	    	int tempC=0;
	    	for(int j=0; j<4;j++) {
	    		if(matrix[j][i]==1)
	    			tempC++;
	    		}
	    	if(maxC<tempC) {
	    		maxC=tempC;
	    		column=i;
	    		}
	    	}
	    System.out.println("Large row index is " + row);
	    System.out.println("Large column index is " + column);
	    }
    }
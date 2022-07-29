package ArrayMultiply;

public class ArrayMultiplyDemo {

	public static void main(String[] args) {
		int [][] x= {{6,2,9},{7,9,4},{1,0,5}};
		int [][] y= {{7,3,0},{5,3,9},{8,0,3}};
		int [][] multi = new int [3][3];
		int i,j;
		for(i=0;i<x.length;i++) {
			for(j=0;j<x[0].length;j++) {
				multi[i][j]=x[i][j]*y[i][j];
			}
		}
		System.out.println("The resulted Array is: ");
		for(i=0;i<x.length;i++) {
			for(j=0;j<x[0].length;j++) {
				System.out.format("%d \t", multi[i][j]);
			}
			System.out.println(" ");
		}
	}
}

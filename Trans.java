package com.vikki.pgm;

public class Trans {
	
	public static void main(String[] args) {
		
		int rows,cols;
		
		int a[][]= {
						{23,46,54},
						{33,26,34},
						{44,35,19}
					};
		
		rows=a.length;
		cols=a[1].length;
		
		System.out.println("Before transpose the given matrix is");
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(a[i][j] +" ");
				
			}
			System.out.println();
		}
		System.out.println();
		
		int tr[][]=new int[cols][rows];
		
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				tr[i][j]=a[j][i];
			}
		}
		
		System.out.println("After transpose the given matrix is");
		
		
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				System.out.print(tr[i][j] +" ");
				
			}
			System.out.println();
		}
		
	}

}

/**
 * 
 */
package dsa_learnings.BinarySearch;

import java.util.Arrays;

/**
 * @author Aritra
 *
 */
public class BinarySearch_SortedMatrix {
	
	public static void main(String[] args) {
		// Here matrix is sorted in column-wise and row-wise
		int [] [] matrix = {
				{10,20,30,40},
				{15,25,35,45},
				{28,29,37,49},
				{33,34,38,50}
		};
		
		int target =37;
		System.out.println("Searching Inside Column Wise and Row Wise Sorted Matrix: "+Arrays.toString(binarySearchMatrixRowColSorted(matrix, target)));
		
		int [][] matrix2= {
				{1,2,3,4,5,6},
				{7,8,9,10,11,12},
				{13,14,15,16,17,18},
				{19,20,21,22,23,24,25}
		};
		int target2=24;
		System.out.println("Searching Inside Sorted Matrix: "+Arrays.toString(search(matrix2, target2)));
	}
	
	public static int[] binarySearchMatrixRowColSorted(int [][] matrix, int target) {
		int row =0;
		int col = matrix.length-1; // if it is a n x m matrix then col will be m -1
		while(row<matrix.length && col>=0) {
			if(matrix[row][col]==target)
				return new int[] {row,col};
			else if(matrix[row][col]<target)
				row++; //if the target element is greater than the current element in the matrix then move on to the next row as all the numbers left to current number being lower than the current element, is less than the target, so move to the next row.
			else
				col--; //if the target element is lesser than the current element in the matrix then move to the previous col as all the numbers next to the current number in the column greater than the current number, is greater than the target, so move to the previous col.
		}
		return new int [] {-1,-1};
	}
	
	public static int[] binarySearchMatrix(int [][]matrix, int row, int cStart, int cEnd, int target) {
		while(cStart<=cEnd) {
			int mid = cStart+(cEnd-cStart)/2;
			if(matrix[row][mid]==target)
				return new int[] {row,mid};
			else if(target>matrix[row][mid])
				cStart=mid+1;
			else
				cEnd=mid-1;
		}
		return new int[] {-1,-1};
	}
	
	public static int[] search(int [][] matrix, int target) {
		int rows=matrix.length;
		int cols =matrix[0].length;
		
		if(rows==1) {
			return binarySearchMatrix(matrix,0,0,cols-1,target); //if there is only one row in the matrix
		}
		int rowStart=0;
		int rowEnd=rows-1;
		int colMid = cols/2; //to traverse inside every selected row....
		
		while(rowStart<(rowEnd-1)) {
			//this condition is kept true until two rows are left... because always at the end for last comparison only two items are left in this case only 2 columns
			int rowMid=rowStart+(rowEnd-rowStart)/2;
			if(matrix[rowMid][colMid]==target)
				return new int[] {rowMid,colMid};
			else if(matrix[rowMid][colMid]<target)
				rowStart=rowMid;
			else
				rowEnd=rowMid;
		}
		// now only two rows are left....
		if(matrix[rowStart][colMid]==target)
			return new int[] {rowStart,colMid}; //1st left-out row
		if(matrix[rowStart+1][colMid]==target)
			return new int[] {rowStart+1,colMid}; // 2nd left-out row
		
		
		if(target<=matrix[rowStart][colMid-1])
			return binarySearchMatrix(matrix,rowStart,0,colMid-1,target);//search in the left side of the 1st left-out row
		else if(target>=matrix[rowStart][colMid+1] && target<=matrix[rowStart][cols-1])
			return binarySearchMatrix(matrix,rowStart,colMid+1,cols-1,target);//search in the right side of the 1st left-out row
		else if(target<=matrix[rowStart+1][colMid-1])
			return binarySearchMatrix(matrix,rowStart+1,0,colMid-1,target);//search in the left side of the 2nd left-out row
		else
			return binarySearchMatrix(matrix,rowStart+1,colMid+1,cols-1,target);//search in the right side of the 2nd left-out row
	}
}


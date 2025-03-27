package DSA_Vault_2k25.src.LeetCode2k25;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Aritra
 * */
public class SetMatrixZero {
    public static void main(String[] args){

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        setMatrixZero2(matrix);
        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : matrix) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }


    }

    //Brute force approach...
    // we are converting the 0 element respective row and column to -1, because if we convert them 0 then it will make that 0's column and row also to 0, which will be an error.
    //Time Complexity: O((N*M)*(N + M)) + O(N*M), where N = no. of rows in the matrix and M = no. of columns in the matrix.
    //Reason: Firstly, we are traversing the matrix to find the cells with the value 0. It takes O(N*M). Now, whenever we find any such cell we mark that row and column with -1. This process takes O(N+M). So, combining this the whole process, finding and marking, takes O((N*M)*(N + M)).
    //Another O(N*M) is taken to mark all the cells with -1 as 0 finally.
    //
    //Space Complexity: O(1) as we are not using any extra space
    public static void setMatrixZero(ArrayList<ArrayList<Integer>> matrix){
        int rowCount = matrix.size();

        for(int i=0;i<rowCount;i++){ //for traversing in the rows
            for(int j =0;j<matrix.get(i).size();j++){ //for traversing in the columns
                if(matrix.get(i).get(j)==0){
                    setRow2Zero(matrix,i);
                    setColumn2Zero(matrix,j);

                }
            }
        }

        for(int i=0;i<rowCount;i++){
            for(int j=0;j<matrix.get(i).size();j++){
                if(matrix.get(i).get(j)==-1)
                    matrix.get(i).set(j,0);
            }
        }
    }

    //converting the value of each element of that respective row to -1
    public static void setRow2Zero(ArrayList<ArrayList<Integer>> matrix,int fixedRow){
        for(int i =0; i<matrix.get(fixedRow).size();i++){
            if(matrix.get(fixedRow).get(i)!=0){
                matrix.get(fixedRow).set(i,-1);
            }
        }
    }
    //converting the value of each element of that respective column to -1
    public static void setColumn2Zero(ArrayList<ArrayList<Integer>> matrix,int fixedColumn){
        for(int i =0; i<matrix.get(0).size();i++){
            if(matrix.get(i).get(fixedColumn)!=0){
                matrix.get(i).set(fixedColumn,-1);
            }
        }
    }

    // Better Approach:
    //Time Complexity: O(2*(N*M)), where N = no. of rows in the matrix and M = no. of columns in the matrix.
    //Reason: We are traversing the entire matrix 2 times and each traversal is taking O(N*M) time complexity.
    //
    //Space Complexity: O(N) + O(M), where N = no. of rows in the matrix and M = no. of columns in the matrix.
    //Reason: O(N) is for using the row array and O(M) is for using the col array.
    public static void setMatrixZero2(ArrayList<ArrayList<Integer>> matrix){
        int [] row = new int[matrix.size()];
        int [] col = new int[matrix.get(0).size()];

        for(int i =0;i<matrix.size();i++){
            for(int j=0;j<matrix.get(0).size();j++){
                if(matrix.get(i).get(j)==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if (row[i] == 1 || col[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }

        }
    }
}

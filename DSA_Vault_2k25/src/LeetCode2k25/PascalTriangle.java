package DSA_Vault_2k25.src.LeetCode2k25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        drawPascalTriangle2(n);

    }

    //Time Complexity: O(n2), where n = number of rows(given).
    public static void drawPascalTriangle(int n) {
        ArrayList<ArrayList<String>> matrix = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<String> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) { // First and last element of each row is 1
                    row.add("1");
                } else {
                    row.add(String.valueOf(Integer.parseInt(matrix.get(i - 1).get(j - 1)) + Integer.parseInt(matrix.get(i - 1).get(j))));
                }
            }

            matrix.add(row);
        }

        // Printing Pascal's Triangle
        for (ArrayList<String> row : matrix) {
            for (String rowElement : row) {
                System.out.print(rowElement + "\t");
            }
            System.out.println(" ");
        }
    }

    //Time Complexity: O(n2), where n = number of rows(given).
    //Reason: We are generating a row for each single row. The number of rows is n. And generating an entire row takes O(n) time complexity.
    //
    //Space Complexity: In this case, we are only using space to store the answer. That is why space complexity can still be considered as O(1).
    public static void drawPascalTriangle2(int n){
        ArrayList<ArrayList<Integer>> pascalTriangle = new ArrayList<>();
        for(int row=0;row<n;row++){
            int rowElements=1;
            ArrayList<Integer> ansRow = new ArrayList<>();
            ansRow.add(1); //inserting the 1st element
            //calculating the nCr
            for(int i=0;i<row;i++){
                rowElements=rowElements*(row-i);
                rowElements=rowElements/(i+1);
                ansRow.add(rowElements);
            }
            pascalTriangle.add(ansRow);
        }

        for( ArrayList<Integer> eachRow:pascalTriangle){
            for(Integer eachRowElement:eachRow){
                System.out.print(eachRowElement+"\t");
            }
            System.out.println(" ");
        }
    }
}

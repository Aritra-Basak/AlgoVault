package DSA_Vault_2k25.src.dsa_learnings.Recursion;

public class RecursivePatterns {
    public static void main(String [] args){
        int k=4;
        printStars(k,1);
        System.out.println("NEXT PATTERN.....");
        printStars2(k,1);
    }

    public static void printStars(int row,int col ){
        if (row==0)
            return;
        if(col<=row){
            System.out.print("*");
            printStars(row,col+1);
        }
        if(col>row){
            System.out.println();
            printStars(row-1,1);
        }
    }
    public static void printStars2(int row,int col ){
        if (row==0)
            return;
        if(col<=row){
            printStars2(row,col+1);
            System.out.print("*");
        }
        if(col>row){
            printStars2(row-1,1);
            System.out.println();
        }
    }
}

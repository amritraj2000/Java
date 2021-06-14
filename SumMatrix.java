public class SumMatrix {
    public static void main(String[] args){
        int rows,cols;
        int firstMatrix[][]={{1,6,2},{4,3,4},{6,8,7}};
        int secondMatrix[][]={{1,3,2},{3,2,4},{4,2,1}};
        rows=firstMatrix.length;
        cols=firstMatrix[0].length;
        int sum[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum[i][j]=firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        System.out.println("Addition of two matrices");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    
}

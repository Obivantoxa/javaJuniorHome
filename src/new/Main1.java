import java.nio.InvalidMarkException;

public class Main1 {

    public static void main(String[] args) {
        double[][] nums1 = {{1, 1, 1, 1},
                            			{1, 1, 1, 1},
                            			{1, 1, 1, 1}};
        Matrix matrix1 = new Matrix (nums1);
        double[][] nums2 = {{2, 2, 2, 2},
        								{2, 2, 2, 2},
        								{2, 2, 2, 2}};
        Matrix matrix2 = new Matrix (nums2);

        
        //System.out.println(matrix1.getRows());

        System.out.println(matrix1.getValueAt(0,2));
       
       // System.out.println(matrix1.getValueAt(0,2));
      //  
        // res = matrix1.add(matrix2);
        //System.out.println(res.getValueAt(0,2));
        //IMatrix res1 = matrix1.sub(matrix2);
          //      System.out.println(res1.getValueAt(0,2));
      //  IMatrix res2 = matrix1.mul(matrix2);
       // System.out.println(res2.getValueAt(0,2));
        
        IMatrix res3 = matrix1.mul(10);
        System.out.println(res3.getValueAt(0,2));

        


   
    }
}



    


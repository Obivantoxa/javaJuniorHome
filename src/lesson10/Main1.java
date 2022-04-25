package lesson10;

public class Main1 {

    public static void main(String[] args) {
        double[][] nums1 = {{2, 1, 5, 4},
                            {1, 3, 6, 4},
                            {5, 6, 4, 3}};
        Matrix matrix1 = new Matrix (nums1);


        double[][] nums2 = {{4, 1, 5, 4},
                            {3, 4, 5, 6},
                             {2, 6, 4, 3}};

        Matrix matrix2 = new Matrix(nums2);
        matrix2.setValueAt(1,2,5);


//        IMatrix resultAdd = matrix1.add(matrix2);
//        resultAdd.getValueAt(2,0);
//
//        System.out.println(resultAdd.getValueAt(2,0));
//        System.out.println(resultAdd.getValueAt(0,0));
        IMatrix resultAddd = matrix1.sub(matrix2);
        System.out.println(resultAddd.getValueAt(2,0));
        System.out.println(resultAddd.getValueAt(0,0));


    }
}

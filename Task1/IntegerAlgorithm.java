package Task1;

class IntegerAlgorithm{
    public static void main(String[] args) {
        int[] arr = {1,7,5,3,8,9,21,34,1,2,3,4,7,3,11,2,6,8,7};
        IntegerAlgorithm test = new IntegerAlgorithm();
        System.out.println(test.highestProduct(arr));
    }

    public int highestProduct(int[] A){
        Merge merge = new Merge();
        int[] arr = merge.mergeSort(A);
        return arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];
    }
}

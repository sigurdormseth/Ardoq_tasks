package Task1;
class Merge{

    int[] mergeSort(int[] A){
        int n = A.length;
        if (leq(n, 1)){
            return A;
        }
        int i = n/2;
        int[] b = new int[i];
        int[] c = new int[n - i];
        for (int j = 0; lt(j, i);j++){
            b[j] = A[j];
        }   
        for (int s = i; lt(s, n);s++){
            c[s - i] = A[s];
        }
        int [] B = mergeSort(b);
        int [] C = mergeSort(c);
        return merge(B, C, A);
    }
    
    int[] merge(int[] B, int[] C, int[] A){
        int i = 0;
        int j = 0;

        while (lt(i, B.length) && lt(j, C.length)){
            if (lt(B[i], C[j])){
                A[i + j] = B[i];
                i++;
            }else{
                A[i + j] = C[j];
                j++;
            }
        }
        while (lt(i, B.length)){
            A[i + j] = B[i];
            i++;
        }
        while (lt(j, C.length)){
            A[i + j] = C[j];
            j++;
        }
        return A;
    }

    boolean lt(int a, int b) {
        return a < b;
    }

    boolean leq(int a, int b) {
        return a <= b;
    }
}

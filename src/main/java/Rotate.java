import java.util.Arrays;

public class Rotate {


        public int[] solution(int[] A, int K) {
            // Implement your solution here
            int[] B = new int[A.length];


                if(K== A.length)
                return A;

                int j=0;
                for (int i=K-1;i<A.length;i++,j++){
                    B[j] = A[i];
                }
                for (int i=0;i<K-1;i++,j++){
                    B[j] = A[i];
                }

            return B;
        }

   public static void main(String args[]){

       Rotate rotate = new Rotate();
       //int[] A = {1,2,3,4};
       //[3, 8, 9, 7, 6], 3
       int[] A = {3, 8, 9, 7, 6};
       int K = 3;
       int[] B = rotate.solution(A,K);
       System.out.println(Arrays.toString(B));
   }

}

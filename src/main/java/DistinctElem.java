public class DistinctElem {

    public static int solution(int[] A) {
        // Implement your solution here
        int len = A.length;
        if(len==1){

            return 1;
        } else if(len ==2){
            if(A[0] == A[1]){
                return 1;
            }
            else{
                return 2;
            }
        }
        int B[] = new int[len];
        for(int i=0;i< len;i++) {
            B[i]=A[i];
        }


        for(int i=0;i< len;i++){
            for(int j=i+1;j< len;j++){
                if(A[i] == B[j])
                {
                    B[j] =0;
                }
            }
        }
        int count=0;
        for(int i=0;i< len;i++){
            if(B[i]!= 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        int A[]={1,2,3};
        int count = DistinctElem.solution(A);
        System.out.println(count);
    }
}

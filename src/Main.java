public class Main {

    public static void main(String[] args) {




        System.out.println(symmetric());


    }



    public static boolean symmetric () {
        int[][] ar = {

                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 3, 2, 3},
                {4, 2, 3, 1}
        };

        for (int i = 0; i < ar.length; i++){
/*
            if (ar[i][i] != ar[ar.length-i][ar.length-i]) {
           with array length of 4, when ar[0][0] it is checking againts ar[4][4] which is out of bounds.
            Last index in the array is ar[3][3]
*/
            if (ar[i][i] != ar[ar.length-1-i][ar.length-1-i]){
              return false;
            }
        }
     return true;
    }


}

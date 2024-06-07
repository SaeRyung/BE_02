package BE_cordingtest.w2;

public class for_Diamond {
    public static void main(String[] args) {
        //트리 윗부분
        for(int i = 0; i<5; i++) {
            for(int j=5; j>i; j--){
                System.out.print(" ");
            }
            for (int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j<i; j++) {
                System.out.print("*");
            }


            System.out.println();
        }

        //트리 아랫부분
        for(int i = 0; i<=5; i++) {
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=5; j>i; j--){
                System.out.print("*");
            }
            for(int j=5; j>=i; j--){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}

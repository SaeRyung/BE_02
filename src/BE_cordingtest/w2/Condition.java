package BE_cordingtest.w2;

public class Condition {
    public static void main(String[] args){
        for(int i = 1; i<100; i++){
            //Integer 클래스의 toString() 메소드를 사용하면 int를 문자열로 바꿀수 있습니다.
            String num = Integer.toString(i);
            if(num.indexOf("3") > -1 || num.indexOf("6")>-1 || num.indexOf("9")>-1){ //3, 6, 9 포함할 때
                //3,6,9 숫자가 두번 들어갈 때
                if(num.indexOf("33") > -1 || num.indexOf("36") > -1 || num.indexOf("39") > -1 ||
                        num.indexOf("63") > -1 || num.indexOf("66") > -1 || num.indexOf("69") > -1 ||
                        num.indexOf("93") > -1 || num.indexOf("96") > -1 || num.indexOf("99") > -1){
                    System.out.print("박수짝짝 ");
                    continue;
                }
                System.out.print("박수짝 ");
            }else{
                System.out.print(i+" ");
            }


        }
    }
}

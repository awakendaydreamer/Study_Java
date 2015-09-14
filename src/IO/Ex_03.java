package IO;

import java.io.InputStream;

public class Ex_03 {

    public static void main(String[] args) {
        //키보드에서 영문자 여러 글자를 입력받아 출력
        InputStream is = System.in;
        System.out.print("영문자 여러 글자를 입력하세요 : ");
        
//        try {
//            while(true){    //입력받은 글자가 몇개인지 알 수 없다.
//                int data = is.read();
//                System.out.println("입력하신 영문자는 " + (char)data + "입니다.");
//                if(data == -1){    //Ctrl + Z 입력 시 Break 명령을 통해서 while문 탈출
//                    System.out.println("종료되었습니다.");
//                    break;
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        
        try {
            int data;
            while((data = is.read()) != -1){
                System.out.println("입력하신 영문자는 " + (char)data + "입니다.");
            }
            System.out.println("종료되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

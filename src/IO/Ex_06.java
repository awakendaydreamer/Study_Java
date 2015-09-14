package IO;

import java.io.InputStream;

public class Ex_06 {

    public static void main(String[] args) {
        //키보드에서 영문자 여러개를 읽어서 출력
        //단,입력한 글자중에 q 라는 문자가 있으면 종료
        InputStream is = System.in;
        System.out.println("영문자 여러 글자를 입력하세요 : ");
        int data;
        try {
            while((data = is.read()) != 'q'){
                System.out.println("입력하신 영문자는 " + (char)data + " 입니다.");
            }
            System.out.println("종료되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }

}

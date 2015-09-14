package IO;

import java.io.InputStream;

public class Ex_01 {

    public static void main(String[] args) {
        //키보드(Console Window)에서 "영문자(ASCII Code)" 1글자를 읽어서 출력
        InputStream is = System.in;    //노드 스트림 : 가장먼저 연결되는 스트림
        System.out.println("영문자 1글자를 입력하세요 : ");  //대기상태(Blocked State)
        
        try {
            int data = is.read();                                        //처음부터 char로 받을수 없는 이유 : read() 메서드가 int returnType이므로 int data로 받아줘야함
            System.out.println("입력하신 영문자는 " + (char)data + " 입니다.");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}


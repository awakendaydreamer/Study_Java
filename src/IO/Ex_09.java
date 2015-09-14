package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex_09 {

    public static void main(String[] args) {
        // 파일에서 바이트 단위로 입출력하는 스트림 : FileInputStream, FileOutputStream
        //이미지 파일을 읽어서 복사하는 프로그램(Copy & Paste)
        //원본이미지를 준비 : 이미지를 복사한 후에 IO프로젝트에 넣기
        //경로설정하지 않으면 현재 프로젝트에서 작업이 이루어 진다.
        //다른위치에서 작업할 경우 절대경로 표기. ▶  D:\study_java\workspace\Study_Java
        //프로그램 실행후 Refresh(F5)하면 복사된 파일을 확인할 수 있다.
        try {
            FileInputStream fis = new FileInputStream("pic.jpg");    //원본파일
           FileOutputStream fos = new FileOutputStream("copy.jpg");    //사본파일
            int data, cnt=0;
            
            while((data = fis.read()) != -1){ //EOF(End of File)시 종료
                cnt++;        //접근횟수
                System.out.println(data);//사진의 픽셀값 (RGB)
                fos.write(data);//data에 입력되어진 RGB값을 기초로 파일을 생성
                
            }
            
            fos.close();
            fis.close();
            System.out.println("접근횟수: " + cnt);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        
    }

}

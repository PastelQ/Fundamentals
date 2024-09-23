package chap14_IOStream.sec03_javaIOApi.exam03_file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* File 클래스
 - java.io 패키지에서 제공하는 File 클래스는 파일 및 폴더(디렉토리) 정보를 제공
 - File 클래스로부터 File 객체를 생성하려면 문자열 경로를 인수로 제공해야 함 */

/** File 클래스를 이용한 파일 및 폴더 정보 출력 **/
public class FileExample {

	public static void main(String[] args) throws IOException {
		
		// File 객체 생성 : 인수로 경로 제공
		File dir = new File("C:/icanjava/StudyWorkSpace/javaIO/folder");
		File file1 = new File("C:/icanjava/StudyWorkSpace/javaIO/file1.txt");
		File file2 = new File("C:/icanjava/StudyWorkSpace/javaIO/file2.txt");
		File file3 = new File("C:/icanjava/StudyWorkSpace/javaIO/file3.txt");
		
		// 파일 또는 폴더가 존재하지 않을 경우 생성
		if(dir.exists() == false) { dir.mkdir(); }
		if(file1.exists() == false) {file1.createNewFile(); }
		if(file2.exists() == false) {file1.createNewFile(); }
		if(file3.exists() == false) {file1.createNewFile(); }
		
		// File 객체 생성 후 인수로 받은 폴더 내부 내용 목록을 File 배열로 얻음
		File temp = new File("C:/icanjava/StudyWorkSpace/javaIO");
		File[] contents = temp.listFiles();
		
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름"); // Console 출력 표 헤더
		System.out.println("-------------------------------------------------------");
		// 날짜 양식
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified()))); // lastModified() : 마지막 수정 일정 리턴

			if(file.isDirectory()) { // isDirectory() : 폴더 여부 확인(boolean 값 리턴)
				// 폴더일 경우 콘솔 출력 내용
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				// 파일일 경우 콘솔 출력 내용
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName()); // length() : 파일 크기 리턴
			}
			System.out.println(); // 공백
		}
	}
}
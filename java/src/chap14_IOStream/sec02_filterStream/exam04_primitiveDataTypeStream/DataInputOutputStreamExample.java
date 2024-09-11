package chap14_IOStream.sec02_filterStream.exam04_primitiveDataTypeStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* 기본 타입 입출력 스트림(DataIn/OutputStream)
 - 기본 타입인 boolean, char, int, long, float, double 입출력할 수 있는 보조 스트림
 ! 주의점 : 데이터 타입의 크기가 모두 달라 출력한 데이터를 입력스트림으로 읽어 올 때는
  출력한 순서와 동일한 순서로 읽어야 함 */
public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		// 해당 경로로 바이트 기반 출력 스트림을 생성 
		FileOutputStream fos = new FileOutputStream("C:/icanjava/StudyWorkSpace/javaIO/primitive.db");
		// 기본 타입 입출력 보조 스트림 연결
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");  // writeUTF() : String 타입 출력
		dos.writeDouble(95.5); // writeDouble() : double 타입 출력
		dos.writeInt(1);	   // writeInt() : int 타입 출력
		
		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush(); dos.close(); // 버퍼 내부 출력 및 출력 스트림 자원 해제
		
		
		// 해당 경로로 바이트 기반 입력 스트림을 생성
		FileInputStream fis = new FileInputStream("C:/icanjava/StudyWorkSpace/javaIO/primitive.db");
		// 기본 타입 입출력 보조 스트림 연결
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0; i<2; i++) {
			String name = dis.readUTF();      // readUTF() : String 타입 읽기
			double score = dis.readDouble();  // readDouble() : double 타입 읽기
			int order = dis.readInt(); 		  // readInt() : int 타입 읽기
			System.out.println(name + " : " + score + " : " + order);
		}
		
		// 입력 스트림 자원 해제
		dis.close();
	}
}
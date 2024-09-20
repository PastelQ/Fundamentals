package chap11_basicJavaAPI.sec01_javalangPackage.exam09_classPath;

import chap06_class.sec02_field.exam01_fieldDeclaration.Car;

// 클래스 경로를 활용해서 리소스 절대 경로 얻기
// Class 객체는 해당 클래스의 파일 경로 정보를 가지고 있어 다른 리소스 파일(이미지, XML, Property 등)의
// 경로를 얻을 수 있음(이 방법은 UI 프로그램에서 많이 이용됨)
public class ResourcePathExample {

	public static void main(String[] args) {
		//1. 클래스로부터 얻는 방법
		Class clazz = Car.class;
		
		// 해당 클래스가 있는 디렉토리에 photo1.jpg / images/photo2.jpg가 있을 경우 하기 방법으로 절대 경로 얻기
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
		
	}
}
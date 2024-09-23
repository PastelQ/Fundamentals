package chap06_class.sec06_packageAndAccessModifier.exam03_classAccessModifier.package2;

import chap06_class.sec06_packageAndAccessModifier.exam03_classAccessModifier.package1.B;

// A,B클래스와 패키지가 다름
public class C {

	// A a; -> default 접근제한자 : 다른 패키지의 클래스에서 접근 제한
	B b; // -> public  접근제한자 : 외부에서 자유롭게 접근 가능(임포트 필요)
}
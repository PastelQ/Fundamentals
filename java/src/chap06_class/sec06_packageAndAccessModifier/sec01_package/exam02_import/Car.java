package chap06_class.sec06_packageAndAccessModifier.sec01_package.exam02_import;

import chap06_class.sec06_packageAndAccessModifier.sec01_package.exam02_import.hankook.*;
import chap06_class.sec06_packageAndAccessModifier.sec01_package.exam02_import.kumho.*;
import chap06_class.sec06_packageAndAccessModifier.sec01_package.exam02_import.hyundai.Engine;

// import 상위패키지.하위패키지.클래스이름 : 사용하고자 하는 클래스 or 인터페이스가 다른 패키지에
// 소속되어 있으면 import문으로 해당 패키지에서 가져와 사용할 것을 컴파일러에게 명시
public class Car {
	
	Engine engine = new Engine(); 			 // import hyundai.Engine
	SnowTire tire1 = new SnowTire();		 // import hankook.*
	BigWidthTire tire2 = new BigWidthTire(); // import kumho.*
	
	// 하기는 클래스명이 같아 패키지명까지 명시해야 함
	chap06_class.sec06_packageAndAccessModifier.sec01_package.exam02_import.hankook.Tire tire3 =
			new chap06_class.sec06_packageAndAccessModifier.sec01_package.exam02_import.hankook.Tire();
	
	chap06_class.sec06_packageAndAccessModifier.sec01_package.exam02_import.kumho.Tire tire4 =
			new chap06_class.sec06_packageAndAccessModifier.sec01_package.exam02_import.kumho.Tire();
}
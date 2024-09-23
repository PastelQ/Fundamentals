package chap06_class.sec06_packageAndAccessModifier.exam03_classAccessModifier.package1;

// Access Modifier 사용 이유 : 외부로부터 데이터를 보호하기 위함
// 외부엔 불필요하고 내부적으로만 사용 혹은 그런 부분을 은닉하기 위해(보안 목적)
class A {}

/* Access Modifier(접근 제한자) 종류
 1. public	  : 외부 클래스가 자유롭게 접근 가능
 2. protected : 동 패키지 / 하위(자식) 클래스 접근 가능
 3. private   : 외부에서 사용 불가
 4. default   : 동 패키지 접근 가능
 */

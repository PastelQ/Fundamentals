# Spring Framework Annotation 복습

## @Configuration
- 클래스가 @Bean 메서드를 하나 이상 선언함을 나타냄
- Bean 정의를 생성하며 Java 설정 파일을 만든다고 볼 수 있음

## @ComponentScan
- 컴포넌트를 스캔할 특정 패키지를 정의
- 별도로 패키지를 지정하지 않으면 이 어노테이션을 선언한 현재 패키지 스캔

## @Component
- 어노테이션을 사용한 클래스가 컴포넌트임을 명시
- 해당 클래스가 ComponentScan으로 검색된다면 SpringBean 생성

## @Service
- @Component의 한 종류
- 어노테이션한 클래스에 비즈니스 논리가 있음을 나타냄

## @Controller
- @Component의 한 종류
- 어노테이션한 클래스가 컨트롤러임을 나타냄
- 일반적으로 웹 애플리케이션과 REST API에서 컨트롤러를 정의하는데 사용됨

## @Repository
- 데이터베이스에서 데이터를 검색하거나 조작하는 데 사용 됨(DB와의 상호 관계)

## @Primary
- 단일 값 의존성에 자동 연결될 후보 Bean이 여러 개일 때 우선 순위를 줌

## @Qualifier
- 자동 연결될 후보 Bean들의 한정자로 필드, 매개 변수에서 사용됨
- Primary보다 더 구체적이며, 더 우선 순위가 높음

## @Lazy
- Spring Bean은 일반적으로 컨텍스트가 시작하면 즉시 초기화(Eager)되나 해당 어노테이션으로 지연 초기화할 것을 명시할 수 있음

## @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
- 특정 컴포넌트에 프로토 타입 스코프를 정의할 수 있음
- 모든 Bean은 싱글톤타입이나 해당 어노테이션으로 프로토타입으로 정의 가능

### Prototype : Bean을 참조할 때마다 인스턴스가 새로 만들어짐

## @PostConstruct
- 의존성이 주입이 수행된 이후 초기화를 위해 실행될 메서드를 명시
- 주로 모든 의존성이 준비되는 대로 DB에서 몇 가지 값을 가져오려는 경우 사용

## @PreDestroy
- 컨테이너에서 인스턴스를 삭제하는 과정을 거치고 있는 부분 콜백 알림을 수신하는 메서드
- 보통 특정한 Bean에서 보유하고 있는 리소스 해제하는 데 사용

## @Named
- CDI(Contests & Dependency Injection) 어노테이션
- @Component와 유사

## @Inject
- CDI(Contests & Dependency Injection) 어노테이션
- @Autowired와 유사
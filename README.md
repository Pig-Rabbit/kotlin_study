# my_first_app_development
Development Android Application
- class: 변수와 함수의 모음으로, 연관성 있는 코드의 그룹
- constructor: 클래스를 사용하기 위해서 호출하는 일종의 함수
- init: 기본 생성자를 호출하면 실행되는 코드 블록
- property: 클래스에 정의된 변수(=멤버 변수)
- method: 클래스에 정의된 함수(=멤버 함수)
- companion object: 생성자를 통하지 않고 클래스의 멤버를 사용할 수 있게 만드는 블록
- inheritance: 코드를 재사용하기 위한 설계도구, 상속 관계에서 자식 클래스는 부모 클래스의 멤버들을 자신의 것으로 사용
- abstract: 클래스를 개념 설계하기 위한 도구
- interface: 외부 모듈에 제공하기 위해 메서드 이름 나열한 명세서
- package: 연관성 있는 클래스들을 분류하기 위한 디렉터리 구조
- private, internal, protected, public: 접근 제한자, 클래스의 멤버에 지정되어 외부에서 사용 여부 결정
- generic: 타입을 특정해서 안정성을 유지하기 위한 설계 도구

Null Safety
- Nullable (3 types)
1. var nullable: String?
2. fun nullParameter(str:String?) { ~
3. fun nullReturn(): String? { ~
- Safe Call (?.)
1. var resultNull: Int? = str?.length
- Elvis Operator (?:)
1. var resultNonNull: Int = str?.length?:0

lateinit & lazy
- Examples
1. lateinit var name: String
2. val person by lazy {Person()}

Scope Function
- run: 스코프 함수 안에서 호출한 대상을 this로 사용 가능 (this 생략 가능)
1. list.run { ~
2. list.apply { ~
3. with (list) { ~
- let: 스코프 함수 안에서 호출한 대상을 it으로 사용 가능 (it 생략 불가, 이름 대체 가능)
1. list.let { ~
2. list.also { ~

Layout
- Constraint Layout: Android Default Layout
- Linear Layout: Horizontal and Vertical Layout
- Frame Layout: Overlap Multiple Layout

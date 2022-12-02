# 1. 변수 Varible

---

## 1) 변수
> 단 하나의 값을 저장할 수 있는 메모리 공간
> 

## 2) 변수의 사용 방법
> int age; // 변수타입 변수이름;
> 
> age = 25; // 변수 초기화
> 
> int age = 25; // 
> 
 - 변수타입 : 변수에 저장될 값의 타입을 지정(정수형, 실수형, 문자형 등)
 - 변수이름 : 변수에 붙인 이름(중복 불가)
 - 변수 초기화 : 변수를 사용하기 전 처음으로 값을 저장

## 3) 변수의 명명규칙
### 필수 사항
> - 대소문자가 구분되며 길이에 제한이 없다.
> - 예약어를 사용해서는 안 된다.
> - 숫자로 시작해서는 안 된다.
> - 특수문자는 '_'와'$'만을 허용한다
### 권장 사항
> - 클래스 이름의 첫 글자는 항상 대문자로 한다.
> 
>   (변수와 메서드의 이름의 첫 글자는 항상 소문자로 한다.)
> - 여러 단어로 이루어진 이름은 단어의 첫 글자를 대문자로 한다.
> - 상수의 이름은 모두 대문자로 한다. 여러 단어로 이루어진 경우'_'로 구분한다


# 2. 변수의 타입

---

## 1) 변수의 타입
 > 1. 기본형
 >  - 계산을 위한 실제 값을 저장
 >  - 논리형, 문자형, 정수형, 실수형
>
> 
 > 2. 참조형
 >  - 객체의 주소를 저장
 >  - 기본형을 제외한 나머지 타입

## 2) 기본형
|  크기   |   1byte   |  2byte  |  4byte  |  8byte  |
|:-----:|:---------:|:-------:|:-------:|:-------:|
|  논리형  |  boolean         |         |         |         |
|  문자형  |           |  char   |         |         |
|  정수형  |  byte         |  short  | **int**        | long        |
|  실수형  |           |         |  float       |  **double**  | 

 - 정수형의 기본 자료형은 int, 실수형의 기본 자료형은 double이다.
 - 20억 이상의 값을 저장할 때는 int 대신 long타입을 사용하는 것이 좋다.

## 3) 상수와 리터럴

### 3-1 상수
> 값을 한번만 저장할 수 있는 공간
> 
> final int MAX_SPEED = 10; // 상수 MAX_SPEED를 선언하고 초기화

 - 상수는 변수 타입 앞에 'final'을 붙여준다.
 - 상수의 값은 변경할 수 없다.

### 3-2 리터럴
> 그 자체로 값을 의미 하는 것
> 
> final int MAX_SPEED = 10; // 여기서 10이 리터럴

 - 리터럴의 접미사(long타입 : L, float 타입 : f)
 - 정수형의 기본 타입은 int, 실수형의 기본 타입은 double이다.
 - 리터럴의 접두사(8진수 : 0, 16진수 : 0x, 2진수  0b)
 - 리터럴의 값이 변수의 타입의 범위를 넘어서거나 변수의 타입보다 저장범위가 넓으면 컴파일 에러가 발생한다.

### 3-3 문자 리터럴과 문자열 리터럴
> char = 'J'; // 문자 리터럴

 - char타입의 변수는 단 하나의 문자만 저장 할 수 있고 빈 문자를 허용하지 않는다.
 

> String name = new String("Java"); // String 객체를 생성(생략 가능)
> 
> String name = "Java" // 문자열 리터럴

 - String타입의 변수는 여러 문자를 저장할 수 있고 빈 문자열을 허용한다.
 - String은 객체 생성을 생략할 수 있다.
 - 덧셈 연산자는 피연산자 중 어느 한 쪽이 String이면 나머지 한 쪽은 String으로 변환 후 두 String을 결합한다.

### 3-4 형식화된 출력 - printf
> System.out.printf("first : 지시자 second : 지시자", first, second) ;

 - 지시자의 순서에 맞는 변수가 출력된다.
 - println()과 달리 prinf()sms 출력 후 줄바꿈을 하지 않는다. 줄바꿈을 하려면 %n 지시자를 넣어줘야 한다.
 - 지시자 : %d(10진 정수), %f(부동 소수점), %s(문자열) 등
 - 지시자의 활용 : ABC.Df 
   - A : 정렬(생략:오른쪽 정렬, -:왼쪽 정렬)
   - B : 빈 칸에 채울 수
   - C : 전체 자리 수
   - D : 소수점 아래자리 수
 
### 3-5 화면에서 입력받기 - Scanner
> import java.util.Scanner; // Scanner 클래스 사용을 위해 추가
> 
> Scanner scanner = new Scanner(System.in); // Scanner 클래스의 객체를 생성
> 
> String input = scanner.nextLine(); // 입력받은 내용을 input에 저장

 - 입력받은 내용은 문자열로 반환되므로 숫자로 사용하려면 Integer.parseInt()와 같은 메소드로 변환해 주어야 한다.
 - nextInt(), nextFloat()와 같이 변환없이 숫자로 바로 입력 받는 메소드도 있다.
   하지만 화면에서 연속적으로 값을 입력 받기 까다로우므로 nextLine()으로 입력 받아 변환하는 것이 더 낫다.

# 4. 기본형

---

## 1) 논리형 - boolean
> boolean power = true;
 - true와 false 중 하나를 저장 할 수 있으며 기본값은 false이다.

## 2) 문자형 - char
> char ch = 'A';
> char ch = 65;
 - 단 하나의 문자만 저장 가능
 - 문자의 유니코드가 저장되는 것으로 유니코드를 직접 저장할 수 있다.
 - \t(탭), \n(줄바꿈) 등 특수문자를 저장할 수 있다.

## 3) 정수형 - byte, short, int, long
> 정수형의 표현 방식 : S | n-1 bit
 - S : 부호비트(1비트, 양수는 0, 음수는 1) / n : 타입의 크기(단위:bit)
 - n비트로 표현할 수 있는 부호있는 정수의 범위 : -2<sup>n-1</sup> ~ 2<sup>(n-1)</sup> - 1
 - 정수형의 선택 기준
   - ±20억 범위 안이면 int, 넘어서면 long
   - 성능보다 저장공간이 중요하면 byte나 short
 - 정수형의 오버 플로우 : 타입이 표현할 수 있는 값의 범위를 넘어서는 것
   - 최대값 + 1 -> 최소값
   - 최소값 - 1 -> 최대값
 
## 4) 실수형 - float, double
> 실수형의 저장 형식
> float : S(1) | E(8) | M(23)
> double : S(1) | E(11) | M(52)
 - S : 부호 / E : 지수 / M : 가수(실제값)

   | 타입  |                   저장 가능 범위(양수)                    | 정밀도  |
   |:---:|:---:|:---:|
   | float  |  1.4 X 10<sup>-45</sup> ~ 3.4 X 10<sup>38</sup>   | 7자리  |
   | double  | 4.9 X 10<sup>-324</sup> ~ 1.8 X 10<sup>308</sup>  | 15자리 |
 - 연산속도 향상이나 메모리를 절약하려면 float를 더 큰 값의 범위나 더 높은 정밀도를 필요로 하면 double을 선택한다.
 - 오버플로우가 발생하면 변수의 값은 무한대로 언더플로우가 발생하면 변수의 값은 0이 된다.

# 5.형변환

---

## 1) 형변환
> 서로 다른 타입간의 연산을 위해 변수 또는 상수의 타입을 다른 타입으로 변환하는 것

## 2) 형변환 방법
> (타입)피연산자
 - 기본형에서 boolean을 제외한 나머지 타입들은 서로 형변환이 가능하다.
 - 기본형과 참조형간의 형변환은 불가능하다.

## 3) 정수형 간의 형변환
 - 큰 타입에서 작은 타입으로 형변환시 값 손실이 발생할 수 있다.
 - 작은 타입에서 큰 타입으로 형변환시 값 손실은 발생하지 않고 빈공간을 변환하려는 값이 양수인 경우 0으로 음수인 경우 1로 채운다.

## 4) 실수형 간의 형변환
 - 큰 타입에서 작은 타입으로 형변환시 값 손실이 발생할 수 있다.
 - 지수는 변하기 전 형의 기저를 빼고 변하는 형의 기저를 더해서 변환한다.(float:23, double:127)
 - double에서 float로 변환하는 경우 가수 52자리 중 23자리만 저장되고 나머지는 버려진다.
 - float에서 double로 변환하는 경우 가수 52자리 중 23자리를 채우고 남은 자리를 0으로 채운다.

## 5) 정수형과 실수형 간의 형변환
 - 정수형을 실수형으로 변환하는 것은 정수를 2진수로 변환한 다음 정규화해서 실수의 저장형식에 맞게 저장한다.
 - 실수형의 정밀도의 제한으로 오차가 발생할 수 있다.(float는 7자리 정밀도를 제공하므로 8자리 이상의 정수 변환 시 오차가 발생)
 - 실수형을 정수형으로 변환하면 소수점 이하의 값은 버려진다.

## 6) 자동 형변환
 - 표현범위가 좁은 타입에서 넓은 타입으로 형변환하는 경우에는 값 손실이 없으므로 생략해도 자동 형변환한다.
 - 표현범위가 넓은 타입에서 좁은 타입으로 형변환하는 경우 생략 시 에러가 발생한다.
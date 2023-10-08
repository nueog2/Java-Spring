#☕ Java&Spring 웹 개발 


# 들어가기 전

---


## 💡TPC

T: thinking 생각하기 - 질문을 던지고 문제를 접근하는 방법을 생각해보는 시간 

프로그램의 요소들의 관계를 이해하는 것이 목적

P: presentation 표현하기  - 메모리에서 어떻게 동작이 되는지 이해하는 단계 (문법,용어,기술)

C: coding 코딩하기 - 그림으로 표현한 부분을 실제 언어로 구현해보는 단계

코딩(구현) 단계는 FSA단계로 실습 진행


## FSA -

따라하기  : Follow Coding- 스스로하기 : Self Coding - 응용하기 : Apply Coding 


# TPC

프로그래밍 언어 → JAVA

개발환경 구축 → JavaSE 플랫폼 구축 (JDK)

코딩을 위한 도구  → IntelliJ, Eclipse IDE 

예) 1+1=? 문제 제시

-코드를 짠다 → 구현, 코딩한다

-**저장**: **Caculatior.java** (java는 저장할 때 확장자를 .java로 함)

-**문법오류 체크**: **컴파일러**(해석기)필요 → **JDK**

-만들어지는 파일: Caculator.class

-**실행**: 실행해주는 **명령어** 및 **프로세서** 필요 → **JDK[ JRE(JVM)]** 


## 자바 개발환경의 이해

자바 프로그래밍 언어에는 4가지 종류가 있음
There are four platforms of the Java programming language
• Java Platform, Standard Edition (**Java SE**) : Desktop Application 데스크탑 어플
• Java Platform, Enterprise Edition (**Java EE)** : WEB ERP Application 모바일 어플
• Java Platform, Micro Edition (**Java ME**) : Mobile Device Application 안드로이드 개발? 
~~• JavaFX : GUI based Application~~


## JavaSE 개발환경이 구축 되었다는 의미는 … 

jvm, api , Tool(명령어)가 PC에 설치가 되었다는 뜻이며 자바언어로 데스크톱 응용소프트웨어를 개발할 수 있다. 


## JavaSE개발환경 구축을 위해 설치하는 프로그램

→ JDK


## JDK를 설치하면 PC에 설치 되는 것들

⏩ JVM, API, TOOL


## 자바 프로그램을 구동하는 프로세서

⏩ JVM ( Java Virtual Machine )

---


# 🏃 JavaSE프로젝트 만들기

JAVA언어란? → 객체지향 프로그래밍이다


### 객체지향 프로그래밍이란? → 클래스 단위로 프로그래밍을 하는 것

Java언어는 객체지향 언어이므로 **객체(Object)** 단위로 프로그래밍을 해야 한다 : 인간 중심 관점

Java 언어는 객체지향 언어이므로 **클래스(class)** 단위로 프로그래밍을 해야 한다 : **프로그래밍 관점**


## JavaSE프로그램의 기본 골격

```java
public class Calculator {
	public static void main(String[] args) {
#여기서 main 메서드 : 프로그램의 시작점(진입점)이다 
	}
}
```


*Method(메서드) : 동작을 처리하는 함수 (function) 

💡Java 메인 클래스 만들기

- main 메서드를 가지고 있는 클래스
- 많은 클래스 중에 메인 클래스는 딱 1개가 존재
- 메인 클래스부터 프로그램이 시작

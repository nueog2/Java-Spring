// 자바는 객체지향언어이기 떄문에 클래스단위로 코딩을 한다
// 시작, 메인 클래스
// 객체를 만드는 이유는 접근을 하기 위함임
//main을 가지고 있는 class로부터 시작하는 클래스를 JavaSE프로그램이라고 함!
public class Calculator {
    // main(){  }메서드
    public static void main(String[] args) {
        // 두 개의 정수를 더하여 출력하는 자바 프로그램을 만들어보기
        int a, b, sum;
        a=1;
        b=1;
        sum=a+b;
        //출력 : sout
        System.out.println(sum); // 2
    }
}

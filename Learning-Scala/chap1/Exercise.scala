/* 
 * 1.
 * println()이 문자열을 출력하는 좋은 방식이긴 하지만, 
 * println 없이 문자열을 출력하는 방법은 무엇일까? 
 * 또 REPL은 어떤 종류의 숫자, 문자열 및 다른 데이터를 지원하는가?
 *
 * scala> "Hello World"
 * TODO: Double 등?
 */

/*
 * 2.
 * 스칼라 REPL에서 섭씨 22.5도를 화씨로 바꿔보자.
 * 변환식은 cToF(x) = (x * 9/5) + 32
 */

def cToF(x:Float): Float = {
	x * 9 / 5 + 32
}
println(cToF(22.5f))

/*
 * 3. 
 * 연습문제 2의 결괏값을 다시 섭씨로 바꾸자.
 * 그 결괏값을 직접 복사해서 붙여넣는 대신이미 생성된
 * 상수 변수(예:'res0')를 이용할 수 있다.
 */

def fToC(x:Float): Float = {
	(x - 32) * 5 / 9
}
println(fToC(cToF(22.5f)))

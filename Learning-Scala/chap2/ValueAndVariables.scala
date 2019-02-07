// 값
val x: Int = 5

val greeting: String = "Hello, World"
val atSymbol: Char = '@'

val greeting1 = "Hello, World!"
val atSymbol1 = '#'

// 변수
var a: Double = 2.72
a = 355.0 / 113.0

var b: Int = 5
b = b * 4
b = 10

// Type casting
val l: Long = 20
val i: Int = l.toInt

// Numeric literals
val integer: Int = 5
val hexa: Int = 0x0f
val long: Long = 5l
val double: Double = 5.0
val float: Float = 5f
val double2: Double = 5d

// Multiple lines of String
val greeting2 = """She suggested reformatting the file
by replacing tabs(\t) with newlines (\n);
"why do that?", he asked. """

// String interpolation
val approx = 355/133f
println(s"Pi, using 355/113, is about $approx.")

val item = "apple"
println(s"Fish n chips n vinegar, ${"pepper "*3}salt")
println(f"I wrote a new $item%.3s today")
println(f"Enjoying this $item ${355/113.0}%.5f times today")

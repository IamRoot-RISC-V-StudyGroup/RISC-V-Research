val a: Long = 10
val b: Int = 5

println(a.asInstanceOf[Int])
println(b.asInstanceOf[Long])

println(a.getClass)
println(a.isInstanceOf[Long])
println(a.hashCode)
println(a.toInt)
println(a.toString)

// Error
// println(a.asInstanceOf[Boolean])

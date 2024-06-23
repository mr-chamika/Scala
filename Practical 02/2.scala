def fun()={

  var a = 2; var b = 3; var c = 4; var d = 5; val g = 4.0f
  val k = 4.5f

  b = b - 1

  println("(a) " + (b*a+c*d))

  d = d - 1

  println("(b) " + a)

  a = a + 1

  println("(c) " +(-2*(g-k)+c))

  c = c + 1

  println("(d) " +"c = " + c)

  c = c + 1

  println("(e) " +"c = " +  (c * a))

  a = a + 1

}

fun()

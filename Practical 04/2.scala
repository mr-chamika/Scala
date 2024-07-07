def PatternMatching()={

  print("Enter a number : ")
  val num = scala.io.StdIn.readInt()

  check(num)
  

}

def check(x:Int)=x match{

  case i if(i<=0) => println("Negative/Zero")
  case i if(i%2==0) => println("Even number")
  case i if (i%2==1) => println("Odd number")

}

PatternMatching()

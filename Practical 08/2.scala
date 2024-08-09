
val pattern = (x:Int) => {

  if(x % 3 == 0 && x % 5 == 0){
      
      "Multiple of Both Three and Five"

  }else if(x % 3 == 0){
    
    "Multiple of Three"

  }else if(x % 5 == 0){
    
    "Multiple of Five"

  }else{
    
    "Not a Multiple of Three or Five"

  }

}

def func():String={
  
  print("Enter a number : ")
  val num = scala.io.StdIn.readInt()

  val msg = pattern(num)

  msg
}

val message = func()
println(message)


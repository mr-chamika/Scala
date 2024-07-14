var i=0
var list =List.empty[Int]

def fibo(x:Int):Int=x match{

  case i if(x==0) => 0
  case i if(x==1) => 1
  case _ => fibo(x-1) + fibo(x-2)

}

def gettingNum(y:Int)={

  for(i<- 0 to y-1){

    list:+=fibo(i)

  }

}

gettingNum(10)

print(list)

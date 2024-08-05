var i = 0

val y  = (x:Int) => if(x==2 || x%2==1) x else 1

def filterPrime(list:List[Int]):List[Int] = {
    
    var newList = List.empty[Int]

    for(i <- 0 to  list.length-1){
    
     val number = y(list(i))
     
     if (number != 1) newList:+=number

    }

  newList
}

def getList():List[Int] = {

  var firstList = List.empty[Int]

  print("Enter the size of the list : ")
  val size = scala.io.StdIn.readInt()

  for(i <- 0 to size-1){
  
    print("Enter the number " + (i+1) + " : ")
    var num = scala.io.StdIn.readInt()
    
     firstList:+=num

  }

  firstList

}

var l = getList()

print("Intput : " + l + "\n")

val returnList = filterPrime(l)

print("Output : " + returnList + "\n")

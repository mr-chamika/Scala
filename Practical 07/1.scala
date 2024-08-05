var i = 0

val y  = (x:Int) => if (x%2==0) x else 1

def filterEvenNumbers(list:List[Int]):List[Int] = {

    var newList = List.empty[Int]
    
    for(i <- 0 to  list.length-1){
    
      val even = y(list(i))
      
      if (even!=1) newList:+=even

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

val returnList = filterEvenNumbers(l)

print("Output : " + returnList + "\n")

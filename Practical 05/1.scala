var i=0

def getProductList():List[String] = {

  var list = List.empty[String]
  var x = ""

  while(x != "done"){

  print("Enter an item : ")
  x = scala.io.StdIn.readLine();
 
  if(x != "done"){

  list=list:+x

  }

  }

  list//returning the list


}

def printProductList(list:List[String])={

  for(i <- 0 to list.length-1){

    println(i+1 + " : " + list(i))

  }

}

def getTotalProducts(list:List[String])= list.length

var list = getProductList();//get products to a list and return the list
printProductList(list);//print the list with positions
println("Total number of products in the list : " + getTotalProducts(list)) //printing the size of the list

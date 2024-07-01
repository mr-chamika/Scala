var i,num =0
var list = List.empty[String] 
var listNew = List.empty[String]

def Take(num:Int) = {//get strings from user 
  
  for(i <- 0 to num-1){

  print("Enter a string : ") 
  var x = scala.io.StdIn.readLine()//package of scala.io object of StdIn readLine method 
  Add(x)

  }

}

def Start(){//get the number of elements should in list from user

  print("Enter the number of strings want in the list : ")
  num = scala.io.StdIn.readInt()

  Take(num)

}


def Add(string:String) = list:+=string //add strings to the list



def addToNew(string:String) =  listNew:+=string// add strings to the new list


def newList(){ //put strings which have 5 characters to the new list

  for(i <- 0 to num-1){

    if(list(i).length == 5) addToNew(list(i)) 

  }

}

Start()
newList()

println("\nNew List (Strings of length is 5) : ")

listNew.foreach(println) // printing the new list



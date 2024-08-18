
def toUpper(string:String):String = {

  val converted = string.map(x=>if(x>=97 && x<=122) (x-32).toChar else x).mkString //lowercase letters 97-112 ascii values

  converted

}

def toLower(string:String):String = {

  val converted = string.map(x=>if(x>=65 && x<=90) (x+32).toChar else x).mkString//uppercase letters 65-90 ascii values

  converted

}


def formatNames(string:String,name:String,function1:(String)=>String,function2:(String)=>String):String={

  if(string.length != name.length){

    "Error......name and the string must have same length"

  }else{
    
    val formatted =  name.zipWithIndex.map{case(z,index) => if (z>=65 && z<=90) function2(string(index).toString) else function1(string(index).toString)}.mkString

    formatted

  }

}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

def getDataForUpperCase():String = {

  print("Enter a name to make toUpper : ")
  val data1 = scala.io.StdIn.readLine()

  data1

}

val dataU = getDataForUpperCase()

println("Using toUpper on " + dataU + " : " + toUpper(dataU))

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


def getDataForLowerCase():String = {

  print("Enter a name to make toLower : ")
  val data2 = scala.io.StdIn.readLine()

  data2

}

val dataL = getDataForLowerCase()
println("Using toLower on " + dataL + " : " + toLower(dataL))

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

def getDataForFormatCase():(String,String) = {

  print("Enter a name to format : ")
  val name = scala.io.StdIn.readLine()

  print("Enter a format type : ")
  val format = scala.io.StdIn.readLine()

  (name,format)

}

val tuple = getDataForFormatCase()
println("Using "+tuple._2+" format on " + tuple._1 + " : " + formatNames(tuple._1,tuple._2,toLower,toUpper))



////////////////////////////////////////////////////////////////////////////////////////////////////

def Encryption(x:String,shift:Int):String={

  val encrypted = x.map(y=>(y+shift).toChar).mkString

  encrypted

}

////////////////////////////////////////////////////////////////////////////////////////////////////

def Decryption(x:String,shift:Int):String={

  val decrypted = x.map(y=>(y-shift).toChar).mkString  

  decrypted

}

///////////////////////////////////////////////////////////////////////////////////////////////////

def getData():(String,Int)={

  print("Enter a string to encrypt : ")
  val input = scala.io.StdIn.readLine()

  print("Enter the no of shifts in alphebat : ")
  val shift = scala.io.StdIn.readInt()

  (input,shift)

}

////////////////////////////////////////////////////////////////////////////////////////////////////

def Cipher(string:String, shift:Int, function:(String, Int)=>String):String = function(string, shift)

/////////////////////////////////////////////////////////////////////////////////////////////////////

val tuple = getData()

val string = Cipher(tuple._1,tuple._2,Encryption)

println("After encrypted : " + string)

val last = Cipher(string,tuple._2,Decryption)

println("After decrypted : " + last)


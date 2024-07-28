var i=0

def getStudentInfo():Unit={

    print("\nEnter student name : ")
    val name = scala.io.StdIn.readLine()

    print("Enter student's marks : ")
    val marks = scala.io.StdIn.readInt()

    print("Enter student's total possible marks : ")
    val totalMarks = scala.io.StdIn.readInt()

    print("\n")

    var grade = 'a'

    val percentage = ((marks*100.0)/totalMarks)

    if(percentage >= 90){
        
        grade = 'A'
    
      }else if(percentage >= 75){

        grade = 'B'

      }else if(percentage >= 50){

        grade = 'C'
      
    }else{
        
        grade = 'D'
    }

    val returns = validateInput(name, marks, totalMarks)

    if(returns._1){

      printStudentRecord(getStudentInfoWithRetry(name, marks,totalMarks,percentage, grade))

    } else{

      for(i<-0 to (returns._2).length-1){

        println(returns._2(i))

      }

       getStudentInfo()

    }


}
//////////////////////////////////////////////////////////////////////////////////////////////////
def printStudentRecord(tuple:(String, Int, Int, Double, Char))={

  println("Student's name       : "+tuple._1)
  println("Student's marks      : "+tuple._2)
  println("Student's totalMarks : "+tuple._3)
  println("Student's percentage : "+tuple._4)
  println("Student's grade      : "+tuple._5)

}
//////////////////////////////////////////////////////////////////////////////////////////////////
def validateInput(name:String, marks:Int, totalMarks:Int):(Boolean,Array[String])={

  var isValid = true
  var errorMsg = Array.empty[String]
  

  if(name ==""){

    errorMsg :+="[ERROR]Name can not be empty"
    isValid = false

  }

  if(marks < 0){
    
    errorMsg :+="[ERROR]Marks shold be a  positive integer"
    isValid = false

  }

  if(marks > totalMarks){
    
    errorMsg :+="[ERROR]Marks can not exceeding the total possible marks"
    isValid = false

  }

  (isValid, errorMsg)

}
/////////////////////////////////////////////////////////////////////////////////////////
def getStudentInfoWithRetry(name:String, marks:Int, totalMarks:Int, percentage:Double, grade:Char):(String, Int, Int, Double, Char)={

  val tuple = (name,marks,totalMarks,percentage,grade)

  tuple

}

getStudentInfo()

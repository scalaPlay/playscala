class Student (name: String, ban: Int, no: Int, kor: Int, eng: Int, math: Int, total: Int, schoolRank: Int) {

	var name: String
	var ban: Int
	var no : Int
	var kor: Int
	var eng: Int
	var math: Int

	var total: Int
	var schoolRank: Int
	
	/*
	def student ( name: String, ban: Int, no: Int, kor: Int, eng: Int, math: Int) : Student =  {
		var student: Student
		this.name = name
		this.ban = ban
		this.no = no
		this.kor = kor
		this eng = eng
		this.math = math

		return
	}*/

	def getTotal() : Int = {
		
		total = kor + eng + math
		
		return total

	} 

	def getAverage() : Float = {

		//과목 객체를 만들어서 카운팅해야 평균을 유동적으로 할 수 있음
		return getTotal() / 6
	}

	override def toString() : String = {


		"name : " + name + " ban : " + ban  + " no : " + no + " kor : " + kor + " eng : " + eng + " math : " + math
	}
}
	

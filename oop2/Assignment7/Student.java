class Student{
	private int id;
	private float per;
	
	public Student(){}
	public Student(int id, float per){
		this.id = id;
		this.per = per;
	}

	public void getGrade(){
		if(per>=90){
			System.out.println("Excellent.");
		}
		else if(per>=80){
			System.out.println("Very good.");
		}
		else if(per>=70){
			System.out.println("Good.");
		}
		else if(per>=60){
			System.out.println("Average.");
		}
		else if(per>=40){
			System.out.println("Pass.");
		}
		else{
			System.out.println("Fail.");
		}
	}
}
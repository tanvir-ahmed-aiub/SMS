public class Student{
	private String sName;
	private String sId;
	
	public Student(){}
	public Student(String sName, String sId){
		this.sName = sName;
		this.sId = sId;
	}
	public void setName(String sName){
		this.sName = sName;
	}
	public void setId(String sId){
		this.sId = sId;
	}
	public String getName(){
		return sName;
	}
	public String getId(){
		return sId;
	}
	public void showInfo(){
		System.out.println("Name: " + sName);
		System.out.println("Id: " + sId);
		
	}
	
	
	
}
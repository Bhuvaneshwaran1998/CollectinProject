package Stream;

	public class Players {
	private int age ;
	private int jersey_No;
	private int run;
	private String name;
	private  String team;
	
public Players(String team,String name,int age,int run,int jersey_No) {
	this.team=team;
	this.run=run;
	this.jersey_No=jersey_No;
	this.name=name;
	this.age=age;

	}

	public int getAge() {
	return age;
	}
	public void setAge(int age) {
	this.age = age;
	}
	public int getJersey_No() {
	return jersey_No;
	}
	public void setJersey_No(int jersey_No) {
	this.jersey_No = jersey_No;
	}
	public int getRun() {
	return run;
	}
	public void setRun(int run) {
	this.run = run;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getTeam() {
	return team;
	}
	public void setTeam(String team) {
	this.team = team;
	}
	public String toString() {
	return name+" "+team+" "+run+" "+age+" "+jersey_No;
	}
	}




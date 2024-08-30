package Jpa11.JpaOneToMany1;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Student11 {
	@Id
	private int sid;
	private String sname;
	private String scity;
	@OneToMany
	private List<Courses11>courses11;
	public Student11() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student11(int sid, String sname, String scity, List<Courses11> courses11) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
		this.courses11 = courses11;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public List<Courses11> getCourses11() {
		return courses11;
	}
	public void setCourses11(List<Courses11> courses11) {
		this.courses11 = courses11;
	}
	@Override
	public String toString() {
		return "Student11 [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", courses11=" + courses11 + "]";
	}


		
	
	
	

}

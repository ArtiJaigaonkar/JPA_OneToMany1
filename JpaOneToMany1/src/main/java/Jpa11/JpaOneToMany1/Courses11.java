package Jpa11.JpaOneToMany1;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Courses11 {
	@Id
	private int cid;
	private String cname;
	private int sduration;
	public Courses11() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Courses11 [cid=" + cid + ", cname=" + cname + ", sduration=" + sduration + "]";
	}
	public Courses11(int cid, String cname, int sduration) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.sduration = sduration;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getSduration() {
		return sduration;
	}
	public void setSduration(int sduration) {
		this.sduration = sduration;
	}
	
	

}

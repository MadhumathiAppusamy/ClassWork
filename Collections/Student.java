package Collections;

public class Student {
      public String sname;
      public int sid;
      public int sage;
	public Student() {
		super();
	
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public Student(String sname, int sid, int sage) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.sage = sage;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + ", sage=" + sage + ", getSname()=" + getSname()
				+ ", getSid()=" + getSid() + ", getSage()=" + getSage() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}

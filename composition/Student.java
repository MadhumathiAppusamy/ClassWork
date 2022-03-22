package composition;

public class Student {
      private String sname;
      private int sid;
      private int sage;
      public Address ad=new Address();
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
		return "Student [sname=" + sname + ", sid=" + sid + ", sage=" + sage + ", ad=" + ad + "]";
	}
	
}

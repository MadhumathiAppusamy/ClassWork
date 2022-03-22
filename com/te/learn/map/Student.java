package com.te.learn.map;

public class Student implements Comparable{
	public String sname;
	public int sid;
	public int sage;
	public Student() {
		super();
	
	}
	public Student(String sname, int sid, int sage) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.sage = sage;
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
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + ", sage=" + sage + ", getSname()=" + getSname()
				+ ", getSid()=" + getSid() + ", getSage()=" + getSage() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int compareTo(Object o) {
		Student a=new Student();
		if(this.sage>0)
			return 1;
		else if(this.sage<0)
			return -1;
		return 0;
	}

}

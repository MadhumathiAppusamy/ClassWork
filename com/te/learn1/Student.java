package com.te.learn1;

public class Student {
    public String sname;
    public int sage;
    public int id;
	public Student(String string, int i, int j) {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sage=" + sage + ", id=" + id + ", getSname()=" + getSname()
				+ ", getSage()=" + getSage() + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
   
}

package co.edureka.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE", schema = "java75")
public class Employee {
	@Id
	@Column(name="EMPNO", nullable = false, unique = true, length = 5)	
	private Integer empno;
	
	@Column(name="NAME", length=20)
	private String ename;
	
	@Column(name="SAL", length=10, precision = 2)
	private Float sal;

	public Employee() {	}

	public Employee(Integer empno, String ename, Float sal) {		
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Float getSal() {
		return sal;
	}

	public void setSal(Float sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}

}

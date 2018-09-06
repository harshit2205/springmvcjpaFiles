package com.cg.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Employee {

	@NotNull(message="Empno is mandatory")
	private Integer empno;
	
	
	@NotNull(message="Name is mandatory")
	@Pattern(regexp="[A-Za-z]{3,15}",
	message="Name should contain min 3 and max 15 letters")
	private String empName;
	
	
	@NotNull(message="Age is mandatory")
	private Integer age;
	
	
	public Employee(){
		
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public void setEmpno(Integer empno){
		this.empno = empno;
	}
	public Integer getEmpno() {
		return empno;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empName=" + empName + ", age="
				+ age + "]";
	}

	
	
	
	
	
}

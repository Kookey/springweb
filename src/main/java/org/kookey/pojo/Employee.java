package org.kookey.pojo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 
 * @author admin
 * +----------+--------------+------+-----+---------+----------------+
| Field    | Type         | Null | Key | Default | Extra          |
+----------+--------------+------+-----+---------+----------------+
| id       | int(11)      | NO   | PRI | NULL    | auto_increment |
| name     | varchar(255) | YES  |     | NULL    |                |
| job      | varchar(255) | YES  |     | NULL    |                |
| age      | int(11)      | YES  |     | NULL    |                |
| sex      | tinyint(1)   | YES  |     | NULL    |                |
| salary   | double       | YES  |     | NULL    |                |
| address  | varchar(255) | YES  |     | NULL    |                |
| birthday | date         | YES  |     | NULL    |                |
| married  | varchar(255) | YES  |     | NULL    |                |
+----------+--------------+------+-----+---------+----------------+
 */
public class Employee implements Serializable {

	private static final long serialVersionUID = 7106021178901861040L;

	private int id;
	private String name;
	private String job;
	private int age;
	private boolean sex;
	private double salary;
	private String address;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	private String married;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getMarried() {
		return married;
	}

	public void setMarried(String married) {
		this.married = married;
	}
}

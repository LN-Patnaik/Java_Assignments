package treemapPackage;

public class Contact implements Comparable<Contact>
{
	private Long phno;
	private String name;
	private String email;
	enum Gender
	{
		male,female;
	}
	 private Gender gen;
	
	
	public Contact(Long phno, String name, String email, Gender gen) {
		super();
		this.phno = phno;
		this.name = name;
		this.email = email;
		this.gen = gen;
	}
	


	public Long getPhno() {
		return phno;
	}



	public void setPhno(Long phno) {
		this.phno = phno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Gender getGen() {
		return gen;
	}



	public void setGen(Gender gen) {
		this.gen = gen;
	}



	@Override
	public String toString() {
		return "Contact [phno=" + phno + ", name=" + name + ", email=" + email + ", Gender=" + gen + "]";
	}


	@Override
	public int compareTo(Contact o) {
		// TODO Auto-generated method stub
		return this.getPhno().compareTo(o.getPhno());
		//return Long.compare(o.getPhno(),this.getPhno());
	}


	

	
}

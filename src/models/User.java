package models;

import static com.google.common.base.MoreObjects.toStringHelper;
import com.google.common.base.Objects;

public class User {
	public long userId;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	public String job;
	public long zipcode;
	
	
	
	public User(long userId,String firstName, String lastName, int age, String gender, String job, long zipcode){
		super();
		this.firstName =firstName;
		this.lastName =lastName;
		this.age = age;
		this.zipcode = zipcode;	
		this.gender = gender;
		this.job = job;
		this.userId = userId;
	}

	
	@Override
	public String toString()
	{
		 return toStringHelper(this).addValue(firstName)
                 .addValue(lastName)
                 .addValue(age)
                 .addValue(gender) 
                 .addValue(job)
                 .addValue(zipcode)
                 .toString();
	}

	
	

	public long getUserId() {
		return userId;
	}



	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public int getAge() {
		return age;
	}



	public String getGender() {
		return gender;
	}



	public String getJob() {
		return job;
	}



	public long getZipcode() {
		return zipcode;
	}



	public void setUserId(long userId) {
		this.userId = userId;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public void setJob(String job) {
		this.job = job;
	}



	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}

		
	
	@Override 
	public int hashCode()
	{
		return Objects.hashCode(this.firstName, this.lastName, this.age, this.gender,this.job,this.zipcode);
	}
	
	
	@Override
	  public boolean equals(final Object obj)
	  {
	    if (obj instanceof User)
	    {
	      final User other = (User) obj;
	      return Objects.equal(firstName, other.firstName) 
	          && Objects.equal(lastName,  other.lastName)
	          && Objects.equal(age,     other.age)
	          && Objects.equal(gender,  other.gender)
	          && Objects.equal(job,  other.job)
	          && Objects.equal(zipcode,  other.zipcode);
	      
	    }
	    else
	    {
	      return false;
	    }
	  }
	
}

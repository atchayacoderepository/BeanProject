package DependanciesPro.DevlopePro.Bean;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class Use 
{
	private Integer id;

	private String name;

	private Date birthDate;

	protected Use() {

	}

	public Use(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
@Autowired
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Autowired
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s, birthDate=%s]", id, name, birthDate);
	}
}




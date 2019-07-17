package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "artical")
public class Artical {
	
	@Id
	private long code;
	@Column
	private String name;
	@Column
	private String display_name;
	@Column
	private boolean isActive;
	@OneToOne()
	@JoinColumn(name = "group_id", referencedColumnName = "id")
	private Group group;
	@OneToOne()
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;
	
	
	public Artical () {
		// TODO Auto-generated constructor stub
	}


	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplay_name() {
		return display_name;
	}

	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	public Group getGroup() {
		return group;
	}
	
	
	public void setGroup(Group group) {
		this.group = group;
	}
	
	
}

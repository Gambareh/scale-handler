package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private Users user;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "group_id")
	private Groups groups;
	
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
	
	
	
	
	
}

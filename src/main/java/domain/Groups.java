package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="groups")
public class Groups {
	@Id
	private int group_id;
	
	@Column(name = "group_name")
	private String groupName;
	

	public Groups () {
		// TODO Auto-generated constructor stub
	}

	
	public int getGroup_id() {
		return group_id;
	}

	
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	
	public String getGroupName() {
		return groupName;
	}

	
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	
	
}

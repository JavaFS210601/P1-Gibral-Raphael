package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ers_reimbursement_type")
public class ERS_Reimbursement_Type {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reimb_type_id")
	private int type_id;
	
	@Column(name = "reimb_type")
	private String type;

	public ERS_Reimbursement_Type() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ERS_Reimbursement_Type(int type_id, String type) {
		super();
		this.type_id = type_id;
		this.type = type;
	}

	public ERS_Reimbursement_Type(String type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "ERS_Reimbursement_Type [type_id=" + type_id + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + type_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ERS_Reimbursement_Type other = (ERS_Reimbursement_Type) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (type_id != other.type_id)
			return false;
		return true;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}

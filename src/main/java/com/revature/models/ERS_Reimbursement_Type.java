package com.revature.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	
	@OneToMany
	@JoinColumn(name = "reimb_type_id")
	private Set<ERS_Reimbursement> types;

	public ERS_Reimbursement_Type() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ERS_Reimbursement_Type(int type_id, String type, Set<ERS_Reimbursement> types) {
		super();
		this.type_id = type_id;
		this.type = type;
		this.types = types;
	}
	
	

	public ERS_Reimbursement_Type(String type, Set<ERS_Reimbursement> types) {
		super();
		this.type = type;
		this.types = types;
	}

	@Override
	public String toString() {
		return "ERS_Reimbursement_Type [type_id=" + type_id + ", type=" + type + ", types=" + types + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + type_id;
		result = prime * result + ((types == null) ? 0 : types.hashCode());
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
		if (types == null) {
			if (other.types != null)
				return false;
		} else if (!types.equals(other.types))
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

	public Set<ERS_Reimbursement> getTypes() {
		return types;
	}

	public void setTypes(Set<ERS_Reimbursement> types) {
		this.types = types;
	}

	

}

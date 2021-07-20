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
@Table(name = "ers_reimbursement_status")
public class ERS_Reimbursement_Status {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reimb_status_id")
	private int status_id;
	
	@Column(name = "reimb_status")
	private String status;
	
	@OneToMany
	@JoinColumn(name = "reimb_status_id")
	private Set<ERS_Reimbursement> statusReimb;

	public ERS_Reimbursement_Status() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ERS_Reimbursement_Status(int status_id, String status, Set<ERS_Reimbursement> statusReimb) {
		super();
		this.status_id = status_id;
		this.status = status;
		this.statusReimb = statusReimb;
	}

	public ERS_Reimbursement_Status(String status, Set<ERS_Reimbursement> statusReimb) {
		super();
		this.status = status;
		this.statusReimb = statusReimb;
	}

	@Override
	public String toString() {
		return "ERS_Reimbursement_Status [status_id=" + status_id + ", status=" + status + ", statusReimb="
				+ statusReimb + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((statusReimb == null) ? 0 : statusReimb.hashCode());
		result = prime * result + status_id;
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
		ERS_Reimbursement_Status other = (ERS_Reimbursement_Status) obj;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (statusReimb == null) {
			if (other.statusReimb != null)
				return false;
		} else if (!statusReimb.equals(other.statusReimb))
			return false;
		if (status_id != other.status_id)
			return false;
		return true;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<ERS_Reimbursement> getStatusReimb() {
		return statusReimb;
	}

	public void setStatusReimb(Set<ERS_Reimbursement> statusReimb) {
		this.statusReimb = statusReimb;
	}

	
	
	

}

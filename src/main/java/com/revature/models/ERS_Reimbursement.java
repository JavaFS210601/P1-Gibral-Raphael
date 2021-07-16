package com.revature.models;

import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ers_reimbursement")
public class ERS_Reimbursement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reimb_id")
	private int id;
	
	@Column(name = "reimb_amount")
	private int amount;
	
	@Column(name = "reimb_submitted")
	private java.time.LocalDateTime submitted;
	
	@Column(name = "reimb_resolved")
	private java.time.LocalDateTime resolved;
	
	@Column(name = "reimb_description")
	private String description;
	
	@Lob
    @Column(name="reimb_receipt")
	private byte[] receipt;
	
	@OneToMany(mappedBy="ers_user", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@Column(name = "reimb_author")
	private int author;
	
	@OneToMany(mappedBy="ers_user", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@Column(name = "reimb_resolver")
	private int resolver;
	
	@OneToMany(mappedBy="ers_reimbursement_status", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@Column(name = "reimb_status_id")
	private int status_id;
	
	@OneToMany(mappedBy="ers_reimbursement_type", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@Column(name = "reimb_type_id")
	private int type_id;

	public ERS_Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ERS_Reimbursement(int id, int amount, LocalDateTime submitted, LocalDateTime resolved, String description,
			byte[] receipt, int author, int resolver, int status_id, int type_id) {
		super();
		this.id = id;
		this.amount = amount;
		this.submitted = submitted;
		this.resolved = resolved;
		this.description = description;
		this.receipt = receipt;
		this.author = author;
		this.resolver = resolver;
		this.status_id = status_id;
		this.type_id = type_id;
	}

	public ERS_Reimbursement(int amount, LocalDateTime submitted, LocalDateTime resolved, String description,
			byte[] receipt, int author, int resolver, int status_id, int type_id) {
		super();
		this.amount = amount;
		this.submitted = submitted;
		this.resolved = resolved;
		this.description = description;
		this.receipt = receipt;
		this.author = author;
		this.resolver = resolver;
		this.status_id = status_id;
		this.type_id = type_id;
	}

	@Override
	public String toString() {
		return "ERS_Reimbursement [id=" + id + ", amount=" + amount + ", submitted=" + submitted + ", resolved="
				+ resolved + ", description=" + description + ", receipt=" + Arrays.toString(receipt) + ", author="
				+ author + ", resolver=" + resolver + ", status_id=" + status_id + ", type_id=" + type_id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + author;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + Arrays.hashCode(receipt);
		result = prime * result + ((resolved == null) ? 0 : resolved.hashCode());
		result = prime * result + resolver;
		result = prime * result + status_id;
		result = prime * result + ((submitted == null) ? 0 : submitted.hashCode());
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
		ERS_Reimbursement other = (ERS_Reimbursement) obj;
		if (amount != other.amount)
			return false;
		if (author != other.author)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (!Arrays.equals(receipt, other.receipt))
			return false;
		if (resolved == null) {
			if (other.resolved != null)
				return false;
		} else if (!resolved.equals(other.resolved))
			return false;
		if (resolver != other.resolver)
			return false;
		if (status_id != other.status_id)
			return false;
		if (submitted == null) {
			if (other.submitted != null)
				return false;
		} else if (!submitted.equals(other.submitted))
			return false;
		if (type_id != other.type_id)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public java.time.LocalDateTime getSubmitted() {
		return submitted;
	}

	public void setSubmitted(java.time.LocalDateTime submitted) {
		this.submitted = submitted;
	}

	public java.time.LocalDateTime getResolved() {
		return resolved;
	}

	public void setResolved(java.time.LocalDateTime resolved) {
		this.resolved = resolved;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getReceipt() {
		return receipt;
	}

	public void setReceipt(byte[] receipt) {
		this.receipt = receipt;
	}

	public int getAuthor() {
		return author;
	}

	public void setAuthor(int author) {
		this.author = author;
	}

	public int getResolver() {
		return resolver;
	}

	public void setResolver(int resolver) {
		this.resolver = resolver;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	
	

}

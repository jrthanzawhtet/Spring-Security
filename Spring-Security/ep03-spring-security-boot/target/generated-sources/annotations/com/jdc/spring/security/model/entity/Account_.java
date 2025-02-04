package com.jdc.spring.security.model.entity;

import com.jdc.spring.security.model.entity.Account.Role;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;
import java.util.UUID;

@StaticMetamodel(Account.class)
public abstract class Account_ {

	public static final String PASSWORD = "password";
	public static final String ROLE = "role";
	public static final String ACTIVATED_AT = "activatedAt";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String EMAIL = "email";
	public static final String REQUEST_AT = "requestAt";
	public static final String ACTIVATED = "activated";

	
	/**
	 * @see com.jdc.spring.security.model.entity.Account#password
	 **/
	public static volatile SingularAttribute<Account, String> password;
	
	/**
	 * @see com.jdc.spring.security.model.entity.Account#role
	 **/
	public static volatile SingularAttribute<Account, Role> role;
	
	/**
	 * @see com.jdc.spring.security.model.entity.Account#activatedAt
	 **/
	public static volatile SingularAttribute<Account, LocalDateTime> activatedAt;
	
	/**
	 * @see com.jdc.spring.security.model.entity.Account#name
	 **/
	public static volatile SingularAttribute<Account, String> name;
	
	/**
	 * @see com.jdc.spring.security.model.entity.Account#id
	 **/
	public static volatile SingularAttribute<Account, UUID> id;
	
	/**
	 * @see com.jdc.spring.security.model.entity.Account
	 **/
	public static volatile EntityType<Account> class_;
	
	/**
	 * @see com.jdc.spring.security.model.entity.Account#email
	 **/
	public static volatile SingularAttribute<Account, String> email;
	
	/**
	 * @see com.jdc.spring.security.model.entity.Account#requestAt
	 **/
	public static volatile SingularAttribute<Account, LocalDateTime> requestAt;
	
	/**
	 * @see com.jdc.spring.security.model.entity.Account#activated
	 **/
	public static volatile SingularAttribute<Account, Boolean> activated;

}


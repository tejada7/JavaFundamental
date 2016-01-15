/**
 * @(#)User.java			14/01/2016
 * 
 * Copyright (c) 2016 EPITA.
 * 14/16 Rue Voltaire, 94276 Kremlin Bicêtre Cedex, France
 * 
 * Adapted with permission from JAVA CODE CONVENTIONS. Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. http://java.sun.com/docs/codeconv/
 *
 * This software is part of an academic project of EPITA  
 */


package com.hf.funproject.dao;

import com.hf.funproject.datamodel.Identity;

/**
 * interfaces IdentityDAOInterface
 * @author Favio
 *
 */
public interface IdentityDAOInterface {

	/* Defining methods */
	
	public void create(Identity identity);
	
	public void readAll();
	
	public void search(Identity identity);
	
	public void modify(Identity identity);
	
	public void delete(Identity identity);
}

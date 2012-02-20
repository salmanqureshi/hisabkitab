package com.conradlabs

import grails.plugin.multitenant.core.groovy.compiler.MultiTenant;

@MultiTenant
class Project {
	String name

    static constraints = {
    }
}

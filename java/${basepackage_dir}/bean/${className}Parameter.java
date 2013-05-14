<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.model;

import java.io.Serializable;
import ${basepackage}.model.BaseParameterSupport


public class ${className}Parameter extends BaseParameterSupport implements java.io.Serializable{
	private static final long serialVersionUID = 8751282105532159742L;

	<#list table.columns as column>
	private ${column.javaType} ${column.columnNameLower};
	</#list>


	<#list table.columns as column>
	public ${className} set${column.columnName}(${column.javaType} ${column.columnName}) {
		this.${column.columnNameLower} = ${column.columnName};
		return this;
	}
	
	public ${column.javaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	</#list>

}

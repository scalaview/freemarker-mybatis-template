<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.dao;

public class TableConstants{

	<#list table.columns as column>
	public static String ${table.sqlName} = ${className};
	</#list>
}

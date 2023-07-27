<%@ include file="init.jsp"%>

<p>
	<b><liferay-ui:message key="firstweb.caption" /></b>
</p>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/clay" prefix="clay"%>

<portlet:actionURL name="submitForm" var="actionURL" />

<aui:form action="${actionURL}">
	<aui:input name="firstname"></aui:input>
	<aui:button type="submit"></aui:button>
</aui:form>
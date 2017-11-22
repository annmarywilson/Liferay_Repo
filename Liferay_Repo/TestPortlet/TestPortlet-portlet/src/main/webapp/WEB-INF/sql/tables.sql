create table TestPortlet_Employee (
	employeeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	employeeName VARCHAR(75) null,
	employeeDesignation VARCHAR(75) null,
	address VARCHAR(75) null,
	email VARCHAR(75) null,
	phoneNumber VARCHAR(75) null
);

create table TestPortlet_Employee_portlet (
	employeeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	address VARCHAR(75) null,
	email VARCHAR(75) null,
	phoneNumber VARCHAR(75) null,
	password_ VARCHAR(75) null
);

create table TestPortlet_Foo (
	uuid_ VARCHAR(75) null,
	fooId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	field1 VARCHAR(75) null,
	field2 BOOLEAN,
	field3 INTEGER,
	field4 DATE null,
	field5 VARCHAR(75) null
);
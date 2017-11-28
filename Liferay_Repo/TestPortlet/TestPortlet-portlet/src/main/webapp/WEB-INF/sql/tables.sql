create table TestPortlet_Employee (
	employeeId LONG not null primary key,
	groupId LONG,
	employeeName VARCHAR(75) null,
	employeeDesignation VARCHAR(75) null,
	address VARCHAR(75) null,
	email VARCHAR(75) null,
	phoneNumber VARCHAR(75) null,
	fileEntryId LONG
);
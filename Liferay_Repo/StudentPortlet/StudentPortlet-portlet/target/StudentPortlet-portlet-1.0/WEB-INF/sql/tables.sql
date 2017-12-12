create table StudentPortlet_Address (
	addressId LONG not null primary key,
	studentId LONG,
	groupId LONG,
	parentAddress VARCHAR(75) null,
	parentState VARCHAR(75) null,
	parentDistrict VARCHAR(75) null,
	parentPin VARCHAR(75) null,
	parentPhone VARCHAR(75) null,
	parentMail VARCHAR(75) null
);

create table StudentPortlet_Student (
	studentId LONG not null primary key,
	groupId LONG,
	studentName VARCHAR(75) null,
	studentClass VARCHAR(75) null,
	studentEmail VARCHAR(75) null,
	phoneNumber VARCHAR(75) null
);
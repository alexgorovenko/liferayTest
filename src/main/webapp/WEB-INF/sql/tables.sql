create table testtask_Bank (
	bankId LONG not null primary key,
	bankName VARCHAR(75) null,
	bik VARCHAR(75) null,
	adres VARCHAR(75) null
);

create table testtask_Employees (
	empId LONG not null primary key,
	firstName VARCHAR(75) null,
	secondName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	gender VARCHAR(75) null,
	birthday DATE null,
	emplPosition LONG,
	startWork DATE null,
	salary LONG,
	workPhoneNumber VARCHAR(75) null,
	phoneNumber VARCHAR(75) null,
	bank LONG,
	isArchived BOOLEAN
);

create table testtask_Positions (
	positionId LONG not null primary key,
	positionName VARCHAR(75) null,
	isArchived BOOLEAN
);

create table testtask_bank (
	bankId LONG not null primary key,
	bankName VARCHAR(75) null,
	bik VARCHAR(75) null,
	adres VARCHAR(75) null
);

create table testtask_Employees (
	empId LONG not null primary key,
	firstName VARCHAR(75) null,
	secondName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	gender VARCHAR(75) null,
	birthday DATE null,
	emplPosition LONG,
	startWork DATE null,
	salary LONG,
	workPhoneNumber VARCHAR(75) null,
	phoneNumber VARCHAR(75) null,
	bank LONG,
	isArchived BOOLEAN
);

create table testtask_positions (
	positionId LONG not null primary key,
	positionName VARCHAR(75) null,
	isArchived BOOLEAN
);
create index IX_7C3AA23F on TestPortlet_Employee (groupId);

create index IX_AF0ECFA4 on TestPortlet_Employee_portlet (groupId);

create index IX_44BD1BC1 on TestPortlet_Foo (field2);
create index IX_AF23B775 on TestPortlet_Foo (groupId);
create index IX_8B3AA33F on TestPortlet_Foo (uuid_);
create index IX_EB033389 on TestPortlet_Foo (uuid_, companyId);
create unique index IX_F9A5084B on TestPortlet_Foo (uuid_, groupId);
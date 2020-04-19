alter table SESSIONPLANNER_SESSION alter column SESSIONEND rename to SESSIONEND__U94305 ^
alter table SESSIONPLANNER_SESSION alter column SESSIONSTART rename to SESSIONSTART__U79697 ^
alter table SESSIONPLANNER_SESSION add column SESSIONSTART timestamp ^
update SESSIONPLANNER_SESSION set SESSIONSTART = current_timestamp where SESSIONSTART is null ;
alter table SESSIONPLANNER_SESSION alter column SESSIONSTART set not null ;
alter table SESSIONPLANNER_SESSION add column SESSIONEND timestamp ;

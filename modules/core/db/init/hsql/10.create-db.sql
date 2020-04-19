-- begin SESSIONPLANNER_SPEAKER
create table SESSIONPLANNER_SPEAKER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRSTNAME varchar(255) not null,
    LASTNAME varchar(255),
    EMAIL varchar(255) not null,
    --
    primary key (ID)
)^
-- end SESSIONPLANNER_SPEAKER
-- begin SESSIONPLANNER_SESSION
create table SESSIONPLANNER_SESSION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TOPIC varchar(255) not null,
    SESSIONSTART timestamp not null,
    SESSIONEND timestamp,
    SPEAKER_ID varchar(36) not null,
    DESCRIPTION varchar(255),
    --
    primary key (ID)
)^
-- end SESSIONPLANNER_SESSION

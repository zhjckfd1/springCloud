create table cloud.properties (
    key varchar(2048) not null,
    value varchar(4096) not null,
    application varchar(128) not null,
    profile varchar(128) not null,
    label varchar(1024) not null,
    PRIMARY KEY (key, application, profile, label)
);

insert into cloud.properties (key, value, application, profile, label) values
    ('key1', 'value1', 'SC', 'default', 'latest'),
    ('key2', 'value2', 'SC', 'default', 'latest'),
    ('key3', 'value3', 'SC', 'default', 'latest');
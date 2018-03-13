alter table users add constraint pk_user primary key (id);
alter table role add constraint pk_role primary key (id);
alter table users add constraint fk_role FOREIGN key (roleid) REFERENCES role(id);
alter table listenguideline add constraint pk_listenguideline primary key (id);
alter table comments add constraint pk_comments primary key (id);
alter table comments add constraint fk_user FOREIGN key (userid) REFERENCES users(id);
alter table comments add constraint fk_listenguideline FOREIGN key (listenguidelineid) REFERENCES listenguideline(id);


drop table gir_fir;

create table girl_fir(
 girl_id int not null primary key auto_increment,
  beuty varchar(255) not null,
  tall int not null,
  created_date datetime null default now()
);

insert into girl_fir(beuty, tall)
values('이쁨', '160');

insert into girl_fir(beuty, tall)
values('보통', '170');

insert into girl_fir(beuty, tall)
values('못생김', '180');

select
beuty,
tall
from 
girl_fir
where tall>160;

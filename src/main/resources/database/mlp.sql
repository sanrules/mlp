create table if not exists category
(
    id          bigint auto_increment
        primary key,
    description varchar(50) null
);

create table if not exists product
(
    id      bigint auto_increment
        primary key,
    name    varchar(50) null,
    variety varchar(50) null
);

create table if not exists product_category
(
    idProduct  bigint not null,
    idCategory bigint not null,
    constraint idCategory_product_category_fk
        foreign key (idCategory) references category (id)
            on delete cascade,
    constraint idProduct_product_category_fk
        foreign key (idProduct) references product (id)
            on delete cascade
);

create table if not exists product_price
(
    date      date   not null,
    idProduct bigint not null,
    costPrice float  null,
    sellPrice float  null,
    primary key (date, idProduct),
    constraint idProduct_product_price_fk
        foreign key (idProduct) references product (id)
            on update set default on delete cascade
);

create table if not exists user
(
    id           varchar(50) not null
        primary key,
    name         varchar(45) null,
    surname      varchar(45) null,
    email        varchar(45) null,
    birth_date   datetime    null,
    phone_number varchar(45) null
);



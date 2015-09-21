drop TABLE JEPUM;
drop TABLE CART;

select * FROM CART;
SELECT * FROM JEPUM;

CREATE TABLE JEPUM(
code NUMBER primary key not NULL,
name VARCHAR2(30),
company VARCHAR2(30),
cost NUMBER
);

CREATE TABLE CART(
code NUMBER,
su NUMBER
);

INSERT into JEPUM values (1000, '노트북', '삼성전자', 1000000);
INSERT into JEPUM values (1001, '컴퓨터', 'LG전자', 1200000);
INSERT into JEPUM values (1002, '세탁기', '삼성전자', 500000);

COMMIT;

--BOOK TABLE �ۼ�
CREATE TABLE Book(
num NUMBER primary key not NULL,
title VARCHAR2(30),
company VARCHAR2(20),
name VARCHAR2(10),
price NUMBER
);
SELECT * FROM book ORDER BY num asc;

INSERT into book values(1,'Ű������', '���ϳ���', '�达',83000);
INSERT into book values(2,'�ٳ����±������', '���ϳ���', '�̾�',37000);
INSERT into book values(3,'���ھ��¾þ������ ', '���ϳ���', '�ھ�',10000);
INSERT into book values(4,'�ǻ�������', '��������', '�־�',20000);
INSERT into book values(5,'����������', '���ݷ���', '����',30000);
INSERT into book values(6,'��ǳ�ٱ���', '��ȭ������', '�⾾',40000);
INSERT into book values(7,'����Ÿ���', '����', '�澾',50000);
INSERT into book values(8,'�����̴¿���Ƣ���', '��䳪��', '�ž�',60000);
INSERT into book values(9,'��ġ����������䳪��', '��䳪��', '�¾�',70000);
INSERT into book values(10,'�ܰ������Ȱ�', '���ҸӴ���', '�ι',80000);

drop TABLE book;

COMMIT;
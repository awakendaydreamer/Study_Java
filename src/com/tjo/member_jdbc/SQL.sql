--Member Table ����
CREATE TABLE Member(
	NUM NUMBER primary key Not NULL,
    name VARCHAR2(10),
    age NUMBER,
    addr VARCHAR2(50),
    tel VARCHAR2(20)
);

--Member Table ����
Drop TABLE Member;

--���ڵ� ����
INSERT into member values(1, 'ȫ�浿', 30, '���ֽ� ���� ��õ��', '010-1111-1111');
INSERT into member values(2, '�ڹ���', 25, '���ֽ� ���� ������', '010-2222-2222');

--��üȸ����� �˻�
SELECT * FROM member ORDER BY num asc;

--Ŀ�� ���
COMMIT;
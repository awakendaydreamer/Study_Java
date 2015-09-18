--BOOK TABLE 작성
CREATE TABLE Book(
num NUMBER primary key not NULL,
title VARCHAR2(30),
company VARCHAR2(20),
name VARCHAR2(10),
price NUMBER
);
SELECT * FROM book ORDER BY num asc;

INSERT into book values(1,'키위먹자', '과일나라', '김씨',83000);
INSERT into book values(2,'바나나는까야제맛', '과일나라', '이씨',37000);
INSERT into book values(3,'수박씨는씹어야제맛 ', '과일나라', '박씨',10000);
INSERT into book values(4,'건빵은군대', '군대출판', '최씨',20000);
INSERT into book values(5,'술꾼의최후', '알콜랜드', '무씨',30000);
INSERT into book values(6,'단풍잎구경', '문화관광부', '기씨',40000);
INSERT into book values(7,'랍스타비쌈', '쿠팡', '경씨',50000);
INSERT into book values(8,'떡볶이는역시튀김과', '김밥나라', '신씨',60000);
INSERT into book values(9,'김치볶음밥은김밥나라', '김밥나라', '좌씨',70000);
INSERT into book values(10,'단감다음꽂감', '외할머니집', '콩씨',80000);

drop TABLE book;

COMMIT;
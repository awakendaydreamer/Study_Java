--Member Table 생성
CREATE TABLE Member(
	NUM NUMBER primary key Not NULL,
    name VARCHAR2(10),
    age NUMBER,
    addr VARCHAR2(50),
    tel VARCHAR2(20)
);

--Member Table 제거
Drop TABLE Member;

--레코드 삽입
INSERT into member values(1, '홍길동', 30, '광주시 서구 광천동', '010-1111-1111');
INSERT into member values(2, '박문수', 25, '광주시 동구 서석동', '010-2222-2222');

--전체회원목록 검색
SELECT * FROM member ORDER BY num asc;

--커밋 명령
COMMIT;
package codingtest.week7;

 <!-- 조건에 맞는 도서와 저자 리스트 출력하기 sql -->

    SELECT BOOK_ID, AUTHOR_NAME, DATE_FORMAT(PUBLISHED_DATE , '%y-%m-%d') AS PUBLISHED_DATE
    FROM BOOK AS B JOIN AUTHOR A
    ON B.AUTHOR_ID = A.AUTHOR_ID
    WHERE B.CATEGORY IN ('경제')
    ORDER BY PUBLISHED_DATE ASC;


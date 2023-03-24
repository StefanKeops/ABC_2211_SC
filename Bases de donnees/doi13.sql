CREATE VIEW doi13 AS
SELECT  ename, DATE_FORMAT (hiredate, "%W") AS jour_de_la_semaine
FROM emp
CREATE VIEW doi12 AS
SELECT  r.ename, r.hiredate
FROM emp r
JOIN emp s ON r.hiredate = s.hiredate AND s.deptno = 30
WHERE r.deptno =20
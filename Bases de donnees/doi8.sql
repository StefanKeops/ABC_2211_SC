/*CREATE VIEW DOI8 AS*/
SELECT  *
FROM emp 
WHERE hiredate < (SELECT hiredate FROM emp WHERE ename = 'BLAKE')
CREATE VIEW doi19 AS
SELECT  deptno, COUNT(*) AS nombre_employes
FROM emp
GROUP BY  deptno
ORDER BY nombre_employes DESC
LIMIT 1;
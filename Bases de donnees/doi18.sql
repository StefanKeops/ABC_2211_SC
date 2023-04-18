CREATE VIEW doi18 AS
SELECT  job, AVG(sal) AS salaire_moyen
FROM emp
GROUP BY  job
ORDER BY salaire_moyen
LIMIT 1;
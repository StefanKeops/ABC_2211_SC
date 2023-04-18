CREATE VIEW doi14 AS
SELECT  ename, TIMESTAMPDIFF (MONTH, hiredate, NOW()) AS mois_en_entreprise
FROM emp
ORDER BY mois_en_entreprise DESC 
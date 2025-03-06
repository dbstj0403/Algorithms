SELECT SUM(HRG.SCORE) AS SCORE, HRE.EMP_NO, HRE.EMP_NAME, HRE.POSITION, HRE.EMAIL
FROM HR_EMPLOYEES AS HRE
JOIN HR_GRADE AS HRG 
ON HRE.EMP_NO = HRG.EMP_NO
GROUP BY HRG.EMP_NO
ORDER BY SCORE DESC
LIMIT 1




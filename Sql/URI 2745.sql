SELECT name, round((salary * 0.10), 2) AS tax
FROM people
WHERE salary > 3000

--------- OUTRA POSSIVEL SOLUÇÃO -----------

SELECT name, round(((salary * 10) / 100), 2) AS tax
FROM people
WHERE salary > 3000
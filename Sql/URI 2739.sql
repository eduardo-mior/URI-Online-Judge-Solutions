SELECT name, cast(EXTRACT(DAY FROM payday) AS INT) as day
FROM loan
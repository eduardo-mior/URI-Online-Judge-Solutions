(
SELECT concat('Podium: ', team) as name 
FROM league 
WHERE position <= 3
)
UNION ALL
(
SELECT concat('Demoted: ', team) as name 
FROM league
WHERE position >= 14
)
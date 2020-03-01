SELECT 

-- Nome
(
    SELECT name 
    FROM teams t 
    WHERE t.id = team.id
) as name,


-- matches (partidas)
(
    SELECT count(team_1) 
    FROM matches 
    WHERE team_1 = team.id
)+(
    SELECT count(team_2) 
    FROM matches WHERE 
    team_2 = team.id
) as matches,


-- victories (vitórias)
(
    SELECT sum(case when team_2_goals > team_1_goals then 1 else 0 END) as victories 
    FROM teams t INNER JOIN matches m ON t.id = m.team_2 
    WHERE t.id = team.id
)+(
    SELECT sum(case when team_1_goals > team_2_goals then 1 else 0 END) 
    FROM teams t INNER JOIN matches m ON t.id = m.team_1 
    WHERE t.id = team.id
) as victories,


-- defeats (derrotas)
(
    SELECT sum(case when team_2_goals < team_1_goals then 1 else 0 END) as victories 
    FROM teams t INNER JOIN matches m ON t.id = m.team_2 
    WHERE t.id = team.id
)+(
    SELECT sum(case when team_1_goals < team_2_goals then 1 else 0 END) 
    FROM teams t INNER JOIN matches m ON t.id = m.team_1 
    WHERE t.id = team.id
) as defeats,


-- draws (empates)
(
    SELECT sum(case when team_2_goals = team_1_goals then 1 else 0 END) as victories 
    FROM teams t INNER JOIN matches m ON t.id = m.team_2 
    WHERE t.id = team.id
)+(
    SELECT sum(case when team_1_goals = team_2_goals then 1 else 0 END) 
    FROM teams t INNER JOIN matches m ON t.id = m.team_1 
    WHERE t.id = team.id
) as draws,


-- score (pontos)
(
    SELECT sum(case when team_2_goals > team_1_goals then 3 when team_2_goals = team_1_goals then 1 else 0 END) as victories 
    FROM teams t INNER JOIN matches m ON t.id = m.team_2 
    WHERE t.id = team.id
)+(
    SELECT sum(case when team_1_goals > team_2_goals then 3 when team_1_goals = team_2_goals then 1 else 0 END) 
    FROM teams t INNER JOIN matches m ON t.id = m.team_1 
    WHERE t.id = team.id
) as score


FROM teams team
ORDER BY score DESC
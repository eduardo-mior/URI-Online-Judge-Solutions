(
   SELECT DISTINCT n1.node_id, 'ROOT' as "type"
   FROM nodes n1 
   LEFT JOIN nodes n2 ON n2.pointer = n1.node_id 
   WHERE n2.node_id IS NULL
)

UNION ALL

(
   SELECT DISTINCT n1.node_id, 'INNER' as "type"
   FROM nodes n1 
   INNER JOIN nodes n2 ON n1.node_id = n2.pointer 
   WHERE n1.pointer IS NOT NULL
)

UNION ALL

(
   SELECT DISTINCT n1.node_id, 'LEAF' as "type"
   FROM nodes n1
   WHERE n1.pointer IS NULL
)

ORDER BY node_id ASC
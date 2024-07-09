SELECT x.u1_name, x.u2_name
FROM (
   SELECT DISTINCT 
      CASE WHEN u1.posts < u2.posts THEN u1.user_id ELSE u2.user_id END AS "u1_id", 
      CASE WHEN u1.posts < u2.posts THEN u1.user_name ELSE u2.user_name END AS "u1_name", 
      CASE WHEN u1.posts > u2.posts THEN u1.user_name ELSE u2.user_name END AS "u2_name"
   FROM users u1
   INNER JOIN followers f1 ON u1.user_id = f1.following_user_id_fk
   INNER JOIN users u2 ON u2.user_id = f1.user_id_fk
   INNER JOIN followers f2 ON f2.user_id_fk = u1.user_id AND f2.following_user_id_fk = f1.user_id_fk
) as x
ORDER BY u1_id
# JPA Optimization Exercise

## Pour créer une vue matérialisée

Étape 1

```sql
CREATE MATERIALIZED VIEW tasks_per_project AS
SELECT p.projet_id AS projet_id,
p.name AS projet_name,
COUNT(t.task_id) AS task_count
FROM projet p
LEFT JOIN task t ON p.projet_id = t.projet_id
GROUP BY p.projet_id, p.name;
```

Étape 2

Créer l'entité avec les colonnes concernées
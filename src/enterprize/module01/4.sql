ALTER TABLE projects
  ADD COLUMN cost REAL NOT NULL;

UPDATE projects
SET cost = project_id * CASE WHEN (project_id % 2 = 1)
  THEN 110000
                        ELSE 200000 END;
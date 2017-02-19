ALTER TABLE projects
  ADD COLUMN cost REAL NOT NULL;

UPDATE projects
SET cost = project_id * CASE WHEN project_id < 6
  THEN 100000
                        ELSE 200000 END;
INSERT INTO TOPIC (id, name, description) VALUES
  ('java', 'Java', 'Java Description'),
  ('spring', 'Spring Boot', 'Spring Boot Description'),
  ('javascript', 'JavaScript', 'JavaScript Description');

INSERT INTO COURSE (id, name, description, topic_id) VALUES
  ('javac', 'Java Course', 'Java Course Description', 'java');

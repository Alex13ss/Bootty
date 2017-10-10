INSERT INTO TOPIC (id, name, description) VALUES
  ('java', 'Java', 'Java Description'),
  ('spring', 'Spring Boot', 'Spring Boot Description'),
  ('javascript', 'JavaScript', 'JavaScript Description');

INSERT INTO COURSE (id, name, description, topic_id) VALUES
  ('javac', 'Java Course', 'Java Course Description', 'java');

INSERT INTO USER (login, password, first_name, last_name, email) VALUES
  ('Alex', 'password', 'Alex', 'Western', 'sample@gmail.com');

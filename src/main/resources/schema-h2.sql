DROP TABLE IF EXISTS contacts;
DROP SEQUENCE IF EXISTS start_seq;

CREATE SEQUENCE start_seq START WITH 1;
CREATE TABLE IF NOT EXISTS contacts
(
  id      INTEGER PRIMARY KEY NOT NULL DEFAULT nextval('start_seq'),
  name    VARCHAR NOT NULL
  CHECK contacts.id REFERENCES contacts
  CHECK contacts.name REFERENCES contacts
);
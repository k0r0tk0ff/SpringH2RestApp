CREATE TABLE clients (
    client_id BIGINT PRIMARY KEY auto_increment,
    name VARCHAR(32)
  );

CREATE TABLE pets (
    pet_id BIGINT PRIMARY KEY auto_increment,
    client_id BIGINT REFERENCES clients (client_id),
    nick VARCHAR(16)
);


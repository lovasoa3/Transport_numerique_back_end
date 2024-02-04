
CREATE TABLE IF NOT EXISTS users (
    id_user  serial PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    gender VARCHAR(10),
    numéro VARCHAR(30),
    cin VARCHAR(20),
    adress VARCHAR(200)
);



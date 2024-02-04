CREATE TABLE IF NOT EXISTS administrateur (
    id_administrateur serial PRIMARY KEY,
    name_admin VARCHAR(255),
    email VARCHAR(255),
    contact VARCHAR(50),
    id_reservation INT,
    FOREIGN KEY (id_reservation) REFERENCES reservation(id_reservation)
);
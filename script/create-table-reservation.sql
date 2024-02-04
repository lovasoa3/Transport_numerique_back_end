CREATE TABLE IF NOT EXISTS reservation (
    id_reservation serial PRIMARY KEY,
    date_reservation TIMESTAMP,
    type_payment VARCHAR(200),
    depart_date DATE,
    tarif DOUBLE,
    destination VARCHAR(200),
    id_user INT,
    FOREIGN KEY (id_users) REFERENCES place(id_user),
);
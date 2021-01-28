use practice_db;
DROP TABLE  IF EXISTS liquorStore ;
CREATE TABLE liquorStore
(
    id       INT           NOT NULL AUTO_INCREMENT,
    name     VARCHAR(100)  NOT NULL,
    price    DECIMAL(8,2) NOT NULL,
    quantity INT           NOT NULL,
    PRIMARY KEY (id)
);
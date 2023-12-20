CREATE TABLE agenda (
    id INT PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(255) NOT NULL,
    data_hora DATETIME NOT NULL,
    data_criacao DATETIME NOT NULL,
    id_paciente INT,
    CONSTRAINT fk_paciente_agenda FOREIGN KEY (id_paciente) REFERENCES paciente(id)
);
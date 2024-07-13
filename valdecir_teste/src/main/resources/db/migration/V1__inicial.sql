-- db/migration/V1__inicial.sql
CREATE TABLE IF NOT EXISTS situacao (
    id VARCHAR(20) NOT NULL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL
);

INSERT INTO situacao (id, nome) VALUES ('SIT_ATIVO', 'Ativo')
ON DUPLICATE KEY UPDATE nome = VALUES(nome);

INSERT INTO situacao (id, nome) VALUES ('SIT_BLOQUEADO', 'Bloqueado')
ON DUPLICATE KEY UPDATE nome = VALUES(nome);
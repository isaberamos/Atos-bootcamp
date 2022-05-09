--CREATE DATABASE Dinossauros;
Use Dinossauros;

CREATE TABLE [Era] (
  [id] int not null identity(1,1),
  [nome] varchar(50) not null,
  [inicio] int not null,
  [fim] int not null,
  PRIMARY KEY ([id])
);

CREATE TABLE [Grupo] (
  [id] int not null identity(1,1),
  [nome] varchar(60) not null,
  PRIMARY KEY ([id])
);

CREATE TABLE [Descobridor] (
  [id] int not null identity,
  [nome] varchar(100) not null,
  PRIMARY KEY ([id])
);

CREATE TABLE [Pais] (
  [id] int not null identity(1,1),
  [nome] varchar(50) not null,
  PRIMARY KEY ([id])
);

CREATE TABLE [Dinossauro] (
  [id] int not null identity(1,1),
  [nome] varchar(100) not null,
  [toneladas] int not null,
  [ano_descoberta] int not null,
  [id_era] int not null,
  [id_pais] int not null,
  [id_grupo] int not null,
  [id_descobridor] int not null,
  PRIMARY KEY ([id]),
  CONSTRAINT [FK_Dinossauro.fk_grupo]
    FOREIGN KEY ([id_grupo])
      REFERENCES [Grupo]([id]),
  CONSTRAINT [FK_Dinossauro.fk_era]
    FOREIGN KEY ([id_era])
      REFERENCES [Era]([id]),
  CONSTRAINT [FK_Dinossauro.fk_pais]
    FOREIGN KEY ([id_pais])
      REFERENCES [Pais]([id]),
  CONSTRAINT [FK_Dinossauro.fk_descobridor]
    FOREIGN KEY ([id_descobridor])
      REFERENCES [Descobridor]([id])
);

INSERT INTO pais(nome) VALUES ('Mongolia');
INSERT INTO pais(nome) VALUES ('Canada');
INSERT INTO pais(nome) VALUES ('Tanzania');
INSERT INTO pais(nome) VALUES ('China');
INSERT INTO pais(nome) VALUES ('America do Norte');
INSERT INTO pais(nome) VALUES ('USA');

INSERT INTO Era(nome, inicio, fim) VALUES ('Cretaceo', 145, 66);
INSERT INTO Era(nome, inicio, fim) VALUES ('Jurassico', 201, 145);

INSERT INTO Grupo(nome) VALUES ('Anquilossauros');
INSERT INTO Grupo(nome) VALUES ('Ceratopsideos');
INSERT INTO Grupo(nome) VALUES ('Estegossauros');
INSERT INTO Grupo(nome) VALUES ('Terapodes');

INSERT INTO Descobridor(nome) VALUES ('Maryanska');
INSERT INTO Descobridor(nome) VALUES ('John Bell Hatcher');
INSERT INTO Descobridor(nome) VALUES ('German Scientists');
INSERT INTO Descobridor(nome) VALUES ('Museu Americano de Historia Natural');
INSERT INTO Descobridor(nome) VALUES ('Othniel Charles Marsh');
INSERT INTO Descobridor(nome) VALUES ('Barnum Brown');

INSERT INTO Dinossauro(nome, toneladas, ano_descoberta, id_grupo, id_era, id_pais, id_descobridor)
VALUES ('Saichania', 4, 1977, 1, 1, 1, 1);
INSERT INTO Dinossauro(nome, toneladas, ano_descoberta, id_grupo, id_era, id_pais, id_descobridor)
VALUES ('Triceratops', 6, 1887, 2, 2, 1, 2);
INSERT INTO Dinossauro(nome, toneladas, ano_descoberta, id_grupo, id_era, id_pais, id_descobridor)
VALUES ('Kentrossauro', 2, 1909, 3, 2, 2, 3);
INSERT INTO Dinossauro(nome, toneladas, ano_descoberta, id_grupo, id_era, id_pais, id_descobridor)
VALUES ('Pinacossauro', 6, 1999, 1, 1, 1, 4);
INSERT INTO Dinossauro(nome, toneladas, ano_descoberta, id_grupo, id_era, id_pais, id_descobridor)
VALUES ('Alossauro', 3, 1877, 4, 2, 2, 5);
INSERT INTO Dinossauro(nome, toneladas, ano_descoberta, id_grupo, id_era, id_pais, id_descobridor)
VALUES ('Torossauro', 3, 1877, 4, 1, 1, 6);
INSERT INTO Dinossauro(nome, toneladas, ano_descoberta, id_grupo, id_era, id_pais, id_descobridor)
VALUES ('Anquilossauro', 8, 1906, 1, 1, 5, 6);

SELECT * FROM Era
SELECT * FROM Pais
SELECT * FROM Grupo
SELECT * FROM Dinossauro

SELECT dinossauro.nome AS 'Dinossauro',
grupo.nome AS 'Grupo',
dinossauro.toneladas AS 'Toneladas',
dinossauro.ano_descoberta AS 'Ano Descoberta',
descobridor.nome AS 'Descobridor',
era.id AS 'Era',
era.inicio AS 'Início',
era.fim AS 'Fim',
pais.id AS 'País ou Continente'
FROM dinossauro, grupo, pais, descobridor, era
WHERE dinossauro.id_grupo = grupo.id
AND dinossauro.id_pais = pais.id
AND dinossauro.id_descobridor = descobridor.id
AND dinossauro.id_era = era.id
ORDER BY dinossauro.nome;

SELECT dinossauro.nome AS 'Dinossauro',
grupo.nome AS 'Grupo',
dinossauro.toneladas AS 'Toneladas',
dinossauro.ano_descoberta AS 'Ano Descoberta',
descobridor.nome AS 'Descobridor',
era.id AS 'Era',
era.inicio AS 'Início',
era.fim AS 'Fim',
pais.id AS 'País ou Continente'
FROM dinossauro, grupo, pais, descobridor, era
WHERE dinossauro.id_grupo = grupo.id
AND dinossauro.id_pais = pais.id
AND dinossauro.id_descobridor = descobridor.id
AND dinossauro.id_era = era.id
ORDER BY descobridor.nome;

SELECT grupo.nome AS 'Grupo',
dinossauro.nome AS 'Dinossauro',
dinossauro.ano_descoberta AS 'Ano Descoberta',
dinossauro.toneladas AS 'Toneladas',
descobridor.nome AS 'Descobridor',
era.id AS 'Era',
era.inicio AS 'Início',
era.fim AS 'Fim',
pais.id AS 'País ou Continente'
FROM dinossauro, grupo, pais, descobridor, era
WHERE dinossauro.id_grupo = grupo.id
AND dinossauro.id_pais = pais.id
AND dinossauro.id_descobridor = descobridor.id
AND dinossauro.id_era = era.id
AND grupo.nome = 'Anquilossauros'
ORDER BY dinossauro.ano_descoberta;

SELECT dinossauro.nome AS 'Dinossauro',
grupo.nome AS 'Grupo',
dinossauro.toneladas AS 'Toneladas',
dinossauro.ano_descoberta AS 'Ano de Descoberta',
descobridor.nome AS 'Descobridor',
era.id AS 'Era',
era.inicio AS 'Inicio',
era.fim AS 'Fim',
pais.nome AS 'País ou Continente'
FROM dinossauro, grupo, descobridor, era, pais
WHERE dinossauro.id_grupo = grupo.id
AND dinossauro.id_pais = pais.id
AND dinossauro.id_descobridor = descobridor.id
AND dinossauro.id_era = era.id
AND grupo.nome = 'Anquilossauros'
AND dinossauro.ano_descoberta between 1900 AND 1999
ORDER BY dinossauro.ano_descoberta;

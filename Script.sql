ALTER TABLE boleto DROP FOREIGN KEY fk_boleto_pessoajuridica1;

ALTER TABLE boleto DROP FOREIGN KEY fk_boleto_funcionario1;

ALTER TABLE boleto DROP FOREIGN KEY fk_boleto_pagamento1;

ALTER TABLE venda DROP PRIMARY KEY;

ALTER TABLE tipolocacao DROP PRIMARY KEY;

ALTER TABLE pessoafisica DROP PRIMARY KEY;

ALTER TABLE locacao DROP PRIMARY KEY;

ALTER TABLE veiculo DROP PRIMARY KEY;

ALTER TABLE pagamento DROP PRIMARY KEY;

ALTER TABLE funcionariosetor DROP PRIMARY KEY;

ALTER TABLE setor DROP PRIMARY KEY;

ALTER TABLE motorista DROP PRIMARY KEY;

ALTER TABLE endereco DROP PRIMARY KEY;

ALTER TABLE promocao DROP PRIMARY KEY;

ALTER TABLE boleto DROP PRIMARY KEY;

ALTER TABLE funcionario DROP PRIMARY KEY;

ALTER TABLE pessoajuridica DROP PRIMARY KEY;

ALTER TABLE combustivel DROP PRIMARY KEY;

ALTER TABLE compra DROP PRIMARY KEY;

ALTER TABLE cliente DROP PRIMARY KEY;

ALTER TABLE manutencao DROP PRIMARY KEY;

ALTER TABLE cliente DROP INDEX fk_cliente_pessoafisica1_idx;

ALTER TABLE locacao DROP INDEX fk_locacao_tipolocacao1_idx;

ALTER TABLE boleto DROP INDEX fk_boleto_pessoajuridica1_idx;

ALTER TABLE funcionario DROP INDEX fk_funcionario_pessoafisica1_idx;

ALTER TABLE boleto DROP INDEX fk_boleto_funcionario1_idx;

ALTER TABLE motorista DROP INDEX fk_motorista_pessoafisica1_idx;

ALTER TABLE pessoafisica DROP INDEX fk_pessoafisica_endereco1_idx;

ALTER TABLE cliente DROP INDEX fk_cliente_pessoajuridica1_idx;

ALTER TABLE venda DROP INDEX fk_venda_veiculo_idx;

ALTER TABLE veiculo DROP INDEX fk_veiculo_combustivel1_idx;

ALTER TABLE manutencao DROP INDEX fk_manutencao_veiculo1_idx;

ALTER TABLE funcionariosetor DROP INDEX fk_funcionariosetor_funcionario1_idx;

ALTER TABLE locacao DROP INDEX fk_locacao_pagamento1_idx;

ALTER TABLE pessoajuridica DROP INDEX fk_pessoajuridica_endereco1_idx;

ALTER TABLE locacao DROP INDEX fk_locacao_motorista1_idx;

ALTER TABLE boleto DROP INDEX fk_boleto_pagamento1_idx;

ALTER TABLE locacao DROP INDEX fk_locacao_funcionario1_idx;

ALTER TABLE locacao DROP INDEX fk_locacao_cliente1_idx;

ALTER TABLE pagamento DROP INDEX fk_pagamento_funcionario1_idx;

ALTER TABLE venda DROP INDEX fk_venda_funcionario1_idx;

ALTER TABLE funcionariosetor DROP INDEX fk_funcionariosetor_setor1_idx;

ALTER TABLE locacao DROP INDEX fk_locacao_veiculo1_idx;

ALTER TABLE pagamento DROP INDEX fk_pagamento_promocao1_idx;

ALTER TABLE manutencao DROP INDEX fk_manutencao_funcionario1_idx;

ALTER TABLE compra DROP INDEX fk_compra_funcionario1_idx;

ALTER TABLE compra DROP INDEX fk_compra_veiculo1_idx;

ALTER TABLE manutencao DROP INDEX fk_manutencao_locacao1_idx;

DROP TABLE combustivel;

DROP TABLE locacao;

DROP TABLE veiculo;

DROP TABLE cliente;

DROP TABLE funcionario;

DROP TABLE promocao;

DROP TABLE boleto;

DROP TABLE compra;

DROP TABLE venda;

DROP TABLE manutencao;

DROP TABLE setor;

DROP TABLE motorista;

DROP TABLE tipolocacao;

DROP TABLE pessoajuridica;

DROP TABLE funcionariosetor;

DROP TABLE pessoafisica;

DROP TABLE pagamento;

DROP TABLE endereco;

CREATE TABLE combustivel (
	idcombustivel INT NOT NULL,
	nome CHAR(15),
	PRIMARY KEY (idcombustivel)
) ENGINE=InnoDB;

CREATE TABLE locacao (
	idlocacao INT NOT NULL,
	idveiculo INT NOT NULL,
	idcliente INT NOT NULL,
	idmotorista INT NOT NULL,
	idpagamento INT NOT NULL,
	idfuncionario INT NOT NULL,
	idtipolocacao INT NOT NULL,
	datalocacao DATE,
	datadevolucao DATE,
	PRIMARY KEY (idlocacao)
) ENGINE=InnoDB;

CREATE TABLE veiculo (
	idveiculo INT NOT NULL,
	idcombustivel INT NOT NULL,
	modelo CHAR(30),
	marca CHAR(30),
	anomodelo DATE,
	anofabricacao DATE,
	quilometragem INT,
	PRIMARY KEY (idveiculo)
) ENGINE=InnoDB;

CREATE TABLE cliente (
	idcliente INT NOT NULL,
	idpessoajuridica INT,
	idpessoafisica INT,
	datacadastro DATE,
	PRIMARY KEY (idcliente)
) ENGINE=InnoDB;

CREATE TABLE funcionario (
	idfuncionario INT NOT NULL,
	idpessoafisica INT NOT NULL,
	senha CHAR(50),
	usuario CHAR(50),
	PRIMARY KEY (idfuncionario)
) ENGINE=InnoDB;

CREATE TABLE promocao (
	idpromocao INT NOT NULL,
	nome CHAR(50),
	descricao CHAR(50),
	datainicio DATE,
	datatermino DATE,
	PRIMARY KEY (idpromocao)
) ENGINE=InnoDB;

CREATE TABLE boleto (
	idboleto INT NOT NULL,
	idfuncemissor INT NOT NULL,
	idpessoajuridica INT NOT NULL,
	idpagamento INT NOT NULL,
	codigobarras CHAR(60),
	valor DECIMAL(10 , 2),
	valorpago DECIMAL(10 , 2),
	datavencimento DATE,
	datapagamento DATE,
	PRIMARY KEY (idboleto)
) ENGINE=InnoDB;

CREATE TABLE compra (
	idcompra INT NOT NULL,
	idveiculo INT NOT NULL,
	idfuncionario INT NOT NULL,
	datacompra DATE,
	valorcompra DATE,
	PRIMARY KEY (idcompra)
) ENGINE=InnoDB;

CREATE TABLE venda (
	idvenda INT NOT NULL,
	idfuncionario INT NOT NULL,
	idveiculo INT NOT NULL,
	datavenda DATE,
	valorvenda DATE,
	PRIMARY KEY (idvenda)
) ENGINE=InnoDB;

CREATE TABLE manutencao (
	idmanutencao INT NOT NULL,
	idfunc INT NOT NULL,
	idlocacao INT,
	datainicio DATE,
	datatermino DATE,
	observacoes CHAR(50),
	idveiculo INT NOT NULL,
	PRIMARY KEY (idmanutencao)
) ENGINE=InnoDB;

CREATE TABLE setor (
	idsetor INT NOT NULL,
	nome CHAR(60),
	PRIMARY KEY (idsetor)
) ENGINE=InnoDB;

CREATE TABLE motorista (
	idmotorista INT NOT NULL,
	registro CHAR(15),
	dataemissao DATE,
	datavalidade DATE,
	idpessoafisica INT NOT NULL,
	PRIMARY KEY (idmotorista)
) ENGINE=InnoDB;

CREATE TABLE tipolocacao (
	idtipolocacao INT NOT NULL,
	tipo CHAR(20),
	descricao CHAR(50),
	PRIMARY KEY (idtipolocacao)
) ENGINE=InnoDB;

CREATE TABLE pessoajuridica (
	idpessoajuridica INT NOT NULL,
	razaosocial CHAR(50),
	nomefantasia CHAR(50),
	cnpj CHAR(20),
	telefone1 CHAR(14),
	telefone2 CHAR(14),
	idendereco INT,
	PRIMARY KEY (idpessoajuridica)
) ENGINE=InnoDB;

CREATE TABLE funcionariosetor (
	idfuncionario INT NOT NULL,
	idsetor INT NOT NULL,
	PRIMARY KEY (idsetor,idfuncionario)
) ENGINE=InnoDB;

CREATE TABLE pessoafisica (
	idpessoafisica INT NOT NULL,
	nome CHAR(50),
	datanascimento DATE,
	cpf CHAR(11),
	rg CHAR(11),
	telefone1 CHAR(15),
	telefone2 CHAR(15),
	idendereco INT,
	PRIMARY KEY (idpessoafisica)
) ENGINE=InnoDB;

CREATE TABLE pagamento (
	idpagamento INT NOT NULL,
	idpromocao INT,
	idfuncbaixa INT,
	valor DECIMAL(10 , 2),
	datalancamento DATE,
	datapagamento DATE,
	PRIMARY KEY (idpagamento)
) ENGINE=InnoDB;

CREATE TABLE endereco (
	idendereco INT NOT NULL,
	logradouro CHAR(60),
	numero CHAR(15),
	bairro CHAR(20),
	cidade CHAR(20),
	uf CHAR(2),
	complemento CHAR(20),
	PRIMARY KEY (idendereco)
) ENGINE=InnoDB;

CREATE INDEX fk_cliente_pessoafisica1_idx ON cliente (idpessoafisica ASC);

CREATE INDEX fk_locacao_tipolocacao1_idx ON locacao (idtipolocacao ASC);

CREATE INDEX fk_boleto_pessoajuridica1_idx ON boleto (idpessoajuridica ASC);

CREATE INDEX fk_funcionario_pessoafisica1_idx ON funcionario (idpessoafisica ASC);

CREATE INDEX fk_boleto_funcionario1_idx ON boleto (idfuncemissor ASC);

CREATE INDEX fk_motorista_pessoafisica1_idx ON motorista (idpessoafisica ASC);

CREATE INDEX fk_pessoafisica_endereco1_idx ON pessoafisica (idendereco ASC);

CREATE INDEX fk_cliente_pessoajuridica1_idx ON cliente (idpessoajuridica ASC);

CREATE INDEX fk_venda_veiculo_idx ON venda (idveiculo ASC);

CREATE INDEX fk_veiculo_combustivel1_idx ON veiculo (idcombustivel ASC);

CREATE INDEX fk_manutencao_veiculo1_idx ON manutencao (idveiculo ASC);

CREATE INDEX fk_funcionariosetor_funcionario1_idx ON funcionariosetor (idfuncionario ASC);

CREATE INDEX fk_locacao_pagamento1_idx ON locacao (idpagamento ASC);

CREATE INDEX fk_pessoajuridica_endereco1_idx ON pessoajuridica (idendereco ASC);

CREATE INDEX fk_locacao_motorista1_idx ON locacao (idmotorista ASC);

CREATE INDEX fk_boleto_pagamento1_idx ON boleto (idpagamento ASC);

CREATE INDEX fk_locacao_funcionario1_idx ON locacao (idfuncionario ASC);

CREATE INDEX fk_locacao_cliente1_idx ON locacao (idcliente ASC);

CREATE INDEX fk_pagamento_funcionario1_idx ON pagamento (idfuncbaixa ASC);

CREATE INDEX fk_venda_funcionario1_idx ON venda (idfuncionario ASC);

CREATE INDEX fk_funcionariosetor_setor1_idx ON funcionariosetor (idsetor ASC);

CREATE INDEX fk_locacao_veiculo1_idx ON locacao (idveiculo ASC);

CREATE INDEX fk_pagamento_promocao1_idx ON pagamento (idpromocao ASC);

CREATE INDEX fk_manutencao_funcionario1_idx ON manutencao (idfunc ASC);

CREATE INDEX fk_compra_funcionario1_idx ON compra (idfuncionario ASC);

CREATE INDEX fk_compra_veiculo1_idx ON compra (idveiculo ASC);

CREATE INDEX fk_manutencao_locacao1_idx ON manutencao (idlocacao ASC);

ALTER TABLE boleto ADD CONSTRAINT fk_boleto_pessoajuridica1 FOREIGN KEY (idpessoajuridica)
	REFERENCES pessoajuridica (idpessoajuridica);

ALTER TABLE boleto ADD CONSTRAINT fk_boleto_funcionario1 FOREIGN KEY (idfuncemissor)
	REFERENCES funcionario (idfuncionario);

ALTER TABLE boleto ADD CONSTRAINT fk_boleto_pagamento1 FOREIGN KEY (idpagamento)
	REFERENCES pagamento (idpagamento);


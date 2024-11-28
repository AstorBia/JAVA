create table T_Autor(
    id varchar(255) primary key,
    nome varchar(35)
);

----------------------
create table T_AudioBook(
    id varchar(255) primary key,
    titulo varchar(60),
    categoria varchar(60),
    ano_lancamento int,
    id_album varchar(255)
);

-------------------------
create table T_Album(
    id varchar(255) primary key,
    nomeAlbum varchar(20),
    id_autor varchar(255)
);

----------- ALTER TABLE -------------------

ALTER TABLE T_AudioBook
    ADD CONSTRAINT audiobook_autor_FK FOREIGN KEY ( id_album )
        REFERENCES T_Autor ( id );

ALTER TABLE T_Album
    ADD CONSTRAINT album_audiobook_FK FOREIGN KEY ( id_autor )
        REFERENCES T_Autor ( id );


-----------DELETAR AS TABELAS ------------
--- *** autor ***
drop table T_Autor;

--- *** audio book ***
drop table T_AudioBook;

--- *** album ***
drop table T_Album;

------------- SELECT -----------------------
select * from T_Autor;
select * from t_audiobook;
select * from T_Album;

-------------------- DECRIÇÃO DA TABELA ------------------
DESCRIBE T_AUDIOBOOK;
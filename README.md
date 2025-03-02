Nome: Johnny Zhen Wei Qi RGM: 11232100184
Nome: Gustavo Felipe Hilario RGM: 11232101029

Rode o programa

Para testar se esta rodando:
Entre no seu navegador e entre no link localhost:8080/user/teste ou localhost:8080/curso/teste

No Postman coloque no método POST e insira localhost:8080/user/novo para criar um novo usuario ou localhost:8080/curso/criar para inserir um curso com o id do indivíduo.

Para inserir um novo usuario:
{
    "name": "nome_do_usuario",
    "email": "email_do_usuario"
}

Para inserir um curso:
{
    "nomeCurso": "nome_do_curso",
    "idUser": "id_do_usuario"
}

Aviso: Não será permitido mais de um curso por usuário

Para verificar o banco de dados entre em localhost:8080/h2-console no seu navegador:
JDBC URL: jdbc:h2:mem:testdb
User Name:	admin
Password:  admin

Ao fazer login e entrar:
SELECT * FROM TB_CURSO para verificar a tabela dos cursos
SELECT * FROM TB_USUARIO para verificar a tabela dos usuarios.

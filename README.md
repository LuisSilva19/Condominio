ProjetoCondominio

Esse projeto tem como função a busca de dados especifico de determinado usuário em uma base de dados, que se encontra em um arquivo .csv, o projeto utiliza JDK8, com base em uma requisicao web com JAX-RS e Jersey, com opção de deploy em qualquer servlet container.

Dados do envio

o arquivo zip contera o workspace do projeto (sem o metadata), e um arquivo .war para subir a aplicacao em um servlet container desejado.

Passo a passo de como utilizar por servidor de aplicacao:

1- Entre na pasta do tomcat (preferencia tomcat 8 para cima), inclua o arquivo .war no diretorio: "tomcat8\webapps"

2- Crie uma pasta "Arquivo" no caminho C: ("C:\Arquivos") e insira o arquivo com nome de "baseDados.csv"

3- Apos criada a pasta e ter colocado o arquivo .war na pasta webapps do tomcat, basta voce subir o tomcat pelo terminal.

4- entrar no endereco: http://localhost:8080/ProjetoCondominio/condominio/"email"
insira o email que deseja buscar na base de dados e de enter, será retornado os dados necessarios na tela, voce tambem podera ver os dados retornados no cmd. 

Passo a passo de como utilizar pelo eclipse:

1: basta rodar a classe "Servidor" no pacote server

2- Apos servidor de pé entrar no endereco: http://localhost:8080/ProjetoCondominio/condominio/"email"
insira o email que deseja buscar na base de dados e de enter, será retornado os dados necessarios na tela, voce tambem podera ver os dados retornados no console.


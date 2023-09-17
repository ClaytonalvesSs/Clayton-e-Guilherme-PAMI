# Clayton-e-Guilherme-PAMI
## Repositório com arquivo do app sobre energia renovável e pokémon

Nova dupla: Clayton Alves e Evelyn Karina

Feito por: Clayton Alves e Guilherme Gasperini

O app desenvolvido cujo seu tema é sobre energia renovável mesclado com o tema de pokemon.
Primeiramente utilizamos o canva para elaborar a interface do projeto.
Após isso, utilizamos o Android Studio para fazer o layout e definir a funcionalidade para cada elemento.

O app possui 5 activities:

A primeira seria onde você irá escolher o tipo de energia, para isso utilizamos 4 ImageButtons, em cada um tem uma imagem de cada energia, que são: Solar, Eólica, Hidrelétrica e Oceânica. Nesta primeira activity terá os quatro ImageButtons que irá te direcionar para a activity correspondente a energia renovável.

As outras 4 activities irão apresentar informações sobre a energia que você escolheu no menu inicial.

Assim que você escolher a energia, você será direcionado a outra activity, onde nela vai mostrar informações sobre a energia escolhida, onde utilizamos TextView para apresentar as informações e ImageView para colocar a imagem da fonte de energia, o pokemon representado e o "rank" de cada energia (como se fosse uma nota), e também terá um ImageButton que tem a função de te levar de volta ao menu inicial.

# Atualizações:
Mudança na dupla, a partir de agora, as pessoas que darão continuidade ao app será Clayton Alves e Evelyn Karina.

Após uma breve discussão, pensamos em adicionar tais elementos ao nosso aplicativo.

Começando por pequenos ajustes no layout (por questão estética).

Ao clicar no app, iremos fazer uma "intro" de 3 segundos mais ou menos, exibindo uma ImageView da logo e uma TextView com o nome, que no caso seria PokeEnergy.

Após essa intro, iria aparecer uma activity, com um campo de login, que seria Nome de usuário e Senha que iremos utilizar duas TextViews para indicar ao usuário onde inserir os dados e duas EditTexts que são campos para o usuário inserir o nome de usuário e senha. Ainda nesta activity iremos colocar um Button enviar e ao clicar ele te  redirecionaria para a activity das 4 energias renováveis, aparecendo uma mensagem escrita "login efetudo com sucesso!".

# Ideia do menu lateral (cancelada)
Na activity das energias, vamos adicionar um button que vai chamar um menu lateral, no qual ele exibirá algumas opções, como por exemplo, "Sair" que ao clicar,  vai sair do usuário cadastrado, redirecionando de volta para a tela de login e o "Suporte" no qual iria redirecionar para uma nova activity com algumas dúvidas frequentes já respondidas (conjunto de TextViews) sobre energia renovável.

# Ideia que vamos por no lugar do menu
Adicionar um Button que levará a activity suporte, no qual terá 5 button que levará a 5 sites (cada um falando sobre um tipo de energia), em cada activity das energias, terá um button levando a uma localização, exemplo, na activity da energia solar, terá um button que mostrará uma localização que tem esse tipo de energia, e adicionaremos um button que levará a um e-mail caso queira mandar algo para nós.

Atualização:
Adicionamos a imagem do Diagrama de Classes e sua explicação logo abaixo:

![image](https://github.com/ClaytonalvesSs/Clayton-e-Guilherme-PAMI/assets/128047894/03b8c823-3109-448d-8dcf-598121899b4d)

Contexto da imagem:

Temos as classes Login, TpEnergias e Suporte. 

A classe login, seria o login do usuário no aplicativo e sem ele não seria possível o usuário entrar nas outras activitys.  

A classe TpEnergias, seria as informações colocadas no aplicativo sobre o tema Energias Renováveis, ou seja, o nome da energia, a imagem e a descrição. 

A classe Suporte, representaria a activity suporte que será inserida com o intuito de deixar perguntas frequentes sobre Energias Renováveis e junto as perguntas, as respostas. 

Ou seja, na classe Login podemos cadastrar e atualizar os dados do usuário. 

Na classe TpEnergias iriamos cadastrar, atualizar e consultar as informações. 

E na classe Suporte seria uma forma de consulta para o usuário.

# ERROS DO PROJETO 
Bom, o meu problema é que, eu tava fazendo o app, todo certinho, inclusive tá quase finalizado, aí fui dar o commit e push dia 14, só que eu não percebi que tinha mandado os mesmo arquivos duas vezes seguidas(tinha usado merge), aí quando fui abrir meu projeto na tarde/noite de dia 15, meu Android exibiu o projeto com vários erros, e os códigos estavam duplicados em literalmente todos os arquivos, literalmente n exibia a prévia das minhas activitys por contas dos vários erros.

# Arquvio Gradle
Eu não tenho foto dos códigos, apenas do gradle, então vou mostrar como era ele na versão "normal" e ele após os problemas.

# Na versão normal: 

![image](https://github.com/ClaytonalvesSs/Clayton-e-Guilherme-PAMI/assets/128047894/bb29eefd-d059-4cd8-9a1e-dd031b67d98e)

# Na versão com erros:

![image](https://github.com/ClaytonalvesSs/Clayton-e-Guilherme-PAMI/assets/128047894/294b86cd-b23c-4141-b02b-ff9dd46905a3)

# Imagem comprovando o commit acidental:

![image](https://github.com/ClaytonalvesSs/Clayton-e-Guilherme-PAMI/assets/128047894/e034d479-6077-48df-ab56-35e19c007da6)

# Video que minha dupla (Evelyn) me enviou no dia 15/09
Minha dupla Evelyn karina disse que até tinha conseguido resolver em uma tela, só que aparecia outros erros em pastas que a gente nem sabia quais eram, veja o video abaixo: 

https://github.com/ClaytonalvesSs/Clayton-e-Guilherme-PAMI/assets/128047894/7dec654b-c017-4484-a56a-78063323789e

Literalmente não da para programar, por conta de que os codigos estão todos alterados, até a prévia das activitys não estão sendo exibidas, neste exato momento, estou refazendo em outro repositório para ter o app totalmente funconal.


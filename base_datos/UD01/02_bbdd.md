[Bases de datos](https://centros.edu.xunta.gal/cifprodolfouchapineiro/aulavirtual/pluginfile.php/36924/mod_resource/content/1/index.html)
# Bases de Datos.

O desenvolvemento dos sistemas de bases de datos **converteuse en crucial para proporcionar información correcta (sen erros) e oportuna (no momento que se necesita)**, aos directivos **como axuda á toma de decisións**.

Hai **cambio radical no enfoque do sistema de información**:

  “_**Os datos se organizan e manteñen nun conxunto estruturado que non está deseñado para unha aplicación concreta, senón que, pola contra, tende a satisfacer as necesidades de información de toda a organización**_” ; necesidades cuxa diversidade se ve acentuada co transcurso do tempo.

Estes **sistemas orientados cara aos datos (BBDD)** **van substituíndo, de forma progresiva, aos sistemas orientados cara ao proceso (por exemplo, ficheiros)**, que pola súa pouca fiabilidade, falta de adecuación á realidade pola baixa achega aos novos sistemas de xestión, e mal asegurada confidencialidade foron perdendo de forma progresiva a confianza dos usuarios. 

![[2025-09-16_11-32-40.png|Sistemas orientados a proceso]]

![[2025-09-16_11-33-25.png|Sistemas orientado a objetos]]

# Conceptos.

### Base de datos.

O concepto de base de datos foi cambiando e configurándose ao longo do tempo, na actualidade, **podemos definir a base de datos** como:

_“**Colección ou depósito de datos integrados**, **con redundancia controlada** e cunha estrutura que **reflicta as interrelacións e restricións** existentes no mundo real. O**s datos, que han de ser compartidos** por diferentes usuarios e **aplicacións, deben manterse independentes destas**, e a súa **definición e descrición, únicas para cada tipo de datos, han de estar almacenadas xunto cos mesmos**. Os **procedementos de actualización e recuperación, comúns e ben determinados,** **haberán de ser capaces de conservar a integridade, seguridade e confidencialidade do conxunto dos datos**”_

 Analizamos algúns destes conceptos:

- **Integrada**: os datos son xestionados de forma centralizada, sen redundancia.
- **A redundancia dos datos debe ser controlada,** de forma que non existan duplicidades prexudiciais nin innecesarias, e que as redundancias físicas, convenientes moitas veces a fin de responder a obxectivos de eficiencia, sexan tratadas polo propio sistema de xestión, de modo que non poidan producirse incoherencias. Por tanto, un dato actualizarase loxicamente polo usuario de forma única, e o sistema preocuparase de cambiar fisicamente todos aqueles campos nos que o dato estivese repetido, en caso de existir redundancia física.
-  **Que reflicta interrelacións entre os datos:** Dada a importancia que teñen no mundo real as interrelacións entre os datos, é imprescindible que a base de datos sexa capaz de almacenar estas interrelacións, do mesmo xeito que fai con outros elementos, siendo ésta una diferencia esencial respecto a los ficheros donde no se almacenan las interrelaciones.
- **Compartida**: permítese o acceso de varios usuarios aos mesmos datos e mesmo simultáneamente.
- **Independiente física e lóxica**, para que a BD recolla os datos de forma centralizada e poida ser usada por distintas aplicacións e usuarios.
- **A actualización e recuperación nas bases de datos debe realizarse mediante procesos ben determinados**, incluídos nun conxunto de programas que se encargan da xestión da base de datos e que se denominan sistemas xestores de bases de datos (SGBD); procesos que han de estar deseñados de modo que se manteña a integridade, seguridade e confidencialidade da base.

### Sistema de xestión de BD.

É o software que **permite aos usuarios procesar, describir, administrar e recuperar os datos almacenados nunha base de datos**. Neses sistemas proporciónase un conxunto coordinado de programas, procedementos e linguaxes que permiten aos usuarios realizar as súas tarefas habituais cos datos, garantindo ademais a seguridade dos mesmos. Co SGBD podemos:
![[2025-09-16_11-34-51.png]]

- **Definir unha BD**: é especificar os tipos de datos, estruturas e restricións para os datos que se almacenarán.
- **Construír unha BD**: é o proceso de almacenar os datos sobre algún medio de almacenamento.
- **Manipular unha BD**: é realizar operacións tales como consultas, actualizacións…
- **Manter a integridade da BD.** Integridade en canto aos datos en si, os seus valores e as relacións entre eles.
- **Controlar a privacidade e seguridade dos datos na BD**.

# Características.

### Resumo das características que definen unha BD.

- **Independencia dos datos.** A modificación da estrutura dos datos non supoña un cambio nos programas e viceversa.
- **Integridade e mínima redundancia**: un dos obxectivos das BBDD é a eliminación da redundancia, a condición de que isto non implique un aumento da súa complexidade nin unha reducción no seu rendemento. En calquera caso, unha redundancia controlada, que garanta a integridad do sistema. Integridade entendida como veracidade da información almacenada.
- **Seguridade e privacidade**: a información almacenada nunha BD é de gran valor para unha empresa, isto explica a necesidade de dispoñer de procedementos que protexan os datos fronte a fallos  
    do sistema, evitando a súa perda e facilitando a súa recuperación, ou fronte a usos indebidos por parte de persoas non autorizadas. A privacidade fai referencia a que usuarios poden acceder a que datos. Os procedementos de seguridade deben cubrir:
    - **Fallos do sistema**, xa sexan técnicos ou debidos a catástrofes naturais (lume, inundaciones)
    - **Control de acceso** a diferentes usuarios.
    - **Reconstrución total ou parcial dos datos** no caso de problemas do hardware/software.
    - **Control de accesos erróneos ou indebidos** por parte de usuarios.
- **Versatilidade para representar a información**: os datos da B.D. deben poder presentarse de diferentes formas, para que cada usuario vexa aquela información que solicitou.
- **Capacidade de acceso:** o acceso á B.D ha de ser concorrente (desempeño: acceso concorrente ao mesmo ou distinto conxunto de ítems por calquera procedimento autorizado) e rápido. Esta rapidez depende da organización física dos datos.
- **Tempo de resposta mínimo**.
- **Simplicidade**: As bases de datos deben estar baseadas en **representacións lóxicas simples** que **permitan a verificación na representación do problema** que representan e, máis aínda, **a modificación dos requirimentos no mesmo**, de tal forma que a inclusión de novos ítems de datos e relacións non ocasione unha complexidade excesiva.
- **Flexibilidade ou afinación**: **fai referencia á organización física** da información da base de datos, a cal **determina directamente o tempo de resposta dos procedementos** que operan sobre a mesma, **e á súa flexibilidade/capacidade cara á súa modificación.** A modificación pode supoñer ademais unha migración dos datos segundo evolucione a base de datos, sen que por iso véxanse afectados os procedementos ou outras representacións dos datos pero, con todo, consígase un desempeño máis alto.

# Vantaxes e inconvenientes.

Con respecto aos ficheiros as BBDD presentan as seguintes vantaxes e incovenientes, moitos deles sobradamente explicados en apartados anteriores.

### Vantaxes.

- Independencia dos datos respecto a os tratamentos e viceversa.
- Coherencia dos resultados.
- Maior eficiencia na recollida, validación e entrada dos datos ao sistema.
- Mellor dispoñibilidade dos datos para o conxunto dos usuarios.
- Redución do espazo de almacenamento.

### Incovenientes.

- Instalación custosa.
- Persoal especializado.
- Implantación longa e difícil.
- Falta de rendibilidade a curto plazo.
- Ausencia real de normas.

# Tipos de BBDD.

Existen varias clasificacións posibles, como podedes ver nas imaxes. Aquí estudiaremos as clasificacións máis importantes con respecto a organización e deseño das bases de datos, que son a clasificación pola variabilidade dos datos, polo seu modelo e segundo o acceso ou almacenamento.
![[2025-09-16_11-41-07.png]]

![[2025-09-16_11-41-19.png]]  
## Segundo a variabilidade.

Segundo a variabilidade dos datos:

- **Bases de datos estáticas:** Son **bases de datos de só lectura**, utilizadas primordialmente para almacenar datos históricos que posteriormente se poden utilizar para estudar o comportamento dun conxunto de datos a través do tempo, realizar proxeccións e tomar decisións.
- **Bases de datos dinámicas:** Estas son **bases de datos onde a información almacenada modifícase** co tempo, permitindo operacións como actualización, borrado e adición de datos, **ademais das operacións fundamentais de consulta**. Un exemplo disto pode ser a base de datos utilizada nun sistema de información dun supermercado, unha farmacia, un videoclub ou unha empresa.

## Segundo o almacenamento.

Según como se almacenan os datos:

- **Bases de datos centralizadas**: manteñen todos os datos nunha única computadora, localización e para acceder á información débese ingresar á computadora principal do sistema, coñecida como “servidor”
- **Bases de datos distribuídas**:  neste caso **funciona como unha única base de datos lóxica** que está **instalada nunha serie de computadoras (nodos) situadas en diferentes lugares xeográficos** e que non están conectadas a unha única unidade de procesamento, pero están **totalmente conectadas entre si** a través dunha rede de comunicacións. **Os datos da BD están ubicados nos distintos nodos**.
- **Bases de datos decentralizadas**: tamén **formada por unha serie de computadoras e servidores que se atopan en distintos lugares xeográficos**, pero **funcionan como un grupo de bases de datos independentes** sen conexións lóxicas entre elas e que **non están totalmente interconectadas necesariamente.** Un bo exemplo deste tipo de base de datos é Informix, o servizo de almacenamento na nube de IBM que almacena datos nunha variedade de servidores, para ter apoiada a súa información ante calquera incidente.
![[2025-09-16_11-42-14.png]]  
## Segundo o modelo de datos.

### Modelo de datos.

Antes de clasificar as BBDD segundo o modelo de datos, é necesario saber qué é un modelo de datos.

**Unha das características fundamentais dos SXBD é que proporcionan certo nivel de abstracción de datos**, ao ocultar as características sobre o almacenamento físico que a maioría de usuarios non necesita coñecer. **Os modelos de datos son o instrumento principal para ofrecer a devandita abstracción**.

**Un modelo de datos é unha linguaxe utilizada para a descrición dunha base de datos**. Polo xeral, un modelo de datos permite describir as estruturas de datos da base (o tipo dos datos que inclúe a base e a forma en que se relacionan), as restricións de integridade (as condicións que os datos deben cumprir para reflectir correctamente a realidade desexada) e as operacións de manipulación dos datos (agregado, borrado, modificación e recuperación dos datos da base).

_**O modelo de datos é un conxunto de conceptos, regras e convencións que permiten describir en distintos niveis de abstracción a estrutura (esquema) da BDD**_.

Por lo general, un modelo de datos **presenta dous sublenguajes**: **un Lenguaje de Definición de Datos o DDL** cuya función es describir, de una forma abstracta, las estructuras de datos y las restricciones de integridad; y **un Lenguaje de Manipulación de Datos o DML**, que se orienta a describir las operaciones de manipulación de los datos.  

### Deseño dunha BD.

O **deseño dunha BD faise en varias etapas**, que podemos ver na imaxe. Podemos observar tamén que **empregaremos un modelo de datos para cada unha das etapas** do deseño. 

**Segundo o modelo lóxico utilizado tamén se fai unha clasificación das BD** que vemos nas páxinas posteriores deste manual, pero **primeiro é necesario coñecer algúns dos modelos de datos máis utilizados** para cada fase do proceso de deseño da BD.
![[2025-09-16_11-43-28.png]]

### Clasificación dos modelos de datos.

Unha forma de clasificar os modelos de datos é facelo **dacordo ao nivel de abstracción** que presentan:

- **Modelos conceptuais baseados en obxectos**: aplícanse nos 2 niveis superiores, e temos:
    - **Modelo Entidade-Relación (ER)**: caracterízase por estar constituído por un conxunto de elementos, cada un dos cales recibe o nome de entidade. Cada entidade confórmana á súa vez, un conxunto de atributos que as diferenza. Doutra banda, ditas entidades poden asociarse mediante relacións.
    - **Modelo orientado a obxectos**:  está formado por unha colección de elementos que recibe o nome de obxectos. **Cada obxecto está constituído por**:
        - **Datos** que se almacenan en variables, as cales á súa vez tamén se consideran obxectos
        - Segmentos de código denominados **métodos**, cuxa finalidade é actuar sobre os obxectos, é dicir, realizar unha petición a un obxecto
        - Para permitir unha petición utilízanse as **mensaxes**, que son os que manipulan aos obxectos, obtendo deles unha resposta.
    - Cando hai **varios obxectos con idénticos tipos de valores e métodos agrúpanse formando unha “clase”**.
- **Modelo lóxico baseado en rexistros**: aplícanse nos dous niveis inferiores. Os datos almacénanse en rexistros de formato fixo, constituídos por campos ou atributos, tamén de lonxitude fixa.
    - **Modelo relacional**: Neste modelo represéntanse os datos e as relacións entre estes a través dunha colección de táboas (filas=rexistros, columnas=atributos)
    - **Modelo de rede**: este modelo representa os datos mediante coleccións de rexistros e as súas relacións represéntanse por medio de ligas ou ligazóns, punteiros. Os rexistros organízanse en grafos.
    -  **Modelo xerárquico:** similar ao anterior, pero coa representación en árbore.
- **Modelo físico de datos:** permiten especificar os datos a nivel físico. Temos:
    - Modelo unificador
    - Memoria de elementos
![[2025-09-16_11-43-46.png]]  

# BBDD jerárquicas
![[2025-09-16_11-50-50.png]]

_Estructura dunha árbore xerárquica._

Un DBMS xerárquico utiliza xerarquías ou **árbores** para a **representación lóxica dos datos**. As árbores xerárquicas represéntanse de forma invertida, coa raíz cara arriba e as follas cara abaixo.

**Cada nodo** da árbore representa **un tipo de rexistro conceptual, é dicir, unha entidade**. Á súa vez, **cada rexistro ou segmento** **está constituído por un número de campos** que describen as propiedades ou atributos das entidades.

**As relacións** entre entidades están representadas polas **ramas**.
![[2025-09-16_11-52-10.png]]
### Características do modelo xerárquico.

- Os **rexistros (segmentos)** dun arquivo xerárquico están dispostos en forma de árbore e non poden existir ciclos.
- Os **segmentos están enlazados** mediante **relacións uno a moitos (1:N) ou un a un (1:1)**.
- **Cada nodo** consta **dun ou máis campos**.
- Cando **se elimina un rexistro pai débense eliminar todos os rexistros fillos** (integridade dos datos).
- Un **nodo pai pode ter tantos nodos fillo como sexa necesario, un nodo fillo só pode ter un pai.** _A excepción do nodo raíz, todos os nodos deben ter un pai._
- **A recuperación dos datos** nunha base de datos xerárquica supón **navegar entre os** **rexistros**, movéndose cara arriba, cara abaixo ou cara aos lados. Dise que é un sistema navegacional.
![[2025-09-16_11-52-38.png]]
### Vantaxes das bases de datos jerarquicas.

- **Estrutura simple**. É fácil de entender, aseméllase á estrutura organizativa dunha empresa.
- É moi **adecuada para representar problemas** nos que existan **relacións do tipo pai-fillo**.
- **Bo rendemento.** As relacións entre rexistros impleméntanse coa utilización de punteiros, realizándose a navegación entre os rexistros dunha forma rápida.
![[2025-09-16_11-53-02.png]]
### Inconvenientes do modelo xerárquico.

- **Non** permite **máis dunha relación entre dous segmentos**
- **Non** se admiten **relacións do tipo M:N**
- **Non se permite que un segmento fillo teña máis dun pai**
- A árbore **percórrese en certa orde**
- **Para acceder a calquera segmento é necesario facelo polo segmento raíz.**
- **A complexidade da estrutura trasládase á linguaxe**, sendo estes máis complexos. Adoitan ser linguaxes procedurales, navegacionales.  

# BBDD en rede

Usa unha **estrutura non lineal** na que **cada rexistro fillo pode ter máis dun nodo pai (representación en forma de grafo)**. 
![[2025-09-16_11-49-28.png]]
Foi unha gran **mellora con respecto ao modelo xerárquico**, xa que ofrecía unha **solución eficiente ao problema de redundancia de datos**; pero, aínda así, **a dificultade de** **administrar a información nunha base de datos de rede** significou que sexa un modelo utilizado na súa maioría por programadores máis que por usuarios finais.

Os sistemas de base de datos en rede do mesmo xeito que os xerárquicos **utilizan punteiros para representar as interrelacións entre os datos**, pero neste caso créanse **estruturas de tipo rede**, que se diferencian das árbores xerárquicas en que **un pai pode ter moitos fillos e un fillo pode ter moitos pais**.
![[2025-09-16_11-49-40.png]]

### Características.

- A estrutura principal do **esquema conceptual é o conxunto DBTG (SET)** que consiste en **dous tipos de rexistros** relacionados: r**existro pai ou propietario (un), rexistro fillo ou membro (varios).**
- **Os dous tipos de rexistros deben ser diferentes**. **Non se admiten lazos** (relacións reflexivas).
- Un rexistro membro pódese asociar con **máis dun propietario**.
- A **recuperación dos datos** tamén é **navegacional**.
![[2025-09-16_11-50-25.png]]
### Vantaxes do modelo en rede.

- **Facilidade para adaptarse a problemas onde as relaciones pai-fillo non teñan unha estrutura xerárquica sinxela**.
- Como no modelo xerárquico as relacións entre rexistros fanse mediante punteiros, e aínda que con maior complexidade, conséguese un **bo rendemento** na utilización da base de datos.

### Inconvenientes do modelo en rede.

- **Rixidez**. As estruturas de rexistros e as relacións tiñan que especificarse de antemán. _A modificación da estrutura da base de datos requiría xeralmente a reconstrución completa da base de datos_.
- **Complexidade. A utilización da base de datos estaba reservada exclusivamente a programadores**. A recuperación de calquera dato requiría a escritura dun programa que percorrese o camiño a través da base de datos.  

# BBDD relacionais

Este é **o modelo utilizado na actualidade para modelar problemas reais e administrar datos dinámicamente**. Tras ser postulados os seus fundamentos en **1970 por Edgar F.Codd**.

**Codd propuxo un modelo simple de datos** no que todos eles representaríanse en **táboas constituídas por filas ou tuplas (rexistros)  e columnas (campos)**. A **estas táboas déuselles o nome de relacións** e por iso denominouse ao modelo relacional.

**Neste modelo, o lugar e a forma en que se almacenen os datos non teñen relevancia** (a diferenza doutros modelos como o xerárquico e o de rede). **A información pode ser recuperada ou almacenada mediante "consultas"** que ofrecen unha ampla flexibilidade e poder para administrar a información, e **facilita a comprensión e uso da BD para un usuario esporádico**.

**Para a realización destas consultas Codd tamén propuxo dúas linguaxes para manipular os datos nas táboas**: **o álxebra relacional e o cálculo relacional**. **A partir deles créanse linguaxes linguaxes de interrogación** máis accesibles para un usuario non especialista en programación. 

**A linguaxe máis habitual para construír as consultas a bases de datos relacionales é SQL (Structured Query Language ou Linguaxe Estruturada de Consultas)**, un estándar implementado polos principais motores ou sistemas de xestión de bases de datos relacionales.

### Terminoloxía.

- Utiliza **táboas bidimensionais, chamadas relacións,** para a **representación lóxica dos datos** **e as relacións entre eles**.
- Chámase **rexistro (entidade ou tupla) a cada fila.**
- Chámase  **campo (atributo) a cada columna** da táboa.
- Unha **clave será un atributo ou conxunto de atributos que identifique de forma única a unha tupla**.
![[2025-09-16_11-48-23.png|439x228]]
### Características.

As táboas deben cumprir unha serie de requisitos:

- **Só** pode haber **un tipo de rexistro**.
- **Non existen rexistros duplicados**.
- **Os rexistros dentro dunha relación non teñen unha secuencia determinada**.
- Pódense **crear novas táboas relacionando campos procedentes de 2 ó máis táboas** xa existentes.
![[2025-09-16_11-46-28.png]]
Actualmente os sistemas relacionales son un estándar no mercado, especialmente en operacións.comerciais. Exemplos de sistemas de bases de datos relacionales son: Informix, DB2,.Oracle, SYBASE, SQLServer, MySQL, PostgreSQL...  

# BBDD orientadas a obxectos

Este modelo, bastante recente, e propio dos modelos informáticos orientados a obxectos, trata de almacenar na base de datos os obxectos completos (estado e comportamento).
![[2025-09-16_11-45-34.png]]
Unha **base de datos orientada a obxectos** é unha base de datos que **incorpora** todos os **conceptos importantes do paradigma de obxectos**:

- **Encapsulación**: Propiedade que permite ocultar a información ao resto dos obxectos, impedindo así accesos incorrectos ou conflitos.
- **Herdanza**: Propiedade a través da cal os obxectos herdan comportamento dentro dunha xerarquía de clases.
- **Polimorfismo**: Propiedade dunha operación mediante a cal pode ser aplicada a distintos tipos de obxectos.

SQL 2003, é o estándar de SQL92 ampliado, soporta os conceptos orientados a obxectos e mantén a compatibilidade con SQL92

**Baséase en encapsular código e datos nunha sóla entidade, o  obxecto**. O interface entre un obxectivo e o resto do sistema defínese mediante un conxunto de mensaxes. **Un obxecto ten**:

- Un conxunto de **variables** que conteñen **os datos do obxecto**.
- Un conxunto de **mensaxes** aos que o obxecto responde.
- Un **método**, que é un anaco de código para implementar cada mensaxe.

Un **SGBD orientado a obxectos permite**:

- **Obxectos complexos**: obxectos que conteñen outros obxectos.
- **Datos de comportamento**: distintos obxectos necesitan responder de distinta maneira á mesma orde.
- **Metaconocimiento**: a miúdo son máis importantes regras xerais sobre as relacións máis que as tuplas específicas.
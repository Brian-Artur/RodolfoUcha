[Sistemas de almacenamiento](https://centros.edu.xunta.gal/cifprodolfouchapineiro/aulavirtual/pluginfile.php/35137/mod_resource/content/1/index.html)
# Sistemas de almacenamento
Os sistemas de almacenamento evolucionaron do papel gardado en arquivos físicos, aos ficheiros aloxados en dispositivos de almacenamento secundario, para logo despois chegar as Bases de Datos.

A medida que **evolucionaba a tecnoloxía**, **xurdían novos sistemas de almacenamento** que intentaban paliar os inconvenientes dos sistemas anteriores e axilizar as operacións sobre os datos (acceso, almacenamento, modificiacións, integridade,...).

Imos **estudar nesta unidade, os sistemas de almacenamento principais** presentes ao longo da historia, así como as súas características.

Os **obxectivos** **desta UD** son os seguintes:

- Analizar os sistemas lóxicos de almacenamento e as súas características.
- Identificar os tipos de bases de datos segundo o modelo de datos utilizado e da localización da información.
- Coñecer as vantaxes de utilizar un SGBD e as diferenzas que existen con respecto a unha BD.
- Coñecer os compoñentes dunha Base de Datos así como definir que é unha Base de Datos.
- Clasificar os SGBD.
- Coñecer que é e como funciona a fragmentación da información.

**Neste bloque** de contidos comezaremos polos **ficheiros**.

![[2025-09-15_17-27-52.png|452x1130]]

# Ficheiros
Un sistema de almacenamento relevante na xestión automatizada de datos foron os ficheiros. 

**Un ficheiro é unha estrutura de datos** (conxunto de información que está relacionada entre si e estruturada en unidades máis pequenas) que agrupa unha secuencia de 0 ou máis tuplas denominadas, normalmente rexistros (cada rexistro é un bloque de información que se pode manexar de forma unitaria), e que á súa vez se poden compoñer doutras estruturas de datos ás que se adoitan chamar  
campos.

**Para cada aplicación diseñábanse os seus ficheiros**, os cales eran empregados, en exclusiva, por esa aplicación. Podía darse o caso de que dúas aplicacións da mesma empresa podían estar a utilizar os mesmos datos ubicados en ficheiros diferentes, por exemplo, RRHH e ventas, que contarían cun ficheiro con datos de empleados. 

_Non existía un formato para os ficheiros, nin medidas de control de integridade para evitar a inconsistencia dos datos, polo que podías ter unha dirección nun ficheiro e outra diferente noutro! Tampouco se consideraban cuestións tan relevantes como a escalabilidade, o custe de mantemento a medio ou longo prazo, o consumo de recursos como o espazo de almacenamento ou o tempo de acceso aos datos, etc._

Resumindo, podemos enumerar os seguintes **problemas**:

- **Redundancia** de información (duplicidad innecesaria de información)
- **Mal aproveitamento do espazo de almacenamento**.
- **Tratamento ineficaz dos datos** (dificultade de acceso, modificación, etc.)
- **Inconsistencia dos datos**. Unha modificación nun dato dun ficheiro, por exemplo o nºde teléfono dun empregado, non se propagaba a todos os ficheiros onde aparecese ese mesmo dato, producíondose unha inconsistencia de información debida á redundancia.
- **Descentralización da información** (imposibilidade de transferila a outros programas a non ser que se desenvolvera un software de migración específico).
- **Falta de escalabilidade e de flexibilidade** orixinada na dependencia total da estructura física dos datos.
- ...

# Definicións
![[2025-09-16_10-47-47.png]]  
- Un **ficheiro/arquivo/file** **é unha estrutura de datos** (conxunto de información relacionada entre si e estruturada en unidades máis pequenas) que **agrupa unha secuencia de 0 ou máis** **tuplas semellantes** denominadas, normalmente **rexistros**  e **que á súa vez** **se poden compoñer** doutras estruturas de datos ás que se adoitan chamar **campos**.
- **O arquivo é tratado como unha entidade individual** polos usuarios e as aplicacións e pode ser referenciada polo nome. Os arquivos teñen nomes únicos e poden crearse, borrarse, modificarse, ....
- **Un campo (Field)** é o elemento de datos básico. Un campo individual **contén un valor único**. Esta caracterizado pola súa lonxitude e polo tipo de datos. Dependendo do deseño do arquivo, os campos poden ser de tamaño fixo ou variable.
- **Rexistro (Record)** é unha **colección de campos relacionados** que poden tratarse como unha única unidade. Por exemplo:, un rexistro de empregados vai conter campos como nome, numero de seguridade social etc.
- Tamén dependendo do deseño, os rexistros poden ser de **lonxitude fixa ou de lonxitude variable**. Un rexistro vai ter unha lonxitude variable se algúns dos campos son de tamaños variables ou se o numero de campos é variable. Cada campo ten un nome de campo.

# Características
Os ficheiros **poden situarse en memoria principal ou secundaria**, pero o máis normal é que se utilice esta última, debido sobre todo ao seu tamaño (en moitos casos moi grande).

_En cada sistema, é o sistema operativo, máis concretamente o seu **sistema de arquivos, o encargado da administración dos ficheiros**, e o que establece para tal efecto, a súa estrutura, nome, forma de acceso, posibles usos, implantación e técnicas de protección_.

**É o sistema de arquivos o que proporciona tamén unha serie de operacións** para crealos, destruílos, lelos, escribilos e manexalos noutras formas.

## Características:

- **Nome**: utilízase para a súa identificación. Cada sistema ten as súas regras para nomear os arquivos.
- **Atributos dun arquivo**: información adicional utilizada polo sistema e útil ao usuario (data e hora de creación, tamaño, #etc). Varía dun sistema operativo a outro.
- **Rexistro lóxico**: Conxunto de campos referentes a un mesmo suxeito ou obxecto. Un ficheiro é un conxunto de rexistros do mesmo tipo. **Cada un destes rexistros ten unha dirección lóxica** usada polos programas do usuario que indica a posición relativa que ocupa o rexistro no arquivo. A **dirección física é a posición real do rexistro no soporte**, é dicir, a dirección hardware.
- **Bloque ou rexistro físico**: cantidade de datos que se transmiten nunha operación de entrada/saída, esto é, a cantidade fixa de información que transporta o SO cada vez que accede ao soporte onde se aloxa o arquivo. Un rexistro físico pode conter varios rexistros lóxicos, ou poida que un rexistro lóxico ocupe varios rexistros físicos. 
- **Factor de bloqueo ou de blocaje**: nº de rexistros lóxicos contidos nun rexistro físico.
- **Campo**: conxunto de caracteres capaces de expresar, por si mesmos, un dato unitario e independente.
- **Organización dun ficheiro**: método de ordenación e localización dos rexistros dos arquivos sobre o soporte.
- **Método de acceso**: aquel que permite atopar o emprazamento dun rexistro no soporte.

# Tipos e formatos  
**O formato e tipo de ficheiro determina a forma de interpretar a información** que contén, xa que, en definitiva, o único que se almacena nunha ristra de bits (ceros e uns), de forma que **é necesaria a súa interpretación para dar sentido á información que almacena**.

Varias clasificacións: 
- **Segundo o seu contido**:
	- **Ficheiros de texto:** adoitan chamarse tamén ficheiros planos ou ficheiros ascii. ASCII é un estándar que asigna un valor numérico a cada carácter, lexible polo ser humano. Por exemplo: ficheiros de configuración do SO (adoitan ter extensión .ini, .inf, .conf), ficheiros de código fonte (.java, .sql), ficheiros de páxinas web (.html, .php, .css, .xml),etc.
	- **Ficheiros binarios**: todos aqueles que non son de texto e requiren un formato para ser interpretado. Algúns tipos de formatos de ficheiros binarios son:
	    - de **imaxe**: .jpg, .gif, .tiff, .bmp ….
	    - de **vídeo**: .mpg, .mov, .avi
	    - **comprimidos** ou empaquetados: .zip, .tar....
	    - **executables** ou compilados: .exe, . Com, .cgi...
	    - procesadores de **texto**: .doc, .odt
![[2025-09-16_10-49-43.png]]  

- **Segundo o modo de acceder aos datos**: secuencial, directa, indexada. Dado que as características da organización e modo de acceso van determinar o uso dun ou outro tipo de ficheiro,  tratámolos en profundidade no seguiente apartado.
    - **Secuencial**: os datos están dispostos seguindo unha secuencia ordenada, é dicir, uns detrás doutros. Caracterízanse por ter que percorrer todos os datos anteriores para chegar a un en concreto.
    - **Directa**: estes ficheiros están aloxados en dispositivos direccionables (pódese acceder a calquera dirección lóxica do soporte, directamente). Os rexistros conteñen un campo clave que os identifica unívocamente e coincide coa dirección lóxica que ocupan no soporte, polo que permiten acceder a un dato en concreto sen necesidade de acceder a todos os anteriores. 
    - **Indexada**: estes ficheiros están aloxados en dispositivos direccionables. Os rexistros conteñen, como mínimo, un campo clave principal que os identifica unívocamente. O ficheiro contará cunha táboa ordeada onde recollerá pares clave principal-dirección lóxica no soporte,  para axilizar a busca dun rexistro determinado empregando a clave principal.
    - Existen variantes das anteriores que mesturan as mellores características de cada unha delas.
- **Segundo a súa utilidade** (que uso vai facer del)/del): mestres, históricos, movementos
    - **Permanentes**:
        - **Mestres**: Conteñen información variable que é necesario actualizar a miúdo, tamén se denomina ficheiros de situación. Son os máis importantes e reflicten a información básica a cada pouco. Exemplo: ficheiro de almacén.
        - **Constantes**: Conteñen información fixa necesaria para o funcionamento dunha aplicación. A información non varía, ou o fai a longo prazo. Exemplo: ficheiro cos tipos de cotización á Seguridade Social.
        - **Históricos**: Conteñen información acumulada ao longo do tempo que desexamos conservar. Adoitan ser copias de ficheiros ou resultado de procesos. 
    - **Temporais**:
        - **Movemento**: tamén chamados ficheiros de transaccións porque se utilizan para actualizar os ficheiros mestres, A vida destes ficheiros adoita ser curta xa que cando se produce a actualización do ficheiro permanente, destrúense, ou se gardan como un histórico.
        - **De Traballo ou de Manobra**: Son ficheiros auxiliares, creados durante a execución dos programas, almacenan información que será manexada por estes programas. Son ficheiros de apoio, que se eliminan cando finaliza o programa e que non son visibles polo usuario. Exemplo: ficheiro auxiliar que se usa para clasificar outros ficheiros.
 ![[2025-09-16_10-51-48.png]]  

# Organización e modo de acceso  
## Organización.

**Forma en que se colocan os datos contidos nos rexistros sobre o soporte informático (disco, cinta,..) durante a súa gravación**.

Existen estas formas básicas de organización de ficheiros: secuencial, indexada e relativa. Na organización secuencial os rexistros vanse gravando uns a continuación dos outros, na orde que se van dando de alta, mentres que na organización relativa os rexistros grávanse nas posicións que lles corresponda segundo o valor que garden no campo clave e nas indexadas accédese a través dun índice.

## Modo de acceso.

**Procedemento que se ten que seguir para poder situarse nun rexistro determinado** para poder facer unha operación de lectura ou gravación do mesmo. O modo de acceso pode ser secuencial, directo ou por índice.

**No modo de acceso secuencial** para chegar a un rexistro é necesario pasar por todos os anteriores, mentres que no modo de acceso directo pódese chegar directamente a un rexistro coñecendo unicamente o valor do campo clave.

**Ao modo de acceso directo pódese chegar de varias formas**:

- A posición que ocupa o rexistro dentro do ficheiro coincide co contido da clave.
- Calculando a posición que ocupa o rexistro no ficheiro mediante unha transformación do contido do campo clave (acceso aleatorio - Hashing).
- Mediante o uso de táboas de índices. A localización dun rexistro faise buscando na táboa de índices o valor do campo clave e obtemos a posición en que está gravado o rexistro dentro do ficheiro. (acceso indexado - Keyed).

_**A elección dunha forma de organización determinada está en función do tipo de aplicación que lle imos a dar ao ficheiro**_. Dous **factores** inflúen directamente na selección: **a memoria necesaria para almacenar os datos e a velocidade de acceso aos mesmos.**

Exemplo: Un ficheiro no que os rexistros se actualicen todos xuntos unha vez ao mes, e o tempo necesario para a actualización non sexa importante, non pode ter a mesma organización que un ficheiro que se actualice todos os días varias veces poñendo ao día os datos que conteñen os seus rexistros e o tempo empregado para a actualización sexa o menor posible.

##  Secuencial
Un ficheiro con organización secuencial é aquel no que:

- **Os rexistros se van gravando un a continuación doutro**, sobre o soporte informático, **sen deixar ocos** no medio.
- Existe unha **correspondencia total entre a orde lóxica e a orde física**, se entendemos por orde lóxica a orde en que son dados de alta e recuperados os rexistros, e por orde física a orde en que están gravados os rexistros no soporte.
- Os rexistros **normalmente estarán ordenados polo contido dun ou máis campos para facer máis fácil o traballo de procura, inserción e borrado de rexistros**.

A organización secuencial é **aconsellable sólo! para ficheiros cun índice de utilización moi elevado e estables**.

### Vantaxes.

- Aproveita ao máximo o soporte, ao non deixar ocos entre os rexistros.
- Rápido acceso ao rexistro seguinte. Polo que se fai ideal cando en cada operación de actualización ou consulta van procesar a maioría dos rexistros.
- Pódense utilizar calquera tipo de rexistros: de lonxitude fixa, variable ou indefinida.
- Pódense gravar en calquera tipo de soporte, tanto en secuenciales como direccionables.
- Todas as linguaxes de programación dispoñen de instrucións para traballar con este tipo de ficheiros.

### Inconvenientes.

- **O único modo de acceso é o acceso secuencial**, polo que para ler o rexistro que ocupe a posición nº é necesario ler os n-1 rexistros anteriores. Isto fai que este tipo de organización **non sexa adecuado para ficheiros nos que se necesita procesar frecuentemente rexistros illados, é dicir que teñan un índice de utilización baixo**.
- **Non se poden inserir rexistros entre os que xa están gravados.** Se temos o ficheiro ordenado polo contido dun campo e queremos dar de alta un rexistro, que segundo esa orde debería ir entre dous rexistros que xa existen no ficheiro, é necesario copiar todo o ficheiro nun novo, gravando no novo ficheiro todos os rexistros, inserindo o rexistro que se quere dar de alta na posición que lle  corresponda. Outra posibilidade é ir dando de alta os rexistros ao final do ficheiro e a continuación realizar unha operación de reordenación de todo o ficheiro.
- **Se o ficheiro está gravado nun soporte secuencial por exemplo unha cinta magnética, para poder facer modificacións ou borrado de rexistros é necesario facer unha copia do ficheiro nun ficheiro novo.** Se o soporte non é secuencial as modificacións pódense facer sobre o mesmos rexistro, e o borrado pódese facer de forma lóxica, é dicir, mediante a gravación dunha marca no rexistro.

### Utilización de ficheiros con organización secuencial.

Hai que **ter en conta o soporte sobre o que están gravados**, pois algunhas operacións que se poden facer nos soportes direccionables non se poden facer nos soportes secuenciales, como poden  
ser as modificacións e borrado lóxico de rexistros.

O formato das i**nstrucións para manexar este tipo de ficheiros** dependerá da linguaxe de programación co que traballemos. De forma xeral podemos resumilas nas seguintes:

- **Abrir** (OPEN) Abrir un ficheiro para poder traballar cos seus rexistros. Se pode abrir de catro formas:
    - INPUT (I) - Só para ler rexistros.
    - OUTPUT (0) - Só para escribir rexistros.
    - INPUT-OUPUT (I-Ou) - Para ler e escribir.
    - EXTEND (E) - Para engadir rexistros ao final do ficheiro
- **Pechar** (CLOSE) Pechar o ficheiro, cando xa non se vai traballar mais cos seus rexistros.
- **Ler** (READ) Pasar a información dun rexistro á memoria principal do computador para que o programa poida traballar cos datos que contén. Cada vez que se dá unha orde de ler lese o seguinte rexistro.
- **Escribir** (WRITE) Grava no soporte a información dun rexistro coa información que teña na memoria principal.
- **Reescribir** (REWRITE) Grava sobre un rexistro que xa existe no ficheiro. Antes de utilizar esta instrución tense que ler antes o rexistro que se vai a reescribir cunha orde de ler (READ).

Para poder utilizar os datos do ficheiro **o sistema operativo utiliza un indicador, ou punteiro, que se coloca sinalando ao primeiro rexistro de datos do ficheiro, cando se dá a orde de Abrir (OPEN)**, e **vaise desprazando, sempre na mesma dirección, cada vez que se le ou grava un rexistro.** A estrutura do ficheiro complétase cun rexistro de cabeceira que serve de marca de final de ficheiro, ou EOF (EOF - End Of File). Este rexistro grávase , por primeira vez, no momento da creación do ficheiro e vaise desprazando cando se engaden novos rexistros ao final do mesmo.  
![[2025-09-16_10-53-44.png]]  

### Variantes.

Co fin de mellorar as prestacións da organización secuencial xorden unha serie de organizacións que son unha variante desta e que poden ser utilizados con soportes direccionables. As mais  empregadas son:

- **A organización secuencial indexada**, na que os rexistros cos datos grávanse nun ficheiro secuencialmente, pero pódense recuperar con acceso directo grazas á utilización dun ficheiro adicional, chamado de índices, que contén información da posición que ocupa cada rexistro no ficheiro de datos.
- **A organización secuencial encadeada**, que nos permite ter os rexistro ordenados segundo unha orde lóxica diferente da orde física no que están gravados grazas á utilización duns campos adicionais chamados punteiros.

## Secuencial-Indexada
Aos ficheiros con este tipo de organización **chámaselles, tamén, ficheiros indexados**, porque se basea na **utilización de índices, que permiten o acceso a un rexistro do ficheiro de forma directa**, sen ter que ler os anteriores.

Estes índices son similares aos dos libros. Se nos interesa ler un capítulo concreto podemos recorrer ao índice que nos di en que páxina comeza, e abrimos o libro por esa páxina, sen ter que mirar en todas as páxinas anteriores para localizalo.

As **características** máis relevantes dun ficheiro indexado, son as seguintes:

- **O deseño do rexistro** ten que ter **un campo, ou combinación de campos, que permita identificar cada rexistro de forma única**, é dicir, que non poida haber dous rexistros que teñan a mesma información nel. **A este campo chámaselle campo clave e é o que vai servir de índice**. Un mesmo ficheiro **pode ter mais dun campo clave**, pero polo menos un deles non admitirá valores duplicados e chámaselle clave primaria. Ás restantes **chámaselles claves alternativas**.
- **Permiten utilizar o modo de acceso secuencial e o modo de acceso directo** para ler a información gardada nos seus rexistros.
    - **O modo de acceso directo** faise coñecendo o contido do campo clave do rexistro que queremos localizar. Con esa información o sistema operativo pode consultar o índice e coñecer a posición do rexistro dentro do ficheiro.
    - **No modo de acceso secuencial** os rexistros son lidos ordenados polo contido do campo clave, independentemente da orde en que se foron gravando (A orde lóxica non é igual á orde física), debido a que o acceso aos datos faise a través do índice, que para facer máis fácil a procura dos rexistros permanece sempre ordenado polo campo clave.
- **Soamente pódese gravar nun soporte direccionable**. Ex.: disco magnético. Se isto non fóra así non podería empregar o acceso directo.
![[2025-09-16_10-57-02.png]] 
## Estructura dos ficheiros con organización secuencial-indexada.

Un arquivo con organización secuencial indexada está formado por:
- **Área de datos, primaria ou secuencial:**  É a área na que se escriben os rexistros cando o arquivo é creado. Nesta área **os rexistros atópanse agrupados por segmentos.**
	Os rexistros deste tipo de ficheiros, grávanse nun soporte direccionable (permite o acceso directo), en orde ascendente dacordo cos valores da  súa clave, en páxinas ou bloques de lonxitude fixa, chamados segmentos.
	![[2025-09-16_10-58-28.png]]  
- **Área de índices:** é creada polo sistema ao mesmo tempo que se van almacenando os datos. Contén unha táboa que **asocia as claves coas direccións dos rexistros na área de datos**. **Cada entrada da área de índices** está formada polo valor máis alto da clave de cada grupo de rexistros e un punteiro coa dirección do primeiro rexistro do grupo.
	![[2025-09-16_10-59-34.png]]  
- **Área de excedentes ou de overflow:** onde se gravan os rexistros que non teñen sitio na área de datos. Os novos rexistros insérense e quedan enlazados entre si mediante punteiros conservando a orde lóxica que marca a clave ou índice principal.

**Do tratamento dos índices e punteiros encárgase o sistema operativo** polo que non vai crear problemas ao usuario cando manexa este tipo de ficheiros. O usuario sabe o que sucede cando solicita unha consulta dun rexistro, pero non sabe como se realiza internamente esa consulta.

Hai dúas variantes neste modelo tamén. **Secuencial-indexado con índice denso**, que constrúe a táboa coas claves ordeadas de todos os rexistros, e a dirección de cada unha delas, e a **secuencial-indexado con índice escaso** que é o que vemos aquí, pois de gardan só as direccións dalgúns rexistros na táboa de índices.

### Vantaxes.

A organización secuencial indexada permite o acceso directo aos rexistros, sen os inconvenientes da existencia de ocos como na organización directa, e o tratamento secuencial dos rexistros, propio da organización secuencial. Esta organización é **moi utilizada, tanto para procesos nos que interveñen poucos rexistros como para aqueles nos que se manexa o ficheiro completo**.

***As principais vantaxes:***
- **Permite o acceso secuencial**. Isto é moi interesante cando a taxa de actividade é alta. No acceso secuencial, ademais, os rexistros lense ordenados polo campo clave.
- **Permite o acceso directo aos rexistros.** Realmente emula o acceso directo, empregando para iso as táboas de índices. Primeiro busca a clave na área de índices e logo vai ler á área de datos na dirección que lle indica a táboa.
- **Pódense actualizar os rexistros no mesmo ficheiro,** sen necesidade de crear un ficheiro novo de copia no proceso de actualización. Permite tanto o **proceso por lotes** (procesos en diferido que hai que preparar previamente) como o **proceso en tempo real**  (as actualizacións da información levan a cabo no momento en que se producen).

### Inconvenientes:

- **Ocupa mais espazo físico** que os ficheiros secuenciales, debido ao uso da área de índices Ten tendencia a que aumente o tempo medio de acceso aos rexistros, cando se producen moitas altas novas con claves que hai que intercalar entre as existentes, xa que aumenta a área de overflow. Require unha reorganización periódica.
- **Só en soportes direccionables**.
- Obriga a un **investimento económico maior**, pola necesidade de programas e, ás veces, hardware mais sofisticado.

## Directa
A organización directa está baseada na **independencia entre a orde en que se dan de alta os rexistros e a posición na que se gravan no soporte**. _**A posición na que se gravan os rexistros está en función da información que teña o campo clave do rexistro**_.
Nesta organización **o espazo total dispoñible para o ficheiro divídese en celas destinadas cada unha delas a conter un rexistro e só un**. As celas están numeradas correlativamente e pódese acceder ao contido dun rexistro, de forma directa, se coñecemos a dirección relativa da cela na que está gravado.

Esta organización **só é posible en soportes direccionables**, pois o acceso aos rexistros faise sen necesidade de ler os anteriores. **É a organización que ten un menor tempo de acceso a un rexistro**, en acceso directo. Úsanse cando o acceso aos datos dun rexistro faise sempre empregando a mesma clave e a velocidade de acceso a un rexistro é o que máis nos importa.
![[2025-09-16_11-10-24.png]]  
### Técnicas de direccionamento.

Como queda devandito para poder localizar un rexistro é necesario coñecer o valor da clave. _**Ás técnicas utilizadas para converter o valor da clave dun rexistro C, na dirección relativa da cela do ficheiro en que vai estar gravado D chámaselle técnicas de direccionamiento.**_

O elixir unha boa técnica de direccionamiento é fundamental neste tipo de organización. Á hora de elixir unha técnica de direccionamiento debemos pedirlle:

- Que sexa **fácil de aplicar.**
- Que deixe o **menor número de ocos** posible. Débese procurar que o método seleccionado proporciónenos valores entre 1 e nº, sendo nº o número de celas que ten o ficheiro, sen deixar celas baleiras.
- **Que as claves de rexistros diferentes déannos direccións diferentes**. _Cando dous ou máis claves diferentes proporcionan, ao aplicar a técnica de direccionamiento, a mesma dirección dise que produce **sinónimos**_. Tamén se di que eses rexistros chocan. _Cando as claves de dous rexistros deron lugar a un sinónimo (indican a mesma cela), só un deles pode ser almacenado nesa cela e temos que ter revisto algún procedemento para calcular a posición na que se ten que gravar o outro rexistro_.

### Clasificación das técnicas de direccionamento.

Hai unha gran cantidade de técnicas de direccionamiento que podemos clasificar en **tres grupos:**

- direccionamiento directo
- por asociación
- aleatorio (hashing)

#### Direccionamiento directo.

O caso óptimo de aplicación desta organización dáse **cando as claves no ficheiro son numéricas e toman valores de 1 a nº sen ocos intermedios**. Neste caso a clave k conduciranos á cela k-ésima do ficheiro podendo acceder facilmente aos datos deste rexistro. **O campo clave de cada rexistro contén a súa dirección no ficheiro**.

**Exemplo**: ficheiro de facturas onde tomamos como clave o nº de factura.

#### Direccionamiento por asociación.

**Os valores da clave almacénanse nunha táboa en memoria na que cada elemento asocia cada valor da clave coa dirección relativa na que está almacenado o rexistro**. Posto que a táboa debe prever a inclusión de todas as direccións posibles do arquivo, o seu principal inconveniente resulta determinar o seu tamaño e mantela ordenada polos valores da clave.
![[2025-09-16_11-11-09.png]]
#### Direccionamiento aleatorio (Hashing).
Neste caso **hai que buscar unha función, se é posible biunívoca, que relacione os posibles valores da clave co conxunto de números correlativos de cela**. Esta función consistirá en realizar unha serie de cálculos matemáticos co valor da clave ata obter un número entre 1 e nº, sendo nº o número de celas que ten o ficheiro.
![[2025-09-16_11-12-39.png]]

O principal inconveniente que presenta este tipo de direccionamiento é o que **se poden producir sinónimos** xa que o número que se obtén ao aplicar os cálculos é un número aleatorio e **poida que dúas claves diferentes dean como resultado o mesmo número**, e iso obríganos a ter previsto un método para o tratamento dos sinónimos. **Nos dous tipos anteriores nunca se producen sinónimos.**

### Vantaxes.

- **Permiten acceder da forma mais rápida posible a un rexistro calquera do ficheiro**. Por tanto é a organización **ideal para os procesos nos que o tempo de acceso aos rexistros é o máis importante**, a condición de que o acceso fágase sempre polo campo clave. O caso máis favorable para utilizar a organización directa é cando as claves son numéricas e permiten utilizar o direccionamiento directo.
- **Permite a actualización dos rexistros no mesmo ficheiro**, sen necesidade de copiar o ficheiro.
- **Permite realizar procesos de actualización en tempo real**.

### Inconvenientes.

- **A relación entre clave e dirección (Nº de rexistro) defínea o programador** e só el é responsable de manexala correctamente. O acceso a un rexistro faise indicándolle ao sistema a súa dirección relativa dentro do ficheiro (nº de rexistro) e a comprobación de si o rexistro lido é ou non o que buscamos tena que facer o programador, **o sistema operativo non nos avisa de posibles erros que se produzan o cálculo da dirección**.
- **Cando o rango de claves posibles é moi superior ao de claves que realmente están gravadas no ficheiro, haberá moito espazo desaproveitado** debido a que temos que reservar espazo a todos e cada un dos rexistros teoricamente posibles. Poden existir celas baleiras.
- **O algoritmo de direccionamiento debe garantimos que non se nos producirán dúas direccións iguais para dous valores de clave distintos.** No caso de non elixir un bo método de direccionamiento poida que a aparición de sinónimos faga complicado o acceso a algúns rexistros debido a que teriamos que empregar un método de tratamento de sinónimos que debe controlar o programador.
- **Non permite o acceso secuencial aos rexistros** por outra orde que non sexa a orde en que están gravados no soporte.
- **Só se pode utilizar un campo clave** para acceder aos rexistros.  
# Operacións

A utilidade principal dos ficheiros é poder almacenar información e recuperala máis tarde.

Para poder levar a cabo estas operacións os S.Ou. proporcionan un **conxunto de chamadas ou primitivas que permiten realizar determinadas operacións sobre os ficheiros**. Algunhas destas primitivas son: create, delete, open, close, read, write, rename, seek, ….

- **Creación**: consiste na gravación, por primeira vez, sobre un soporte dos rexistros dun ficheiro.
- **Apertura**: operación necesaria para empezar a traballar cos datos
- **Peche**: operación realizada unha vez finalicemos o traballo con el, para evitar que se deteriore a información almacenada.
- **Actualización**: mantemento, modificación dos datos almacenados.
- **Clasificación ou ordenación**: consiste en cambiar a orde en que están gravados os rexistros do ficheiro. Os rexistros ordénanse segundo o contido dun ou ou máis campos de forma ascendente ou descendente.
- **Copia ou duplicado**: esta operación consiste en crear un novo ficheiro idéntico a un xa existente. Operación recomendable realizala como medida de seguridade.
- **Fusión ou intercalación**: tamén chamado mestura. Consiste en obter, de dous ficheiros ordenados por un mesmo campo e coa mesma estrutura, outro ficheiro que conteña todos os rexistros de ambos e que se manteña ordenado polo mesmo campo.
- **Borrado**: eliminación de todo o ficheiro.
- **Partición**: consiste en dividir un ficheiro en dous ou máis, de acordo con algunha condición que han de cumprir os rexistros.

Ademais destas operacións nas que ven afectados todos os rexistros do ficheiro pódense realizar outras **operacións nas que só se utilicen unha parte dos rexistros**. Nestas operacións será necesario, primeiro localizar o rexistros ou os rexistros cos que queremos traballar e logo, realizar as operacións. As operacións máis utilizadas deste tipo son:

- **Actualización ou mantemento**: consiste en manter actualizados os datos almacenados nos rexistros do ficheiro. As operacións de actualización son:
    - **Altas**: engadir novos rexistros
    - **Baixas**: eliminar rexistros
    - **Modificacións**: cambiar o contido dun ou máis campos dun rexistro do ficheiro
- **Recuperación**: consiste en acceder á información almacenada nos rexistros do ficheiro para poder ser consultada:
    - **Consultas**: acceder a un ou varios rexistros para ver o contido de todos os seus campos ou só parte deles
    - **Listados**: a información accedida móstrase ben en papel, por pantalla...
# Conclusión

Como os sistemas son dinámicos, os requirimentos cambian co tempo, a información para ser tratada en cada problema tamén cambia e, por tanto, é necesario, dalgunha maneira, **independizar a estrutura da información** (os arquivos encargados de almacenal) **dos procedementos encargados do seu tratamento**, se non se estaría sempre abocado á dedicación dunha gran cantidade de esforzo á modificación de todos aqueles procedementos encargados do mantemento da información.

Por outra parte, se dispoño dun arquivo secuencial e quero pasar a empregar un arquivo directo, terei que cambiar o tipo de soporte que aloxa o arquivo a un que sexa direccionable. Aquí obsérvase a necesidade de **independizar a estructura lóxica da información da súa estructura física**.

### Bases de Datos.

O concepto de Bases de Datos xurde para resolver estas cuestións e proporcionar esta independencia da información en dous niveis de abstracción:

- **Independencia lóxica dos datos**, pola que **a modificación da representación lóxica xeral** do dominio do problema **non afecta os programas de aplicación que os manipulan**, sempre que esta modificación non elimine ningún dos ítems de datos que estes programas requiran.
- **Independencia física dos datos**, pola que a **distribución nas unidades de almacenamento e a estrutura física da información** almacenada é **independente** dos cambios **da estrutura lóxica** xeral da información e, por tanto, dos procedementos que manexan a mesma.

**Por exemplo**, se teño **un xestor de base de datos relacional** (utiliza táboas para gardar a información):

- **Dispón de independencia lóxica xa que podo modificar a estrutura da táboas**, engadindo novos campos, **sen que teña que modificar nada dos procedementos** que fan uso desa táboa.
- **Dispón de independencia física xa que podo modificar fisicamente os rexistros para que teñan un maior rendemento** á hora de mostralos, **non vai afectar en nada ao deseño lóxico (a táboa)** que estou a utilizar.
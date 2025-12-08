# Instalación.

**Tanto o Netbeans como o Eclipse necesitan o Java Development Kit para poder executarse.** InstalaremosOpenJDK na súa versión 17.0.12. 

## Instalar OpenJDK.

**Paso1 -** Abrir un terminal, **autentificarnos como root e realizar unha actualización dos repositorios**. Isto é imprescindible antes de calquera instalación en Debian!!!! _Dependendo do estado do teu debian a actualización pode levar máis ou menos tempo._

![[2025-09-29_21-16-22.png]]

**Paso2** - **Executamos o comando de instalación do JDK:**

![[2025-09-29_21-16-29.png]]

**Paso3** - **Verificamos as versións do JRE e do compilador** instalados:

![[2025-09-29_21-16-33.png]]


# Netbeans.

## Proceso de instalación de Netbeans 23 en Debian 12.

### Paso1 - Descargar o paquete. 

Imos instalar a **derradeira versión do Netbeans**. Empregaremos o **paquete binario** que podedes descargar deste enlace: [https://netbeans.apache.org/front/main/download/nb23/](https://netbeans.apache.org/front/main/download/nb23/)

### Paso2- Descomprimir.

 Dende o terminal accedemos ao directorio de Descargas do usuario profesora, co que iniciáchedes sesión. Aí atoparemos o paquete descargado e procedemos a descomprimilo, tal como aparece na imaxe:

![[2025-09-29_21-18-07.png]]

### Paso3 - Mover o directorio netbeans a /opt.

Unha vez rematamos a descompresión, aparece un directorio netbeans. Debemos movelo ao directorio /opt tal como se ve na imaxe:

![[2025-09-29_21-18-17.png]]

### Paso4 - Creamos o acceso directo.

Neste momento temos instalado o IDE pero é preciso crear un acceso directo para facilitar a súa execución. Debemos seguir os seguintes pasos:

**1 - Imos ao directorio  /usr/share/applications.**

![[2025-09-29_21-18-25.png]]

**2 - Executamos o comando "nano netbeans.desktop".** Con este comando abrimos o editor "nano" que é un editor de texto plano, que imos empregar para crear o arquivo de configuración "netbeans.desktop" necesario para crear o acceso directo.

![[2025-09-29_21-18-40.png]]
**Cando executamos ese comando ábrese o arquivo e escribimos nel o seguinte texto**:

_(Podes copialo de aquí e facer un copy/paste no terminal)._

```bash
[Desktop Entry]   
Name=Netbeans IDE  
Comment=Netbeans IDE
Type=Application   
Encoding=UTF-8   
Exec=/opt/netbeans/bin/netbeans   
Icon=/opt/netbeans/nb/netbeans.png   
Categories=GNOME;Application;Development;   
Terminal=false   
StartupNotify=true
```


**Cando rematamos de escribir o texto hai que** :

1. **Ctrl+o** para gardar os cambios no arquivo. 
2. Cando prememos Ctrl+o aparecerá o nome do arquivo onde imos gardar os cambios, e prememos **enter**.
3. Prememos **Ctrl+x** para saír do editor "nano".
4. Finalmente comprobamos o feito co comando "**cat netbeans.desktop**".

![[2025-09-29_21-20-15.png]]

### Comprobación da instalación.

Podemos verificar a instalación.

![[2025-09-29_21-20-24.png]]

![[2025-09-29_21-20-31.png]]


# Eclipse.

## Proceso de instalación de Eclipse 2024-09/r en Debian 12.

### Paso1 - Descargar o paquete. 

Imos instalar a **versión 2024-09/r do Eclipse para desarrolladores Java.** Empregaremos o **paquete para Linux x86x64** que podedes descargar deste enlace:  [https://www.eclipse.org/downloads/packages/release/2024-09/r](https://www.eclipse.org/downloads/packages/release/2024-06/r)

![[2025-09-29_21-28-49.png]]

### Paso2- Descomprimir.

Dende o terminal accedemos ao directorio de _Descargas_ do usuario profesora, co que iniciáchedes sesión. Aí atoparemos o paquete descargado e procedemos a descomprimilo, tal como aparece na imaxe:

![[2025-09-29_21-28-56.png]]

### Paso3 - Mover o directorio eclipse a /opt.

Unha vez rematamos a descompresión, aparece un directorio eclipse. Debemos movelo ao directorio /opt tal como se ve na imaxe:

![[2025-09-29_21-29-06.png]]

### Paso4 - Creamos o acceso directo.

Neste momento temos instalado o IDE pero é preciso crear un acceso directo para facilitar a súa execución. Debemos seguir os seguintes pasos:

**1 - Imos ao directorio  /usr/share/applications.**

![[2025-09-29_21-29-30.png]]

**2 - Executamos o comando "nano eclipse.desktop".** Con este comando abrimos o editor "nano" que é un editor de texto plano, que imos empregar para crear o arquivo de configuración "eclipse.desktop" necesario para crear o acceso directo.

![Editando o eclipse.desktop.](https://centros.edu.xunta.gal/cifprodolfouchapineiro/aulavirtual/pluginfile.php/65133/mod_resource/content/1/Paso6_EditandoArquivo.png "Editando o eclipse.desktop.")**Cando executamos ese comando ábrese o arquivo e escribimos nel o seguinte texto**:

_(Podes copialo de aquí e facer un copy/paste no terminal. Vemos na imaxe como pide confirmación do que se vai copiar cando premes Pegar sobre o terminal)._

**[Desktop Entry]**   
**Name=Netbeans IDE**   
**Comment=Netbeans IDE**   
**Type=Application**   
**Encoding=UTF-8**   
**Exec=/opt/netbeans/bin/netbeans**   
**Icon=/opt/netbeans/nb/netbeans.png**   
**Categories=GNOME;Application;Development;**   
**Terminal=false**   
**StartupNotify=true**

**Cando rematamos de escribir o texto hai que** :

1. **Ctrl+o** para gardar os cambios no arquivo. 
2. Cando prememos Ctrl+o aparecerá o nome do arquivo onde imos gardar os cambios, e prememos **enter**.
3. Prememos **Ctrl+x** para saír do editor "nano".
4. Finalmente comprobamos o feito co comando "**cat netbeans.desktop**".

### Comprobación da instalación.

Podemos verificar a instalación.
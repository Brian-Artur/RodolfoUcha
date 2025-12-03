![[Pasted image 20251128161330.png]]

GNU [Richard Stallman] : Un tipo bastante curioso. Dicen que tiene un gran grado de autismo. Firme defensor del software libre. Vive de sus conferencias. 
Linux [Linus Tornalds] : Tiene 

jaron tanier : 10 razones para dejar las rrss ya. 


![[Pasted image 20251128162236.png]]



![[Pasted image 20251128162256.png]]

Terminar e iniciar la máquina
![[Pasted image 20251128162440.png]]


Distribución Live. porque no hace falta ni tener disco duro. Esto nos permite probar si nuestro ordenador es compatible con esta distribución sin necesidad de instalarlo.

La finalidad de la distro Mint es la de facilitar la migración de usuarios de Windows a Linux.

PearOS existe de verdad. Es un clon visual de MacOS, pero con una pera en vez de una manzana.

El entorno gráfico de Mint está tan bien configurado que hace que se pueda personalizar casi todo del sistema.

![[Pasted image 20251128162516.png]]

Hacemos click sobre el "cd de instalación"

Aunque lo instalemos en inglés, vamos a seleccionar Spanish como idioma del teclado.
![[Pasted image 20251128163839.png]]

Codecs multimedia sólo haría falta si fuesemos a ver vídeos. No es nuestro caso.
![[Pasted image 20251128163954.png]]

No vamos a usar el LVM porque hace que tarde más la instalación. El LVM nos va a permitir reconfigurar el espacio y posición de las particiones del disco duro.
![[Pasted image 20251128164253.png]]

No vamos a cifrar la carpeta /home , al igual que tampoco habíamos cifrado el disco duro.
![[Pasted image 20251128164721.png]]
En total se podrían cifrar el sistema en 3 puntos, si contamos cifrar en la BIOS.


BSD: licencia que permite coger un software libre, modificarlo, y lucrarse con él. BSD es a su vez un sistema operativo que viene de Unix System 5. MacOS viene de BSD.

Los comandos en esencia de Linux no han cambiado desde los años 70, con los primeros Unix.

Cuando termine le damos en a reiniciar y en la pantalla a ENTER. No es necesario retirar ningún pendrive porque estamos ante la maquina virtual
![[Pasted image 20251128171420.png]]

Click derecho 
![[Pasted image 20251128172139.png]]

Doble clic sobre la única red que tenemos
![[Pasted image 20251128172219.png]]

Muestra la siguiente ventana
![[Pasted image 20251128172241.png]]

Click en el escudito
![[Pasted image 20251128172343.png]]
Luego le damos a aceptar (si mal no recuerdo).


click derecho sobre el escritorio.
![[Pasted image 20251128172629.png]]
Ahí podremos cambiar fondo de escritorio y demás chorradas.


![[Pasted image 20251128172827.png]]
![[Pasted image 20251128172953.png]]

![[Pasted image 20251128174017.png]]

![[Pasted image 20251128175150.png]]

Al ser de Flatpak (flathub) nos va a tener que descargar todo lo de Flatpak para poder hacer la instalación. Esto sólo sucede la primera vez que instalamos algo de esta forma
![[Pasted image 20251128175325.png]]

A diferencia del anterior, este programa ya no va con Flatpak
![[Pasted image 20251128175432.png]]

Emulador de terminal
![[Pasted image 20251128182035.png]]

Si presionamos Ctrl + F1 vamos a la primera terminal real que tiene Mint. Tiene hasta 6 posibles terminales con las que trabajar. Si presionamos Ctrl + F7 , nos solimos de la terminal y volvemos al entorno gráfico.

![[Pasted image 20251128182813.png]]

![[Pasted image 20251128183503.png]]


```bash
# Hace un listado de los archivos "ocultos", de configuración
ls -lisha
```
![[Pasted image 20251128184345.png]]

Podemos ir cambiando de shells. Por ejemplo, ir a sh, que no tiene colores ni nos indica en dónde estamos ni quienes somos.
![[Pasted image 20251128184807.png]]


## Instalar Guest  Additions

![[Pasted image 20251128185205.png]]

Hacemos click derecho en la ventana para 
![[Pasted image 20251128185730.png]]

Ejecutamos el comando y ya funciona las guest additions sin tener que reiniciar la máquina.
![[Pasted image 20251128185914.png]]


## Instalar vlc

![[Pasted image 20251128172827.png]]


![[Pasted image 20251128190619.png]]

![[Pasted image 20251128190634.png]]

Intentando instalar vlc, nos da este error.
![[Pasted image 20251128190755.png]]



Con Gnome mahjongg sale un error similar.
![[Pasted image 20251128191005.png]]

## Ejecutar desde consola
- whoami : quienes somos
- hostname : el nombre ne la máquina
- pwd : en dónde estamos
- ip a : para ver la addres
- ip r : ver la red
![[Pasted image 20251128191252.png]]
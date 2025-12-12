
### Adaptadores de red en hypervisores (examen)
Crean adaptadores de red virtualizados. Simula una tarjeta de cable.

#### Adaptador NAT
Tipo de *adaptador NAT*: sólo permite salir a internet, pero entre ellas no se van a a ver. Mi equipo anfitrión tampoco se va a conectar a ellas.
Todas las MV con NAT van a tener exactamente la misma configuración. Van a tener la misma ip (10.0.2.15). Es decir, que van a ser la misma.
![[2025-10-07_20-47-45.png]]

En todas las MV se crea un router virtual que la da salida a cada máquina a internet. La puerta de enlace va a ser 10.0.2.2 en todas las MV, pese a que tengan cada una su propio router virtual.

#### Host-Only
Host-Only (Sólo anfitrión): lo que hace es crear un switch que conecta mi MV con la anfitrión. Sólo se crea un switch virtual, lo que hace que todas las MVs se puedan ver entre ellas. El nombre despista. La configuración de red se puede configurar facilmente. Puedo crear diferentes adaptadores host-only, para tener diferentes redes aisladas en grupitos de 4 o 5.

#### Red interna
Red interna las MVs se ven entre ellas, pero el anfitrión no puede llegar a ellas.

#### Puente (bridge)
Se crea un tarj. virtual que está enganchada a una de mis tarjetas reales. Se puede comunicar entre el anfitrión y conectar a internet


![[2025-10-07_21-17-05.png]]

# Consola
Powersher no distingue mayúsculas.
## Comandos
`Get-ComputerInfo`
![[2025-10-07_21-47-50.png]]

`Get-LocalUser`
![[2025-10-07_21-51-45.png]]

`Get-LocalUser | Format-List`
El pippe conecta la primera sentencia con la siguiente. El resultado del primer comando se lo pasa al segundo. La concatenación de comandos es ilimitada, en principio.
![[2025-10-07_21-56-28.png]]

Seleccionamos varios campos de los que hemos obtenido, con la coma.
![[2025-10-07_22-06-53.png]]

### Ayuda de powershell
Lo que sería el segundo comando, en realidad actúa como un parámetro.
![[2025-10-07_22-20-06.png]]

Para buscar los comandos que hay con ese sufijo
![[2025-10-07_22-24-45.png]]

Funciona igual con los prefijos
![[2025-10-07_22-27-02.png]]
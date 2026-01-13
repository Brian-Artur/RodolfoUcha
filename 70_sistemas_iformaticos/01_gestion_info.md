# Sistemas de ficheros
## Windows
![](../00_assets/Pasted%20image%2020260109170417.png)
### Page File
Archivo de paginación se usa para la gestión de memoria. Archivo o sistema de archivos que saca de la RAM el programa que hace más tiempo que no se está empleando, y lo mete en el disco duro. Lo que en Linux es SWAP.

### Crash Dump
Volcado de memoria en caso de catástrofe. Mítica en caso de pantallazo azul.

### Primary partition
![](../00_assets/Pasted%20image%2020260109172701.png)

# DiskPart
![](../00_assets/Pasted%20image%2020260109173035.png)  
Con `help` muestra la lista de comandos.
Si hacemos `LIST` nos muestra qué podemos listar.
`SELECT` marcar qué disco quiero seleccionar
![](../00_assets/Pasted%20image%2020260109173458.png)

Los discos se enumeran con números. No confundir con particiones como C:/
![](../00_assets/Pasted%20image%2020260109173639.png)

Me da información detallada del disco en el que estemos.
![](../00_assets/Pasted%20image%2020260109173809.png)
Clusterizado significa si está formado por varios discos físicos conectados. Bastante similar a un RAID.

![](../00_assets/Pasted%20image%2020260109174255.png)
`Offset in Bytes`  es desde qué punto de bites, del disco, comienza esta partición. 

![](../00_assets/Pasted%20image%2020260109174622.png)

`DELETE` puedes eliminar un objeto; en este caso para eliminar una partición
![](../00_assets/Pasted%20image%2020260109175209.png)
Eliminar cualquier partición que no sea una partición primaria de arranque.

A una partición le puedes quitar la marca de _boot_

## Crear partición

![](../00_assets/Pasted%20image%2020260109182911.png)
**MBR** : sistema antigua de particiones
**EFI** : sistema nuevo de particiones

![](../00_assets/Pasted%20image%2020260109182825.png)

![](../00_assets/Pasted%20image%2020260109183103.png)

No tiene un sistema de archivos seleccionado. Está RAW (en crudo).
![](../00_assets/Pasted%20image%2020260109183129.png)
## Achicar partición `shrink`
![](../00_assets/Pasted%20image%2020260109183706.png)

![](../00_assets/Pasted%20image%2020260109183955.png)

La partición que tenemos seleccionada aparece con un asterisco
![](../00_assets/Pasted%20image%2020260109184419.png)

## Ampliar partición `extend`
![](../00_assets/Pasted%20image%2020260109184633.png)

![](../00_assets/Pasted%20image%2020260109184838.png)

Desde el entorno gráfico se ve como ha ocupado todo el resto del disco
![](../00_assets/Pasted%20image%2020260109185058.png)

## Volver a reducir
![](../00_assets/Pasted%20image%2020260109185325.png)

Se van sumando los espacios que hemos dejado libres (sin partición).
![](../00_assets/Pasted%20image%2020260109185428.png)
![](../00_assets/Pasted%20image%2020260109185617.png)

## Defragmentación
Antiguamente se hacía esta práctica a un disco duro de platos para reubicar los archivos para que estén juntitos y dejar huecos físicos reales. Esto trabaja como el juego de aparcacoches. Cuanto menos hueco libre tenga el disco, más va a tardar en terminar la operación. La defragmentación es una tarea que tarda mucho tiempo y que exige muchísimo trabajo al disco duro. 

## Asignar letra & formatear partición

![](../00_assets/Pasted%20image%2020260109191135.png)
## 1. Ver información del equipo
### 1. Entorno gŕafico
#### 1. Acerca de
1. Clic derecho sobre **"Start"**. Seleccionamos "System". Se muestra una ventana con la información más básica de nuestra máquina.
  ![[2025-11-14_11-31-31.png|298x350]]![[2025-11-14_11-32-32.png|459x255]]
#### 2. System Information
1. Hacemos click izquierdo en el botón de inicio y escribimos "System Information".
   ![[2025-11-14_11-48-47.png]]
2. Cliclamos en la opción que nos da, o en "Abrir". Y ya podremos ver una información más detallada del ordenador
   ![[2025-11-14_11-50-46.png|415x401]]

### 2. Consola
1. Hacemos click izquierdo en el botón de inicio y escribimos "Powershell.
2. Hacemos click en "Ejecutar como administrador"
3. Escribimos `systeminfo` . Y ya vemos la información del ordenador.
   ![[2025-11-14_14-53-39.png]]

###  **Obtener el modelo del equipo**

```bash
# 
Get-CimInstance Win32_ComputerSystem

# CPU
Get-CimInstance Win32_Processor

# Solo modelo
(Get-CimInstance Win32_Processor).Name


# RAM
Get-CimInstance Win32_PhysicalMemory
# Suma total
(Get-CimInstance Win32_PhysicalMemory | Measure-Object -Property Capacity -Sum).Sum / 1GB


# GPU
Get-CimInstance Win32_VideoController

# Información de BIOS
Get-CimInstance Win32_BIOS

# Version Windows
Get-ComputerInfo | Select-Object WindowsVersion, OsName, OsBuildNumber

# Resumen completo con Get-ComputerInfo
Get-ComputerInfo

```


#### Más comandos de interés
`Get-LocalUser` 
`Get-Help`


## 2. Configuración de red
1. Clic derecho sobre **"Start"**. Seleccionamos "Conexiones de red".  
   ![[2025-11-14_11-10-16.png|301x507]]
2. En la ventana de "Ethernet" clicamos en "Cambiar opciones del adaptador".
   ![[2025-11-14_11-12-13.png|237x284]]
3. Se abre otra ventana con todas las redes que tiene la máquina. Hacemos click derecho sobre la que nos interesa modificar sus propiedades.
   ![[2025-11-14_11-14-25.png|338x228]]
4. Vamos a propiedades y seleccionamos la opción que pone "TCP/IPv4". Luego hacemos click en el botón "Properties". 
   ![[2025-11-14_11-20-07.png|350x382]]
5. Vamos a marcar la opción "Use the following IP address" para poder cambiar de manera manual la dirección IP. *Las DNS no es necesario que las completemos.*
   ![[2025-11-14_11-23-57.png|356x267]]

## 3. Usuarios y grupos
### 1. Crear dos usuarios locales

Ejemplo: usuarios `usuario1` y `usuario2`  
(pon la contraseña que tú quieras)

```bash
New-LocalUser -Name "usuario1" -Password (Read-Host -AsSecureString "Contraseña para usuario1")
New-LocalUser -Name "usuario2" -Password (Read-Host -AsSecureString "Contraseña para usuario2")
```


### 2. Crear un grupo local
```bash
New-LocalGroup -Name "GrupoTrabajo"
```

### 3. Agregar los dos usuarios al grupo
```bash
Add-LocalGroupMember -Group "GrupoTrabajo" -Member "usuario1","usuario2"
```

### Añadido 
#### 1. Eliminar usuario
```bash
Remove-LocalUser -Name "usuario1"

# Comprobar
Get-LocalUser
```

#### 1. Eliminar grupo
```bash
Remove-LocalGroup -Name "GrupoTrabajo"


# Comprobar
Get-LocalGroup
```


## 4. Crear tareas programadas

Clic derecho sobre **"Start"**
Vamos a **"=={orange}Computer Managment=="**
![[2025-11-14_09-04-46.png|335x309]]

Hacemos click en "=={red}Task shedule==".
![[2025-11-13_18-59-41.png|284x291]]

Se abre el siguiente menú lateral derecho, sobre el que podemos seleccionar la forma en la que queremos crear una tarea programada. Está la =={orange}básica== (Create Basic Task...) y la =={blue}avanzada== (Create Task...).
![[2025-11-13_23-51-15.png|334x264]]

Si seleccionamos la creación de una tarea básica, esto nos abrirá la siguiente ventana.
![[2025-11-14_09-18-01.png]]
A diferencia de las tareas "avanzadas" es que en las básicas podemos programas algo en tan solo 4 sencillos pasos.
1. Introducimos el nombre y descripción de la tarea.
2. Indicamos el momento en el que queremos que se ejecute el disparador.
	![[2025-11-14_09-22-55.png|377x226]]
3. Le decimos cúando queremos que inicie la primera vez.![[2025-11-14_09-25-16.png]]
4. Dejamos la opción por defecto; que se ejecute un programa.![[2025-11-14_09-26-51.png|438x147]]
5. Buscamos el programa que queremos que se ejecute.![[2025-11-14_09-29-51.png|487x158]]
6. Al clicar en "Browse" se nos abre la siguiente ventana con la lista de programas que trae windows 32bits para ejecutar. ![[2025-11-14_10-54-06.png]]
7. En la último apartado vemos un resumen de la tarea que hemos programado.  ![[2025-11-14_10-55-32.png]]

En la parte central de la pantalla hay un listado de la tareas programadas que tiene guardadas el ordenador; indistintamente de qué usuario las haya creado. 
![[2025-11-14_11-00-27.png|430x311]]


Modificar la tarea que se ha seleccionado
![[2025-11-13_23-55-27.png|272x264]]
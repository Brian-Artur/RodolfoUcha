---
title: "Apuntes mejorados: Linux, VirtualBox, paquetes, discos y SSH (DAW)"
autor: "(revisado y ampliado por ChatGPT)"
---

# 0) Cómo leer estos apuntes 🙂

Piensa en el sistema operativo como una **ciudad** 🏙️:
- El **kernel** es el *ayuntamiento* (manda sobre recursos: CPU, memoria, discos, red).
- La **shell** es el *mostrador de información* donde pides cosas con comandos.
- Los **paquetes** son *tiendas/servicios* que instalas.
- El **sistema de archivos** es el *mapa de calles* (carpetas) donde viven tus cosas.

> 💡 Objetivo: que tengas apuntes **ordenados**, con **comandos útiles**, y con correcciones de algunas frases/confusiones típicas.

---

# 1) GNU/Linux, distribuciones y “sabores” 🐧

## 1.1 GNU vs Linux (la idea correcta)
- **Linux** es el **kernel** (la parte central que habla con el hardware).
- **GNU** es un conjunto de herramientas (bash, coreutils, gcc, etc.) que suelen acompañar al kernel.
- Por eso verás a veces *“GNU/Linux”*: es como decir **motor + carrocería** 🚗.

En tus apuntes aparece la idea de GNU y Linux como conceptos separados (bien), pero con nombres mal escritos (p. ej., *Linus Torvalds*) y con comentarios personales que no aportan al temario. Mejor quedarse con lo técnico. fileciteturn0file0

## 1.2 Distribución (distro) y entorno de escritorio
Una **distro** es un “pack” que incluye:
- Kernel + herramientas + instalador + repositorios + configuración.

Ejemplos: Debian/Ubuntu/Mint, Arch, Fedora/Red Hat… fileciteturn0file0

Además, una distro puede llevar distintos **entornos de escritorio** (lo que ves):
- GNOME, KDE Plasma, Cinnamon (Mint), Xfce, LXDE… fileciteturn0file0

> Analogía 🎨: misma “ciudad” (Linux) pero con *distinto diseño de calles y señales* (entorno).

## 1.3 Versiones y “Rolling Release”
- **Versionada**: sale una versión cada X meses/años (Ubuntu, Mint…).
- **Rolling release**: se actualiza continuamente (Arch). fileciteturn0file0

---

# 2) Live USB/ISO e instalación en VirtualBox 🧪

## 2.1 Modo Live
Una **Live** te deja arrancar y probar sin instalar (ideal para comprobar compatibilidad). fileciteturn0file0

## 2.2 Instalación de Linux Mint (puntos clave)
Cosas típicas que aparecen en tus pantallazos:
- Elegir idioma/teclado (puedes instalar en inglés y luego usar teclado español). fileciteturn0file0
- Codecs multimedia: útiles si vas a reproducir formatos privativos (vídeo/audio). fileciteturn0file0
- **LVM**: no es “mejor o peor”, es una herramienta.
  - ✅ Ventaja: redimensionar volúmenes, snapshots (según configuración), más flexibilidad.
  - ❌ Inconveniente: añade capa extra (más complejidad y, en equipos modestos, puede notarse en gestión).
  - Para clase/lab suele estar bien **sin LVM** si queréis sencillez. fileciteturn0file0

## 2.3 Cifrado: qué se puede cifrar
En apuntes se menciona cifrar /home y “la BIOS”. La idea general:
- **Cifrado de disco** (LUKS, BitLocker): protege datos *en reposo* (si te roban el disco).
- **Cifrado de /home**: protege datos del usuario (hoy se usa menos porque el cifrado completo es más común).
- En firmware/UEFI existe **Secure Boot** (no es cifrado; es validación de arranque). fileciteturn0file0

> 💡 Regla rápida 🔐: 
> - *Cifrar* = proteger datos **guardados**.
> - *TLS/SSH* = proteger datos **en tránsito**.

---

# 3) Red en Mint/VirtualBox 🌐

En tus apuntes hay pasos GUI para editar una conexión (NetworkManager). fileciteturn0file0

## 3.1 NAT vs Adaptador puente (muy importante)
- **NAT** (por defecto): la VM “sale a Internet” como si fuese un móvil detrás del router. Suele ser más simple.
- **Puente (Bridged)**: la VM aparece en tu red como “otro PC más” (mejor para pruebas de SSH/servidor). fileciteturn0file4

## 3.2 Comandos de red imprescindibles 🧰
- Ver interfaces e IPs:
  ```bash
  ip a
  ```
- Ver rutas (puerta de enlace):
  ```bash
  ip r
  # o
  ip route
  ```
  (En tus apuntes aparece como “ip r / ip route”. fileciteturn0file0turn0file2)

- Comprobar conectividad:
  ```bash
  ping -c 4 8.8.8.8
  ping -c 4 google.com
  ```
  Si a IP funciona pero a dominio no, suele ser DNS.

- Ver puertos en escucha:
  ```bash
  ss -tulpn
  ```

### Nota sobre loopback 🌀
En tus apuntes: “lo = loopback = 127.0.0.1”. Matiz:
- **lo** es la *interfaz*.
- **127.0.0.1** es una *dirección IPv4* de loopback.
- En IPv6 el loopback es **::1**. fileciteturn0file2

---

# 4) Terminal, TTYs y shell 🧑‍💻

## 4.1 Terminal vs TTY (Ctrl+Alt+F1…F6)
En Mint puedes cambiar a una terminal “real” (TTY) con:
- `Ctrl + Alt + F1` … `Ctrl + Alt + F6`
- Volver a entorno gráfico suele ser `Ctrl + Alt + F7` (o `F1` en algunos sistemas modernos). fileciteturn0file0turn0file1

> Analogía 📺: el entorno gráfico es un canal; las TTY son otros canales sin “decorado”.

## 4.2 Prompt y símbolos
En el prompt:
- `$` normalmente = usuario normal
- `#` normalmente = root

## 4.3 Shells (bash, sh, fish…)
- **bash**: la más común en distros tradicionales.
- **sh**: shell más minimalista (en algunos sistemas es “dash”).
- **fish**: muy amigable, autocompletado potente.

En tus apuntes se comenta que sh “no tiene colores” (depende de config), pero sí es cierto que suele ser más austera. fileciteturn0file1turn0file0

Para ver tu shell actual:
```bash
echo "$SHELL"
```
Para cambiar de shell (temporal, en esa sesión):
```bash
sh
bash
```
Para cambiarla de forma permanente (si está instalado):
```bash
chsh -s /bin/bash
```

---

# 5) Manuales, estructura de comandos y códigos de salida 📚

## 5.1 `man` (páginas de manual)
- `man comando` te abre el manual.
- Buscar dentro: escribe `/texto` y Enter.
- Salir: `q`.

Tus apuntes mencionan man7.org y su versión en español (bien como referencia). fileciteturn0file1

## 5.2 Sintaxis general
```text
comando [opciones] [argumentos]
```
- **opciones** cambian el comportamiento.
- **argumentos** son “con qué” trabaja el comando. fileciteturn0file1

## 5.3 Códigos de salida (muy de admin)
Cada comando devuelve un número:
- `0` = OK
- `>0` = error

Ver el último código:
```bash
echo $?
```
(Tu apunte lo menciona, pero faltaba el `echo $?`). fileciteturn0file1

---

# 6) Comandos básicos de navegación y archivos 🗂️

## 6.1 Listado `ls`
En tus apuntes aparece `ls -lisha` para ver ocultos y detalles. fileciteturn0file0turn0file1

Desglose útil:
```bash
ls -la      # largo + ocultos
ls -lh      # tamaños “humanos”
ls -lisa    # inode + tamaño en bloques + ocultos
```

> 💡 “Ocultos” en Linux = empiezan por `.` (ej: `.bashrc`). No son invisibles, solo “apartados” 😄

## 6.2 Moverte por carpetas
```bash
pwd         # dónde estoy
cd /        # ir a la raíz
cd ~        # ir a tu home
cd ..       # subir un nivel
```
`pwd` aparece en tus notas como “en dónde estamos”. fileciteturn0file0

## 6.3 Crear/copiar/mover/borrar
```bash
mkdir carpeta
mkdir -p padre/hijo
cp origen destino
cp -r carpeta destino
mv origen destino
rm archivo
rm -r carpeta
rm -rf carpeta   # ⚠️ peligro
```

## 6.4 Ver contenido de archivos
```bash
cat archivo
less archivo
head -n 20 archivo
tail -n 50 archivo
```

## 6.5 Buscar cosas 🔎
```bash
which comando
whereis comando
find /ruta -name "*.log"
grep -R "texto" /ruta
```

---

# 7) Usuarios, `su`, `sudo` y contraseñas 👤

Tus apuntes incluyen: `whoami`, `logname`, `who`, `id`, `w`, `su`, `passwd` y la idea de que la contraseña no se pasa como parámetro (correcto). fileciteturn0file1

## 7.1 Quién soy
```bash
whoami      # usuario efectivo (con el que ejecutas)
logname     # usuario que inició sesión
id          # UID, GID y grupos
who         # sesiones abiertas
w           # quién está conectado y qué hace
```

## 7.2 Cambiar de usuario
```bash
su - usuario
```
- Si no pones usuario: intenta ir a root.
- El `-` carga el entorno del usuario (como si iniciase sesión). fileciteturn0file1

## 7.3 `sudo` (ejecutar como root)
- No todo usuario puede usar sudo: depende de grupos/configuración.

Ejemplos:
```bash
sudo apt update
sudo passwd root
```
(Tu apunte lo muestra). fileciteturn0file1turn0file5

### Consejo pro ✅
Mejor usar `sudo` para acciones puntuales que “vivir como root”.

---

# 8) Información del sistema 🧾

En tus apuntes salen comandos como `hostname`, `uname`, `lsb_release`, `uptime`, `free`, `df`, `lscpu`, `lsblk`, `lspci`, `lsusb`, `top`. fileciteturn0file1turn0file0

## 8.1 Identidad del sistema
```bash
hostname
hostnamectl
uname
uname -a
lsb_release -a
cat /etc/os-release
```

### Matiz sobre `hostname -i` / `-I`
En tus apuntes se dice que `hostname -i` “siempre 127.0.0.1”. Ojo 👀:
- `hostname -i` intenta resolver el hostname a IP (puede dar 127.0.1.1/127.0.0.1 en algunas configs, pero no “siempre”).
- `hostname -I` lista IPs asignadas a interfaces. fileciteturn0file1

## 8.2 Tiempo encendido
```bash
uptime
uptime -p     # “pretty” (en muchos sistemas)
```
fileciteturn0file1

## 8.3 Memoria
```bash
free -h
```
- **RAM**: memoria rápida.
- **swap**: “memoria de intercambio” (como una mochila extra, más lenta). fileciteturn0file1

## 8.4 Disco
```bash
df -h
```
- Muestra *sistemas de archivos montados* y uso.

Para ver “qué carpeta ocupa más”:
```bash
du -sh /home
du -sh *
```
(Tus apuntes lo mencionan pero con algunas frases mezcladas; aquí va ordenado). fileciteturn0file2

## 8.5 Procesos
```bash
top
ps aux | head
```
Extra recomendado:
```bash
htop
```

## 8.6 Hardware detectado
```bash
lscpu
lsblk
lspci
lsusb
```
fileciteturn0file1

---

# 9) Gestión de paquetes en Debian/Ubuntu/Mint: APT 📦

Tus apuntes explican que apt es un gestor de paquetes y hablan de dependencias (bien). fileciteturn0file2turn0file5

## 9.1 Flujo típico (sin liarla 😅)
1) Actualizar lista de paquetes:
```bash
sudo apt update
```
2) Actualizar paquetes instalados:
```bash
sudo apt upgrade
```

> ✅ En tus apuntes aparece `apt -yes update`. En APT se usa normalmente `-y`:
```bash
sudo apt -y update
```
fileciteturn0file2

## 9.2 Buscar e inspeccionar paquetes
```bash
apt search nombre
apt show paquete
apt policy paquete
```

## 9.3 Instalar / eliminar
```bash
sudo apt install paquete
sudo apt remove paquete
sudo apt purge paquete     # elimina también config
```
fileciteturn0file2

## 9.4 Limpiar dependencias y caché
- Quitar dependencias no usadas:
```bash
sudo apt autoremove
sudo apt autoremove --purge
```
- Limpiar caché:
```bash
sudo apt clean
sudo apt autoclean
```

> ⚠️ En tus apuntes aparece “apt autopurge”: **no es un comando estándar**.
> Lo equivalente suele ser `apt autoremove --purge`.

## 9.5 `full-upgrade` / `dist-upgrade`
```bash
sudo apt full-upgrade
```
- Puede instalar/quitar paquetes para resolver dependencias.
- No siempre significa “cambiar de versión de distro”. Para eso se usan herramientas específicas (depende de la distro). fileciteturn0file2

---

# 10) Flatpak (Flathub) vs paquetes del sistema 🧩

En tus apuntes se ve que al instalar algo de Flatpak la primera vez se descarga “la base” (runtimes) y luego ya va más rápido: correcto. fileciteturn0file0

## 10.1 Diferencias rápidas
- **Paquete del sistema (APT)**: integrado con tu distro, librerías compartidas.
- **Flatpak**: trae dependencias “empaquetadas” (más pesado, pero más aislado y a veces más actualizado).

Comandos útiles:
```bash
flatpak list
flatpak search nombre
flatpak install flathub app.id
flatpak uninstall app.id
```

---

# 11) VirtualBox Guest Additions 🧰

Tus apuntes muestran el menú “Insertar imagen de CD de las Guest Additions” y ejecutar el script. fileciteturn0file0turn0file5turn0file4

## 11.1 ¿Para qué sirven?
- Mejor resolución/autoajuste de pantalla.
- Portapapeles compartido.
- Carpetas compartidas.

## 11.2 Instalación típica en Linux (Mint/Ubuntu)
1) Insertar CD desde VirtualBox.
2) Instalar dependencias (recomendado):
```bash
sudo apt update
sudo apt install -y build-essential dkms linux-headers-$(uname -r)
```
3) Montar y ejecutar (a veces se automonta en /media):
```bash
cd /media/$USER/VBox_GAs_*/
sudo ./VBoxLinuxAdditions.run
sudo reboot
```

> Si al compilar da error, casi siempre faltan *headers* o DKMS.

---

# 12) SSH: acceso remoto seguro 🔐

Tus apuntes mencionan que telnet va por 23 y que se usa SSH porque va cifrado (correcto) y enseñan `ssh -l usuario ip`. fileciteturn0file2turn0file3

## 12.1 Telnet vs SSH
- **Telnet**: texto plano (inseguro). Útil hoy solo para pruebas muy concretas (p. ej., comprobar banners/puertos).
- **SSH**: comunicación **cifrada** (confidencialidad + integridad). 

> Nota de vocabulario: en español técnico lo correcto es decir **cifrado** (encryption). fileciteturn0file2

## 12.2 Instalar servidor SSH en Linux
```bash
sudo apt update
sudo apt install -y openssh-server
sudo systemctl enable --now ssh
```

Comprobar estado:
```bash
systemctl status ssh
```

## 12.3 Conectarte desde Windows a Linux
1) Mira la IP en Linux:
```bash
ip route
```
2) Conecta:
```bash
ssh usuario@IP
# o
ssh -l usuario IP
```
fileciteturn0file5turn0file3

## 12.4 Puertos y firewall (corrección importante) 🧯
En tus apuntes aparece “para conectarnos de linux a windows deshabilitar cortafuegos de windows”. Eso es **mala práctica**.

✅ Mejor:
- **Crear una regla** en Windows Defender Firewall para permitir el puerto (p. ej., 22 si es OpenSSH, o el que use Bitvise).
- O limitarlo a “Red privada” y/o a una IP concreta.

> Analogía 🚪: no tires la puerta de casa para que entre un amigo; **abre la puerta solo a quien toca**.

## 12.5 Comandos SSH extra (muy útiles)
- Salir de la sesión: `exit` (en tus apuntes). fileciteturn0file3
- Copiar archivos (SCP):
```bash
scp archivo.txt usuario@IP:/ruta/destino
scp -r carpeta usuario@IP:/ruta/destino
```
- Túneles (port forwarding):
```bash
ssh -L 8080:localhost:80 usuario@IP
```
Esto crea un “túnel” seguro para acceder a un puerto remoto como si fuese local.

---

# 13) Discos, particiones y montaje 🧱

Tus apuntes incluyen: `/dev/sda`, `/dev/sdb`, `fdisk -l`, GPT/MBR, `mkfs`, `mount`, `umount`, y `lsblk -f`. fileciteturn0file6turn0file7

## 13.1 Nombres de discos en Linux
- Discos: `/dev/sda`, `/dev/sdb`…
- Particiones: `/dev/sda1`, `/dev/sda2`…

> “Todo es un archivo” 🧠: en Linux el disco aparece como un *archivo especial* dentro de `/dev`. fileciteturn0file6

## 13.2 Ver discos y particiones
```bash
lsblk
lsblk -f        # con filesystem y UUID
sudo fdisk -l
```
fileciteturn0file6turn0file7

## 13.3 MBR vs GPT (correcciones)
En tus apuntes:
- MBR: “máximo 4 particiones” (correcto: 4 primarias; una puede ser extendida con lógicas). fileciteturn0file7
- GPT: aparece “hasta 128 (7bits)” y en otro lado “512 particiones”. Esto suele ser confusión.
  - **GPT** suele venir con **128 entradas** por defecto (muy común en herramientas), pero puede ampliarse.
  - La idea importante para examen/práctica: GPT es **moderno**, con **copia de tabla** al final del disco y mejor tolerancia a errores (CRC). fileciteturn0file7turn0file6

## 13.4 Crear particiones (fdisk)
⚠️ `fdisk` es interactivo. Flujo típico:
- `n` crear
- `p` listar
- `t` cambiar tipo
- `w` escribir cambios
- `q` salir sin guardar

Tus capturas lo muestran (bien). fileciteturn0file6

## 13.5 Formatear (crear sistema de archivos)
Ejemplos:
```bash
sudo mkfs.ext4 /dev/sdb1
sudo mkfs.btrfs /dev/sdb2
sudo mkfs.ntfs -f /dev/sdb3
```
- La opción `-L` pone etiqueta (LABEL). fileciteturn0file6

## 13.6 Montar y desmontar
1) Crear punto de montaje (carpeta):
```bash
sudo mkdir -p /mnt/disco2part3
```
2) Montar:
```bash
sudo mount /dev/sdb3 /mnt/disco2part3
```
3) Desmontar:
```bash
sudo umount /mnt/disco2part3
```

> En tus apuntes aparece un error por no existir la carpeta o por estar en una ruta distinta. Lo importante es: **la carpeta debe existir** y **montas dispositivo → carpeta**. fileciteturn0file6

## 13.7 Montaje automático con `/etc/fstab`
En tus apuntes aparece el concepto de UUID y ejemplo de líneas (bien). fileciteturn0file7

1) Obtener UUID:
```bash
blkid
```
2) Editar `/etc/fstab` (con cuidado):
```bash
sudo nano /etc/fstab
```
Ejemplo (ext4):
```text
UUID=cedc5f37-2fe2-40d3-9246-59eeba7de827 /disco2part1 ext4 defaults 0 2
```
3) Probar sin reiniciar:
```bash
sudo mount -a
```

---

# 14) BIOS vs UEFI (arranque) 🚀

Tus apuntes explican BIOS con POST y búsqueda del MBR, y UEFI con GPT. fileciteturn0file7

## 14.1 BIOS (clásico)
Flujo típico:
1) POST
2) Busca MBR/sector de arranque
3) Carga bootloader
4) Arranca SO

## 14.2 UEFI (moderno)
- Trabaja con partición EFI (ESP).
- Usa entradas de arranque más flexibles.
- Normalmente se combina con GPT.

---

# 15) Sistemas de archivos (resumen bueno para examen) 🧠

Tus apuntes listan FAT32/exFAT/NTFS, APFS/HFS+, ext2/3/4, XFS, Btrfs, ZFS. fileciteturn0file7

## 15.1 Windows
- **FAT32**: compatible, pero limita archivos a 4GB (y sin permisos/journaling). fileciteturn0file7
- **exFAT**: pensado para memorias/compatibilidad moderna.
- **NTFS**: estándar Windows, permisos, journaling, etc. fileciteturn0file7

## 15.2 macOS
- **APFS** (actual).
- **HFS+** (antiguo).

## 15.3 Linux
- **ext4**: muy común y estable.
- **XFS**: muy bueno con archivos grandes y servidores.
- **Btrfs**: moderno, CoW, snapshots, RAID software (según uso).
- **ZFS**: muy fiable (normalmente no viene “nativo” en el kernel; suele añadirse). fileciteturn0file7

---

# 16) Windows 10 en VM: instalación + software 🪟

Tus apuntes muestran instalación de Windows 10 en VirtualBox y luego uso de winget para instalar software. fileciteturn0file4

## 16.1 Recomendaciones de VM
- 2 núcleos y 8 GB RAM (si tu PC lo permite).
- 50 GB disco.
- Red: puente si quieres que sea “un equipo más” de la LAN. fileciteturn0file4

## 16.2 Guest Additions en Windows
Desde VirtualBox: insertar imagen y ejecutar instalador; reiniciar. fileciteturn0file4

## 16.3 `winget` (gestor de paquetes)
Buscar:
```powershell
winget search --source winget vlc
```
Instalar:
```powershell
winget install -e --id VideoLAN.VLC --source winget
winget install -e --id Microsoft.PowerToys --source winget
winget install -e --id Mozilla.Firefox --source winget
winget install -e --id 7zip.7zip --source winget
```
(Tus apuntes lo muestran). fileciteturn0file4

Listar instalados:
```powershell
winget list
```
Actualizar:
```powershell
winget upgrade --all
```

## 16.4 SSH en Windows (Bitvise vs OpenSSH)
En tus apuntes se usa Bitvise SSH Server con winget. fileciteturn0file4

Idea clave:
- Si montas un servidor SSH en Windows, revisa:
  - Servicio arrancado.
  - Puerto permitido en firewall.
  - Usuario con permisos.

## 16.5 Chocolatey (mención)
Chocolatey es otro gestor de paquetes en Windows (similar a winget, muy usado en entornos dev). fileciteturn0file4

---

# 17) Mini “chuleta” de comandos para práctica ✅

## Linux
```bash
# Identidad
whoami; logname; hostname; hostnamectl; uname -a

# Archivos
pwd; ls -la; cd; mkdir -p; cp -r; mv; rm -r

# Buscar
which; find; grep -R

# Red
ip a; ip r; ping -c 4 8.8.8.8; ss -tulpn

# Sistema
uptime -p; free -h; df -h; du -sh *; top

# Paquetes
sudo apt update && sudo apt upgrade
apt search; apt show; sudo apt install; sudo apt purge; sudo apt autoremove --purge

# SSH
sudo apt install openssh-server
sudo systemctl enable --now ssh
ssh usuario@ip
```

## Windows (PowerShell)
```powershell
winget search --source winget ssh
winget install -e --id VideoLAN.VLC --source winget
winget list
winget upgrade --all
```

---

# 18) Errores típicos (y cómo salir) 😵‍💫➡️😎

- “No puedo instalar VLC / no conecta a archive.ubuntu.com”
  - Mira red: `ip r`, `ping 8.8.8.8`, DNS.
  - Si estás en VM: revisa NAT/puente.
  - A veces es IPv6 raro en redes “capadas”; prueba DNS o desactivar IPv6 (solo para test).
  - En tus apuntes aparecen errores de conexión al repo (buena pista de problema de red). fileciteturn0file0

- “`mount` falla: mountpoint no existe”
  - Crea la carpeta: `mkdir -p /mnt/loquesea`.

- “No me funciona Guest Additions”
  - Instala `dkms` + `linux-headers-$(uname -r)`.

---

## Fin 🎉
Si quieres, en el siguiente paso puedo:
- Convertir esto en **varias notas separadas** estilo Obsidian (1 archivo por tema),
- O montarte un **índice** tipo “vault” con enlaces internos `[[...]]`.

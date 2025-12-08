## 🖥️ INFORMACIÓN GENERAL DEL EQUIPO

|Acción|Comando PowerShell|Descripción|
|---|---|---|
|Ver información del sistema|`Get-ComputerInfo`|Muestra información detallada: SO, versión, RAM, CPU, etc.|
|Nombre del equipo|`(Get-ComputerInfo).CsName` o `hostname`|Devuelve el nombre del equipo.|
|Variables del sistema|`Get-ChildItem Env:`|Lista las variables de entorno.|
|Procesos activos|`Get-Process`|Muestra los procesos en ejecución.|
|Servicios activos|`Get-Service`|Lista los servicios del sistema.|
|Información del BIOS|`Get-WmiObject Win32_BIOS`|Muestra fabricante, versión y serie del BIOS.|

---
## 🌐 TARJETA DE RED (ADAPTADOR)

| Acción                                            | Comando PowerShell                                                                                                 | Descripción                                           |
| ------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------ | ----------------------------------------------------- |
| Ver adaptadores de red                            | `Get-NetAdapter`                                                                                                   | Muestra los adaptadores instalados y su estado.       |
| Ver configuración IP                              | `Get-NetIPAddress`                                                                                                 | Lista direcciones IPv4/IPv6 de todos los adaptadores. |
| Ver configuración completa (como `ipconfig /all`) | `Get-NetIPConfiguration`                                                                                           | Muestra DNS, gateway, IP y más.                       |
| Activar adaptador                                 | `Enable-NetAdapter -Name "Ethernet"`                                                                               | Activa el adaptador de red.                           |
| Desactivar adaptador                              | `Disable-NetAdapter -Name "Ethernet"`                                                                              | Desactiva el adaptador de red.                        |
| Asignar IP estática                               | `New-NetIPAddress -InterfaceAlias "Ethernet" -IPAddress 192.168.1.10 -PrefixLength 24 -DefaultGateway 192.168.1.1` | Configura IP manualmente.                             |
| Configurar DNS                                    | `Set-DnsClientServerAddress -InterfaceAlias "Ethernet" -ServerAddresses ("8.8.8.8","8.8.4.4")`                     | Define los servidores DNS.                            |
| Volver a DHCP (IP automática)                     | `Set-NetIPInterface -InterfaceAlias "Ethernet" -Dhcp Enabled`                                                      | Restaura la obtención automática de IP.               |

---

## 👤 USUARIOS Y GRUPOS

| Acción                           | Comando PowerShell                                                                                                                       | Descripción                                                    |
| -------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------- |
| Ver usuarios locales             | `Get-LocalUser`                                                                                                                          | Muestra todos los usuarios locales del sistema.                |
| Crear un usuario                 | `New-LocalUser -Name "Juan" -Password (Read-Host -AsSecureString "Contraseña") -FullName "Juan Pérez" -Description "Usuario de pruebas"` | Crea un usuario local.                                         |
| Cambiar contraseña de un usuario | `Set-LocalUser -Name "Juan" -Password (Read-Host -AsSecureString "Nueva contraseña")`                                                    | Cambia la contraseña.                                          |
| Habilitar usuario                | `Enable-LocalUser -Name "Juan"`                                                                                                          | Activa un usuario deshabilitado.                               |
| Deshabilitar usuario             | `Disable-LocalUser -Name "Juan"`                                                                                                         | Desactiva una cuenta.                                          |
| Eliminar usuario                 | `Remove-LocalUser -Name "Juan"`                                                                                                          | Borra el usuario local.                                        |
| Ver miembros de un grupo         | `Get-LocalGroupMember -Group "Administradores"`                                                                                          | Muestra los miembros del grupo especificado.                   |
| Ver grupos locales               | `Get-LocalGroup`                                                                                                                         | Lista los grupos existentes (Administradores, Usuarios, etc.). |
| Agregar usuario a grupo          | `Add-LocalGroupMember -Group "Administradores" -Member "Juan"`                                                                           | Da permisos de administrador.                                  |
| Quitar usuario de grupo          | `Remove-LocalGroupMember -Group "Administradores" -Member "Juan"`                                                                        | Revoca permisos.                                               |
|                                  |                                                                                                                                          |                                                                |

---

## 🧠 AYUDA Y DOCUMENTACIÓN

| Acción                          | Comando PowerShell               | Descripción                                         |
| ------------------------------- | -------------------------------- | --------------------------------------------------- |
| Ver ayuda general               | `Get-Help`                       | Lista las opciones del sistema de ayuda.            |
| Obtener ayuda de un comando     | `Get-Help Get-Process`           | Muestra información y sintaxis del comando.         |
| Ver ejemplos de uso             | `Get-Help Get-Process -Examples` | Solo los ejemplos prácticos.                        |
| Ver ayuda detallada             | `Get-Help Get-Process -Detailed` | Muestra descripción completa y parámetros.          |
| Actualizar la ayuda del sistema | `Update-Help`                    | Descarga y actualiza los archivos de ayuda locales. |

---
### ⚙️ OTROS COMANDOS ÚTILES

|Acción|Comando PowerShell|Descripción|
|---|---|---|
|Mostrar versión de PowerShell|`$PSVersionTable.PSVersion`|Versión actual de PowerShell.|
|Ver información de red resumida|`Test-Connection 8.8.8.8`|Equivalente a `ping`.|
|Mostrar rutas de red|`tracert 8.8.8.8`|Muestra la ruta hasta un destino.|
|Ver sesiones activas|`query user`|Lista las sesiones de usuario en el sistema.|
|Reiniciar el equipo|`Restart-Computer`|Reinicia el sistema.|
|Apagar el equipo|`Stop-Computer`|Apaga el sistema.|

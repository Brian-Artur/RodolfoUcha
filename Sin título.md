## 1. Desinstalar software de audio/vídeo que no necesitas

bash

```bash
# Eliminar software de edición de vídeo
sudo apt remove --purge kdenlive openshot pitivi shotcut flowblade

# Eliminar software de edición de audio/música
sudo apt remove --purge ardour audacity lmms rosegarden qtractor hydrogen

# Eliminar software de producción musical y plugins
sudo apt remove --purge carla calf-plugins eq10q guitarix rakarrack

# Eliminar herramientas de diseño gráfico (si no las necesitas)
sudo apt remove --purge krita inkscape blender gimp

# Limpiar paquetes huérfanos y caché
sudo apt autoremove
sudo apt autoclean
```

## 2. Instalar herramientas de desarrollo web

bash

```bash
# Actualizar repositorios
sudo apt update

# Instalar Node.js y npm (versión LTS desde repositorio oficial)
curl -fsSL https://deb.nodesource.com/setup_lts.x | sudo -E bash -
sudo apt install -y nodejs

# Instalar TypeScript globalmente
sudo npm install -g typescript

# Instalar VS Code
wget -qO- https://packages.microsoft.com/keys/microsoft.asc | gpg --dearmor > packages.microsoft.gpg
sudo install -D -o root -g root -m 644 packages.microsoft.gpg /etc/apt/keyrings/packages.microsoft.gpg
sudo sh -c 'echo "deb [arch=amd64,arm64,armhf signed-by=/etc/apt/keyrings/packages.microsoft.gpg] https://packages.microsoft.com/repos/code stable main" > /etc/apt/sources.list.d/vscode.list'
rm -f packages.microsoft.gpg
sudo apt update
sudo apt install code

# Instalar VirtualBox
sudo apt install virtualbox virtualbox-ext-pack

# Instalar Obsidian (AppImage o Snap)
# Opción 1 - Snap:
sudo snap install obsidian --classic

# Opción 2 - Si prefieres AppImage, descarga desde: https://obsidian.md/download

# Instalar Git (si no está ya)
sudo apt install git

# Instalar otras herramientas útiles para desarrollo web
sudo apt install curl wget build-essential
```

## 3. Verificar que LibreOffice y VLC están instalados

bash

```bash
# Verificar LibreOffice
dpkg -l | grep libreoffice

# Verificar VLC
dpkg -l | grep vlc

# Si no están instalados:
sudo apt install libreoffice vlc
```

## 4. Herramientas adicionales recomendadas para desarrollo web

bash

```bash
# Navegadores para testing
sudo apt install firefox chromium-browser

# Docker (muy útil para desarrollo)
sudo apt install docker.io
sudo systemctl enable docker
sudo usermod -aG docker $USER

# Postman (para testing de APIs) - via Snap
sudo snap install postman
```
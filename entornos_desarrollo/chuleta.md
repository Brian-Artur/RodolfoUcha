# 1. Instalar Eclipse

https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2025-09/R/eclipse-java-2025-09-R-linux-gtk-x86_64.tar.gz



## 🧩 1️⃣ Instalar Eclipse en Debian 12 Xfce

### 📦 A) Instalar dependencias necesarias

Abre una terminal y ejecuta:
```bash
sudo apt update
sudo apt install default-jdk wget unzip
```


Comprueba la versión de Java:

java -version

Debe aparecer algo como openjdk 17 o superior.

### 🧭 B) Descargar Eclipse

Puedes hacerlo manualmente o con terminal.  
Con terminal:
```bash
cd /tmp
wget https://ftp.fau.de/eclipse/technology/epp/downloads/release/latest/eclipse-jee-latest-linux-gtk-x86_64.tar.gz
```


Descomprime:
```bash
tar -xvzf eclipse-jee-latest-linux-gtk-x86_64.tar.gz
sudo mv eclipse /opt/
```

### ⚙️ C) Crear acceso directo al menú de aplicaciones

Crea un archivo de escritorio:
```bash
sudo nano /usr/share/applications/eclipse.desktop
```

Copia dentro:
```bash
[Desktop Entry]
Name=Eclipse IDE
Type=Application
Exec=/opt/eclipse/eclipse
Terminal=false
Icon=/opt/eclipse/icon.xpm
Comment=Eclipse IDE for Java Developers
Categories=Development;IDE;
```
Guarda (Ctrl+O, Enter, Ctrl+X).  
Ahora Eclipse aparecerá en tu menú de aplicaciones.

## 📘 2️⃣ Crear un proyecto Java y generar documentación Javadoc

### 🔹 Crear proyecto:

1. Abre Eclipse.
    
2. Ve a **File → New → Java Project** → nómbralo, por ejemplo `JavadocTest`.
    
3. Crea una clase: **File → New → Class → Main**.
    
4. Escribe algo como:

```java
/**
 * Clase de ejemplo para probar Javadoc.
 * @author Brian
 * @version 1.0
 */
public class Main {

    /**
     * Método principal que muestra un saludo por pantalla.
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        System.out.println("Hola desde Javadoc!");
    }

    /**
     * Devuelve la suma de dos enteros.
     * @param a primer número
     * @param b segundo número
     * @return la suma de a y b
     */
    public static int sumar(int a, int b) {
        return a + b;
    }
}
```

### 🔹 Generar Javadoc:

1. En Eclipse: menú **Project → Generate Javadoc...**
    
2. Si pide el ejecutable `javadoc`, selecciona:
    
    `/usr/bin/javadoc`
    
3. Marca la clase o paquete.
    
4. Elige una carpeta de salida, por ejemplo:  
    `~/workspace/JavadocTest/doc`
    
5. Marca las opciones de visibilidad (public, protected, etc.)
    
6. Clic en **Finish**.
    

Luego abre el archivo `index.html` que se genera en la carpeta `doc`.

---

## 🔌 3️⃣ Instalar un plugin en Eclipse

Ejemplo: instalar el **plugin de Git (EGit)**.

1. En Eclipse:  
    **Help → Eclipse Marketplace...**
    
2. Busca **EGit**.
    
3. Clic en **Install**, sigue los pasos y reinicia Eclipse.
    

También podrías instalar otros plugins desde una URL:

- **Help → Install New Software...**
    
- En “Work with”, pegas la URL del repositorio del plugin, por ejemplo:
    
    `https://download.eclipse.org/egit/updates`
    
- Seleccionas el plugin y haces clic en **Next → Finish**.
    

---

## ⚡ 4️⃣ Crear un atajo (template) para escribir código rápidamente

Esto sirve para que al escribir una palabra y pulsar **Ctrl+Espacio**, Eclipse inserte automáticamente un bloque de código.

Ejemplo: crear un atajo `saludo` que escriba un `System.out.println("Hola mundo!");`.

1. Ve a **Window → Preferences → Java → Editor → Templates**.
    
2. Clic en **New...**
    
3. Rellena:
    
    - **Name:** `saludo`
        
    - **Context:** `Java statements`
        
    - **Description:** “Imprime un saludo en consola”
        
    - **Pattern:**
        
        `System.out.println("Hola mundo!");`
        
4. Acepta y aplica los cambios.
    

Luego, en cualquier código Java, escribe:

`saludo`

y pulsa **Ctrl+Espacio** → se insertará automáticamente el texto.
## 1. Método `indexOf()`
👉 Sirve para **buscar la posición (índice)** donde aparece un texto dentro de otro.

`String frase = "Hola mundo"; int pos = frase.indexOf("mundo"); System.out.println(pos); // 👉 imprime 5`

> Si no lo encuentra, devuelve `-1`.

## 2. Método `substring()`
👉 Sirve para **extraer una parte (subcadena)** de una cadena, indicando desde dónde hasta dónde.

`String palabra = frase.substring(0, 4); System.out.println(palabra); // 👉 "Hola"`

### Formas de uso:
- `substring(inicio)` → desde `inicio` hasta el final.
- `substring(inicio, fin)` → desde `inicio` hasta justo **antes de** `fin`.
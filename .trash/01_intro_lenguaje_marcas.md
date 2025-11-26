# Introducción
Un **lenguaje de marcas, o lenguaje de marcado,** es una forma de codificar un
documento donde, junto al propio texto, se incorporan una serie de etiquetas, marcas o anotaciones con el objetivo de proporcionar información adicional sobre la estructura del texto o su formato de presentación. Por tanto, los lenguajes de marcado permiten hacer explícita la estructura de un documento, su contenido semántico o cualquier otra información lingüística o extralingüística que se quiera resaltar.

Cada lenguaje de marcas se define en base a un documento llamado DTD[^1] en el que se establecen los diferentes elementos utilizados por dicho lenguaje: las etiquetas reconocidas, la forma de construir nuevas etiquetas, los atributos y sus valores válidos, la sintaxis y las reglas de uso, en general.

[^1]: Document Type Definition

A continuación se muestra un ejemplo de un documento creado utilizando el lenguaje de marcado XML:

```xml
<carta>
	<fecha>22/11/2024</fecha>
	<presentación>Estimado cliente:</presentación>
	<contenido>Aquí está la copia de la factura que solicitó
	</contenido>
	<firma>María Segunda Castro</firma>
</carta>
```

Una forma habitual de clasificar los lenguajes de marcado es según su objeto
funcional (aunque en la práctica, en un mismo documento se pueden combinar varios lenguajes de marcado diferentes), distinguiendo:

- **Presentacional** : este tipo de lenguaje de marcado define el formato del texto.
- **Procedural** : también orientado a la presentación, pero siendo un programa que interpreta el código en orden secuencial.
- **Descriptivos o semánticos**: describen las diferentes partes en las que se estructura el documento pero sin especificar cómo deben representarse.
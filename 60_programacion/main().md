## ☕ Cómo funciona REALMENTE Java

En Java **SIEMPRE** hay **un único método de entrada**:

```java
`public static void main(String[] args)`
```

## ✅ Lo CORRECTO en Java (POO bien hecha)
```java
public class Main {     
	public static void main(String[] args) {         
		Application app = new Application();         
		app.start();     
	} 
}`
```

```java
public class Application {     
	public void start() {         
		System.out.println("App iniciada");         
		// menú, módulos, etc.     
	} 
}
```
📌 **Esto es POO limpia**

- `main()` → solo arranca
    
- `Application` → controla el flujo
    
- Otras clases → hacen su trabajo
# ----- Inventory -----

Download stable version JDK: https://www.oracle.com/technetwork/es/java/javase/downloads/index.html

vscode extension: https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack

## Run app
```java
javac Main.java
java Main

```
## Results
```java
----- INVENTARIO -----
Seleccione la opcion tecleando el digito
1.Tiendas --- 2. Proveedores --- 3. Productos --- 4. Empleados

Entry: 1

```
### Success results
```java

Seleccione la tienda tecleando el digito: 
 1. Tienda 1 
 2. Tienda 2

 Entry: 1

 Informacion general de tienda: 
 Tienda: 1, Telefono: '3423467890', Direccion: PUEBLA, PUEBLA
 ```

SELECCIONAR LA TIENDA Tienda 1 Tienda 2

```
### Fail results
```java
    Entry: 4
    Error: No se pudo obtener la informacion de la tienda: null
```

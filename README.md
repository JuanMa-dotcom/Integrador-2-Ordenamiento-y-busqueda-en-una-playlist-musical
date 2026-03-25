# 📁 Estructuras de Datos — Prácticas Finales

Dos proyectos desarrollados en **Java con NetBeans** como prácticas finales de la materia de Estructuras de Datos.

---

## 📷 Práctica 1 — Gestor de Imágenes (Lista Doblemente Enlazada)

Aplicación de escritorio que gestiona un diario de imágenes usando una **lista doblemente enlazada**. Cada nodo almacena una imagen con su información asociada y permite navegación secuencial entre registros.

### Estructura del Nodo
| Campo | Tipo | Descripción |
|---|---|---|
| `imagen` | `BufferedImage` | Imagen del registro |
| `nombreImagen` | `String` | Nombre descriptivo |
| `fecha` | `String` | Fecha de registro |
| `descripcion` | `String` | Descripción del registro |
| `siguiente` | `Nodo` | Referencia al nodo siguiente |
| `anterior` | `Nodo` | Referencia al nodo anterior |

### Funciones implementadas
- ➕ Agregar imagen a la lista
- ▶️ Avanzar a la siguiente imagen
- ◀️ Retroceder a la imagen anterior
- ⏮️ Volver al inicio de la lista
- ⏭️ Ir al final de la lista
- ℹ️ Mostrar información del nodo actual (con punteros anterior/siguiente)

### Archivos
```
📦 GestorImagenes/
 ┣ 📄 Nodo.java              → Estructura del nodo
 ┣ 📄 ListaEnlazada.java     → Lista doblemente enlazada
 ┗ 📄 GestorImagenes.java    → JFrame principal (UI)
```

### Restricciones cumplidas
- ✅ Sin arreglos ni listas predefinidas
- ✅ Almacenamiento exclusivo mediante nodos enlazados
- ✅ Validación de lista vacía antes de navegar
- ✅ Menú interactivo y mensajes claros en cada acción

---

## 🎶 Práctica 2 — Playlist Musical (QuickSort + Búsqueda Binaria)

Aplicación de escritorio que gestiona una playlist de música usando un **arreglo de tamaño fijo**. Implementa ordenamiento con **QuickSort recursivo** y búsqueda con **búsqueda binaria**.

### Estructura de la Canción
| Campo | Tipo | Descripción |
|---|---|---|
| `nombre` | `String` | Nombre de la canción |
| `artista` | `String` | Nombre del artista |
| `album` | `String` | Álbum (opcional) |

### Funciones implementadas
- 🎵 Mostrar playlist completa en tabla
- ⚡ Ordenar con QuickSort (por Nombre o por Artista)
- 🔍 Búsqueda binaria (por Nombre o por Artista)
- ➕ Agregar canciones al arreglo
- 📊 Mostrar estado del arreglo antes y después del ordenamiento
- 🚪 Salir del programa

### Archivos
```
📦 GestorPlaylist/
 ┣ 📄 Cancion.java           → Estructura de datos de cada canción
 ┣ 📄 PlaylistManager.java   → Arreglo, QuickSort y búsqueda binaria
 ┗ 📄 GestorPlaylist.java    → JFrame principal (UI)
```

### Restricciones cumplidas
- ✅ Almacenamiento mediante arreglo de tamaño fijo (50 elementos)
- ✅ QuickSort implementado con recursividad
- ✅ Sin funciones predefinidas de ordenamiento o búsqueda
- ✅ Arreglo ordenado antes de realizar la búsqueda binaria
- ✅ Validación de opciones del menú

---

## 🛠️ Tecnologías

- **Lenguaje:** Java
- **IDE:** Apache NetBeans
- **UI:** Java Swing (JFrame, JTable, JLabel, JButton, JMenuBar)

## ▶️ Cómo ejecutar

1. Clona el repositorio
2. Abre el proyecto en **NetBeans**
3. Verifica que los tres archivos `.java` estén en el mismo paquete
4. Clic derecho en el proyecto → **Clean and Build**
5. **Run** (F6)

---

> Materia: Estructuras de Datos  
> Desarrollado con Java Swing — NetBeans

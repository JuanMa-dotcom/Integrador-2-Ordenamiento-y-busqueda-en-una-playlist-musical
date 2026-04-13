# Estructuras de Datos 

## Práctica 2 — Playlist Musical (QuickSort y Búsqueda Binaria)

Aplicación de escritorio que gestiona una playlist de música usando un **arreglo de tamaño fijo**. Implementa ordenamiento con **QuickSort recursivo** y búsqueda con **búsqueda binaria**.

### Estructura de la Canción
| Campo | Tipo | Descripción |
|---|---|---|
| `nombre` | `String` | Nombre de la canción |
| `artista` | `String` | Nombre del artista |
| `album` | `String` | Álbum (opcional) |

### Funciones implementadas
- Mostrar playlist completa en tabla
- Ordenar con QuickSort (por Nombre o por Artista)
- Búsqueda binaria (por Nombre o por Artista)
- Agregar canciones al arreglo
- Mostrar estado del arreglo antes y después del ordenamiento
- Salir del programa

### Archivos
```
📦 GestorPlaylist/
 ┣ 📄 Cancion.java           → Estructura de datos de cada canción
 ┣ 📄 PlaylistManager.java   → Arreglo, QuickSort y búsqueda binaria
 ┗ 📄 GestorPlaylist.java    → JFrame principal (UI)
```

### Restricciones cumplidas
- Almacenamiento mediante arreglo de tamaño fijo (50 elementos)
- QuickSort implementado con recursividad
- Sin funciones predefinidas de ordenamiento o búsqueda
- Arreglo ordenado antes de realizar la búsqueda binaria
- Validación de opciones del menú

---

## Tecnologías

- **Lenguaje:** Java
- **IDE:** Apache NetBeans
- **UI:** Java Swing (JFrame, JTable, JLabel, JButton, JMenuBar)

## ▶Cómo ejecutar

1. Clona el repositorio
2. Abre el proyecto en **NetBeans**
3. Verifica que los tres archivos `.java` estén en el mismo paquete
4. Clic derecho en el proyecto → **Clean and Build**
5. **Run** (F6)

---

> Materia: Estructuras de Datos  
> Desarrollado con Java Swing — NetBeans

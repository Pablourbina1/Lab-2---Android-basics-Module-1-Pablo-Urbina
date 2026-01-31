# Traffic Light Simulator
## Parte 2 del Laboratorio
### Link del video de explicación: https://drive.google.com/file/d/1ds8ZUCkIH46yBu5OxifBfP4LUyPHyrHV/view?usp=sharing
Se creo un proyecto nuevo para trabajar con los States y `Launched Effect`, creando un semaforo utilizando 3 circulos apilados verticalmente (Rojo, Verde, Amarillo), su funcionamiento fue:
- Automaticamente ciclaba entre cada color.
- Las luces inactivas permanecian en color gris.
- Funcionaba continuamente sin necesidad de interacción del usuario.

## Definition of Done
| Criterio           | Descripción |
|--------------------|-------------|
| Enum definido      | Existe `enum class Light { Red, Yellow, Green }` |
| Tres círculos      | Pila vertical de 3 `Box` con recorte `CircleShape` |
| Estados de color   | Luz activa = color brillante, las demás = gris |
| Ciclo automático  | `LaunchedEffect` ejecuta un bucle infinito |
| Tiempo correcto   | Rojo: 2s → Verde: 2s → Amarillo: 1s → repetir |
| Sin errores        | La app maneja correctamente el ciclo de vida (sin fugas de memoria) |
| UI limpia          | Centrada en pantalla con espaciado adecuado |

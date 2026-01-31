# RPG Dice Roller
Primer ejercicio del Laboratorio 1

Este proyecto consiste en editar el proyecto del dado ya existente de tal forma que sirva como un dado para obtener 3 estadisticas principales para un personaje:
- VIT
- DEX
- WIS

Cada estadistica tiene su propio boton para lanzar el dado y obtener un valor del 1 al 20, principalmente controlado por una funcion compose llamada StatRow, permitiendo que los valores se guarden individualmente y se muestre una suma total de las estadisticas.

## Requisitos
1. Tres Stat Rows (Filas de estadistica)
- En lugar de un numero grande, crear 3 filas (Vit, Dex, Wis)
- Cada fila tiene una etiqueta ("VIT"), un valor ("14"), y un boton de "Lanzar". 
2. Puntuación Total
- Desplegar la **Suma** de las 3 estadisticas abajo.
3. Reglas de validación (Lógica)
- Si el Total < 30, enseñar un mensaje que diga "Re-roll recommended!" en Rojo.
- Si el Total >= 50, enseñar "Godlike!" en Dorado
4. Pulido Visual
- Usar `Card` o `Row` para hacer que las filas de estadisticas se vean profesionales.
- Añadir padding Logico

Link del video de explicación: https://drive.google.com/file/d/1Yy2nFtHbhzpMMvnZF3nYZg5cw9E2orG7/view?usp=drive_link
  

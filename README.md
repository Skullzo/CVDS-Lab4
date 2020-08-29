# Laboratorio 4 de CVDS

Este laboratorio tiene como finalidad el aprendizaje sobre Desarrollo Dirigido por Pruebas + DIP + DI + Contenedores Livianos
El enunciado de este se encuentra dentro del repositorio como un PDf de nombre Laboratorio4CVDS

El diseño de este laboratorio es para el juego conocido como hangman, y se divide en dos partes

## Parte 1

1. Clonamos el proyecto con el comando
```
git clone https://github.com/PDSW-ECI/LigthwayContainer_DependencyInjection_Hangman
```

<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/ClonarRepositorio.PNG">

2. Se implemento los "cascarones" que se pide el enunciado desde el IDE de preferencia, en este caso ECLIPSE

<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/CascaronesDelModelo.PNG">

3. Se realizo las especificaciones necesarias dentro de los metodos para asegurar la calidad del codigo, y se dejo como valor inicial un return 0
A continuacion se muestra cada una de las especificaciones
<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/EspecificacionOriginalScore.PNG">

<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/EspecificacionBonusScore.PNG">

<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/EspecificacionPowerBonusScore.PNG">

4. Se realizo un commit con las especificaciones con 
```
git add .
git commit -m "especificacion metodo"
```

5. Se actualizo el POM del archivo para la version 8 de Java, y se agrego la dependencia de JUNIT

<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/ActualizarPOM.PNG">

6. Se realizaron las clases de equivalencia para cada uno de los 3 casos en Excel, se muestran a continuacion

- Original Score

<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/ClasesEquivalencia1.PNG">

- Bonus Score

<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/ClasesEquivalencia2.PNG">

- PowerBonus Score

<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/ClasesEquivalencia3.PNG">

7. Y a continuación, hicimos las pruebas dentro del IDE Eclipse.
_Para crear una carpeta test, necesitamos crear test dentro la carpeta src, y dentro de esta crear la carpeta java_

- Original Score

<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/PruebasOriginalScore.PNG">

- Bonus Score

<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/PruebasBonusScore.PNG">

- PowerBonus Score

<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/PruebasPowerBonusScore.PNG">

Aqui vemos que las pruebas efectivamente estan correctas

<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/FuncionamientoPruebasCorrecto.PNG">

8. Realizamos el commit con el codigo que nos brinda el laboratorio

```
git add .
git commit -m "implementacion pruebas"
```

<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/commitPruebas.PNG">

9. Ahora realizamos la implementacion de cada uno de los cascarones para su funcionamiento y las pruebas para cada uno de estos

Primero creamos e implementamos la excepcion necesaria
<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/ExcepcionGameScore.PNG">

Manejamos el orden del laboratorio

- Original Score

<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/OriginalScoreImplementacion.PNG">
<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/PruebasOriginalScore2.PNG">

- Bonus Score

<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/BonusScoreImplementacion.PNG">
<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/PruebasBonusScore.PNG">

- PowerBonus Score

<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/PowerBonusScoreImplementacion.PNG">
<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/PruebasPowerBonusScore.PNG">

Aqui vemos que las pruebas efectivamente estan correctas

<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/FuncionamientoPruebasCorrecto2.PNG">


10. Realizamos el add y commit con el codigo que nos brinda el laboratorio

```
git add .
git commit -m "implementacion del modelo"
```

<img  src="https://github.com/JuanMunozD/CVDS4/blob/master/img/commitFinal.PNG">

11. Y realizamos el push necesario para nuestro repositorio


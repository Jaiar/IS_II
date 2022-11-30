-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-11-2022 a las 12:19:47
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10
DROP DATABASE hospitalito;
CREATE DATABASE hospitalito;
USE hospitalito;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hospitalito`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `enfermedad`
--

CREATE TABLE `enfermedad` (
  `id_enfermedad` int(11) NOT NULL,
  `nombre` varchar(11) NOT NULL,
  `enfermedades_relacionadas` int(11),
  `contagiosa` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historialmedico`
--

CREATE TABLE `historialmedico` (
  `id_historialmedico` int(11) NOT NULL,
  `id_paciente` int(11) NOT NULL,
  `id_enfermedad` int(11) NOT NULL,
  `fecha_alta` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicamento`
--

CREATE TABLE `medicamento` (
  `id_medicamento` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `alergias` varchar(30) DEFAULT NULL,
  `efectos_secundarios` varchar(30) DEFAULT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `id_paciente` int(8) NOT NULL,
  `dni_paciente` varchar(8) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `telefono` int(9) NOT NULL,
  `habitacion` int(3) NOT NULL,
  `medico` int(11) NOT NULL,
  `enfermero` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente_enfermedades`
--

CREATE TABLE `paciente_enfermedades` (
  `id_paciente_enfermedades` int(11) NOT NULL,
  `id_paciente` int(8) NOT NULL,
  `id_enfermedad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE `tratamiento` (
  `id_tratamiento` int(11) NOT NULL,
  `id_medicamento` int(11) NOT NULL,
  `id_enfermedad` int(11) NOT NULL,
  `dosis` int(11) NOT NULL,
  `dosis_diaria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `dni_usuario` varchar(8) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `rol` smallint(3) NOT NULL,
  `fecha_incorporacion` date NOT NULL,
  `user` varchar(20) NOT NULL,
  `pass` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `enfermedad`
--
ALTER TABLE `enfermedad`
  ADD PRIMARY KEY (`id_enfermedad`),
  ADD KEY `fk_enfermedad_enfermedad` (`enfermedades_relacionadas`);

--
-- Indices de la tabla `historialmedico`
--
ALTER TABLE `historialmedico`
  ADD PRIMARY KEY (`id_historialmedico`),
  ADD KEY `fk_historial_enfermedad` (`id_enfermedad`),
  ADD KEY `fk_historial_paciente` (`id_paciente`);

--
-- Indices de la tabla `medicamento`
--
ALTER TABLE `medicamento`
  ADD PRIMARY KEY (`id_medicamento`),
  ADD UNIQUE KEY `alergias` (`alergias`,`efectos_secundarios`) USING HASH,
  ADD UNIQUE KEY `alergias_2` (`alergias`,`efectos_secundarios`) USING HASH;

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id_paciente`),
  ADD KEY `fk_enfermero_paciente` (`enfermero`) USING BTREE,
  ADD KEY `fk_paciente_medico` (`medico`);

--
-- Indices de la tabla `paciente_enfermedades`
--
ALTER TABLE `paciente_enfermedades`
  ADD PRIMARY KEY (`id_paciente_enfermedades`),
  ADD KEY `fk_pacientenenfermedad_enfermedad` (`id_enfermedad`),
  ADD KEY `fk_enfermedades_paciente` (`id_paciente`);

--
-- Indices de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD PRIMARY KEY (`id_tratamiento`),
  ADD KEY `fk_tratamiento_enfermedad` (`id_enfermedad`),
  ADD KEY `fk_tratamiento_medicamento` (`id_medicamento`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `enfermedad`
--
ALTER TABLE `enfermedad`
  ADD CONSTRAINT `fk_enfermedad_enfermedad` FOREIGN KEY (`enfermedades_relacionadas`) REFERENCES `enfermedad` (`id_enfermedad`);

--
-- Filtros para la tabla `historialmedico`
--
ALTER TABLE `historialmedico`
  ADD CONSTRAINT `fk_historial_enfermedad` FOREIGN KEY (`id_enfermedad`) REFERENCES `enfermedad` (`id_enfermedad`),
  ADD CONSTRAINT `fk_historial_paciente` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id_paciente`);

--
-- Filtros para la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD CONSTRAINT `fk_paciente_enfermero` FOREIGN KEY (`enfermero`) REFERENCES `usuario` (`id_usuario`),
  ADD CONSTRAINT `fk_paciente_medico` FOREIGN KEY (`medico`) REFERENCES `usuario` (`id_usuario`);

--
-- Filtros para la tabla `paciente_enfermedades`
--
ALTER TABLE `paciente_enfermedades`
  ADD CONSTRAINT `fk_enfermedades_paciente` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id_paciente`),
  ADD CONSTRAINT `fk_pacientenenfermedad_enfermedad` FOREIGN KEY (`id_enfermedad`) REFERENCES `enfermedad` (`id_enfermedad`);

--
-- Filtros para la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD CONSTRAINT `fk_tratamiento_enfermedad` FOREIGN KEY (`id_enfermedad`) REFERENCES `enfermedad` (`id_enfermedad`),
  ADD CONSTRAINT `fk_tratamiento_medicamento` FOREIGN KEY (`id_medicamento`) REFERENCES `medicamento` (`id_medicamento`);
COMMIT;

INSERT INTO usuario
VALUES (1, "A000000", "DON VICENTE", "CERVERON", 1, '2001/01/01', "don", "vicente");

INSERT INTO usuario
VALUES (11, "A000001", "ARMANCIO", "ORTEGA", 1, '2011/01/01', "armancio", "ortega");

INSERT INTO usuario
VALUES (2, "B000000", "ANTONIO", "BOLUDA", 2, '2002/02/02', "antonio", "boluda");

INSERT INTO usuario
VALUES (22, "B000001", "MEHDI", "FRANCES", 2, '2003/03/03', "mehdi", "frances");

INSERT INTO usuario
VALUES (3, "C00000", "RICARDO", "FERRIS", 3, '2005/08/06', "ricardo", "ferris");


INSERT INTO paciente
VALUES (1, "D000000", "ERNESTO", "FASCISTA", 611111111, 1, 1, 1);

INSERT INTO paciente
VALUES (2, "E000000", "ROBERTO", "INIESTA", 622222222, 1, 2, 2);

INSERT INTO medicamento
VALUES (1, "aspirina", "sin alergias", "eres plata en el lol", 5);

INSERT INTO medicamento
VALUES (2, "dalsy", "Te matriculas en la UV", "Tienes depresion", 10);

INSERT INTO enfermedad
VALUES(1, "juegas al lol", null, true);

INSERT INTO enfermedad
VALUES(2, "hueles mal", 1, false);

INSERT INTO tratamiento
VALUES(1, 1, 1, 20, 2);

INSERT INTO tratamiento
VALUES(2, 2, 2, 40, 1);

INSERT INTO historialmedico
VALUES(1, 1, 1, 12/12/2020);

INSERT INTO historialmedico
VALUES(2, 2, 2, 10/10/2010);

INSERT INTO paciente_enfermedades
VALUES(1, 1, 1);

INSERT INTO paciente_enfermedades
VALUES(2, 2, 2);

COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

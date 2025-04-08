-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         11.7.2-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.8.0.6908
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para gastrobot
CREATE DATABASE IF NOT EXISTS `gastrobot` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_uca1400_ai_ci */;
USE `gastrobot`;

-- Volcando estructura para tabla gastrobot.listacompra
CREATE TABLE IF NOT EXISTS `listacompra` (
  `idListaCompra` int(11) NOT NULL AUTO_INCREMENT,
  `idUsuario` int(11) NOT NULL,
  PRIMARY KEY (`idListaCompra`),
  KEY `idUsuario` (`idUsuario`),
  CONSTRAINT `listacompra_ibfk_1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_uca1400_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla gastrobot.preferencia
CREATE TABLE IF NOT EXISTS `preferencia` (
  `idPreferencia` int(11) NOT NULL AUTO_INCREMENT,
  `idUsuario` int(11) NOT NULL,
  `tipoDieta` varchar(50) NOT NULL,
  `sinGluten` tinyint(1) NOT NULL DEFAULT 0,
  `sinLactosa` tinyint(1) NOT NULL DEFAULT 0,
  `sinAzucar` tinyint(1) NOT NULL DEFAULT 0,
  `alergico` tinyint(1) NOT NULL DEFAULT 0,
  `nivelPicante` enum('Bajo','Medio','Alto') NOT NULL,
  `cocinaFavorita` varchar(100) NOT NULL,
  `restriccionCalorica` varchar(100) NOT NULL,
  PRIMARY KEY (`idPreferencia`),
  KEY `idUsuario` (`idUsuario`),
  CONSTRAINT `preferencia_ibfk_1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_uca1400_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla gastrobot.productolista
CREATE TABLE IF NOT EXISTS `productolista` (
  `idProductoLista` int(11) NOT NULL AUTO_INCREMENT,
  `idListaCompra` int(11) NOT NULL,
  `nombre_producto` varchar(100) DEFAULT NULL,
  `precio_producto` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idProductoLista`),
  KEY `idListaCompra` (`idListaCompra`),
  CONSTRAINT `productolista_ibfk_1` FOREIGN KEY (`idListaCompra`) REFERENCES `listacompra` (`idListaCompra`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_uca1400_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla gastrobot.receta
CREATE TABLE IF NOT EXISTS `receta` (
  `idReceta` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_receta` varchar(255) NOT NULL,
  `descripcion` text NOT NULL,
  `dificultad` enum('Fácil','Media','Difícil') NOT NULL,
  `tiempo_preparacion` int(11) NOT NULL,
  PRIMARY KEY (`idReceta`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_uca1400_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla gastrobot.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `correo` varchar(150) NOT NULL,
  `contraseña` varchar(255) NOT NULL,
  `fecha_registro` datetime DEFAULT current_timestamp(),
  PRIMARY KEY (`idUsuario`),
  UNIQUE KEY `correo` (`correo`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_uca1400_ai_ci;

-- La exportación de datos fue deseleccionada.

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;

-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         8.0.30 - MySQL Community Server - GPL
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para contacts
CREATE DATABASE IF NOT EXISTS `contacts` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `contacts`;

-- Volcando estructura para tabla contacts.people
CREATE TABLE IF NOT EXISTS `people` (
  `id` int NOT NULL AUTO_INCREMENT,
  `document` varchar(11) COLLATE utf8mb4_spanish_ci NOT NULL DEFAULT '0',
  `fullname` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL DEFAULT '0',
  `email` varchar(100) COLLATE utf8mb4_spanish_ci NOT NULL DEFAULT '0',
  `smartphone` varchar(10) COLLATE utf8mb4_spanish_ci NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `document` (`document`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- Volcando datos para la tabla contacts.people: ~4 rows (aproximadamente)
INSERT INTO `people` (`id`, `document`, `fullname`, `email`, `smartphone`) VALUES
	(1, '1234567890', 'Pepito Pérez Troika', 'pepito@correo.com', '3211234567'),
	(2, '2345678901', 'Juanito Andrés Pérez Troika', 'juanito@correo.com', '3211234567'),
	(4, '52122660', 'Betty Yazmín Sánchez Castiblanco', 'betty@correo.com', '3173865749'),
	(7, '4365747876', 'Other register more.', 'jjdfgdslgdf', '4548848');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;

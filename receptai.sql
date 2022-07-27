-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jul 27, 2022 at 09:07 AM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `receptai_bd`
--

-- --------------------------------------------------------

--
-- Table structure for table `receptai`
--

DROP TABLE IF EXISTS `receptai`;
CREATE TABLE IF NOT EXISTS `receptai` (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `pavadinimas` varchar(50) NOT NULL,
  `kaina` decimal(7,2) UNSIGNED NOT NULL,
  `nurodymai` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `receptai`
--

INSERT INTO `receptai` (`id`, `pavadinimas`, `kaina`, `nurodymai`) VALUES
(1, 'bulviu kose', '6.87', 'kilas bulviu , pienas ,svietas , isvirti bulves sutrinti ir sudeti likusius ingredientus'),
(2, 'vistienos kepsnys', '9.35', 'kepti vistiena ir valgyti!');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

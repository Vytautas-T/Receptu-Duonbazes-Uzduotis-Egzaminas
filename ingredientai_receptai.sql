-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jul 27, 2022 at 09:01 AM
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
-- Table structure for table `ingredientai_receptai`
--

DROP TABLE IF EXISTS `ingredientai_receptai`;
CREATE TABLE IF NOT EXISTS `ingredientai_receptai` (
  `ingrediento_ID` int(10) UNSIGNED NOT NULL,
  `recepto_id` int(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`ingrediento_ID`,`recepto_id`),
  KEY `recepto_id` (`recepto_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `ingredientai_receptai`
--
ALTER TABLE `ingredientai_receptai`
  ADD CONSTRAINT `ingredientai_receptai_ibfk_1` FOREIGN KEY (`ingrediento_ID`) REFERENCES `ingredientai` (`id`),
  ADD CONSTRAINT `ingredientai_receptai_ibfk_2` FOREIGN KEY (`recepto_id`) REFERENCES `receptai` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

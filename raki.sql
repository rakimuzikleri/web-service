-- phpMyAdmin SQL Dump
-- version 4.4.3
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 09, 2015 at 08:05 PM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `raki`
--

-- --------------------------------------------------------

--
-- Table structure for table `device`
--

CREATE TABLE IF NOT EXISTS `device` (
  `id` int(10) NOT NULL,
  `deviceId` varchar(800) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `device`
--

INSERT INTO `device` (`id`, `deviceId`) VALUES
(1, '123123123123124afhasjdahsdhashdjash');

-- --------------------------------------------------------

--
-- Table structure for table `service`
--

CREATE TABLE IF NOT EXISTS `service` (
  `id` int(11) NOT NULL,
  `songName` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `singerName` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `songUrl` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `viewCount` int(11) NOT NULL,
  `isApproved` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `service`
--

INSERT INTO `service` (`id`, `songName`, `singerName`, `songUrl`, `viewCount`, `isApproved`) VALUES
(1, 'Affet', 'Müslüm Gürses', 'https://www.youtube.com/watch?v=Gz0_fWB02JY', 4, '1'),
(2, 'Nilüfer', 'Müslüm Gürses', 'https://www.youtube.com/watch?v=lLk2yFWGIjU', 2, '1'),
(3, 'Gözlerin Doğuyor Gecelerime', 'Zeki Müren', 'https://www.youtube.com/watch?v=_LK4WaaoWHc', 0, '1'),
(8, 'Tutamıyorum Zamanı', 'Müslüm Gürses', 'https://www.youtube.com/watch?v=LoaB4gwQEpk', 0, '1'),
(21, 'test', 'test', 'https://www.youtube.com/watch?v=_x0x9QVOoWE', 0, '0');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `device`
--
ALTER TABLE `device`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `service`
--
ALTER TABLE `service`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `device`
--
ALTER TABLE `device`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `service`
--
ALTER TABLE `service`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=22;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 14, 2015 at 11:06 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `visitorlogdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
`adminID` int(11) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE IF NOT EXISTS `company` (
`companyID` int(11) NOT NULL,
  `companyName` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `errorstore`
--

CREATE TABLE IF NOT EXISTS `errorstore` (
`errorstoreID` int(11) NOT NULL,
  `message` varchar(45) DEFAULT NULL,
  `dateOccured` datetime DEFAULT NULL,
  `origin` varchar(45) DEFAULT NULL,
  `statusCode` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `logbook`
--

CREATE TABLE IF NOT EXISTS `logbook` (
  `logID` int(11) NOT NULL,
  `visitorID` int(11) DEFAULT NULL,
  `reason` varchar(45) NOT NULL,
  `signIn` datetime DEFAULT NULL,
  `signOut` datetime DEFAULT NULL,
  `date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE IF NOT EXISTS `member` (
`memberID` int(11) NOT NULL,
  `memberName` varchar(45) NOT NULL,
  `memberSurname` varchar(45) NOT NULL,
  `companyID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `visitor`
--

CREATE TABLE IF NOT EXISTS `visitor` (
`visitorID` int(11) NOT NULL,
  `visitorName` varchar(45) NOT NULL,
  `visitorSurname` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `companyName` varchar(45) DEFAULT NULL,
  `ID` varchar(45) NOT NULL,
  `memberID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
 ADD PRIMARY KEY (`adminID`);

--
-- Indexes for table `company`
--
ALTER TABLE `company`
 ADD PRIMARY KEY (`companyID`);

--
-- Indexes for table `errorstore`
--
ALTER TABLE `errorstore`
 ADD PRIMARY KEY (`errorstoreID`);

--
-- Indexes for table `logbook`
--
ALTER TABLE `logbook`
 ADD PRIMARY KEY (`logID`), ADD KEY `l1_idx` (`visitorID`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
 ADD PRIMARY KEY (`memberID`), ADD KEY `m1_idx` (`companyID`);

--
-- Indexes for table `visitor`
--
ALTER TABLE `visitor`
 ADD PRIMARY KEY (`visitorID`), ADD KEY `v1_idx` (`memberID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
MODIFY `adminID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `company`
--
ALTER TABLE `company`
MODIFY `companyID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `errorstore`
--
ALTER TABLE `errorstore`
MODIFY `errorstoreID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `member`
--
ALTER TABLE `member`
MODIFY `memberID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `visitor`
--
ALTER TABLE `visitor`
MODIFY `visitorID` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `logbook`
--
ALTER TABLE `logbook`
ADD CONSTRAINT `l1` FOREIGN KEY (`visitorID`) REFERENCES `visitor` (`visitorID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `member`
--
ALTER TABLE `member`
ADD CONSTRAINT `m1` FOREIGN KEY (`companyID`) REFERENCES `company` (`companyID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `visitor`
--
ALTER TABLE `visitor`
ADD CONSTRAINT `v1` FOREIGN KEY (`memberID`) REFERENCES `member` (`memberID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

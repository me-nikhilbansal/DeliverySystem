-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 19, 2016 at 08:08 AM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `deliverydb`
--
CREATE DATABASE IF NOT EXISTS `deliverydb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `deliverydb`;

-- --------------------------------------------------------

--
-- Table structure for table `adminlogin`
--

CREATE TABLE IF NOT EXISTS `adminlogin` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminlogin`
--

INSERT INTO `adminlogin` (`username`, `password`) VALUES
('admin', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `cancelorder`
--

CREATE TABLE IF NOT EXISTS `cancelorder` (
  `ord_no` bigint(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `t_amt` int(100) NOT NULL,
  `dis` int(100) NOT NULL,
  `amt_paid` int(100) NOT NULL,
  `penalty` int(100) NOT NULL,
  `date_time` datetime NOT NULL,
  PRIMARY KEY (`ord_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cancelorder`
--

INSERT INTO `cancelorder` (`ord_no`, `username`, `t_amt`, `dis`, `amt_paid`, `penalty`, `date_time`) VALUES
(65455, 'admin', 5000, 500, 4500, 675, '2016-07-08 09:05:52'),
(65456, 'admin', 65, 16, 49, 7, '2016-07-10 14:01:48');

-- --------------------------------------------------------

--
-- Table structure for table `citytable`
--

CREATE TABLE IF NOT EXISTS `citytable` (
  `statename` varchar(100) NOT NULL,
  `cityname` varchar(100) NOT NULL,
  PRIMARY KEY (`statename`,`cityname`),
  KEY `statename` (`statename`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `citytable`
--

INSERT INTO `citytable` (`statename`, `cityname`) VALUES
('Punjab', 'Jalandhar'),
('Punjab', 'Ludhiana'),
('Rajasthan', 'Jalandhar');

-- --------------------------------------------------------

--
-- Table structure for table `deliverypersontable`
--

CREATE TABLE IF NOT EXISTS `deliverypersontable` (
  `d_id` bigint(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `dob` date NOT NULL,
  `gender` varchar(100) NOT NULL,
  `martial_status` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `m_no` bigint(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `doj` date NOT NULL,
  `id_proof` varchar(100) NOT NULL,
  `liscence_no` varchar(100) NOT NULL,
  `shift` varchar(100) NOT NULL,
  `holidays` int(100) NOT NULL,
  `experience` varchar(100) NOT NULL,
  `lang` varchar(100) NOT NULL,
  `salary_pa` bigint(100) NOT NULL,
  PRIMARY KEY (`d_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `deliverypersontable`
--

INSERT INTO `deliverypersontable` (`d_id`, `name`, `dob`, `gender`, `martial_status`, `address`, `state`, `city`, `m_no`, `email`, `doj`, `id_proof`, `liscence_no`, `shift`, `holidays`, `experience`, `lang`, `salary_pa`) VALUES
(102016001, 'Rohit Sharma', '1995-06-01', 'Male', 'Unmarried', 'Model Town', 'Punjab', 'Ludhiana', 9874563210, 'xyz@yahoo.com', '2016-06-01', 'Adhar Card\nno:-695656', 'PB-6548464', 'Day', 4, 'No', 'Hindi,English,Punjabi', 26000),
(102016002, 'wbgrwg', '2016-07-07', 'Male', 'Married', 'fewgrgrg', 'Rajasthan', 'Jalandhar', 464854, 'kgfigfiu;h', '2016-07-19', 'fwkjgkwhb.kgbh', '35453EFW', 'Day', 0, 'fewF', 'FEWFG', 25100),
(102016003, 'wbgrwg', '2016-07-07', 'Male', 'Married', 'fewgrgrg', 'Rajasthan', 'Jalandhar', 464854, 'kgfigfiu;h', '2016-07-19', 'fwkjgkwhb.kgbh', '35453EFW', 'Day', 0, 'fewF', 'FEWFG', 25100),
(102016004, 'khgftufltg', '2016-07-08', 'Male', 'Married', 'hgyuglygg', 'Punjab', 'Jalandhar', 6565, 'khgyug;gbh', '2016-07-19', 'khghglgjhuhh', 'hiuh22255', 'Day', 1, 'jnjkn', 'hjghyhb', 21515),
(102016005, 'ygtgug', '2016-07-03', 'Male', 'Married', 'ftyftfk', 'Punjab', 'Jalandhar', 0, 'bhjbl.', '2016-07-07', 'bn,vjgvv,', '546584l', 'Day', 0, 'jgbh', 'hjgfyugfv', 4515),
(102016006, 'gegeakjo', '2016-07-13', 'Male', 'Unmarried', 'vreavafvh', 'Punjab', 'Ludhiana', 5484416416, 'vegvvAEjbgj', '2016-07-11', 'vefvae6\n', 'vefva47320', 'Day', 2, 'vefv', 'vrerfvvrfbkj', 54546),
(102016007, 'kmkcjkdnckjnsdkjhmkj', '2016-07-08', 'Male', 'Married', 'lnkjdcnkjnc', 'Punjab', 'Ludhiana', 654114, 'jhudhcihdi', '2016-07-17', 'hjhciyhich', 'dacd454454', 'Day', 2, 'cjdoicj', 'ckjahdciuh', 79769);

-- --------------------------------------------------------

--
-- Table structure for table `deliverypersonupload`
--

CREATE TABLE IF NOT EXISTS `deliverypersonupload` (
  `d_id` bigint(100) NOT NULL,
  `image` varchar(100) NOT NULL,
  `id` varchar(100) NOT NULL,
  PRIMARY KEY (`d_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `deliverypersonupload`
--

INSERT INTO `deliverypersonupload` (`d_id`, `image`, `id`) VALUES
(102016006, 'dp_images\\1468434654250_2posteronganga.jpeg', 'dp_id\\1468434655733_2posteronganga.jpeg'),
(102016007, 'dp_images\\1468432389416_2posteronganga.jpeg', 'dp_id\\1468432392959_2posteronganga.jpeg');

-- --------------------------------------------------------

--
-- Table structure for table `deliverytable`
--

CREATE TABLE IF NOT EXISTS `deliverytable` (
  `ord_no` bigint(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `mob_no` bigint(100) NOT NULL,
  `cust_class` varchar(100) NOT NULL,
  `f_location` varchar(100) NOT NULL,
  `t_location` varchar(100) NOT NULL,
  `doo` date NOT NULL,
  `dod` date NOT NULL,
  `d_type` varchar(100) NOT NULL,
  `no_items` int(100) NOT NULL,
  `fast_d` varchar(100) NOT NULL,
  `d_name` varchar(100) NOT NULL,
  `d_id` int(100) NOT NULL,
  `v_no` varchar(100) NOT NULL,
  `mode_pay` varchar(100) NOT NULL,
  `t_pay` int(100) NOT NULL,
  `dis` int(100) NOT NULL,
  `amt_paid` int(100) NOT NULL,
  PRIMARY KEY (`ord_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `deliverytable`
--

INSERT INTO `deliverytable` (`ord_no`, `name`, `mob_no`, `cust_class`, `f_location`, `t_location`, `doo`, `dod`, `d_type`, `no_items`, `fast_d`, `d_name`, `d_id`, `v_no`, `mode_pay`, `t_pay`, `dis`, `amt_paid`) VALUES
(65454, 'gggf', 1, 'Gold', 'dggd', 'gdgd', '2016-06-01', '2016-06-03', 'Clothes', 3, 'Yes', 'dfdg', 212, '545', 'Master Card', 1210, 10, 1200),
(65455, 'hui', 5826525, 'Silver', 'ygfihjj', 'hhchc', '2016-07-03', '2016-07-07', 'Clothes', 5, 'No', 'wbgrwg', 102016002, 'PB08DC9898', 'Cash on Delivery', 500, 50, 450);

-- --------------------------------------------------------

--
-- Table structure for table `employeelogin`
--

CREATE TABLE IF NOT EXISTS `employeelogin` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `employeetable`
--

CREATE TABLE IF NOT EXISTS `employeetable` (
  `e_id` bigint(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `dob` date NOT NULL,
  `gender` varchar(100) NOT NULL,
  `martial_status` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `m_no` bigint(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `doj` date NOT NULL,
  `id_proof` varchar(100) NOT NULL,
  `holidays` int(100) NOT NULL,
  `salary_pa` bigint(100) NOT NULL,
  PRIMARY KEY (`e_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employeetable`
--

INSERT INTO `employeetable` (`e_id`, `name`, `dob`, `gender`, `martial_status`, `address`, `state`, `city`, `m_no`, `email`, `doj`, `id_proof`, `holidays`, `salary_pa`) VALUES
(2016001, 'Sahej Bansal', '1994-06-13', 'Male', 'Unmarried', 'Jalandhar', 'Punjab', 'Ludhiana', 9878280515, 'sahejbansal@rocketmail.com', '2016-06-01', 'Adhar Card\n13265544DF', 4, 30000),
(2016002, 'Rohit', '1995-09-11', 'Male', 'Unmarried', 'Phase 2', 'Punjab', 'Jalandhar', 65554454, 'hgk@yahoo.com', '2016-06-12', 'Voter Card', 0, 35000),
(2016003, 'ethgths', '2016-06-16', 'Male', 'Unmarried', 'thtrhyrjytj', 'Punjab', 'Ludhiana', 64664, 'vvgefgesb', '2016-06-02', 'wgrehtehbvefbf', 0, 43464),
(2016004, 'Sparsh Bansal', '1996-07-15', 'Male', 'Unmarried', 'bghngfzds', 'Punjab', 'Jalandhar', 84484541541, 'kfjifjikjkjm', '2016-07-03', 'dfeafDAF', 3, 250000);

-- --------------------------------------------------------

--
-- Table structure for table `employeeupload`
--

CREATE TABLE IF NOT EXISTS `employeeupload` (
  `e_id` bigint(100) NOT NULL,
  `image` varchar(100) NOT NULL,
  `id` varchar(100) NOT NULL,
  PRIMARY KEY (`e_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employeeupload`
--

INSERT INTO `employeeupload` (`e_id`, `image`, `id`) VALUES
(2016004, 'e_images\\1468434968437_2posteronganga.jpeg', 'e_id\\1468434969995_game-of-thrones-new-season-wide-620x388.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `statetable`
--

CREATE TABLE IF NOT EXISTS `statetable` (
  `statename` varchar(100) NOT NULL,
  PRIMARY KEY (`statename`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `statetable`
--

INSERT INTO `statetable` (`statename`) VALUES
('Punjab'),
('Rajasthan');

-- --------------------------------------------------------

--
-- Table structure for table `vehicletable`
--

CREATE TABLE IF NOT EXISTS `vehicletable` (
  `v_no` varchar(100) NOT NULL,
  `company` varchar(100) NOT NULL,
  `name_model` varchar(100) NOT NULL,
  `type` varchar(100) NOT NULL,
  `wheeler` varchar(100) NOT NULL,
  `doi` date NOT NULL,
  `chasis_no` varchar(100) NOT NULL,
  `engine_no` varchar(100) NOT NULL,
  `colour` varchar(100) NOT NULL,
  PRIMARY KEY (`v_no`,`chasis_no`,`engine_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vehicletable`
--

INSERT INTO `vehicletable` (`v_no`, `company`, `name_model`, `type`, `wheeler`, `doi`, `chasis_no`, `engine_no`, `colour`) VALUES
('PB08DC9898', 'Tata Company', 'Chota Hathi\nTop model\nZDI+', 'Low Weight', 'Four', '2016-01-01', '598132706', '7981320678879', 'Chota Hathi Top model ZDI+');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `citytable`
--
ALTER TABLE `citytable`
  ADD CONSTRAINT `myconstraint` FOREIGN KEY (`statename`) REFERENCES `statetable` (`statename`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `deliverypersonupload`
--
ALTER TABLE `deliverypersonupload`
  ADD CONSTRAINT `myc` FOREIGN KEY (`d_id`) REFERENCES `deliverypersontable` (`d_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `employeeupload`
--
ALTER TABLE `employeeupload`
  ADD CONSTRAINT `myconstraint11` FOREIGN KEY (`e_id`) REFERENCES `employeetable` (`e_id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

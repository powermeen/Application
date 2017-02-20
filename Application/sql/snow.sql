-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 20, 2017 at 05:14 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `snow`
--

-- --------------------------------------------------------

--
-- Table structure for table `environment_table`
--

CREATE TABLE `environment_table` (
  `i_id` int(50) NOT NULL,
  `s_code` varchar(100) NOT NULL,
  `s_name` varchar(100) NOT NULL,
  `s_url` varchar(200) NOT NULL,
  `i_status` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `environment_table`
--

INSERT INTO `environment_table` (`i_id`, `s_code`, `s_name`, `s_url`, `i_status`) VALUES
(1, 'loacl', 'Local Environment', 'http://localhost:8080/phoenix/', 0),
(2, 'Beta Shipco', 'Beta Shipco Environment', 'http://phoenix.scan-it.com.sg/phoenix/Application.html', 0),
(3, 'Staging Shipco', 'Staging Shipco Environment', 'http://staging.phoenix.shipco.com/phoenix/Application.html', 1);

-- --------------------------------------------------------

--
-- Table structure for table `group_table`
--

CREATE TABLE `group_table` (
  `i_group_id` int(50) NOT NULL,
  `s_name` varchar(100) NOT NULL,
  `s_module` varchar(100) NOT NULL,
  `i_status` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `group_table`
--

INSERT INTO `group_table` (`i_group_id`, `s_name`, `s_module`, `i_status`) VALUES
(1, 'Login_Meen', 'Login', 1);

-- --------------------------------------------------------

--
-- Table structure for table `office_table`
--

CREATE TABLE `office_table` (
  `i_id` int(50) NOT NULL,
  `s_code` varchar(100) NOT NULL,
  `s_name` varchar(100) NOT NULL,
  `i_status` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `office_table`
--

INSERT INTO `office_table` (`i_id`, `s_code`, `s_name`, `i_status`) VALUES
(1, 'KOP', 'Shipco Transport Koper', 0),
(2, 'SJKT', 'Shipco Transport Indonesia', 0),
(3, 'CMB', 'Shipco Transport Lanka Pvt Ltd', 0),
(4, 'KHI', 'Shipco Transport Pakistan', 0),
(5, 'PCHS', 'Shipco Transport USA', 0),
(6, 'AUH', 'SSC Consolidation Abu Dhabi', 0),
(7, 'CKG', 'Shipco Transport Shanghai', 0),
(8, 'BOS', 'Shipco Transport USA', 0),
(9, 'RLGB', 'Shipco Transport USA', 0),
(10, 'BRC', 'Bangkok Resource Center', 0),
(11, 'XMN', 'Shipco Transport Xiamen', 0),
(12, 'LYP', 'Shipco Transport Pakistan', 0),
(13, 'HAN', 'Shipco Transport Vietnam', 0),
(14, 'AKL', 'Shipco Transport NZ', 0),
(15, 'TPE', 'Shipco Transport Taiwan Co.,Ltd.', 0),
(16, 'CORP', 'Shipco Transport USA', 0),
(17, 'LGB', 'Shipco Transport USA', 0),
(18, 'CHS', 'Shipco Transport USA', 0),
(19, 'NYC', 'Shipco Transport USA', 1),
(20, 'ATL', 'Shipco Transport USA', 0),
(21, 'SFO', 'Shipco Transport USA', 0),
(22, 'ANYC', 'Shipco Transport USA', 0),
(23, 'CHI', 'Shipco Transport USA', 0),
(24, 'SEA', 'Shipco Transport USA', 0),
(25, 'JFK', 'Shipco Transport USA', 0),
(26, 'HOU', 'Shipco Transport USA', 0),
(27, 'MIA', 'Shipco Transport USA', 0),
(28, 'ILGB', 'Shipco Transport USA', 0),
(29, 'INYC', 'Shipco Transport USA', 0),
(30, 'ALGB', 'Shipco Transport USA', 0),
(31, 'RMIA', 'Shipco Transport USA', 0),
(32, 'RNYC', 'Shipco Transport USA', 0),
(33, 'ACHI', 'Shipco Transport USA', 0),
(34, 'ANT', 'SSC Consolidation', 0),
(35, 'BKK', 'Shipco Transport Bangkok', 0),
(36, 'COL', 'Shipco Transport Pte Ltd', 0),
(37, 'CPH', 'Shipco Transport Copenhagen', 0),
(38, 'GDY', 'Shipco Transport Poland', 0),
(39, 'GOT', 'Shipco Transport Scandinavia', 0),
(40, 'HEL', 'Shipco Transport Scandinavia', 0),
(41, 'HKG', 'Shipco Transport Hong Kong', 0),
(42, 'JKT', 'Shipco Transport Indonesia', 0),
(43, 'LDN', 'Shipco Transport Great Britain', 0),
(44, 'MNL', 'Shipco Transport Philippines', 0),
(45, 'ODA', 'Shipco Transport Ukraine', 0),
(46, 'OSL', 'Shipco Transport Scandinavia', 0),
(47, 'PEN', 'Shipco Transport Malaysia', 0),
(48, 'PKL', 'Shipco Transport Malaysia', 0),
(49, 'RIX', 'Shipco Transport Balticum', 0),
(50, 'ROT', 'SSC Consolidation', 0),
(51, 'SCL', 'Shipco Transport Santiago', 0),
(52, 'SHA', 'Shipco Transport Shanghai', 0),
(53, 'SIN', 'Shipco Transport Singapore', 0),
(54, 'SUB', 'Shipco Transport Indonesia', 0),
(55, 'TLL', 'Shipco Transport Balticum', 0),
(56, 'TYO', 'Shipco Transport Tokyo', 0),
(57, 'VNO', 'Shipco Transport Balticum', 0),
(58, 'TOR', 'Shipco Transport Canada', 0),
(59, 'MON', 'Shipco Transport Canada', 0),
(60, 'HCM', 'Shipco Transport Vietnam', 0),
(61, 'SZX', 'Shipco Transport Shenzen', 0),
(62, 'DLC', 'Shipco Transport Dalian', 0),
(63, 'GZP', 'Shipco Transport Guangzhou', 0),
(64, 'STP', 'Shipco Transport Russia', 0),
(65, 'HPH', 'Shipco Transport Vietnam', 0),
(66, 'ABKK', 'Shipco Transport Bangkok', 0),
(67, 'AHOU', 'Shipco Transport USA', 0),
(68, 'DUB', 'Shipco Transport Dublin', 0),
(69, 'LHE', 'Shipco Transport Pakistan', 0),
(70, 'DXB', 'SSC Consolidation United Arab Emirates', 0),
(71, 'MOW', 'Shipco Transport Russia', 0),
(72, 'ADXB', 'SSC Consolidation United Arab Emirates', 0),
(73, 'SKT', 'Shipco Transport Pakistan', 0),
(74, 'IEV', 'Shipco Transport Ukraine', 0),
(75, 'IST', 'Shipco Transport Istanbul', 0),
(76, 'NGB', 'Shipco Transport Shanghai', 0),
(77, 'TAO', 'Shipco Transport Shanghai', 0),
(78, 'LAX', 'Shipco Transport USA', 0),
(79, 'IND', 'Shipco Transport USA', 0),
(80, 'MNC', 'Shipco Transport Great Britain', 0),
(81, 'LCH', 'Shipco Transport Bangkok', 0),
(82, 'DAD', 'Shipco Transport Vietnam', 0),
(83, 'PUS', 'Shipco Transport Korea', 0),
(84, 'SEL', 'Shipco Transport Korea', 0),
(85, 'BUH', 'Shipco Transport S.R.L.', 0),
(86, 'PNQ', 'Shipco-IT Private Limited', 0),
(87, 'IPH', 'Shipco Transport Malaysia', 0),
(88, 'PGU', 'Shipco Transport Malaysia', 0),
(89, 'CEB', 'Shipco Transport Philippines', 0),
(90, 'IZM', 'Shipco Transport Istanbul', 0),
(91, 'QIN', 'Shipco Transport Qingdao', 0),
(92, 'NBO', 'Shipco Transport Ningbo', 0),
(93, 'SOF', 'Shipco Transport Bulgaria EOOD', 0),
(94, 'SHJ', 'SSC Consolidation Abu Dhabi', 0),
(95, 'TNYC', 'Shipco Transport USA', 0),
(96, 'BOM', 'Shipco-IT Private Limited', 0);

-- --------------------------------------------------------

--
-- Table structure for table `setup_table`
--

CREATE TABLE `setup_table` (
  `i_setup_id` int(50) NOT NULL,
  `s_module` varchar(100) NOT NULL,
  `s_widget_id` varchar(100) NOT NULL,
  `s_widget_name` varchar(200) NOT NULL,
  `s_data` varchar(200) NOT NULL,
  `s_action_type` varchar(100) NOT NULL,
  `s_sequence` varchar(100) NOT NULL,
  `s_reference` varchar(100) NOT NULL,
  `i_status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `setup_table`
--

INSERT INTO `setup_table` (`i_setup_id`, `s_module`, `s_widget_id`, `s_widget_name`, `s_data`, `s_action_type`, `s_sequence`, `s_reference`, `i_status`) VALUES
(1, 'login', 'Login_username', 'username', 'papisit', 'TextBox', '1', 'Login_Meen', 1),
(2, 'login', 'Login_password', 'password', 'Isnsit_12', 'TextBox', '2', 'Login_Meen', 1),
(3, 'login', 'Login_submit', 'submit', '', 'Button', '3', 'Login_Meen', 1);

-- --------------------------------------------------------

--
-- Table structure for table `widgets_collection`
--

CREATE TABLE `widgets_collection` (
  `i_id` int(50) NOT NULL,
  `s_module` varchar(100) NOT NULL,
  `s_widget_id` varchar(100) NOT NULL,
  `s_widget_description` varchar(200) NOT NULL,
  `i_status` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `widgets_collection`
--

INSERT INTO `widgets_collection` (`i_id`, `s_module`, `s_widget_id`, `s_widget_description`, `i_status`) VALUES
(1, 'Login', 'Login_username', 'username', 1),
(2, 'Login', 'Login_password', 'password', 1),
(3, 'Login', 'Login_submit', 'submit login', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `environment_table`
--
ALTER TABLE `environment_table`
  ADD PRIMARY KEY (`i_id`);

--
-- Indexes for table `group_table`
--
ALTER TABLE `group_table`
  ADD PRIMARY KEY (`i_group_id`);

--
-- Indexes for table `office_table`
--
ALTER TABLE `office_table`
  ADD PRIMARY KEY (`i_id`);

--
-- Indexes for table `setup_table`
--
ALTER TABLE `setup_table`
  ADD PRIMARY KEY (`i_setup_id`);

--
-- Indexes for table `widgets_collection`
--
ALTER TABLE `widgets_collection`
  ADD PRIMARY KEY (`i_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `environment_table`
--
ALTER TABLE `environment_table`
  MODIFY `i_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `group_table`
--
ALTER TABLE `group_table`
  MODIFY `i_group_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `office_table`
--
ALTER TABLE `office_table`
  MODIFY `i_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=97;
--
-- AUTO_INCREMENT for table `setup_table`
--
ALTER TABLE `setup_table`
  MODIFY `i_setup_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `widgets_collection`
--
ALTER TABLE `widgets_collection`
  MODIFY `i_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

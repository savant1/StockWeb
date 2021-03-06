CREATE DATABASE IF NOT EXISTS `stock` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `stock`;

--
-- Structure de la table `produit`
--

CREATE TABLE IF NOT EXISTS `produit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code_produit` varchar(20) NOT NULL,
  `reference` varchar(50) NOT NULL,
  `designation` varchar(52) NOT NULL,
  `rangement` varchar(50) DEFAULT NULL,
  `fournisseur` varchar(56) DEFAULT NULL,
  `remise` int(11) NOT NULL,
  `prix` int(11) NOT NULL,
  `stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;



--
-- Structure de la table `utilisateur`
--

CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;



--
-- Structure de la table `commande`
--

CREATE TABLE IF NOT EXISTS `commande` (
  `idCommande` int(11) NOT NULL AUTO_INCREMENT,
  `num_facture` int(11) NOT NULL,
  `code_produit` int(11) NOT NULL,
  `reference` varchar(55) NOT NULL,
  `prix_vente` int(11) NOT NULL,
  `quantite` int(11) NOT NULL,
  `subtotal` int(11) NOT NULL,
  PRIMARY KEY (`idCommande`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;



--
-- Structure de la table `fournisseur`
--

CREATE TABLE IF NOT EXISTS `fournisseur` (
  `idFournisseur` int(11) NOT NULL AUTO_INCREMENT,
  `nomSociete` varchar(55) NOT NULL,
  `nomFournisseur` varchar(55) NOT NULL,
PRIMARY KEY (`idFournisseur`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;


--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `idclient` int(11) NOT NULL AUTO_INCREMENT,
  `adresse` varchar(55) NOT NULL,
  `contact` varchar(55) NOT NULL,
PRIMARY KEY (`idclient`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;



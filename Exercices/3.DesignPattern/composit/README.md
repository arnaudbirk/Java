# Exercice Composite

En utilisant le pattern composite réalisez un programme qui va permettre de manipuler un ensemble de fichier et dossier comme un seul objet.

Votre programme sera constitué des classes suivantes :

* Une classe abstraite ```FichierAbstrait``` contenant :
	*  un nom
	*  un getter() sur ce nom
	*  une méthode abstraite Afficher() (affichant le nom)

* Une classe ```Fichier``` qui va étendre la classe abstraite ```FichierAbstrait```
* Une classe ```Dossier``` qui va représenter un ensemble d'objet implémentant la classe ```FichierAbstrait```

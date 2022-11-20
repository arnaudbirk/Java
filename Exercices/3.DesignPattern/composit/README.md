# Exercice Composite

En utilisant le pattern composite réalisez un programme qui va permettre de manipuler un ensemble de fichier et dossier comme un seul objet.

Votre programme sera constitué des classes suivantes :

* Une classe **FichierAbstrait** qui servira d'interface contenant :
	* 	un nom
	*  un getter() sur ce nom
	*  une méthode abstraite Afficher() (affichant le nom)

* Une classe **Fichier** qui va implémenter l'interface FichierAbstrait
* Une classe Dossier qui va représenter un ensemble d'objet implémentant la classe **FichierAbstrait**
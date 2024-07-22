# ClubDeFoot

## Description
Ce projet est une application Java simple qui permet de gérer des clubs de football, incluant la gestion des matchs remportés, nuls et perdus, ainsi que les buts marqués. L'application inclut des fonctionnalités de tri et de classement des clubs selon leurs performances et de test unitaire pour valider les comportements.

## Fonctionnalités
- Ajouter et gérer les clubs de football
- Modifier le nombre de matchs remportés, nuls et perdus
- Modifier le nombre de buts marqués
- Afficher les clubs de football triés par nom
- Afficher les clubs de football triés par classement basé sur le score (nombre de matchs remportés * 3 + nombre de matchs nuls)
- Gestion des exceptions
- Tests unitaires avec JUnit

## Prérequis
- Java 11 ou supérieur
- Maven 3.6 ou supérieur

## Installation
- Clonez le dépôt : git clone https://github.com/MichaelDSCR/ClubDEFootTP.git
- Accédez au répertoire du projet : cd votre-projet
- Executez l'application : mvn exec:java -Dexec.mainClass="com.formation.poe.java.dictionnaire.Main"
- Suivez les instructions dans le menu pour utiliser les différentes fonctionnalités.

## Journalisation
- Les logs sont configurés avec Logback et SLF4J. La configuration de base affiche les logs dans la console.
- Vous pouvez modifier logback.xml pour changer la configuration des logs.

## Tests
Pour exécuter les tests unitaires, utilisez la commande suivante : mvn test

## Contribuer
Les contributions sont les bienvenues ! Veuillez suivre les étapes suivantes :
1. Fork le dépôt
2. Créez une branche pour votre fonctionnalité (git checkout -b fonctionnalite/ma-nouvelle-fonctionnalite)
3. Commitez vos modifications (git commit -m 'Ajout de ma nouvelle fonctionnalité')
4. Poussez vers la branche (git push origin fonctionnalite/ma-nouvelle-fonctionnalite)
5. Ouvrez une Pull Request

## Auteur
Descorcier Michaël

## Remerciements
Merci à tous ceux qui s'intéressent à mon code et à ce projet. 
Vos retours, suggestions et contributions sont précieux et fortement appréciés. 
Si vous avez des questions ou souhaitez échanger sur ce projet, n'hésitez pas à me contacter. 
Ensemble, nous pouvons rendre ce projet encore meilleur !

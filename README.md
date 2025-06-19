# AI-BASED-RECOMMENDATION-SYSTEM

*COMPANY* : CODE TECH IT SOLUTIONS

*NAME* : SUSARLA PADMAKSHI

*INTERN ID* : CT04DN839

*DOMAIN* : JAVA PROGRAMMING

*DURATION* : 4 WEEKS

*MENTROR* : NEELA SANTOSH

*DESCRIPTION* : 

This project is a User-Based Collaborative Filtering Recommender System built in Java using Apache Mahout, a machine learning library. It recommends items to users based on preferences and ratings provided by other users with similar tastes. In addition to the recommendation system, the project also includes a simple item explorer, where users can search for items by category or keyword and view filtered results.
The system is designed to simulate how real-world platforms like Amazon or Netflix suggest products or media by analyzing user behavior patterns and similarities.

Project Structure :

RecommenderSystem/
├── data.csv              # User-Item rating data
├── item_data.csv         # Item details (name, category)
├── pom.xml               # Maven configuration file
└── src/
    └── main/java/com/paddu/
        ├── App.java      # Main program
        └── ItemExplorer.java # Keyword/category search logic

How It Works :
Collaborative Filtering
The App.java file loads the data.csv, which contains user-item ratings. It uses Pearson Correlation Similarity to identify similar users and suggests items rated highly by similar users that the target user hasn’t yet rated.

Search by Category :
The ItemExplorer.java file reads from item_data.csv, listing all available categories. The user is prompted to enter a category or keyword (like “sports”), and the system displays all items that match that keyword.

File Details :
data.csv
Format: userID,itemID,rating
Example:

1,101,4.0
2,104,4.5
item_data.csv
Format: itemID,itemName,category
Example:

101,Yoga Mat,Fitness
104,Football,Sports

Prerequisites :
Java JDK (version 8 or higher)
Apache Maven
Internet connection (to download Maven dependencies)
Command-line access (CMD or terminal)

How to Compile and Run :
Place the files correctly:
Ensure data.csv and item_data.csv are in the root folder alongside pom.xml.
Open terminal or PowerShell in the project directory:

cd path/to/RecommenderSystem
Compile the code:

mvn compile
This will compile all .java files inside src/main/java.

Run the program:

mvn exec:java
You will see:
Recommended items for user 1, 2, and 3
Available categories for search
Prompt to enter a keyword
Filtered item list based on your input

Sample Output
yaml

Recommendations for user 1:
  Item ID: 104, Score: 4.5
Available categories:
 - electronics
 - fitness
 - sports
Enter a category or keyword to search: fitness
Items matching 'fitness':
  Item ID: 101, Name: Yoga Mat, Category: Fitness

Conclusion :
This system demonstrates both personalized recommendation and content-based filtering via keyword search, combining two core approaches in recommendation engines. It’s simple, flexible, and ideal for learning or prototyping larger systems.
Let me know if you also want a shorter version for your project abstract or if you'd like this exported as a README.md file!

#OUTPUT :

![Image](https://github.com/user-attachments/assets/34549bc6-7de4-4096-b41b-6d877793979f)

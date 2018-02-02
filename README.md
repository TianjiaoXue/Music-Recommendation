# Music-Recommendation

¬	Problem description
It is common to see the “Guess what you like” function in many App, including music, movie and shopping website. After a user provide his/her basic personal information, like age, gender, or occupation, and have a few record like listen to several song, or view several product. The App will recommend some new item to the user. It is called Recommendation System (RS). 
There are three mechanisms to recommend a product: 1) based on demographics 2) based on similarity between two products 3) collaborate filtering 
For final project, I am going to build a RS using collaborate filtering which is based on PSO algorithm.

¬	Introduction to Collaborate Filtering (CF)
The purpose of CF is to build a user-user matrix or item-item matrix to measure the similarity of two users or items. So that when a new user start to use the App, the system will find the user similar to them and the similar product they have views. A memory-based CF is to uses user history record data to compute the similarity between users or items. 

¬	Problem Solving
Suppose there are 1000 user in the system who has listen to the same j songs and ratings, we picked 10 and 50 users as two different set.
1)	Collect the user’s profile
Get their age 
young  0-25
Middle-age   25-50
Old  >50


Get their gender
male - 0
Female - 1


Create their profile on song j
Song-number
age
gender
rating
Feature-weight-array
0-30
0-80
0/1
1-10
Fixed for each one

2)	Get familiar set
The final rating for a song from a certain user can be represented as:
R=w1*A + w2*B + w3 *C + w4*D
A, B, C, D is different feature
w1, w2, w3, w4 is the weights for each feature. (0.1 - 1)

Each user has fixed feature-weight-array
Get one user A from 10-set, user B from 50-set, compare rating difference between A and B. After listen to get the top 30 users B that rating similar to A
Fitness function
   d(X,Y) = 
f = sim(X,Y) = 
array for smallest f become the pbest and gbest for each user and whole user set

3)	Recommend 
Recommendation is not only depend on rating for same feature-weight-array but also depend on age, gender. Use Euclidean equation to evaluate the similarity between test user and 

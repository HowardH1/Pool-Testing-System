# Pool-Testing-System
Group Project for Mobile Device Programming


**INTRODUCTION**
Takes input from the user about their pool chemical levels and provides guidance to improve said levels with through various methods in order to maintain a healthy swimming environment.

**STORYBOARD**

![pool tester](https://user-images.githubusercontent.com/56894894/120109395-45013080-c137-11eb-8dbf-42044cb5614d.PNG)

**FUNCTIONAL REQUIREMENTS**
SCENARIO
As a user who upkeeps a pool I wish to monitor and understand the various chemical aspects of my pool.

ASSUMPTIONS
Numbers are input in a float point format

EXAMPLES
Given the app is making proper calculations

When I input a pH level of 6.5 & a pool size of 16000 gallons

Then I should recieve proper guidance and chemical recommendations to return it to a safe pH range: "Your pH level is too low, add 4.5oz of dry acid to your pool. Do not swim for 8 hours after application."

ASSUMPTIONS
Numbers are input in a float point format

EXAMPLES
Given the app is making proper calculations

When I input a CYA value of -500

Then I should recieve a message asking for a vaild input range: "That is not a valid input, please input a positive number in the range (range for chemical)."

**CLASS DIAGRAM**

![Chemicals](https://user-images.githubusercontent.com/70410161/120087131-73d5c300-c0b3-11eb-98e1-3f99463dea2b.jpeg)

**CLASS DIAGRAM DESCRIPTION**

MainActivity: The first screen the user sees, which will have areas to input different specifications about their pool.

PoolDetailActivity: Displays information about the current state of the user's pool, and what they can do to improve it.

Chemical: Noun class that represents various pool chemicals.

**ROLES**

DevOps/Product Owner/Scrum Master: Howie Hall
Frontend Developer: Katie Dipaola
Integration Developer: Blake Warner

**WEEKLY MEETING**

Facetime @ 7:00PM every Sunday

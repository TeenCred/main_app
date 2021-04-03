# TeenCred

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
Our app helps college students build better financial habits and pay for school expenses.

### App Evaluation
[Evaluation of your app across the following attributes]
- **Category: Personal Finance**
- **Mobile: The app is primarily used for mobile, but there may be videos tied to the app. So, YouTube is pretty much our desktop part of the idea.**
- **Story: Aimed to help users, primarily students, to build better financial habits and access more powerful finance tools such as scholarships and credit.**
- **Market: College Students and Financially Illiterate**
- **Habit: The app makes it simpler and less cary to manage personal finance.**
- **Scope: Again, college students are the primary target.**

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* [ ] Register an account
* [ ] Login to account
* [ ] Enter in new income
* [ ] Budget from income
* [ ] Set goals to save money towards

**Optional Nice-to-have Stories**

* [ ] Find the right credit card for user's expenses
* [ ] Find textbook discounts
* [ ] Automate investing???
* [ ] Learn more about how FAFSA and college financial aid works
* [ ] Connect bank account info to automate income input through Plaid API
* [ ] Enter in major
* [ ] Find scholarships related to major
* [ ] Aid in drafting good scholarship essays and resumes for jobs and internships with questionnaires?
* [ ] Connect to YouTube feed with videos on finance basics

### 2. Screen Archetypes

* Login Screen
   * User can Login
* Registration Screen
   * User can create a new account.
   * User can direct to log-in screen

* Base "Stream"/Homepage?
    * Total Money in Account(s)
    * Enter in any new income as an input
    * Goals where money is saved towards
    * Enters in by percentages how much money goes into each "Goal"

* Profile
    * Current education level
    * Current average income?

* Settings
    * Stores Profile page
    * Edits Bank Account info
 

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* [Settings]
* [Income/Stream]
    * First thing that comes up in stream
    * Enter Income & other information


**Flow Navigation** (Screen to Screen)

* [Registration to Login]
   * Sign-Up page asks for account info
   * clicking on "Already have an account" leads to the Log-in page
* [Login to Homepage/"Stream"?]
   * Once user completes log-in, the stream, where they enter their income, shows up
* [Settings to Profile]
    * 

## Wireframes
![20210401_232923](https://user-images.githubusercontent.com/77257966/113388478-28b56300-9343-11eb-95c2-c3df51dc3621.jpg)
https://gph.is/g/4LmJAe3

### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype

## Schema 
[This section will be completed in Unit 9]
### Models
| Property   | Type | Description |
| -------- | -------- | -------- |
| Text     | Text     | Text     |
### Networking
May use Plaid banking API to connect with bank accounts.
(API Documentation: https://plaid.com/products/auth/overview/?utm_source=bing&utm_medium=search&utm_campaign=Search_B_Brand_Exact&utm_content=plaidapi&utm_term=plaid%20api&utm_creative=)

- [Add list of network requests by screen]
- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yelp]

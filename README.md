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
- **Category: Personal Finance 
 - **Mobile: The app is primarily used for mobile, but there may be videos tied to the app. So, YouTube is pretty much our desktop part of the idea.**
 - **Story: Aimed to help users, primarily students, to build better financial habits and access more powerful finance tools such as scholarships and credit.**
 - **Market: College Students and Financially Illiterate **
 - **Habit: The app makes it simpler and less cary to manage personal finance.**
 - **Scope: Again, college students are the primary target.**
## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* [ ] Register an account
* [ ] Login to account
* [ ] Enter in new income
* [ ] Budget from income
* [ ] Set goals/exepnses to save money towards

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
https://gph.is/g/4LmJAe3

### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype

## Schema 
[This section will be completed in Unit 9]
### Models


| Property | Data Type | Description |
| -------- | -------- | -------- |
| acctName | String | Unique ID for each user.|
| password   | String     | Password for the user.    |
| bankAcctRoutingNumber | Integer | Unique ID for user's bank account. |
| income | Float | Income amount that user inputs. |
| deposit | Float | One-time transaction in dollars. |
| budget | Float | If deposit is positive, this is the percentage of the deposit saved towards a goal. |
| totalMoneyInBank | Float | Number of dollars available in bank account |
| transactionTime | DateTime | Number of times transaction has been made. |
| goalName | String | Name of the expense user wants to save moeny towards |
| goalAmt | Float | Number of dollars needeed to save for goal |





### Networking
May use Plaid banking API to connect with bank accounts.
(API Documentation: https://plaid.com/products/auth/overview/?utm_source=bing&utm_medium=search&utm_campaign=Search_B_Brand_Exact&utm_content=plaidapi&utm_term=plaid%20api&utm_creative=)

* Registration Screen
   * (Create/POST) Creates a new acctName
   * (Create/POST) Creates a password

* Login Screen
   * (Read/GET) Query logs in acctName
   * (Read/GET) Query finds password

* Stream Screen
    * (Read/GET) Query finds 5 most recent payments from Plaid API
    * (Read/GET) Query logs totalMoneyInBank from bankAcctRoutingNumber retrived from Plaid API
    * (Create/POST) Create a new goal to save money towards with goalName and goalAmt objects
    * (Create/POST) Creates a percentage of a deposit (a 'budget') to allocate towards a goal

* Profile Screen
    * (Create/POST) Creates a bank account from data retrieved by the Plaid API

GIF For Login Screen
![teencred_prototype](https://user-images.githubusercontent.com/77257966/116647425-589a5b00-a92f-11eb-994e-d228998eb90f.gif)


- [Create basic snippets for each Parse network request]
- 
[OPTIONAL: Existing API Endpoints]

| HTTP Verb | Endpoint | Description |
| -------- | -------- | -------- |
| GET | /transactions/get | Fetch transaction data |
| GET | /accounts/balance/get | Fetch real-time account balances |
| GET | /accounts/get/depository | Finds information on whether an account is a checking or savings account |

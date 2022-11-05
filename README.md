<h1> Mobile App Resume</h1>
The Android app called Mobile Resume was developed in response to the HNG9i Mobile Track Stage 2 Tassk, and its poised to displays a developer's resume.
The application presents a developer's resume in an interactive style so that consumers can readily see key details about the developer and open their social media accounts and contact information. The app's basic design attempts to highlight the most crucial details in the developer's credentials.

## App Architectural Features
In this project, I applied some application architectural principles in order to create a roadmap and best practicies to in follow so as to create a well structured and interactive application.

*  I developed data models to store the information that would be shown on the user interface(UI).
*  I also created a domain package, which houses the app's data models.
*  I went further to create a data package, which contains the data that would be displayed on  the UI and is the only source from which the data would come.
* I also constructed the UI package, which houses all UI components and screens.
<p>The project was designed in a way to make it easier to introduce new features in the event that they are added.</p>

## App Design
I came across this design on behance and it caught my attention because of how interactive it was.
* [Design](https://www.behance.net/gallery/155831917/Interactive-Resume?tracking_source=search_projects%7Cresume+mobile+app)

 I was intruiged by UI and got inspired to replicate it by adding more features and functionalities to the app. I created Six(6) screens in order to implement my UI, the screens are as follows;
*  Main Screen
*  Experience
*  Skills
*  Education
*  Project
*  Contact

I created Buttons for this screens in order to easy navigation and i also went ahead it creating an HorizontalScrollView for the Buttons. I added more functionality for the app optimal view to switch from portrait to lanscape when the user's device is rotated.
<p>I added a language(French, Hindu, Spanish) functionality were the language of the app will change once the user sets his/her device to a preferred language.</p>
The sections would be navigated to using the bottom navigation component.

##  App Libraries

The project leverages the following components and libraries :
*  Flow Layout - used to layout ui items on the screen.
*  ViewModel - UI related data holder, lifecycle aware.

##  Features to add if time permits
* Setting up the dark screen demo interface.
* Adding viewpager tablayout to the UI.

## Download Application


You can try out the application on your device through the link below;
*  [Download link](https://github.com/nsikakudo/resumeapp/raw/main/app/app-debug.apk)

## Challenges 
*  Setting up the Dark and Light Theme using Material Theme. 
*  I was also face with the challenge of creating a perfect UI as i am still learning how to use the Jackpack Compose.

## Application Demo
Check out the demo app on Appetize.io
*  [Demo link](https://appetize.io/app/kxel3i2lnh4e3lznyowoax6eqq?device=pixel4&osVersion=11.0&scale=75)

## More Details
You need the following requirements to run this project

*   Android Studio IDE Arctic Fox 2020.3.1 Patch 2
*   Compose 1.6.0
*   Android SDK v33
*   Gradle 7.0.2

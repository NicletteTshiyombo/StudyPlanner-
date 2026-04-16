# Study Planner Application

## Overview

The Study Planner Application is a Java-based desktop application developed using **JavaFX** for the graphical user interface. Its purpose is to help users create and manage study tasks while tracking their progress through different stages.

The system is designed using the **State Design Pattern**, which allows each task to transition between different states such as **New**, **Planned**, **Scheduled**, **In Progress**, **Paused**, **Completed**, and **Archived**. It also includes file saving and loading functionality so that tasks are not lost between sessions.

---

## Features

- Create a new study task with:
  - Task ID (must be unique)
  - Title (e.g., Math, Java, Psychology)
  - Due date (based on number of days)
  - Study duration (minutes)

- Manage task states using buttons:
  - Plan
  - Schedule
  - Start
  - Pause
  - Complete
  - Archive

- Display the current task and its state

- Save tasks to a file (`tasks.txt`)

- Automatically load saved tasks when the application starts

- User-friendly graphical interface built with **JavaFX** and **SceneBuilder**

---

## Technologies Used

- Java (**JDK 17 or higher recommended**)
- JavaFX SDK
- SceneBuilder
- Eclipse IDE
- JUnit for testing

---

## Project Structure

```text
studyplanner/
│
├── Main.java
├── MainController.java
├── StudyPlanner.java
├── StudyTask.java
├── TaskState.java
├── studyplanner.fxml
│
├── states/
│   ├── NewState.java
│   ├── PlannedState.java
│   ├── ScheduledState.java
│   ├── InProgressState.java
│   ├── PausedState.java
│   ├── CompletedState.java
│   └── ArchivedState.java
│
└── studyplannertest/
    ├── AppSettingsTest.java
    ├── StudyPlannerTest.java
    └── StudyTaskStateTest.java
```
## Installation and Setup
### Step 1: Install JavaFX

Download the JavaFX SDK from the official Gluon website:

https://gluonhq.com/products/javafx/

Extract the folder to your computer.

Example:

C:\Users\YourName\Downloads\javafx-sdk

### Step 2: Add JavaFX to Eclipse
Right-click your project and select Build Path
Click Configure Build Path
Open the Libraries tab
Click Add External JARs
Navigate to the lib folder inside your JavaFX SDK
Select all .jar files
Click Apply and Close

### Step 3: Configure VM Arguments
Go to Run → Run Configurations
Select your Main class
Open the Arguments tab
In the VM arguments section, paste:
--module-path "C:\Users\YourName\Downloads\javafx-sdk\lib" --add-modules javafx.controls,javafx.fxml

Replace the path with your actual JavaFX folder location.

## How to Run the Application

1. Run `Main.java`  
2. The JavaFX interface will open  
3. Enter:
   - Task ID  
   - Title  
   - Days until due date  
   - Duration in minutes  
4. Click **Create Task**  
5. Use the buttons to change the task state  
6. Click **Save** to store tasks  
7. Click **Exit** to close the application  

---

## File Storage

Tasks are saved in:

tasks.txt

- The file is automatically loaded when the application starts  
- If it does not exist, it will be created automatically  

### Format

ID,Title,State
### Example
2,Math,Archived

## GUI Design and Data Persistence Explanation
### GUI Design

The graphical user interface was first planned conceptually and then implemented using JavaFX with SceneBuilder through the studyplanner.fxml file.

The MainController.java class handles user interactions and connects the GUI to the application logic.
---
### Data Persistence

The application stores task information in tasks.txt, located in the project’s working directory.

#### How Data Is Read
The application reads the file line by line
Each line is split into task ID, title, and state
Tasks are recreated as StudyTask objects
#### How Data Is Written
Tasks are saved when the user clicks Save or exits
Ensures data persistence between sessions
---
## Testing

The project includes a dedicated testing package, studyplannertest.

### Test Classes
AppSettingsTest.java → Verifies Singleton behavior
StudyPlannerTest.java → Tests task management
StudyTaskStateTest.java → Validates state transitions
---
## Design Pattern Justification

This application implements the State Design Pattern to manage task behavior dynamically based on its current state.

Each state is represented by its own class, improving organization, scalability, and encapsulation.

For example, a task in the In Progress state can transition to Paused or Completed, but not directly to Planned unless explicitly allowed.
---
## Conclusion

This application demonstrates object-oriented programming, design patterns, file handling, JavaFX GUI development, and unit testing.
---
## Authors

### Niclette Tshiyombo
tshi0037@algonquinlive.com

### Anne Azie 
azie0001@alognquinlive.com

---
## Important Notes
Task IDs must be unique
Duplicate task IDs are not allowed
Invalid state transitions will display an error message
If tasks.txt does not exist, it will be created automatically

# **Task Management System**

## **Overview**
The Task Management System is a software solution designed to help users manage their tasks efficiently. It allows users to create, view, update, and delete tasks, track deadlines, and manage task statuses. The project is developed as part of the **SW 301: Object-Oriented Analysis and Design** course at Zewail City for Science and technology.

This project demonstrates the application of OOAD principles, UML modeling, and system design techniques. Data persistence is implemented using **local storage**, ensuring users' data is retained between sessions on the same browser.

---

## **Team Members**
- **Faris Sharara** 
- **Ahmed Taha** 
- **Karim Ashraf** 

---

## **Features**
The system provides the following features:
- **User Management**: Simulate user login and profile management (data saved in local storage).
- **Task Management**: Create, update, delete, and view tasks.
- **Deadline Tracking**: Assign deadlines and prioritize tasks based on urgency.
- **Task Status**: Update and view the status of tasks (e.g., Pending, In Progress, Completed).
- **Category Management**: Organize tasks into customizable categories.

---


## **Project Structure**
```
OOAD-Project/  
│  
├── README.md                 # Project Overview  
├── docs/                     # Documentation files  
│   ├── requirements/         # Functional and Non-Functional Requirements  
│   └── design/               # Design artifacts (e.g., sequence diagrams)
| 
├── class_diagrams/           # Class and Object Diagrams
|
├── OCL_constraints/      # Object Constraint Language definitions  
|
├── usecases/             # Use Case Diagrams and Descriptions
|
├── src/                      # Source code  
│   ├── index.html            # Main HTML file  
│   ├── style.css             # Styling  
│   ├── app.js                # Main JavaScript logic  
│   └── components/           # UI Components (if applicable)  
│  
├── ui_mockups/               # User Interface Wireframes/Mockups  
│  
├── .gitignore                # Ignore unnecessary files  
└── LICENSE                   # License Information  
```

---

## **How to Run the Project**
1. Clone the repository:
   ```bash
   git clone [repository link]
   cd OOAD-Project
   ```
2. Open the `index.html` file in your browser:
   ```bash
   open src/index.html
   ```
3. All data will be stored in your browser’s local storage.


---


## **License**
This project is licensed under the MIT license. See the [MIT](LICENSE) file for details.

# Admin Dashboard 📊

Welcome to the Admin Dashboard project! This application provides a robust and user-friendly interface for managing data efficiently. Built with Java, Spring Boot, and React, this dashboard allows you to perform essential data operations with ease.

## Features ✨

- **Get All Data**: Fetch all records from the database.
- **Get Data by Filter**: Retrieve specific records based on various filter criteria.
- **Data Storage**: Upload and store data from a CSV file into a MySQL database.

## Technologies Used 🛠️

- **Backend**: Java, Spring Boot
- **Frontend**: React
- **Database**: MySQL

## Getting Started 🚀

Follow these instructions to get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites 📋

- Java 11 or higher
- Node.js and npm
- MySQL

### Installation 🔧

1. **Clone the repository**:
    ```bash
    git clone https://github.com/rtanwar572/admin-dashboard.git
    cd admin-dashboard
    ```

2. **Backend Setup**:
    - Navigate to the `backend` directory:
      ```bash
      cd backend
      ```
    - Install dependencies and build the project:
      ```bash
      ./mvnw clean install
      ```
    - Run the Spring Boot application:
      ```bash
      ./mvnw spring-boot:run
      ```

3. **Frontend Setup**:
    - Navigate to the `frontend` directory:
      ```bash
      cd ../frontend
      ```
    - Install dependencies:
      ```bash
      npm install
      ```
    - Start the React application:
      ```bash
      npm start
      ```

### Configuration ⚙️

1. **Database Configuration**:
    - Ensure MySQL is installed and running.
    - Create a database named `admin_dashboard`.
    - Update the `application.properties` file in the `backend/src/main/resources` directory with your MySQL credentials:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/admin_dashboard
      spring.datasource.username=your_username
      spring.datasource.password=your_password
      ```

2. **Data Import**:
    - To import data from a CSV file into the MySQL database, place your `data.csv` file in the `backend/src/main/resources` directory.
    - Run the application, and the data will be automatically loaded into the database.

## Usage 📚

- **API Endpoints**:
  - **Get All Data**: `GET /api/data`
  - **Get Data by Filter**: `GET /api/data/filter?criteria=value`

- **Frontend Access**:
  - Once the React application is running, open your browser and navigate to `http://localhost:3000`.

## Contributing 🤝

We welcome contributions to improve the Admin Dashboard! Please follow these steps to contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Open a pull request.

## License 📄

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact 📬

If you have any questions, feel free to reach out:

- **Rohit Tanwar**
- **Email**: rtanwar7303@gmail.com
- **LinkedIn**: https://www.linkedin.com/in/rohit-tanwar-7303-code/

---

Thank you for checking out the Admin Dashboard project! We hope you find it useful and easy to use. Happy coding! 👩‍💻👨‍💻

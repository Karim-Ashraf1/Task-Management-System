CREATE TABLE Task (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    description TEXT,
    status VARCHAR(50),
    assignee VARCHAR(255),
    due_date DATE
);

package com.managedId.MI;

import javax.persistence.*;
import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@SpringBootApplication
public class MiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiApplication.class, args);
	}
	@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://sevent5-test.database.windows.net:1433;database=seven;user=uday@sevent5-test;password=@Capgemini1234;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
//        dataSource.setUsername("your_username");
//        dataSource.setPassword("your_password");
        return dataSource;
    }
}

@Entity
@Table(name = "users")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Constructor
    public User() {
    }
}

interface UserRepository extends JpaRepository<User, Long> {}



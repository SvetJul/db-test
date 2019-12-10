package hellodb

import com.zaxxer.hikari.HikariDataSource
import java.sql.Connection
import java.sql.DriverManager
import javax.persistence.EntityManager


lateinit var dataSource: HikariDataSource

fun initDb(user: String = "postgres", password: String = "", database: String = "postgres") {
  dataSource = HikariDataSource().apply {
    username = user
    jdbcUrl = "jdbc:postgresql://localhost:5432/$database"
    this.password = password
    maximumPoolSize = 10
  }
}
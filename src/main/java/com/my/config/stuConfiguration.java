package com.my.config;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class stuConfiguration {
	
	public static SessionFactory getSessionFactory() {
		
		Properties properties = new Properties();
		
		properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		properties.put(Environment.JAKARTA_JDBC_URL, "jdbc:mysql://localhost:3306/college");
		properties.put(Environment.JAKARTA_JDBC_USER, "root");
		properties.put(Environment.JAKARTA_JDBC_PASSWORD, "7599");
		properties.put(Environment.HBM2DDL_AUTO, "update");
		properties.put(Environment.SHOW_SQL, "true");
		properties.put(Environment.FORMAT_SQL, "true");
		 
		
		return new MetadataSources(new StandardServiceRegistryBuilder().applySettings( properties).build())
				.addAnnotatedClasses(com.my.entity.student.class,com.my.entity.Adresses.class).getMetadataBuilder()
				.build().buildSessionFactory();
	}

}

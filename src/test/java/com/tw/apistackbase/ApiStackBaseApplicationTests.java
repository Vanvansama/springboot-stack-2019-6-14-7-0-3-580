package com.tw.apistackbase;

import com.tw.apistackbase.controller.EmployeesController;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@WebMvcTest(EmployeesController.class)
public class ApiStackBaseApplicationTests {
	@Test
	public void contextLoads() {
		
	}

}

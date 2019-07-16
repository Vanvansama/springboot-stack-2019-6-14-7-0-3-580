package com.tw.apistackbase.controller;


import com.tw.apistackbase.model.Employees;
import com.tw.apistackbase.service.EmployeeServiceInterface;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(EmployeesController.class)
class EmployeesControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private EmployeeServiceInterface employeeService;

    @Test
    void shoule_return_list_when_list_given() throws Exception {
        ResultActions resultActions = mockMvc.perform(get("/employees"));
    }

    @Test
    void add() {
    }

    @Test
    void should_return_employee_when_get_given_employeeId() throws Exception {
        Employees employees = new Employees("stefan",22,"male");
        when(employeeService.get(anyString())).thenReturn(employees);

        ResultActions resultActions = mockMvc.perform(get("/employees/{employeeId}",employees.getId()));
        resultActions.andExpect(status().isOk())
                .andExpect(jsonPath("$.id",is(employees.getId())))
                .andExpect(jsonPath("$.name",is("stefan")))
                .andExpect(jsonPath("$.age",is(22)))
                .andExpect(jsonPath("$.gender",is("male")));
    }

    @Test
    void delete() {
    }
}
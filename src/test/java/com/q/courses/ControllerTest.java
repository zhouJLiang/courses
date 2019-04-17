package com.q.courses;

import com.q.courses.controller.CourseController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @Author zjl
 * @Date: 2019/4/17 17:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerTest {
    @Autowired
    private CourseController courseController;

    private MockMvc mockMvc;

    @Before
    public void setUP(){
        mockMvc = MockMvcBuilders.standaloneSetup(courseController).build();
    }

    // public void addCourse(@RequestParam("courseName") String courseName, @RequestParam("numOfWeek")
    //            int numOfWeek, @RequestParam("teacherID") int teacherID, @RequestParam("grade") int term,
    //            @RequestParam("grade") int grade, @RequestParam("classNum") int classNum) {
    @Test
    public void addCourse() throws Exception {
        MvcResult result =  mockMvc.perform(MockMvcRequestBuilders.get("/course/addCourse").accept(MediaType.APPLICATION_JSON)
                .param("courseName","语文")
                .param("numOfWeek","8")
                .param("teacherID","1")
                .param("grade","1")
                .param("classNum","1")
                .param("term","1")).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();

        System.out.println("输出：" + result.getResponse().getContentAsString());
    }
}

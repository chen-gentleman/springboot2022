package com.chen.boot;

import com.chen.boot.web.WebController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @Author @Chenxc
 * @Date 2022/6/1 17:11
 */
@SpringBootTest
public class WebTest {
    private MockMvc mockMvc;

    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(new WebController()).build();
    }

    @Test
    public void getUser()throws Exception{
        String content = mockMvc.perform(MockMvcRequestBuilders.post("/getUser").accept(MediaType.APPLICATION_JSON_UTF8_VALUE)).andReturn().getResponse().getContentAsString();
        System.out.println(content);
    }

    @Test
    public void getUsers() throws Exception {
        String responseString = mockMvc.perform(MockMvcRequestBuilders.get("/getUsers"
        ))
                .andReturn().getResponse().getContentAsString();
        System.out.println("result : "+responseString);
    }
}

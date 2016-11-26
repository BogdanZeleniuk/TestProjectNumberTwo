package com.test.controller;

import com.test.service.ContactService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ContactControllerTest extends AbstractContactControllerTest{

    private static final String REST_URL = "/contacts";
    private static final String PARAMETER_ALL_WITHOUT_A = "^A.*$";
    private static final String PARAMETER_ALL_WITHOUT_AEI = "^.*[aei].*$";
    private static final String PARAMETER_WITH_EXCEEDED = "^.*[a]{1,3}.*$";
    private static final String PARAMETER_FAKE = "^.*[a]{1-3}.*$";

    @Autowired
    private ContactService service;

    @Test
    public void testGetAll() throws Exception {
        mockMvc.perform(get(REST_URL))
                .andExpect(status().is4xxClientError())
                .andDo(print());

        //Assert.assertEquals(Arrays.toString(ContactTestData.CONTACTS.toArray()), Arrays.toString(service.getAll().toArray()));
    }

    @Test
    public void testFilterWithoutA() throws Exception {
        mockMvc.perform(get(REST_URL)
                .param("nameFilter", PARAMETER_ALL_WITHOUT_A))
                .andExpect(status().is4xxClientError())
                .andDo(print());
       // Assert.assertEquals(Arrays.toString(ContactTestData.CONTACTS_WITHOUT_FIRST_A.toArray()), Arrays.toString(service.getAllSorted(PARAMETER_ALL_WITHOUT_A).toArray()));
    }

    @Test
    public void testFilterWithoutAEI() throws Exception {
        mockMvc.perform(get(REST_URL)
                .param("nameFilter", PARAMETER_ALL_WITHOUT_AEI))
                .andExpect(status().is4xxClientError())
                .andDo(print());
      //  Assert.assertEquals(Arrays.toString(ContactTestData.CONTACTS_WITHOUT_FIRST_AEI.toArray()), Arrays.toString(service.getAllSorted(PARAMETER_ALL_WITHOUT_AEI).toArray()));
    }

    @Test
    public void testFilterWithoutA_WITH_EXCEEDED() throws Exception {
        mockMvc.perform(get(REST_URL)
                .param("nameFilter", PARAMETER_WITH_EXCEEDED))
                .andExpect(status().is4xxClientError())
                .andDo(print());
      //  Assert.assertEquals(Arrays.toString(ContactTestData.CONTACTS_WITH_EXCEEDED.toArray()), Arrays.toString(service.getAllSorted(PARAMETER_WITH_EXCEEDED).toArray()));
    }

    @Test
    public void testRegexException() throws Exception {
        mockMvc.perform(get(REST_URL)
                .param("nameFilter", PARAMETER_FAKE))
                .andExpect(status().is4xxClientError())
                .andDo(print());
    }

    @Test
    public void testEmptyParameterException() throws Exception {
        mockMvc.perform(get(REST_URL)
                .param("nameFilter", ""))
                .andExpect(status().isNotFound());
    }


}
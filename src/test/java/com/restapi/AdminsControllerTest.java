package com.restapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {AdminsController.class})
@ExtendWith(SpringExtension.class)
class AdminsControllerTest {
    @Autowired
    private AdminsController adminsController;

    /**
     * Method under test: {@link AdminsController#getAdmin()}
     */
    @Test
    void testGetAdmin() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange, Act and Assert
        assertEquals("http GET request to get the admin details", (new AdminsController()).getAdmin());
    }

    /**
     * Method under test: {@link AdminsController#getAdminId(String)}
     */
    @Test
    void testGetAdminId() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange, Act and Assert
        assertEquals("GET request to get the adminId 42", (new AdminsController()).getAdminId("42"));
    }

    /**
     * Method under test: {@link AdminsController#createAdmin()}
     */
    @Test
    void testCreateAdmin() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange, Act and Assert
        assertEquals("http POST request to create the admin", (new AdminsController()).createAdmin());
    }

    /**
     * Method under test: {@link AdminsController#updateAdmin()}
     */
    @Test
    void testUpdateAdmin() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange, Act and Assert
        assertEquals("http GET request to update the admin details", (new AdminsController()).updateAdmin());
    }

    /**
     * Method under test: {@link AdminsController#deleteAdmin()}
     */
    @Test
    void testDeleteAdmin() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange, Act and Assert
        assertEquals("http GET request to delete the admin", (new AdminsController()).deleteAdmin());
    }

    /**
     * Method under test: {@link AdminsController#ping()}
     */
    @Test
    void testPing() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange, Act and Assert
        assertEquals("welcome to the rundeck test", (new AdminsController()).ping());
    }

}

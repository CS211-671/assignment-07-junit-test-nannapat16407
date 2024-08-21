package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    UserList userList;

    @BeforeEach
    void init() {
        userList = new UserList();
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        userList.addUser("Nanna", "Pim");
        userList.addUser("Pun", "Puu");
        userList.addUser("Mook", "keyy");

        // TODO: find one of them
        String expected = "Nanna";
        User user = userList.findUserByUsername("Nanna");
        String actual = user.getUsername();

        // TODO: assert that UserList found User
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        userList.addUser("Nanna", "Pim");
        userList.addUser("Pun", "Puu");
        userList.addUser("Mook", "keyy");
        // TODO: change password of one user
        boolean actual = userList.changePassword("Nanna", "Pim", "Puri");
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("Nanna", "Pim");
        userList.addUser("Pun", "Puu");
        userList.addUser("Mook", "keyy");
        // TODO: call login() with correct username and password
        User actual = userList.login("Nanna","Pim");
        // TODO: assert that User object is found
        User expected = userList.findUserByUsername("Nanna");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("Nanna", "Pim");
        userList.addUser("Pun", "Puu");
        userList.addUser("Mook", "keyy");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("Im","Io");
        // TODO: assert that the method return null
        assertNull(actual);
    }

}
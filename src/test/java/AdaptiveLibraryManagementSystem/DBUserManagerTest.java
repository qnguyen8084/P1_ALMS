package AdaptiveLibraryManagementSystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.sql.*;

import static AdaptiveLibraryManagementSystem.DBManager.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class DBUserManagerTest {

    @Mock
    private Connection connection;

    @Mock
    private Statement statement;

    @Mock
    private ResultSet resultSet;

    private DBUserManager dbUserManager;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        connection = Mockito.mock(Connection.class);
        statement = Mockito.mock(Statement.class);
        resultSet = Mockito.mock(ResultSet.class);
        dbUserManager = new DBUserManager();
        DBManager.overrideConnection(connection);
    }

    @AfterEach
    public void tearDown() {
        DBManager.restoreDefaultConnection();
        Mockito.reset(connection, statement, resultSet);
    }

    @Test
    public void testListMembers() throws SQLException {
        when(connection.createStatement()).thenReturn(statement);
        when(statement.executeQuery("SELECT * FROM members")).thenReturn(resultSet);
        when(resultSet.next()).thenReturn(true).thenReturn(false);
        when(resultSet.getInt("id")).thenReturn(1);
        when(resultSet.getString("name")).thenReturn("John Doe");

        dbUserManager.list();

        assertNotNull(resultSet);
        assertEquals(1, resultSet.getInt("id"));
        assertEquals("John Doe", resultSet.getString("name"));
    }


    @Test
    public void testAddMember() throws SQLException {
        Member member = new Member("John Doe");
        String sql = "INSERT INTO members (name) VALUES (?)";
        PreparedStatement preparedStatement = Mockito.mock(PreparedStatement.class);
        when(connection.prepareStatement(sql)).thenReturn(preparedStatement);

        dbUserManager.add(member);

        verify(preparedStatement).setString(1, "John Doe");
        verify(preparedStatement).executeUpdate();
        verifyNoMoreInteractions(preparedStatement);
    }
}

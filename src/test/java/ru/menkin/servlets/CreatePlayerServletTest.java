package ru.menkin.servlets;

import org.junit.*;
import org.mockito.*;
import ru.menkin.store.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import static org.junit.Assert.*;

/**
 * @author Menkin
 * @since 06.10.2015
 */
public class CreatePlayerServletTest extends Mockito{
    private final PlayerCache cache = PlayerCache.getInstance();

    @Test
    public void createUser() throws ServletException, IOException{
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        when(request.getParameter("team")).thenReturn("test");
        when(request.getParameter("name")).thenReturn("test");
        when(request.getParameter("salary")).thenReturn("test");
        when(request.getParameter("position")).thenReturn("test");

        assertTrue(cache.values().isEmpty());

        new CreatePlayerServlet().doPost(request, response);

        verify(request, atLeast(1)).getParameter("team");
        verify(request, atLeast(1)).getParameter("name");
        verify(request, atLeast(1)).getParameter("salary");
        verify(request, atLeast(1)).getParameter("position");

        assertFalse(cache.values().isEmpty());
    }
}
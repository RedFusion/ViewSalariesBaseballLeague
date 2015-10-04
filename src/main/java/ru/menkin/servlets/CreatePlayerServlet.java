package ru.menkin.servlets;

import ru.menkin.models.Player;
import ru.menkin.store.UserCache;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Class for create new Player
 * @author Menkin
 */
public class CreatePlayerServlet extends HttpServlet
{
    final AtomicInteger ids = new AtomicInteger();

    private final UserCache USER_CACHE = UserCache.getInstance();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.USER_CACHE.add(new Player(this.ids.incrementAndGet(), req.getParameter("team"), req.getParameter("name"),
                req.getParameter("salary"), req.getParameter("position")));
        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/view"));
    }
}
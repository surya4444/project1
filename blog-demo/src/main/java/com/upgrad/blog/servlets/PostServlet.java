package com.upgrad.blog.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TODO 4.18: Modify the class definition to make it a Servlet class.
 * TODO 4.19: Override doPost() method from the base Class and implement the following TODOs in this method.
 * TODO 4.20: Check if the user is logged in or not. If not, then redirect them to the
 * login page. (Hint: Make use of session object)
 * TODO 4.21: Retrieve all the relevant information from the request object and create a
 * new PostDTO object.
 * (Note: 1. For now, you can set the postId attribute of the newly created PostDTO object
 * as (int) 1. You will soon know the reason behind it.)
 * (Note: 2. You can set the timestamp attribute of the newly created PostDTO object using
 * LocalDateTime.now(). This method will fetch you the current date and time. Later in the
 * session, you will learn in detail the use of this method.)
 * TODO 4.22. Print the PostDTO object's data on the console.
 * TODO 4.23. You should also redirect the user to the "ViewPostById" page and pass the PostDTO
 * object along with the request. ViewPostById page will be created later in the project and
 * display the blog posted by the user. At this point of time, you will just see the hyperlink
 * to go to the Home.jsp page on ViewPostById page.
 */

/**
 * TODO: 5.7. Map this Servlet to "/blog/post" url using the @WebServlet annotation.
 * TODO: 5.8: Remove the same mapping from the Deployment Descriptor.
 */

/**
 * TODO: 6.15. Store the post details into the database that is received from the
 * CreatePost.jsp page and then redirect the user to the "ViewPostById" page.
 * (Hint: You should use DAOFactory to get the PostDAO)
 */

/**
 * TODO 8.2: After saving post details into the database and before you redirect the
 * user to the "ViewPostById" page, you should write logs into the following format.
 * <timestamp for that post><\t\t><title for that post><\t><space>writtenby<\t><email for that post><\n\n>
 * (Hint: you should use the LogWriter object)
 * (Hint: Use the following method to get the user's current directory. All the logs should be stored
 * in the file that is located at the following directory.
 * System.getProperty("user.dir")
 * Print the "System.getProperty("user.dir")" to know where the log file is created.
 */

/**
 * TODO 9.1: Modify the existing code such that the following two operations occur simultaneously on
 * two independent threads.
 * thread1: Saving data into the database
 * thread2: Writing logs into the file
 */

public class PostServlet {
    //    Here we will have servlet methods

    /**
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        Uncomment the following code snippet to check whether any of the field is empty.
//        if (email.equals(null) || title.equals(null) || tag.equals(null) || description.equals(null)) {
//            req.setAttribute("isError", true);
//            req.setAttribute("errorMessage", "All form fields value are required!");
//            rd = req.getRequestDispatcher("/blog/CreatePost.jsp"); //rd is RequestDispatcher
//            rd.forward(req, resp); //rd is RequestDispatcher
//        }

    }
}
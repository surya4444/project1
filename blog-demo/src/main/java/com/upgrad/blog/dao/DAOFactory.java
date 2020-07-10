package com.upgrad.blog.dao;

import com.upgrad.blog.dto.PostDTO;
import com.upgrad.blog.dto.UserDTO;
import com.upgrad.blog.interfaces.PostsCRUD;
import com.upgrad.blog.interfaces.UserCRUD;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;

/**
 * TODO: 6.8. Provide a factory method which returns PostDAO object. (Hint: Return type
 * of this method should be PostsCRUD)
 * TODO: 6.9. Provide a factory method which returns UserDAO object. (Hint: Return type
 * of this method should be UserCRUD)
 */
public class DAOFactory
{
    public PostsCRUD getPostCRUDS()
    {
        return new PostDAO();
    }

    public UserCRUD getUserCRUDS()
    {
        return new UserDAO();
    }
}

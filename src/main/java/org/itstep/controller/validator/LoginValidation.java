package org.itstep.controller.validator;


import org.itstep.domain.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LoginValidation implements ConstraintValidator<Login, String> {

    @Autowired
    private final UserDao userDao;

    public LoginValidation(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void initialize(Login login) {
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return !userDao.isExist(s);
    }
}

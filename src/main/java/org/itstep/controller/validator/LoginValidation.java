package org.itstep.controller.validator;


import org.itstep.domain.dao.impl.UserDaoImpl;
import org.itstep.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LoginValidation implements ConstraintValidator<Login, String> {

    @Autowired
    private ConversionService conversionService;

    private final UserDaoImpl userDao;

    public LoginValidation(UserDaoImpl userDao) {
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

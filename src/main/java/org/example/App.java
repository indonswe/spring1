package org.example;

import org.example.data_access.StudentDao;
import org.example.data_access.config.ComponentScanConfig;
import org.example.service.StudentManagement;
import org.example.service.StudentManagementConsoleImpl;
import org.example.util.ScannerInputService;
import org.example.util.UserInputService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);

        UserInputService userInputService =context.getBean(UserInputService.class);

        userInputService.getString();

        StudentManagement studentManagement = context.getBean(StudentManagementConsoleImpl.class);





    }
}

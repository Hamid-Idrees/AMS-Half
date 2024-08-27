
package classes;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AMS {
    
    // Static fields
    private static final ArrayList<Teacher> teachers = new ArrayList<>();
    
    ////////////////////////////////////////////////////////////////////////////
    
    // Method to add a teacher
    public static void addTeacher(Teacher teacher) {
        if (teacher != null) {
            teachers.add(teacher);
        } else {
            showErrorMessage("Teacher data not received");
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    // Method to verify teacher login
    public static boolean verifyTeacher(String username, String password) {
        for (Teacher teacher : teachers) {
            if (username.equals(teacher.getUsername()) &&
                password.equals(teacher.getPassword())) {
                return true;
            }
        }
        return false;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    // Method to show error messages
    public static void showErrorMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    // Method to get all teachers
    public static ArrayList<Teacher> getAllTeachers() {
        return teachers;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    // Method to handle forgotten passwords (optional)
    public static String forgetPassword(String username) {
        for (Teacher teacher : teachers) {
            if (username.equals(teacher.getUsername())) {
                return teacher.getPassword();
            }
        }
        return null;
    }
}

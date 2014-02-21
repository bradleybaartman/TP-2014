/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bradz.boom.com;

/**
 *
 * @author 211064084
 */
public class Header implements MyInterface{

    String name = "Bradz";
    String surname = "Baartman";
    int snum = 209215178;
    float feeD = 3456.56f;
    
    public Header(){}
    public Header(String nm,String sn)
    {
        name = nm;
        surname = sn;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }
    
    @Override
    public String toString()
    {
        return getName()+getSurname();
    }
    
    @Override
    public int getStudentNum() {
        return snum;
    }
    
    @Override
    public float feesDue()
    {
        return feeD;
    }
    
    @Override
    public String hello()
    {
        return "Hello World";
    }
    @Override
    public String destroy()
    {
        return "Destroy the World";
    }
    
   
}
